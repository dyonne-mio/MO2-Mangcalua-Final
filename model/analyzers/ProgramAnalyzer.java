package model.analyzers;

import model.symboltable.LocalScope;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.MangcaluaParser;
import parser.MangcaluaParser.CompilationUnitContext;
import parser.MangcaluaParser.FunctionDeclarationContext;
import parser.MangcaluaParser.MainDeclarationContext;
import parser.MangcaluaParser.BlockStmtContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

import model.symboltable.SymbolTableManager;

public class ProgramAnalyzer implements ParseTreeListener {

    public ProgramAnalyzer() {}

    public void analyze(CompilationUnitContext ctx) {
        SymbolTableManager.getInstance();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, ctx);
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
	public void enterEveryRule(ParserRuleContext PRCtx) {

		if(PRCtx instanceof FunctionDeclarationContext) {
            FunctionDeclarationContext funcCtx = (FunctionDeclarationContext) PRCtx;
			FunctionDeclarationAnalyzer analyzer = new FunctionDeclarationAnalyzer();
            analyzer.analyze(funcCtx);
		}
		else if (PRCtx instanceof MainDeclarationContext) {
            MainDeclarationContext mainCtx = (MainDeclarationContext) PRCtx;
            BlockStmtContext compoundCtx = mainCtx.blockStmt();
            if (compoundCtx != null) {
                LocalScope localScope = new LocalScope(SymbolTableManager.getInstance().getCurScope());
                SymbolTableManager.getInstance().setCurScope(localScope);
                System.out.println("Opened main scope");
                CompoundAnalyzer analyzer = new CompoundAnalyzer();
                analyzer.analyze(compoundCtx);
            }
        }
	}

    @Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		
	}
}