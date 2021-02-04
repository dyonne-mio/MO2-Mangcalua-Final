package model.semantics;

import model.representations.*;
import model.Console;
import model.symboltable.SymbolTableManager;
import parser.MangcaluaParser.FunctionDeclarationContext;
import org.antlr.v4.runtime.Token;


public class MultipleFunctionChecker implements SemanticsChecker {
	private FunctionDeclarationContext funcIdCtx;
	private int line;

	public MultipleFunctionChecker(FunctionDeclarationContext funcIdCtx) {
		this.funcIdCtx = funcIdCtx;

		Token first = funcIdCtx.getStart();
		this.line = first.getLine();
	}

    @Override
	public void check() {
		if (funcIdCtx.Identifier() != null) {
			MangcaluaFunction mangcaluaFunction = SymbolTableManager.getInstance().getFunction(funcIdCtx.Identifier().getText());

			if (mangcaluaFunction != null) {
				Console.log("Multiple Function error is found. Function '" + funcIdCtx.Identifier().getText() + "' has already been declared.", this.line);
			}
		}
	}
}