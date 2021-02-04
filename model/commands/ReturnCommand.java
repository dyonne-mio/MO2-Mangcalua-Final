package model.commands;

import model.symboltable.LocalScope;
import model.symboltable.SymbolTableManager;
import model.trackers.FunctionControlTracker;
import parser.MangcaluaParser.SimpleExpressionContext;

import model.*;
import model.representations.*;
import model.semantics.*;

public class ReturnCommand implements Command {
    private SimpleExpressionContext exprCtx;
    private MangcaluaFunction func;
    private LocalScope localScope;
    public ReturnCommand(SimpleExpressionContext exprCtx, MangcaluaFunction func) {
        this.exprCtx = exprCtx;
        this.func = func;
        this.localScope = SymbolTableManager.getInstance().getCurScope();
        UndeclaredChecker undeclaredSemCheck = new UndeclaredChecker(exprCtx);
        undeclaredSemCheck.check();
        MangcaluaValue mangcaluaValue = this.func.getReturnValue();
        if (this.func.getReturnType() != FunctionType.VOID) {
            TypeMismatchChecker typeMMSemCheck = new TypeMismatchChecker(mangcaluaValue, this.exprCtx);
            typeMMSemCheck.check();
        } else {
            Console.log("void function \'" + this.func.getName() + "\' has a return.", exprCtx.getStart().getLine());
        }
    }

    @Override
    public void execute() {
        EvaluateCommand evalCommand = new EvaluateCommand(this.exprCtx, FunctionControlTracker.getInstance().getCurFunction().getLocalScope());
        evalCommand.execute();
        System.out.println(evalCommand + " is eval instance");
        MangcaluaValue returnValue = FunctionControlTracker.getInstance().getCurFunction().getReturnValue();
        Util.assignValue(returnValue, evalCommand.getEvaluated());
        System.out.println( returnValue + "'s  value is now " + evalCommand.getEvaluated());
    }

    public int getLine() {
        return this.exprCtx.getStart().getLine();
    }
    
} 