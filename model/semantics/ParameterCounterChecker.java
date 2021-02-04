package model.semantics;

import java.util.*;

import model.representations.*;
import model.Console;
import parser.MangcaluaParser.ArgsContext;
import parser.MangcaluaParser.SimpleExpressionContext;


public class ParameterCounterChecker implements SemanticsChecker {
	private MangcaluaFunction mangcaluaFunction;
	private List<SimpleExpressionContext> exprCtxList;
	private int line;

	public ParameterCounterChecker(MangcaluaFunction mangcaluaFunction, ArgsContext argsCtx) {
		this.mangcaluaFunction = mangcaluaFunction;

		if (argsCtx.simpleExpression() != null) {
			this.exprCtxList = argsCtx.simpleExpression();
		}
		this.line = argsCtx.getStart().getLine();
	}

    @Override
	public void check() {
		if (this.mangcaluaFunction == null) {
			return;
		}
		else {
			if (this.exprCtxList != null || this.mangcaluaFunction.getParameterCount() == 0) {
				if (this.exprCtxList != null && this.mangcaluaFunction.getParameterCount() != this.exprCtxList.size() ) {
					Console.log("Mismatch error found. The same number of parameters must exist.", this.line);
				}
			}
			else {
				Console.log("Mismatch error found. The same number of parameters must exist.", this.line);
			}
		}
	}
}