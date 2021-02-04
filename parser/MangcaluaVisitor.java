// Generated from C:/Users/Dyonne/Documents/GitHub/MO2-Mangcalua/grammar\Mangcalua.g4 by ANTLR 4.9
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MangcaluaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MangcaluaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(MangcaluaParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#mainDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainDeclaration(MangcaluaParser.MainDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(MangcaluaParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(MangcaluaParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#arrayDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDataType(MangcaluaParser.ArrayDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#variableDeclarationInitialize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationInitialize(MangcaluaParser.VariableDeclarationInitializeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#scopedVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopedVariableDeclaration(MangcaluaParser.ScopedVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#arrayVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVariableDeclaration(MangcaluaParser.ArrayVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#arrayVariableDeclarationInitialize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVariableDeclarationInitialize(MangcaluaParser.ArrayVariableDeclarationInitializeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#dataTypeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeSelector(MangcaluaParser.DataTypeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(MangcaluaParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(MangcaluaParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(MangcaluaParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MangcaluaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#expressionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStmt(MangcaluaParser.ExpressionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#blockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(MangcaluaParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#blockStmtBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmtBody(MangcaluaParser.BlockStmtBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(MangcaluaParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#printParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintParams(MangcaluaParser.PrintParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#printParamsSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintParamsSelector(MangcaluaParser.PrintParamsSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#scanStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanStmt(MangcaluaParser.ScanStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#selectionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStmt(MangcaluaParser.SelectionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#elseSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseSelector(MangcaluaParser.ElseSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#iterationStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStmt(MangcaluaParser.IterationStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MangcaluaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(MangcaluaParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#iterationToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationToStatement(MangcaluaParser.IterationToStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#loopDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopDeclaration(MangcaluaParser.LoopDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(MangcaluaParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(MangcaluaParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#assignmentStandaloneExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStandaloneExpression(MangcaluaParser.AssignmentStandaloneExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#createArrayExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateArrayExpression(MangcaluaParser.CreateArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(MangcaluaParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#unaryRelExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryRelExpression(MangcaluaParser.UnaryRelExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#relExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpression(MangcaluaParser.RelExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#sumExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumExpression(MangcaluaParser.SumExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#mulExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression(MangcaluaParser.MulExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(MangcaluaParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MangcaluaParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#relOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOperator(MangcaluaParser.RelOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#sumOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumOperator(MangcaluaParser.SumOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#mulOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOperator(MangcaluaParser.MulOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(MangcaluaParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#mutable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMutable(MangcaluaParser.MutableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#immutable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImmutable(MangcaluaParser.ImmutableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(MangcaluaParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(MangcaluaParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangcaluaParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(MangcaluaParser.ConstantContext ctx);
}