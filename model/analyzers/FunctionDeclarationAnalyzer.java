package model.analyzers;

import model.runtime.RuntimeManager;
import model.symboltable.SymbolTableManager;
import model.trackers.FunctionReturnTracker;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.MangcaluaParser.DataTypeContext;
import parser.MangcaluaParser.FunctionDeclarationContext;
import parser.MangcaluaParser.BlockStmtContext;
import parser.MangcaluaParser.ParamsContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

import model.*;
import model.semantics.MultipleFunctionChecker;
import model.representations.*;

public class FunctionDeclarationAnalyzer implements ParseTreeListener {

    private MangcaluaFunction func = new MangcaluaFunction();
    private boolean openedScope = false;

    public FunctionDeclarationAnalyzer() { }

    public void analyze(FunctionDeclarationContext ctx) {
        SymbolTableManager sm = SymbolTableManager.getInstance();
        MultipleFunctionChecker checker = new MultipleFunctionChecker(ctx);
        checker.check();
        String id = ctx.Identifier().getText();
        func.setName(id);
        if (ctx.dataType() != null) {
            DataTypeContext typeCtx = ctx.dataType();
            if (typeCtx.Int()!= null)
                func.setReturnType(FunctionType.INT);
            else if (typeCtx.Bool()!= null)
                func.setReturnType(FunctionType.BOOLEAN);
            else if (typeCtx.String()!= null)
                func.setReturnType(FunctionType.STRING);
            else if (typeCtx.Float()!= null)
                func.setReturnType(FunctionType.FLOAT);
        }
        else if (ctx.arrayDataType() != null) {
            DataTypeContext typeCtx = ctx.arrayDataType().dataType();
            if (typeCtx.Int()!= null)
                func.setReturnType(FunctionType.INT, 1);
            else if (typeCtx.Bool()!= null)
                func.setReturnType(FunctionType.BOOLEAN, 1);
            else if (typeCtx.String()!= null)
                func.setReturnType(FunctionType.STRING, 1);
            else if (typeCtx.Float()!= null)
                func.setReturnType(FunctionType.FLOAT, 1);
        }
        else if (ctx.Void() != null)
            func.setReturnType(FunctionType.VOID);

        sm.addFunction(id, func);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, ctx);
    }

    @Override
	public void enterEveryRule(ParserRuleContext ctx) {
        if (ctx instanceof ParamsContext) {
            ParamsContext paramsCtx = (ParamsContext) ctx;
            func.getLocalScope().setParent(SymbolTableManager.getInstance().getCurScope());
            SymbolTableManager.getInstance().setCurScope(func.getLocalScope());
            if (paramsCtx.parameter() != null) {
                ParameterAnalyzer analyzer = new ParameterAnalyzer(func);
                analyzer.analyze(paramsCtx.parameter());
            }
        } else if (ctx instanceof BlockStmtContext && !openedScope) {
            openedScope = true;
            RuntimeManager.getInstance().openFunctionDeclaration(func);
            FunctionReturnTracker.getInstance().setCurFunction(func);
            BlockStmtContext bCtx = (BlockStmtContext) ctx;
            CompoundAnalyzer analyzer = new CompoundAnalyzer();
            analyzer.analyze(bCtx);

            if (!FunctionReturnTracker.getInstance().hasReturn() && func.getReturnType() != FunctionType.VOID)
                Console.log("Missing return statement for function \'" + func.getName() + "\'", ctx.getStart().getLine());

            RuntimeManager.getInstance().closeFunctionDeclaration();
            FunctionReturnTracker.getInstance().reset();
        }
		
	}

    @Override
	public void exitEveryRule(ParserRuleContext ctx) {
		
	}

    @Override
	public void visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		
	}

    
}