package model.commands;

import model.runtime.RuntimeManager;
import model.symboltable.LocalScope;
import model.symboltable.SymbolTableManager;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.MangcaluaParser;
import parser.MangcaluaParser.SimpleExpressionContext;
import parser.MangcaluaParser.VariableDeclarationContext;
import model.*;
import model.representations.*;
import model.semantics.*;

import java.util.ArrayList;
import java.util.List;

public class InitializeCommand implements Command, ParseTreeListener {
    private LocalScope scope;
    private VariableDeclarationContext varDecCtx;
    private SimpleExpressionContext rhsCtx;
    private EvaluateCommand evalCommand;
    private String builder = "";
    private List<String> excluded = new ArrayList<>();

    public InitializeCommand(VariableDeclarationContext varDecCtx, SimpleExpressionContext rhsCtx) {
        this.rhsCtx = rhsCtx;
        this.varDecCtx = varDecCtx;
        this.scope = SymbolTableManager.getInstance().getCurScope();
        UndeclaredChecker undeclaredSemCheck = new UndeclaredChecker(rhsCtx);
        undeclaredSemCheck.check();
        evalCommand = new EvaluateCommand(this.rhsCtx);
    }

    @Override
    public void execute() {
        System.out.println(varDecCtx.dataType().getText());
        if (varDecCtx.dataType().getText().contains("String")){
            ParseTreeWalker treeWalker = new ParseTreeWalker();
            treeWalker.walk(this, this.rhsCtx);
            MangcaluaValue mangcaluaValue = scope.getVariableAllScope(varDecCtx.variableDeclarationInitialize().Identifier().getText());
            mangcaluaValue.setValue(builder);
        } else {
            evalCommand.execute();
            MangcaluaValue mangcaluaValue = scope.getVariableAllScope(varDecCtx.variableDeclarationInitialize().Identifier().getText());
            Util.assignValue(mangcaluaValue, evalCommand.getEvaluated());
        }
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if (ctx instanceof MangcaluaParser.MutableContext) {
            MangcaluaParser.MutableContext mutableCtx  = (MangcaluaParser.MutableContext) ctx;
            if (mutableCtx.LeftBracket() != null) {
                excluded.add(mutableCtx.getText());
                EvaluateCommand arrEvalCommand = new EvaluateCommand(mutableCtx.simpleExpression(), this.scope);
                arrEvalCommand.execute();
                int arrIndex = arrEvalCommand.getEvaluated().intValue();
                MangcaluaValue mangcaluaValue = scope.getVariableAllScope(mutableCtx.Identifier().getText());
                System.out.println(mangcaluaValue.getValue().toString());
                MangcaluaArray mangcaluaArray = (MangcaluaArray) mangcaluaValue.getValue();
                if (mangcaluaArray.isInitialized()) {
                    MangcaluaValue curValue = mangcaluaArray.getValueAt(arrIndex);
                    if (curValue != null)
                        this.builder += curValue.getValue().toString();
                    else {
                        Printer.getInstance().print("Array index is out of bounds.", mutableCtx.getStart().getLine());
                        RuntimeManager.getInstance().killExecution();
                    }
                } else {
                    Printer.getInstance().print("Array is not initialized", mutableCtx.getStart().getLine());
                    RuntimeManager.getInstance().killExecution();
                }
            } else {
                MangcaluaValue mangcaluaValue = scope.getVariableAllScope(mutableCtx.Identifier().getText());
                if (!isInExcluded(mutableCtx.getText()))
                    this.builder += mangcaluaValue.getValue().toString();
            }
        } else if (ctx instanceof MangcaluaParser.ConstantContext) {
            MangcaluaParser.ConstantContext constCtx  = (MangcaluaParser.ConstantContext) ctx;
            if (!isInExcluded(constCtx.getText())){
                if (constCtx.StringLiteral()!= null)
                    this.builder += constCtx.StringLiteral().getText().replaceAll("^\"+|\"+$", "");
                else {
                    this.builder += constCtx.getText();
                }
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

    private boolean isInExcluded (String s) {
        boolean found = false;
        for (String ex: excluded){
            if (ex.contains(s)) {
                return true;
            }
        }
        return found;
    }
}