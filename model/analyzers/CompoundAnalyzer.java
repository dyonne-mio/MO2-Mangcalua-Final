package model.analyzers;

import parser.MangcaluaParser.BlockStmtContext;
import parser.MangcaluaParser.BlockStmtBodyContext;

import java.util.*;
import model.symboltable.SymbolTableManager;

public class CompoundAnalyzer {

    public CompoundAnalyzer() { }

    public void analyze(BlockStmtContext ctx) {
		List<BlockStmtBodyContext> statementList = ctx.blockStmtBody();
		for (BlockStmtBodyContext statement : statementList) {

			if (statement.scopedVariableDeclaration() != null) {
				VariableDeclarationAnalyzer analyzer = new VariableDeclarationAnalyzer();
				analyzer.analyze(statement.scopedVariableDeclaration());
			}
			else if (statement.statement() != null) {
				StatementAnalyzer visitor = new StatementAnalyzer();
				visitor.visit(statement.statement());
			}
		}
		SymbolTableManager.getInstance().goToParent();
    }
    
}