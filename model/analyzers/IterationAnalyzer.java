package model.analyzers;

import model.runtime.RuntimeManager;
import model.symboltable.LocalScope;
import model.trackers.StatementControlTracker;
import parser.MangcaluaParser.IterationStmtContext;
import parser.MangcaluaParser.WhileStatementContext;
import parser.MangcaluaParser.ForStatementContext;
import parser.MangcaluaParser.LoopDeclarationContext;

import model.symboltable.SymbolTableManager;
import model.semantics.*;
import model.Console;
import model.representations.*;
import model.commands.*;

public class IterationAnalyzer {

    public IterationAnalyzer() {}

    public void analyze(IterationStmtContext ctx) {
        
        if (ctx.whileStatement() != null ) {
            WhileStatementContext whileCtx = ctx.whileStatement();
            MangcaluaValue mangcaluaValue = SymbolTableManager.getInstance().searchMyScopeVariable(whileCtx.Identifier().getText());
			if(mangcaluaValue == null)
				Console.log("Undeclared variable error - '" +  whileCtx.Identifier().getText() + "' cannot be found at while statement", ctx.getStart().getLine());
			else {
                if (mangcaluaValue.getPrimitiveType() != PrimitiveType.INT)
                    Console.log("Type mismatch error - only integers can be used in while statements", ctx.getStart().getLine());
            }
            UndeclaredChecker undeclaredSemCheck = new UndeclaredChecker(whileCtx.simpleExpression());
            undeclaredSemCheck.check();
            TypeMismatchChecker typeMMSemCheck = new TypeMismatchChecker(new MangcaluaValue(null, "int"), whileCtx.simpleExpression());
            typeMMSemCheck.check();
            LocalScope localScope = new LocalScope(SymbolTableManager.getInstance().getCurScope());
            SymbolTableManager.getInstance().setCurScope(localScope);
            WhileCommand whileCommand = new WhileCommand(whileCtx);
            StatementControlTracker.getInstance().enterControlledCommand(whileCommand);
            CompoundAnalyzer analyzer = new CompoundAnalyzer();
            analyzer.analyze(whileCtx.blockStmt());
            StatementControlTracker.getInstance().exitControlledCommand();
        } else if (ctx.forStatement() != null) {
            ForStatementContext forCtx = ctx.forStatement();
            LoopDeclarationContext loopDecCtx = forCtx.loopDeclaration();
            if (loopDecCtx.Int() != null) {
                if (SymbolTableManager.getInstance().searchMyScopeVariable(loopDecCtx.Identifier().getText()) != null)
				    Console.log("Multiple variable declaration error - '" + loopDecCtx.Identifier().getText() +"' cannot be found at for statement", ctx.getStart().getLine());
			    else
                    SymbolTableManager.getInstance().getCurScope().addVariable(loopDecCtx.Identifier().getText(), new MangcaluaValue(null, "int"));
                if (loopDecCtx.Assign() != null ) {
                    IteratorAssignCommand iteratorAssignCommand = new IteratorAssignCommand(loopDecCtx.Identifier(), loopDecCtx.simpleExpression());
                    StatementControlTracker stmtCtrlTracker = StatementControlTracker.getInstance();
                    if (stmtCtrlTracker.isConditionalCommand()) {
                        ConditionalCommand ifCommand = (ConditionalCommand) stmtCtrlTracker.getCurCommand();
                        if (stmtCtrlTracker.inIf())
                            ifCommand.addIfCommand(iteratorAssignCommand);
                        else
                            ifCommand.addElseCommand(iteratorAssignCommand);
                    }else if (stmtCtrlTracker.isControlledCommand()) {
                        ControlledCommand controlledCommand = (ControlledCommand) stmtCtrlTracker.getCurCommand();
                        controlledCommand.addCommand(iteratorAssignCommand);
                    }else
                        RuntimeManager.getInstance().addCommand(iteratorAssignCommand);
                }

            } else {
                MangcaluaValue mangcaluaValue = SymbolTableManager.getInstance().searchMyScopeVariable(loopDecCtx.Identifier().getText());
                if(mangcaluaValue == null) {
                    Console.log("Undeclared variable error - '" + loopDecCtx.Identifier().getText()  + "' cannot be found at for statement", ctx.getStart().getLine());
                } else {
                    if (mangcaluaValue.getPrimitiveType() != PrimitiveType.INT)
                        Console.log("Type mismatch error - only integers can be used in for statements", ctx.getStart().getLine());
                }
                if (loopDecCtx.Assign() != null ) {
                    IteratorAssignCommand iteratorAssignCommand = new IteratorAssignCommand(loopDecCtx.Identifier(), loopDecCtx.simpleExpression());
                    StatementControlTracker stmtCtrlTracker = StatementControlTracker.getInstance();
                    if (stmtCtrlTracker.isConditionalCommand()) {
                        ConditionalCommand ifCommand = (ConditionalCommand) stmtCtrlTracker.getCurCommand();
                        if (stmtCtrlTracker.inIf())
                            ifCommand.addIfCommand(iteratorAssignCommand);
                        else
                            ifCommand.addElseCommand(iteratorAssignCommand);
                    } else if (stmtCtrlTracker.isControlledCommand()) {
                        ControlledCommand controlledCommand = (ControlledCommand) stmtCtrlTracker.getCurCommand();
                        controlledCommand.addCommand(iteratorAssignCommand);
                    }  else {
                        RuntimeManager.getInstance().addCommand(iteratorAssignCommand);
                    }
                }
            }
            UndeclaredChecker undeclaredSemCheck = new UndeclaredChecker(forCtx.simpleExpression());
            undeclaredSemCheck.check();
            TypeMismatchChecker typeMMSemCheck = new TypeMismatchChecker(new MangcaluaValue(null, "int"), forCtx.simpleExpression());
            typeMMSemCheck.check();
            LocalScope localScope = new LocalScope(SymbolTableManager.getInstance().getCurScope());
            SymbolTableManager.getInstance().setCurScope(localScope);
            ForCommand forCommand = new ForCommand(forCtx);
            StatementControlTracker.getInstance().enterControlledCommand(forCommand);
            CompoundAnalyzer analyzer = new CompoundAnalyzer();
            analyzer.analyze(forCtx.blockStmt());
            StatementControlTracker.getInstance().exitControlledCommand();   
        }
    }
}