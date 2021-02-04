package model.commands;

import java.util.*;

import model.representations.MangcaluaArray;
import model.representations.MangcaluaValue;
import model.representations.PrimitiveType;
import model.runtime.RuntimeManager;
import model.semantics.ConstantChecker;
import model.semantics.TypeMismatchChecker;
import model.semantics.UndeclaredChecker;
import model.symboltable.LocalScope;
import model.symboltable.SymbolTableManager;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.math.BigDecimal;
import parser.MangcaluaParser.SimpleExpressionContext;
import parser.MangcaluaParser.MutableContext;
import parser.MangcaluaParser.ConstantContext;
import model.*;

public class AssignCommand implements Command, ParseTreeListener{

    private LocalScope scope;
    private TerminalNode id;
    private MutableContext mutableCtx;
    private SimpleExpressionContext rhsCtx;
    private EvaluateCommand evalCommand;
    private String builder = "";
    private List<String> excluded = new ArrayList<>();

    public AssignCommand(MutableContext mutableCtx, SimpleExpressionContext rhsCtx) {
        this.rhsCtx = rhsCtx;
        this.id = mutableCtx.Identifier();
        this.mutableCtx = mutableCtx;
        this.scope = SymbolTableManager.getInstance().getCurScope();

        UndeclaredChecker undeclaredSemCheck = new UndeclaredChecker(rhsCtx);
        undeclaredSemCheck.check();

        MangcaluaValue mangcaluaValue = scope.getVariableAllScope(id.getText());

        if (mutableCtx.LeftBracket() != null && mangcaluaValue.getPrimitiveType() != PrimitiveType.ARRAY) {
            //Console.log("Variable is not an array.", mutableCtx.getStart().getLine());
        }

        if (mangcaluaValue.getPrimitiveType() != PrimitiveType.ARRAY) {
            ConstantChecker constSemCheck = new ConstantChecker(this.id);
            constSemCheck.check();
        }

        if (mutableCtx.LeftBracket() == null || mangcaluaValue.getPrimitiveType() != PrimitiveType.ARRAY) {
            TypeMismatchChecker typeMMSemCheck = new TypeMismatchChecker(mangcaluaValue, rhsCtx);
            typeMMSemCheck.check();
        }
        else {
            MangcaluaArray pa = (MangcaluaArray) mangcaluaValue.getValue();

            TypeMismatchChecker typeMMSemCheck = new TypeMismatchChecker(new MangcaluaValue(null, pa.getPrimitiveType()), rhsCtx);
            typeMMSemCheck.check();
        }
        evalCommand = new EvaluateCommand(rhsCtx);
    }

    @Override
    public void execute() {
        if (mutableCtx.LeftBracket() == null) {
            MangcaluaValue pseudoValue = scope.getVariableAllScope(id.getText());
            if (pseudoValue.getPrimitiveType() == PrimitiveType.STRING) {
                ParseTreeWalker treeWalker = new ParseTreeWalker();
                treeWalker.walk(this, this.rhsCtx);

                pseudoValue.setValue(builder);
            }
            else {
                evalCommand.execute();
                Util.assignValue(pseudoValue, evalCommand.getEvaluated());
            }
        }
        else {
            EvaluateCommand arrEvalCommand = new EvaluateCommand(mutableCtx.simpleExpression(), this.scope);
            arrEvalCommand.execute();

            int arrIndex = arrEvalCommand.getEvaluated().intValue();

            MangcaluaValue pseudoValue = scope.getVariableAllScope(id.getText());
            System.out.println(pseudoValue.getValue().toString());
            MangcaluaArray pseudoArray = (MangcaluaArray) pseudoValue.getValue();

            switch (pseudoArray.getPrimitiveType()) {
                case STRING:
                    ParseTreeWalker treeWalker = new ParseTreeWalker();
                    treeWalker.walk(this, this.rhsCtx);

                    if (!pseudoArray.isInitialized()) {
                        Printer.getInstance().print("Array is not initialized", mutableCtx.getStart().getLine());
                        RuntimeManager.getInstance().killExecution();
                    }
                    else {
                        MangcaluaValue curValue = pseudoArray.getValueAt(arrIndex);
                        if (curValue == null) {
                            Printer.getInstance().print("Array Index is out of bounds.", mutableCtx.getStart().getLine());
                            RuntimeManager.getInstance().killExecution();
                        }
                        else {
                            curValue.setValue(this.builder);
                            pseudoArray.updateValueAt(curValue, arrIndex);
                        }
                    }

                    break;
                default:
                    evalCommand.execute();
                    BigDecimal result = evalCommand.getEvaluated();

                    if (!pseudoArray.isInitialized()) {
                        Printer.getInstance().print("Array is not initialized", mutableCtx.getStart().getLine());
                        RuntimeManager.getInstance().killExecution();
                    }
                    else {
                        MangcaluaValue curValue = pseudoArray.getValueAt(arrIndex);
                        if (curValue == null) {
                            Printer.getInstance().print("Array Index is out of bounds.", mutableCtx.getStart().getLine());
                            RuntimeManager.getInstance().killExecution();
                        }
                        else {
                            Util.assignValue(curValue, result);
                            pseudoArray.updateValueAt(curValue, arrIndex);
                        }
                    }
                    break;
            }
        }
        this.builder = "";
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

        if (!(ctx instanceof MutableContext)) {
            if (ctx instanceof ConstantContext) {
                ConstantContext constCtx  = (ConstantContext) ctx;
                if (!isInExcluded(constCtx.getText())){
                    if (constCtx.StringLiteral()!= null) {
                        this.builder += constCtx.StringLiteral().getText().replaceAll("^\"+|\"+$", "");
                    } else {
                        this.builder += constCtx.getText();
                    }
                }
            }
        }
        else {
            MutableContext mutableCtx  = (MutableContext) ctx;
            if (mutableCtx.LeftBracket() == null) {
                MangcaluaValue pseudoValue = scope.getVariableAllScope(mutableCtx.Identifier().getText());
                if (!isInExcluded(mutableCtx.getText())){
                    this.builder += pseudoValue.getValue().toString();
                }
            }
            else {
                excluded.add(mutableCtx.getText());
                EvaluateCommand arrEvalCommand = new EvaluateCommand(mutableCtx.simpleExpression(), this.scope);
                arrEvalCommand.execute();

                int arrIndex = arrEvalCommand.getEvaluated().intValue();
                MangcaluaValue pseudoValue = scope.getVariableAllScope(mutableCtx.Identifier().getText());
                MangcaluaArray pseudoArray = (MangcaluaArray) pseudoValue.getValue();

                if (!pseudoArray.isInitialized()) {
                    Printer.getInstance().print("Array is not initialized", mutableCtx.getStart().getLine());
                    RuntimeManager.getInstance().killExecution();
                }
                else {
                    MangcaluaValue curValue = pseudoArray.getValueAt(arrIndex);

                    if (curValue == null) {
                        Printer.getInstance().print("Array Index is out of bounds.", mutableCtx.getStart().getLine());
                        RuntimeManager.getInstance().killExecution();
                    }
                    else {
                        this.builder += curValue.getValue().toString();
                    }
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
        for (Iterator<String> iterator = excluded.iterator(); iterator.hasNext(); ) {
            String ex = iterator.next();
            if (ex.contains(s)) {
                return true;
            }
        }
        return found;
    }
}