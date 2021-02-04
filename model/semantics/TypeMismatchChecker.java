package model.semantics;

import model.representations.*;
import model.Console;
import model.symboltable.SymbolTableManager;
import parser.MangcaluaParser.SimpleExpressionContext;
import parser.MangcaluaParser.ConstantContext;
import parser.MangcaluaParser.MutableContext;
import parser.MangcaluaParser.CallContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

import java.util.*;

public class TypeMismatchChecker implements SemanticsChecker, ParseTreeListener {
    private static final String errorTemplate = "Type Mismatch found:  ";
    private MangcaluaValue mangcaluaValue;
    private SimpleExpressionContext exprCtx;
    private int line;
	private boolean isArgs = false;
	private List<String> excluded;

    public TypeMismatchChecker(MangcaluaValue mangcaluaValue, SimpleExpressionContext exprCtx) {
        this.mangcaluaValue = mangcaluaValue;
        this.exprCtx = exprCtx;

		excluded = new ArrayList<>();

        Token first = exprCtx.getStart();
        this.line = first.getLine();
    }

    @Override
	public void check() {
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		treeWalker.walk(this, this.exprCtx);
	}

    @Override
	public void enterEveryRule(ParserRuleContext ctx) {
		if (!(ctx instanceof ConstantContext)) {
			if (ctx instanceof MutableContext) {
				MutableContext mutCtx = (MutableContext) ctx;
				if (!isInExcluded(mutCtx.getText())) {
					if (mutCtx.LeftBracket() == null){
						MangcaluaValue variable = SymbolTableManager.getInstance().searchMyScopeVariable(mutCtx.Identifier().getText());
						if( variable != null) {
							analyzeType(variable);
						}
					}
				}
			}

			else if (ctx instanceof CallContext) {
				CallContext callCtx = (CallContext) ctx;

				String id = callCtx.Identifier().getText();
				MangcaluaFunction function = SymbolTableManager.getInstance().getFunction(id);

				if (function != null) {
					MangcaluaValue variable = function.getReturnValue();

					if (function.getReturnType() == FunctionType.VOID) {
						String msg = "Function has void return type. Consider changing the return type. ";
						Console.log(errorTemplate + msg, this.line);
					} else if (variable != null) {
						analyzeType(variable);
					}
				}
				else{
					//String msg = "Reference to null function type.";
					//Console.log(errorTemplate + msg, this.line);
				}

				FunctionCallChecker callSemCheck = new FunctionCallChecker(callCtx);
				callSemCheck.check();

				List<SimpleExpressionContext> arguments = callCtx.args().simpleExpression();

				for (SimpleExpressionContext exprCtx : arguments) {
					excluded.add(exprCtx.getText());
				}
			}
		}
		else {
			if(this.mangcaluaValue == null) {
				return;
			}

			ConstantContext constCtx = (ConstantContext) ctx;
			String expressionString = constCtx.getText();

			if (!isInExcluded(expressionString)) {
				switch (this.mangcaluaValue.getPrimitiveType()) {
					case ARRAY:
						break;
					case BOOLEAN:
						if (constCtx.BoolConst() == null) {
							String msg = "Expected boolean.";
							Console.log(errorTemplate + msg, this.line);
						}
						break;
					case INT:
						if (constCtx.IntConst() == null) {
							String msg = "Expected int.";
							Console.log(errorTemplate + msg, this.line);
						}
						break;
					case FLOAT:
						if (constCtx.FloatConst() == null) {
							if (constCtx.IntConst() == null) {
								String msg = "Expected float.";
								Console.log(errorTemplate + msg, this.line);
							}
						}
						break;
					case STRING:
						if (constCtx.StringLiteral() == null) {
							String msg = "Expected string.";
							Console.log(errorTemplate + msg, this.line);
						}
						break;
				}
			}
		}
	}

	public void analyzeType(MangcaluaValue variable) {
		if (this.mangcaluaValue.getPrimitiveType() == PrimitiveType.ARRAY) {
			if (variable.getPrimitiveType() != PrimitiveType.ARRAY) {
				String msg = "Incompatible type " + variable.getPrimitiveType().toString() + ". Expecting array.";
				Console.log(errorTemplate + msg, this.line);
			}
			else {
				MangcaluaArray pa = (MangcaluaArray)this.mangcaluaValue.getValue();
				MangcaluaArray pa1 = (MangcaluaArray)variable.getValue();
				if(pa.getPrimitiveType() == PrimitiveType.BOOLEAN && pa1.getPrimitiveType() != PrimitiveType.BOOLEAN) {
					String msg = "Incompatible array type " + this.mangcaluaValue.getPrimitiveType().toString() + ". Expecting boolean array.";
					Console.log(errorTemplate + msg, this.line);
				}
				else if(pa.getPrimitiveType() == PrimitiveType.FLOAT && pa1.getPrimitiveType() != PrimitiveType.FLOAT) {
					String msg = "Incompatible array type " + this.mangcaluaValue.getPrimitiveType().toString() + ". Expecting float array.";
					Console.log(errorTemplate + msg, this.line);
				}
				else if(pa.getPrimitiveType() == PrimitiveType.INT && pa1.getPrimitiveType() != PrimitiveType.INT) {
					String msg = "Incompatible array type " + this.mangcaluaValue.getPrimitiveType().toString() + ". Expecting integer array.";
					Console.log(errorTemplate + msg, this.line);
				}
				else if(pa.getPrimitiveType() == PrimitiveType.STRING && pa1.getPrimitiveType() != PrimitiveType.STRING) {
					String msg = "Incompatible array type " + this.mangcaluaValue.getPrimitiveType().toString() + ". Expecting string array.";
					Console.log(errorTemplate + msg, this.line);
				}
			}

		}
		else {
			if(this.mangcaluaValue.getPrimitiveType() == PrimitiveType.BOOLEAN && variable.getPrimitiveType() != PrimitiveType.BOOLEAN) {
				String msg = "Incompatible type " + this.mangcaluaValue.getPrimitiveType().toString() + ". Expecting boolean.";
				Console.log(errorTemplate + msg, this.line);
			}
			else if(this.mangcaluaValue.getPrimitiveType() == PrimitiveType.INT && variable.getPrimitiveType() != PrimitiveType.INT) {
				String msg = "Incompatible type " + this.mangcaluaValue.getPrimitiveType().toString() + ". Expecting integer.";
				Console.log(errorTemplate + msg, this.line);
			}
			else if(this.mangcaluaValue.getPrimitiveType() == PrimitiveType.FLOAT && variable.getPrimitiveType() != PrimitiveType.FLOAT) {
				if (variable.getPrimitiveType() != PrimitiveType.INT) {
					String msg = "Incompatible type " + this.mangcaluaValue.getPrimitiveType().toString() + ". Expecting float.";
					Console.log(errorTemplate + msg, this.line);
				}
			}
			else if(this.mangcaluaValue.getPrimitiveType() == PrimitiveType.STRING && variable.getPrimitiveType() == PrimitiveType.ARRAY) {
				String msg = "Incompatible type " + this.mangcaluaValue.getPrimitiveType().toString() + ". Cannot assign array to string. Expecting string.";
				Console.log(errorTemplate + msg, this.line);
			}
		}
	}

    @Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		
	}

    @Override
	public void visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		
	}

	private boolean isInExcluded(String s) {
		boolean found = false;
		for (String ex: excluded){
			if (ex.contains(s)) {
				return true;
			}
		}
		return found;
	}

}