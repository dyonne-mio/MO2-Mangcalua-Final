package model.analyzers;

import model.runtime.RuntimeManager;
import model.symboltable.LocalScope;
import model.symboltable.SymbolTableManager;
import model.trackers.StatementControlTracker;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.MangcaluaParser.ScopedVariableDeclarationContext;
import parser.MangcaluaParser.VariableDeclarationContext;
import parser.MangcaluaParser.VariableDeclarationInitializeContext;
import parser.MangcaluaParser.ArrayVariableDeclarationInitializeContext;
import parser.MangcaluaParser.ArrayVariableDeclarationContext;
import parser.MangcaluaParser.DataTypeContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

import model.*;
import model.semantics.*;
import model.representations.*;
import model.commands.*;

public class VariableDeclarationAnalyzer implements ParseTreeListener {

    public VariableDeclarationAnalyzer() {}

    public void analyze(ScopedVariableDeclarationContext ctx) {
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

		if (PRCtx instanceof ScopedVariableDeclarationContext) {
			ScopedVariableDeclarationContext scopedVarDecCtx = (ScopedVariableDeclarationContext) PRCtx;
			MangcaluaValue mangcaluaValue = null;
			MultipleVariableChecker mulVarSemCheck = new MultipleVariableChecker(scopedVarDecCtx);
			mulVarSemCheck.check();
			if (scopedVarDecCtx.variableDeclaration() != null) {
				VariableDeclarationContext varDecCtx = scopedVarDecCtx.variableDeclaration();
				VariableDeclarationInitializeContext varDecInitCtx = varDecCtx.variableDeclarationInitialize();
				if (varDecCtx.dataType().Int() != null) {
					mangcaluaValue = new MangcaluaValue(null, "int");
				}
				else if (varDecCtx.dataType().Bool() != null) {
					mangcaluaValue = new MangcaluaValue(null, "bool");
				}
				else if (varDecCtx.dataType().String() != null) {
					mangcaluaValue = new MangcaluaValue(null, "String");
				}
				else if (varDecCtx.dataType().Float() != null) {
					mangcaluaValue = new MangcaluaValue(null, "float");
				}
				if (mangcaluaValue != null && varDecCtx.ConstantKeyword() != null)
					mangcaluaValue.markConst();

				if (varDecInitCtx.Assign() != null) {
					TypeMismatchChecker typeMMSemCheck = new TypeMismatchChecker(mangcaluaValue, varDecInitCtx.simpleExpression());
					typeMMSemCheck.check();
					InitializeCommand initializeCommand = new InitializeCommand(varDecCtx, varDecInitCtx.simpleExpression());
					addCommand(initializeCommand);
				}
				LocalScope localScope = SymbolTableManager.getInstance().getCurScope();
				localScope.addVariable(varDecInitCtx.Identifier().getText(), mangcaluaValue);
			}
			else if (scopedVarDecCtx.arrayVariableDeclaration() != null) {
				ArrayVariableDeclarationContext arrVarDecCtx = scopedVarDecCtx.arrayVariableDeclaration();
				ArrayVariableDeclarationInitializeContext arrVarDecInitCtx = scopedVarDecCtx.arrayVariableDeclaration().arrayVariableDeclarationInitialize();
				MangcaluaArray mangcaluaArray = null;
				if (arrVarDecInitCtx.Identifier() != null) {
					if (arrVarDecCtx.arrayDataType().dataType().Int() != null) {
						mangcaluaArray = MangcaluaArray.createArray("int", arrVarDecInitCtx.Identifier().getText());
						mangcaluaArray.setPrimitiveType(PrimitiveType.INT);
					}
					else if (arrVarDecCtx.arrayDataType().dataType().Bool() != null) {
						mangcaluaArray = MangcaluaArray.createArray("bool", arrVarDecInitCtx.Identifier().getText());
						mangcaluaArray.setPrimitiveType(PrimitiveType.BOOLEAN);
					}
					else if (arrVarDecCtx.arrayDataType().dataType().String() != null) {
						mangcaluaArray = MangcaluaArray.createArray("String", arrVarDecInitCtx.Identifier().getText());
						mangcaluaArray.setPrimitiveType(PrimitiveType.STRING);
					}
					else if (arrVarDecCtx.arrayDataType().dataType().Float() != null) {
						mangcaluaArray = MangcaluaArray.createArray("float", arrVarDecInitCtx.Identifier().getText());
						mangcaluaArray.setPrimitiveType(PrimitiveType.FLOAT);
					}
				}
				mangcaluaValue = new MangcaluaValue(mangcaluaArray, "array");
				if (mangcaluaValue != null && arrVarDecCtx.ConstantKeyword() != null)
					mangcaluaValue.markConst();

				if (arrVarDecInitCtx.mutable() != null) {
					String id = arrVarDecInitCtx.mutable().Identifier().getText();
					MangcaluaValue pv = SymbolTableManager.getInstance().searchMyScopeVariable(id);
					if (pv == null) {
						Console.log("Undeclared variable error - " + id + " not found." , arrVarDecInitCtx.getStart().getLine());
					} else {
						String errorTemplate = "Type mismatch error - ";
						
						if (pv.getPrimitiveType() != PrimitiveType.ARRAY) {
							String msg = "Expected array for variable '" + id + "'";
							Console.log(errorTemplate + msg, arrVarDecInitCtx.getStart().getLine());
						} else {
							MangcaluaArray pa = (MangcaluaArray) mangcaluaValue.getValue();
							MangcaluaArray pa1 = (MangcaluaArray) pv.getValue();

							if(pa.getPrimitiveType() == PrimitiveType.BOOLEAN && pa1.getPrimitiveType() != PrimitiveType.BOOLEAN) {
								String msg = "Expected boolean array for variable '" + id + "'";
								Console.log(errorTemplate + msg, arrVarDecInitCtx.getStart().getLine());
							}
							else if(pa.getPrimitiveType() == PrimitiveType.INT && pa1.getPrimitiveType() != PrimitiveType.INT) {
								String msg = "Expected integer array for variable '" + id + "'";
								Console.log(errorTemplate + msg, arrVarDecInitCtx.getStart().getLine());
							}
							else if(pa.getPrimitiveType() == PrimitiveType.FLOAT && pa1.getPrimitiveType() != PrimitiveType.FLOAT) {
								String msg = "Expected float array for variable '" + id + "'";
								Console.log(errorTemplate + msg, arrVarDecInitCtx.getStart().getLine());
							}
							else if(pa.getPrimitiveType() == PrimitiveType.STRING && pa1.getPrimitiveType() != PrimitiveType.STRING) {
								String msg = "Expected String array for variable '" + id + "'";
								Console.log(errorTemplate + msg, arrVarDecInitCtx.getStart().getLine());
							}
						}
						InitializeArrayCommand initializeArrayCommand = new InitializeArrayCommand(arrVarDecInitCtx.Identifier(), arrVarDecInitCtx.mutable());
						addCommand(initializeArrayCommand);
					}
				} else if (arrVarDecInitCtx.createArrayExpression() != null) {
					DataTypeContext typeSpecifier = arrVarDecInitCtx.createArrayExpression().dataType();
					if ((arrVarDecCtx.arrayDataType().dataType().Int() != null && typeSpecifier.Int() == null) ||
					(arrVarDecCtx.arrayDataType().dataType().Float() != null && typeSpecifier.Float() == null) ||
					(arrVarDecCtx.arrayDataType().dataType().String() != null && typeSpecifier.String() == null) ||
					(arrVarDecCtx.arrayDataType().dataType().Bool() != null && typeSpecifier.Bool() == null) ) {
						Console.log("Type mismatch error - initialize type is not the same as variable type.", arrVarDecCtx.getStart().getLine() );
					}
					TypeMismatchChecker typeMMSemCheck = new TypeMismatchChecker(new MangcaluaValue(null, "int"), arrVarDecInitCtx.createArrayExpression().simpleExpression());
					typeMMSemCheck.check();
					CreateArrayCommand createArrCommand = new CreateArrayCommand(arrVarDecInitCtx.createArrayExpression().simpleExpression(), mangcaluaArray);
					addCommand(createArrCommand);
				}
				if (arrVarDecInitCtx.Identifier() != null) {
					LocalScope localScope = SymbolTableManager.getInstance().getCurScope();
					localScope.addVariable(arrVarDecInitCtx.Identifier().getText(), mangcaluaValue);
				}
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

    @Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
	}
}