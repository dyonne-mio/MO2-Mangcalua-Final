package model.analyzers;

import model.runtime.RuntimeManager;
import model.symboltable.LocalScope;
import model.symboltable.SymbolTableManager;
import model.trackers.FunctionReturnTracker;
import model.trackers.StatementControlTracker;
import parser.MangcaluaParser.StatementContext;
import parser.MangcaluaParser.ScanStmtContext;
import parser.MangcaluaParser.PrintStmtContext;
import parser.MangcaluaParser.IterationStmtContext;
import parser.MangcaluaParser.SelectionStmtContext;
import parser.MangcaluaParser.MutableContext;
import parser.MangcaluaParser.DataTypeContext;
import parser.MangcaluaParser.AssignmentStandaloneExpressionContext;

import org.antlr.v4.runtime.ParserRuleContext;


import model.representations.*;
import model.semantics.*;
import model.commands.*;
import model.*;

public class StatementAnalyzer {

    public StatementAnalyzer() { }

	public void visit(ParserRuleContext ctx) {
        if (ctx instanceof StatementContext) {
            StatementContext stmtCtx = (StatementContext) ctx;
            if (stmtCtx.scanStmt() != null) {
                ScanStmtContext scanCtx = stmtCtx.scanStmt();
                if (scanCtx.Identifier() != null) {
                    MangcaluaValue mangcaluaValue = SymbolTableManager.getInstance().searchMyScopeVariable(scanCtx.Identifier().getText());
                    if(mangcaluaValue == null)
                        Console.log("Undeclared variable error - '" + scanCtx.Identifier().getText() + "' cannot be found at scan statement", stmtCtx.getStart().getLine());
                    else {
                        if (mangcaluaValue.getPrimitiveType() == PrimitiveType.ARRAY)
                            Console.log("Type mismatch error - you cannot scan directly to an array.", stmtCtx.getStart().getLine());
                        else {
                            ScanCommand scanCommand = new ScanCommand(scanCtx.StringLiteral().getText() , scanCtx.Identifier().getText());
                            addCommand(scanCommand);
                        }
                    }
                }
            } else if (stmtCtx.printStmt() != null) {
                PrintStmtContext printCtx = stmtCtx.printStmt();
                if (printCtx.printParams() != null) {
                    PrintCommand printCommand = new PrintCommand(printCtx.printParams());
                    addCommand(printCommand);
                }
            } else if (stmtCtx.selectionStmt() != null) {
                SelectionStmtContext ifCtx = stmtCtx.selectionStmt();
                analyzeSelection(ifCtx);
            } else if (stmtCtx.iterationStmt() != null) {
                IterationStmtContext iterStmtCtx = stmtCtx.iterationStmt();
                IterationAnalyzer analyzer = new IterationAnalyzer();
                analyzer.analyze(iterStmtCtx);
            } else if (stmtCtx.expressionStmt() != null) {
                if (stmtCtx.expressionStmt().assignmentStandaloneExpression() != null) {
                    analyzeExpressionStmt(stmtCtx.expressionStmt().assignmentStandaloneExpression());
                } else if (stmtCtx.expressionStmt().call() != null) { // call
                    String id = stmtCtx.expressionStmt().call().Identifier().getText();
                    MangcaluaFunction pf = SymbolTableManager.getInstance().getFunction(id);
                    if (pf != null) {
                        FunctionCallChecker callSemCheck = new FunctionCallChecker(stmtCtx.expressionStmt().call());
                        callSemCheck.check();
                        FunctionCallCommand functionCallCommand = new FunctionCallCommand(pf, stmtCtx.expressionStmt().call().args());
                        addCommand(functionCallCommand);
                    } else {
                        Console.log("Undeclared function error - Try rearranging your functions.", ctx.getStart().getLine());
                    }
                }
            } else if (stmtCtx.returnStmt() != null) {
                if (FunctionReturnTracker.getInstance().getCurFunction() != null && SymbolTableManager.getInstance().getCurScope().getParent() == null) {
                    FunctionReturnTracker.getInstance().setHasReturn(true);
                }
                ReturnCommand callCommand = new ReturnCommand(stmtCtx.returnStmt().simpleExpression(), FunctionReturnTracker.getInstance().getCurFunction());
                addCommand(callCommand);
                UndeclaredChecker undeclaredSemCheck = new UndeclaredChecker(stmtCtx.returnStmt().simpleExpression());
                undeclaredSemCheck.check();
            } 
        } else if (ctx instanceof SelectionStmtContext) {
            SelectionStmtContext ifCtx = (SelectionStmtContext) ctx;
            analyzeSelection(ifCtx);
        } 
    }

