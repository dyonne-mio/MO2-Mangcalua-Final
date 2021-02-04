package model.commands;

import java.util.*;

import model.runtime.RuntimeManager;
import model.symboltable.LocalScope;
import model.symboltable.SymbolTableManager;
import model.trackers.FunctionControlTracker;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import parser.MangcaluaParser.SimpleExpressionContext;
import parser.MangcaluaParser.MutableContext;
import parser.MangcaluaParser.CallContext;
import model.*;
import model.representations.*;
import model.semantics.*;

public class EvaluateCommand implements Command, ParseTreeListener {
    private SimpleExpressionContext simpleCtx;
    private String strExp;
    private LocalScope scope;
    private BigDecimal evaluated;

    public EvaluateCommand(SimpleExpressionContext simpleCtx) {
        this.simpleCtx = simpleCtx;
        this.scope = SymbolTableManager.getInstance().getCurScope();
    }

    public EvaluateCommand(SimpleExpressionContext simpleCtx, LocalScope scope) {
        this.simpleCtx = simpleCtx;
        this.scope = scope;
    }

    @Override
    public void execute() {
        this.strExp = simpleCtx.getText();

        if (this.strExp.contains("\"")) {
            String newComparisons = this.strExp.replaceAll("\"", "");
            String[] cmpArray = newComparisons.split("==");

            MangcaluaValue mangcaluaValue = this.scope.getVariableAllScope(cmpArray[0].trim());
            String cmpString = mangcaluaValue.getValue().toString();

            if (cmpString.equals(cmpArray[1].trim())){
                this.evaluated = new BigDecimal(1);
            } else {
                this.evaluated = new BigDecimal(0);
            }

        } else {
            ParseTreeWalker treeWalker = new ParseTreeWalker();
            treeWalker.walk(this, this.simpleCtx);

            Expression evalEx = new Expression(this.strExp.replace("f", ""));
            this.evaluated = evalEx.eval();
        }
    }


    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if (ctx instanceof CallContext) {
            CallContext callCtx  = (CallContext) ctx;
            this.evaluateCall(callCtx);
        } else if (ctx instanceof MutableContext) {
            MutableContext mutableCtx  = (MutableContext) ctx;
            this.evaluateVar(mutableCtx);
        }

    }

    public void evaluateCall(CallContext callCtx) {
        String functionName = callCtx.Identifier().getText();
        MangcaluaFunction mangcaluaFunction = SymbolTableManager.getInstance().getFunction(functionName);
        ParameterCounterChecker checker = new ParameterCounterChecker(mangcaluaFunction, callCtx.args());
        checker.check();
        if (callCtx.args().simpleExpression().size() != 0) {
            List<SimpleExpressionContext> arguments = callCtx.args().simpleExpression();

            for(int i = 0; i < arguments.size(); i++) {
                SimpleExpressionContext expCtx = arguments.get(i);
                if (mangcaluaFunction.getParamAt(i).getPrimitiveType() == PrimitiveType.ARRAY) {
                    String id = expCtx.getText();
                    mangcaluaFunction.mapArrayParameter(id, this.scope.getVariableAllScope(id), i);
                } else if (mangcaluaFunction.getParamAt(i).getPrimitiveType() == PrimitiveType.STRING){

                    if(expCtx.getText().replaceAll("\".+?\"", "").contains("+")) {
                        Printer.getInstance().print("String concatenation not supported.", callCtx.getStart().getLine());
                        RuntimeManager.getInstance().killExecution();
                    }else if (expCtx.getText().contains("\"")) {
                        String id = expCtx.getText().replaceAll("^\"+|\"+$", "");

                        MangcaluaValue paramValue = mangcaluaFunction.getParamAt(i);
                        paramValue.setValue(id);
                    } else {
                        String id = expCtx.getText();
                        MangcaluaValue paramValue = mangcaluaFunction.getParamAt(i);
                        paramValue.setValue(scope.getVariableAllScope(id).getValue());
                    }
                } else {
                    EvaluateCommand evalCommand = new EvaluateCommand(expCtx, this.scope);
                    evalCommand.execute();
                    if (i < mangcaluaFunction.getParameterCount()) {
                        MangcaluaValue paramValue = mangcaluaFunction.getParamAt(i);
                        paramValue.setValue(evalCommand.getEvaluated().toPlainString());
                    }
                }
            }
        }

        MangcaluaFunction funcInstance = new MangcaluaFunction(mangcaluaFunction);
        FunctionControlTracker.getInstance().enterFunction(funcInstance);
        funcInstance.execute();
        this.strExp = this.strExp.replaceFirst(Pattern.quote(callCtx.getText()), Matcher.quoteReplacement(funcInstance.getReturnValue().getValue().toString()));
        FunctionControlTracker.getInstance().exitFunction();
    }

    public void evaluateVar(MutableContext mutableCtx) {
        if (mutableCtx.Identifier() != null && mutableCtx.LeftBracket() == null) {
            MangcaluaValue mangcaluaValue = this.scope.getVariableAllScope(mutableCtx.Identifier().getText());
            this.strExp =  this.strExp.replaceFirst(Pattern.quote(mutableCtx.Identifier().getText()),Matcher.quoteReplacement(mangcaluaValue.getValue().toString()));
        }
        else {
            EvaluateCommand evalCommand = new EvaluateCommand(mutableCtx.simpleExpression(), this.scope);
            evalCommand.execute();
            int arrIndex = evalCommand.getEvaluated().intValue();
            this.strExp = this.strExp.replaceFirst(mutableCtx.Identifier().getText(), "");
            MangcaluaValue mangcaluaValue = scope.getVariableAllScope(mutableCtx.Identifier().getText());
            MangcaluaArray mangcaluaArray = (MangcaluaArray) mangcaluaValue.getValue();
            if (mangcaluaArray.getValueAt(arrIndex) != null) {
                if (mangcaluaArray.getValueAt(arrIndex).getValue() != null)
                    this.strExp = this.strExp.replaceFirst("\\[.+?\\]", mangcaluaArray.getValueAt(arrIndex).getValue().toString());
                else{
                    Printer.getInstance().print("Value at index is null. Perhaps it is uninitialized.", mutableCtx.getStart().getLine());
                    RuntimeManager.getInstance().killExecution();
                }
            } else {
                Printer.getInstance().print("Index is out of bounds.", mutableCtx.getStart().getLine());
                RuntimeManager.getInstance().killExecution();
            }
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub
    }

    public BigDecimal getEvaluated() {
        return this.evaluated;
    }
}