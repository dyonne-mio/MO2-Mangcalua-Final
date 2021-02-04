package model;

import model.analyzers.*;
import parser.*;

// extend from base listener
public class MangcaluaCustomListener extends MangcaluaBaseListener {
	@Override public void enterCompilationUnit(MangcaluaParser.CompilationUnitContext ctx) {
		ProgramAnalyzer analyzer = new ProgramAnalyzer();
		analyzer.analyze(ctx);
	}
}