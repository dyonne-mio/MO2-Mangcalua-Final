package model.semantics;

import model.representations.*;
import model.Console;
import model.symboltable.SymbolTableManager;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ConstantChecker implements SemanticsChecker {

	private TerminalNode id;
	private int line;

	public ConstantChecker(TerminalNode id) {
		this.id = id;

		Token first = this.id.getSymbol();
		this.line = first.getLine();
	}

    @Override
	public void check() {
		String stringId = id.getText();
		MangcaluaValue mangcaluaValue = SymbolTableManager.getInstance().searchMyScopeVariable(stringId);

		if (mangcaluaValue != null && mangcaluaValue.isConst())
			Console.log("Constant Error found, variables can only be assigned once.", this.line);
	}
} 