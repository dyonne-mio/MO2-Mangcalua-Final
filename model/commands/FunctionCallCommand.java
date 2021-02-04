package model.commands;

import model.symboltable.LocalScope;
import model.symboltable.SymbolTableManager;
import parser.MangcaluaParser.ArgsContext;
import parser.MangcaluaParser.SimpleExpressionContext;

import java.util.*;

import model.representations.*;
import model.semantics.*;

public class FunctionCallCommand implements Command {
    private LocalScope localScope;
    private String funcName;
    private MangcaluaFunction func;
    private ArgsContext argsCtx;
    private MangcaluaValue returnValue;

    public FunctionCallCommand(MangcaluaFunction func, ArgsContext argsCtx) {
        this.func = func;
        this.argsCtx = argsCtx;

        this.localScope = SymbolTableManager.getInstance().getCurScope();
        this.checkParameters();
    }

    public void checkParameters() {
        if (this.argsCtx.simpleExpression().size() != 0) {
            List<SimpleExpressionContext> args = argsCtx.simpleExpression();

            int i = 0;
            while (i < args.size()) {
                SimpleExpressionContext simpleCtx = args.get(i);

                if (i < this.func.getParameterCount()) {
                    TypeMismatchChecker typeMMSemCheck = new TypeMismatchChecker(this.func.getParamAt(i), simpleCtx);
                    typeMMSemCheck.check();
                }
                i++;
            }
        }
        else {
            return;
        }
    }

    public void mapParameters() {
        if (this.argsCtx.simpleExpression().size() == 0) {
            return;
        }

        List<SimpleExpressionContext> args = argsCtx.simpleExpression();
        int i = 0;

        while (i < args.size()) {
            SimpleExpressionContext simpleCtx = args.get(i);

            switch (this.func.getParamAt(i).getPrimitiveType()) {
                case ARRAY:
                    String id = simpleCtx.getText();
                    this.func.mapArrayParameter(id, this.localScope.getVariableAllScope(id), i);
                    break;

                default:
                    EvaluateCommand evalCommand = new EvaluateCommand(simpleCtx, this.localScope);
                    evalCommand.execute();

                    if (i < this.func.getParameterCount()) {
                        MangcaluaValue paramValue = this.func.getParamAt(i);
                        paramValue.setValue(evalCommand.getEvaluated().toPlainString());
                    }
                    break;
            }
            i++;
        }
    }

    @Override
    public void execute() {
        this.mapParameters();
        this.func.execute();
    }
}