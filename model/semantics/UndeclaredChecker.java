package model.semantics;

import model.representations.*;
import model.Console;
import model.symboltable.SymbolTableManager;
import parser.MangcaluaParser.SimpleExpressionContext;
import parser.MangcaluaParser.MutableContext;
import parser.MangcaluaParser.CallContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;


public class UndeclaredChecker implements SemanticsChecker, ParseTreeListener {
	private SimpleExpressionContext simpleCtx;
	private int line;

	public UndeclaredChecker(SimpleExpressionContext simpleCtx) {
		this.simpleCtx = simpleCtx;

		Token first = this.simpleCtx.getStart();
		this.line = first.getLine();
	}

    @Override
	public void check() {
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, this.simpleCtx);
	}

	@Override
	public void visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		if (!(ctx instanceof MutableContext)) {
			if (ctx instanceof CallContext) {
				CallContext callCtx = (CallContext) ctx;
				MangcaluaFunction mangcaluaFunction = SymbolTableManager.getInstance().getFunction(callCtx.Identifier().getText());

				if(mangcaluaFunction == null) {
					Console.log("Function is undeclared.'" + callCtx.Identifier().getText() + "' is not found.", this.line);
				}
			}
		}
		else {
			MutableContext mutableCtx = (MutableContext) ctx;
			MangcaluaValue mangcaluaValue = SymbolTableManager.getInstance().searchMyScopeVariable(mutableCtx.Identifier().getText());

			if (mangcaluaValue != null) {
				return;
			}
			Console.log("Variable is undeclared. '" + mutableCtx.Identifier().getText() + "' is not found.", this.line);
		}
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
	}
}