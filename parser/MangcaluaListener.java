// Generated from C:/Users/Jerald Edric/Documents/DLSU 4th year/CMPILER/interpreter/MO2-Mangcalua/grammar\Mangcalua.g4 by ANTLR 4.9
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MangcaluaParser}.
 */
public interface MangcaluaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(MangcaluaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(MangcaluaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainDeclaration(MangcaluaParser.MainDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainDeclaration(MangcaluaParser.MainDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(MangcaluaParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(MangcaluaParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(MangcaluaParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(MangcaluaParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#arrayDataType}.
	 * @param ctx the parse tree
	 */
	void enterArrayDataType(MangcaluaParser.ArrayDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#arrayDataType}.
	 * @param ctx the parse tree
	 */
	void exitArrayDataType(MangcaluaParser.ArrayDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#variableDeclarationInitialize}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationInitialize(MangcaluaParser.VariableDeclarationInitializeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#variableDeclarationInitialize}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationInitialize(MangcaluaParser.VariableDeclarationInitializeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#scopedVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterScopedVariableDeclaration(MangcaluaParser.ScopedVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#scopedVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitScopedVariableDeclaration(MangcaluaParser.ScopedVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#arrayVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayVariableDeclaration(MangcaluaParser.ArrayVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#arrayVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayVariableDeclaration(MangcaluaParser.ArrayVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#arrayVariableDeclarationInitialize}.
	 * @param ctx the parse tree
	 */
	void enterArrayVariableDeclarationInitialize(MangcaluaParser.ArrayVariableDeclarationInitializeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#arrayVariableDeclarationInitialize}.
	 * @param ctx the parse tree
	 */
	void exitArrayVariableDeclarationInitialize(MangcaluaParser.ArrayVariableDeclarationInitializeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#dataTypeSelector}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeSelector(MangcaluaParser.DataTypeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#dataTypeSelector}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeSelector(MangcaluaParser.DataTypeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(MangcaluaParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(MangcaluaParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(MangcaluaParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(MangcaluaParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MangcaluaParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MangcaluaParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MangcaluaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MangcaluaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmt(MangcaluaParser.ExpressionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmt(MangcaluaParser.ExpressionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(MangcaluaParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(MangcaluaParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#blockStmtBody}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmtBody(MangcaluaParser.BlockStmtBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#blockStmtBody}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmtBody(MangcaluaParser.BlockStmtBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(MangcaluaParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(MangcaluaParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#printParams}.
	 * @param ctx the parse tree
	 */
	void enterPrintParams(MangcaluaParser.PrintParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#printParams}.
	 * @param ctx the parse tree
	 */
	void exitPrintParams(MangcaluaParser.PrintParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#printParamsSelector}.
	 * @param ctx the parse tree
	 */
	void enterPrintParamsSelector(MangcaluaParser.PrintParamsSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#printParamsSelector}.
	 * @param ctx the parse tree
	 */
	void exitPrintParamsSelector(MangcaluaParser.PrintParamsSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#scanStmt}.
	 * @param ctx the parse tree
	 */
	void enterScanStmt(MangcaluaParser.ScanStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#scanStmt}.
	 * @param ctx the parse tree
	 */
	void exitScanStmt(MangcaluaParser.ScanStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#selectionStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStmt(MangcaluaParser.SelectionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#selectionStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStmt(MangcaluaParser.SelectionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#elseSelector}.
	 * @param ctx the parse tree
	 */
	void enterElseSelector(MangcaluaParser.ElseSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#elseSelector}.
	 * @param ctx the parse tree
	 */
	void exitElseSelector(MangcaluaParser.ElseSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#iterationStmt}.
	 * @param ctx the parse tree
	 */
	void enterIterationStmt(MangcaluaParser.IterationStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#iterationStmt}.
	 * @param ctx the parse tree
	 */
	void exitIterationStmt(MangcaluaParser.IterationStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MangcaluaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MangcaluaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(MangcaluaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(MangcaluaParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#iterationToStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationToStatement(MangcaluaParser.IterationToStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#iterationToStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationToStatement(MangcaluaParser.IterationToStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#loopDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLoopDeclaration(MangcaluaParser.LoopDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#loopDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLoopDeclaration(MangcaluaParser.LoopDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(MangcaluaParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(MangcaluaParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(MangcaluaParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(MangcaluaParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#assignmentStandaloneExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStandaloneExpression(MangcaluaParser.AssignmentStandaloneExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#assignmentStandaloneExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStandaloneExpression(MangcaluaParser.AssignmentStandaloneExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#createArrayExpression}.
	 * @param ctx the parse tree
	 */
	void enterCreateArrayExpression(MangcaluaParser.CreateArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#createArrayExpression}.
	 * @param ctx the parse tree
	 */
	void exitCreateArrayExpression(MangcaluaParser.CreateArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(MangcaluaParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(MangcaluaParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#unaryRelExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryRelExpression(MangcaluaParser.UnaryRelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#unaryRelExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryRelExpression(MangcaluaParser.UnaryRelExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#relExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelExpression(MangcaluaParser.RelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#relExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelExpression(MangcaluaParser.RelExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#sumExpression}.
	 * @param ctx the parse tree
	 */
	void enterSumExpression(MangcaluaParser.SumExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#sumExpression}.
	 * @param ctx the parse tree
	 */
	void exitSumExpression(MangcaluaParser.SumExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(MangcaluaParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(MangcaluaParser.MulExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(MangcaluaParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(MangcaluaParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MangcaluaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MangcaluaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#relOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelOperator(MangcaluaParser.RelOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#relOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelOperator(MangcaluaParser.RelOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#sumOperator}.
	 * @param ctx the parse tree
	 */
	void enterSumOperator(MangcaluaParser.SumOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#sumOperator}.
	 * @param ctx the parse tree
	 */
	void exitSumOperator(MangcaluaParser.SumOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#mulOperator}.
	 * @param ctx the parse tree
	 */
	void enterMulOperator(MangcaluaParser.MulOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#mulOperator}.
	 * @param ctx the parse tree
	 */
	void exitMulOperator(MangcaluaParser.MulOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(MangcaluaParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(MangcaluaParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#mutable}.
	 * @param ctx the parse tree
	 */
	void enterMutable(MangcaluaParser.MutableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#mutable}.
	 * @param ctx the parse tree
	 */
	void exitMutable(MangcaluaParser.MutableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#immutable}.
	 * @param ctx the parse tree
	 */
	void enterImmutable(MangcaluaParser.ImmutableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#immutable}.
	 * @param ctx the parse tree
	 */
	void exitImmutable(MangcaluaParser.ImmutableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(MangcaluaParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(MangcaluaParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(MangcaluaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(MangcaluaParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangcaluaParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(MangcaluaParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangcaluaParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(MangcaluaParser.ConstantContext ctx);
}