    private void analyzeSelection(SelectionStmtContext ifCtx) {

        UndeclaredChecker checker = new UndeclaredChecker(ifCtx.simpleExpression());
        checker.check();
        LocalScope localScope = new LocalScope(SymbolTableManager.getInstance().getCurScope());
        SymbolTableManager.getInstance().setCurScope(localScope);
        IfCommand ifCommand = new IfCommand(ifCtx);
        StatementControlTracker.getInstance().enterConditionalCommand(ifCommand);
        // if and else if
        CompoundAnalyzer analyzer = new CompoundAnalyzer();
        analyzer.analyze(ifCtx.blockStmt());
        StatementControlTracker.getInstance().exitIfCommand();
        // else
        if (ifCtx.elseSelector() != null) {
            if (ifCtx.elseSelector().blockStmt() != null) {
                LocalScope elseLocalScope = new LocalScope(SymbolTableManager.getInstance().getCurScope());
                SymbolTableManager.getInstance().setCurScope(elseLocalScope);
                CompoundAnalyzer analyzer1 = new CompoundAnalyzer();
                analyzer1.analyze(ifCtx.elseSelector().blockStmt());
            }
            else {
                StatementAnalyzer stmtVisitor = new StatementAnalyzer();
                stmtVisitor.visit(ifCtx.elseSelector().selectionStmt());
            }
        }
        StatementControlTracker.getInstance().exitControlledCommand();
    }   

    private void analyzeExpressionStmt(AssignmentStandaloneExpressionContext ctx) {
        MutableContext mutableCtx = ctx.mutable();
        ConstantChecker checker = new ConstantChecker(mutableCtx.Identifier());
        checker.check();
        MangcaluaValue pv = SymbolTableManager.getInstance().searchMyScopeVariable(mutableCtx.Identifier().getText());
        if (ctx.simpleExpression() != null) { // x = 2 + 2
            if (pv != null) {
                AssignCommand assignCommand = new AssignCommand(mutableCtx, ctx.simpleExpression());
                addCommand(assignCommand);
            } else {
                Console.log("Undeclared variable error - '" + mutableCtx.Identifier().getText() + "' cannot be found", ctx.getStart().getLine());
            }
            
        } else if (ctx.createArrayExpression() != null) { //  x= create int[]

            if (pv.getPrimitiveType() != PrimitiveType.ARRAY) {
                Console.log("Type mismatch error - '" +  mutableCtx.Identifier().getText() + "' is not an array", ctx.getStart().getLine());
            } else {
                DataTypeContext typeSpecifier = ctx.createArrayExpression().dataType();
                MangcaluaArray pa = (MangcaluaArray) pv.getValue();
                if ((pa.getPrimitiveType() == PrimitiveType.INT && typeSpecifier.Int() == null) || 
                    (pa.getPrimitiveType() == PrimitiveType.STRING && typeSpecifier.String() == null) || 
                    (pa.getPrimitiveType() == PrimitiveType.BOOLEAN && typeSpecifier.Bool() == null) ||
                    (pa.getPrimitiveType() == PrimitiveType.FLOAT && typeSpecifier.Float() == null) ) {
                    Console.log("Type mismatch error - initialize type is not the same as variable type.", ctx.getStart().getLine() );
                }
                TypeMismatchChecker typeMMSemCheck = new TypeMismatchChecker(new MangcaluaValue(null, "int"), ctx.createArrayExpression().simpleExpression());
                typeMMSemCheck.check();
                CreateArrayCommand createArrCommand = new CreateArrayCommand(ctx.createArrayExpression().simpleExpression(), pa);
                addCommand(createArrCommand);
            }
        } 
    }

    private void addCommand(Command c) {
        StatementControlTracker stmtCtrlTracker = StatementControlTracker.getInstance();
        if (stmtCtrlTracker.isConditionalCommand()) {
            ConditionalCommand ifCommand = (ConditionalCommand) stmtCtrlTracker.getCurCommand();
            if (stmtCtrlTracker.inIf())
                ifCommand.addIfCommand(c);
            else
                ifCommand.addElseCommand(c);
        } else if (stmtCtrlTracker.isControlledCommand()) {
            ControlledCommand controlledCommand = (ControlledCommand) stmtCtrlTracker.getCurCommand();
            controlledCommand.addCommand(c);
        }  else {
            RuntimeManager.getInstance().addCommand(c);
        }
    }
}