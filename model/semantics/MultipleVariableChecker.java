package model.semantics;

import model.Console;
import model.symboltable.SymbolTableManager;
import parser.MangcaluaParser.ScopedVariableDeclarationContext;
import parser.MangcaluaParser.VariableDeclarationInitializeContext;
import parser.MangcaluaParser.ArrayVariableDeclarationInitializeContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class MultipleVariableChecker implements SemanticsChecker, ParseTreeListener {

	private ScopedVariableDeclarationContext varIdCtx;
	private int line;

	public MultipleVariableChecker(ScopedVariableDeclarationContext varIdCtx) {
		this.varIdCtx = varIdCtx;
		Token first = this.varIdCtx.getStart();
		this.line = first.getLine();
	}

    @Override
	public void check() {
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, this.varIdCtx);
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		if (!(ctx instanceof VariableDeclarationInitializeContext)) {
			if(ctx instanceof ArrayVariableDeclarationInitializeContext) {
				ArrayVariableDeclarationInitializeContext varDecCtx = (ArrayVariableDeclarationInitializeContext) ctx;
				if (varDecCtx.Identifier() != null && SymbolTableManager.getInstance().searchMyScopeVariable(varDecCtx.Identifier().getText()) != null) {
					Console.log("Multiple Variable error found. '" + varDecCtx.Identifier().getText() + "' has already been declared.", this.line);
				}
			}
		}
		else {
			VariableDeclarationInitializeContext varDecCtx = (VariableDeclarationInitializeContext) ctx;

			if (SymbolTableManager.getInstance().searchMyScopeVariable(varDecCtx.Identifier().getText()) != null) {
				Console.log("Multiple Variable error found. '" + varDecCtx.Identifier().getText() + "' has already been declared.", this.line);
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
}