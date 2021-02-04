package model.analyzers;

import parser.MangcaluaParser.BlockStmtContext;
import parser.MangcaluaParser.BlockStmtBodyContext;

import java.util.*;
import model.symboltable.SymbolTableManager;

public class CompoundAnalyzer {

    public CompoundAnalyzer() { }

    public void analyze(BlockStmtContext ctx) {
		List<BlockStmtBodyContext> stmtList = ctx.blockStmtBody();
		for (BlockStmtBodyContext stmt : stmtList) {

			if (stmt.scopedVariableDeclaration() != null) {
				VariableDeclarationAnalyzer analyzer = new VariableDeclarationAnalyzer();
				analyzer.analyze(stmt.scopedVariableDeclaration());
			}
			else if (stmt.statement() != null) {
				StatementAnalyzer visitor = new StatementAnalyzer();
				visitor.visit(stmt.statement());
			}
		}
		SymbolTableManager.getInstance().goToParent();
    }
    
}