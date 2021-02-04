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

        UndeclaredChecker checker = new UndeclaredChecker(rhsCtx);
        checker.check();

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

            TypeMismatchChecker checker1 = new TypeMismatchChecker(new MangcaluaValue(null, pa.getPrimitiveType()), rhsCtx);
            checker1.check();
        }
        evalCommand = new EvaluateCommand(rhsCtx);
    }

    @Override
    public void execute() {

        if (mutableCtx.LeftBracket() != null) {

            EvaluateCommand arrEvalCommand = new EvaluateCommand(mutableCtx.simpleExpression(), this.scope);
            arrEvalCommand.execute();

            int arrIndex = arrEvalCommand.getEvaluated().intValue();

            MangcaluaValue mangcaluaValue = scope.getVariableAllScope(id.getText());
            MangcaluaArray mangcaluaArray = (MangcaluaArray) mangcaluaValue.getValue();

            if (mangcaluaArray.getPrimitiveType() == PrimitiveType.STRING) {
                ParseTreeWalker treeWalker = new ParseTreeWalker();
                treeWalker.walk(this, this.rhsCtx);

                if (mangcaluaArray.isInitialized()) {
                    MangcaluaValue curValue = mangcaluaArray.getValueAt(arrIndex);

                    if (curValue != null) {
                        curValue.setValue(this.builder);
                        mangcaluaArray.updateValueAt(curValue, arrIndex);
                    } else {
                        Printer.getInstance().print("Array Index is out of bounds.", mutableCtx.getStart().getLine());
                        RuntimeManager.getInstance().killExecution();
                    }

                } else {
                    Printer.getInstance().print("Array is not initialized", mutableCtx.getStart().getLine());
                    RuntimeManager.getInstance().killExecution();
                }

            } else {
                evalCommand.execute();
                BigDecimal result = evalCommand.getEvaluated();

                if (mangcaluaArray.isInitialized()) {
                    MangcaluaValue curValue = mangcaluaArray.getValueAt(arrIndex);

                    if (curValue != null) {
                        Util.assignValue(curValue, result);
                        mangcaluaArray.updateValueAt(curValue, arrIndex);
                    } else {
                        Printer.getInstance().print("Array Index is out of bounds.", mutableCtx.getStart().getLine());
                        RuntimeManager.getInstance().killExecution();
                    }

                } else {
                    Printer.getInstance().print("Array is not initialized", mutableCtx.getStart().getLine());
                    RuntimeManager.getInstance().killExecution();
                }
            }

        } else {
            MangcaluaValue mangcaluaValue = scope.getVariableAllScope(id.getText());
            if (mangcaluaValue.getPrimitiveType() == PrimitiveType.STRING) {
                ParseTreeWalker treeWalker = new ParseTreeWalker();
                treeWalker.walk(this, this.rhsCtx);

                mangcaluaValue.setValue(builder);
            } else {
                evalCommand.execute();
                Util.assignValue(mangcaluaValue, evalCommand.getEvaluated());
            }
        }
        this.builder = "";
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

        if (ctx instanceof MutableContext) { ///str = str + arr[i]
            MutableContext mutableCtx  = (MutableContext) ctx;
            if (mutableCtx.LeftBracket() != null) { // if an array
                excluded.add(mutableCtx.getText());
                EvaluateCommand arrEvalCommand = new EvaluateCommand(mutableCtx.simpleExpression(), this.scope);
                arrEvalCommand.execute(); // rhs

                int arrIndex = arrEvalCommand.getEvaluated().intValue();

                MangcaluaValue mangcaluaValue = scope.getVariableAllScope(mutableCtx.Identifier().getText());
                MangcaluaArray mangcaluaArray = (MangcaluaArray) mangcaluaValue.getValue();

                if (mangcaluaArray.isInitialized()) {
                    MangcaluaValue curValue = mangcaluaArray.getValueAt(arrIndex);

                    if (curValue != null) {
                        this.builder += curValue.getValue().toString();
                    } else {
                        Printer.getInstance().print("Array Index is out of bounds.", mutableCtx.getStart().getLine());
                        RuntimeManager.getInstance().killExecution();
                    }

                } else {
                    Printer.getInstance().print("Array is not initialized", mutableCtx.getStart().getLine());
                    RuntimeManager.getInstance().killExecution();
                }


            } else {
                MangcaluaValue mangcaluaValue = scope.getVariableAllScope(mutableCtx.Identifier().getText());
                if (!isInExcluded(mutableCtx.getText())){
                    this.builder += mangcaluaValue.getValue().toString();
                }
            }

        } else if (ctx instanceof ConstantContext) {
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