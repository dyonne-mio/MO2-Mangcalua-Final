package model.semantics;

import model.representations.*;
import model.symboltable.SymbolTableManager;
import parser.MangcaluaParser.SimpleExpressionContext;
import parser.MangcaluaParser.CallContext;
import parser.MangcaluaParser.ArgsContext;
import org.antlr.v4.runtime.Token;

import java.util.*;

public class FunctionCallChecker implements SemanticsChecker {
    private CallContext callCtx;
    private int line;

    public FunctionCallChecker(CallContext callCtx) {
        this.callCtx = callCtx;

        Token first = callCtx.getStart();
        this.line = first.getLine();
    }

    @Override
	public void check() {
        String id = callCtx.Identifier().getText();
        MangcaluaFunction pf = SymbolTableManager.getInstance().getFunction(id);

        ArgsContext callArgsCtx = callCtx.args();

        ParameterCounterChecker paramCountSemCheck = new ParameterCounterChecker(pf, callArgsCtx);
        paramCountSemCheck.check();
        List<SimpleExpressionContext> callArgsList = callArgsCtx.simpleExpression();

        int i = 0, callArgsListSize = callArgsList.size();
        while (i < callArgsListSize) {
            SimpleExpressionContext exprCtx = callArgsList.get(i);
            UndeclaredChecker undeclaredSemCheck = new UndeclaredChecker(exprCtx);
            undeclaredSemCheck.check();
            i++;
        }
    }
}