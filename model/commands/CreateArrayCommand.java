package model.commands;

import model.symboltable.LocalScope;
import model.symboltable.SymbolTableManager;
import parser.MangcaluaParser.SimpleExpressionContext;

import model.representations.*;
import model.semantics.*;

public class CreateArrayCommand implements Command {

    private SimpleExpressionContext exprCtx;
    private EvaluateCommand evalCommand;
    private MangcaluaArray array;
    private LocalScope localScope;

    public CreateArrayCommand(SimpleExpressionContext exprCtx, MangcaluaArray array) {
        this.exprCtx = exprCtx;
        this.array = array;
        this.localScope = SymbolTableManager.getInstance().getCurScope();

        UndeclaredChecker undeclaredSemCheck = new UndeclaredChecker(exprCtx);
        undeclaredSemCheck.check();
        evalCommand = new EvaluateCommand(this.exprCtx);
    }

    @Override
    public void execute() {
        evalCommand.execute();
       this.array.initSize(evalCommand.getEvaluated().intValue());
    }
}