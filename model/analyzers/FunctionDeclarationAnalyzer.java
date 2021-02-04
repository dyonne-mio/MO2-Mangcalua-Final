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

    private MangcaluaFunction function = new MangcaluaFunction();
    private boolean openedScope = false;

    public FunctionDeclarationAnalyzer() { }

    public void analyze(FunctionDeclarationContext FDCtx) {
        SymbolTableManager stm = SymbolTableManager.getInstance();
        MultipleFunctionChecker checker = new MultipleFunctionChecker(FDCtx);
        checker.check();
        String id = FDCtx.Identifier().getText();
        function.setName(id);
        if (FDCtx.dataType() != null) {
            DataTypeContext typeCtx = FDCtx.dataType();
            if (typeCtx.Int()!= null)
                function.setReturnType(FunctionType.INT);
            else if (typeCtx.Bool()!= null)
                function.setReturnType(FunctionType.BOOLEAN);
            else if (typeCtx.String()!= null)
                function.setReturnType(FunctionType.STRING);
            else if (typeCtx.Float()!= null)
                function.setReturnType(FunctionType.FLOAT);
        }
        else if (FDCtx.arrayDataType() != null) {
            DataTypeContext typeCtx = FDCtx.arrayDataType().dataType();
            if (typeCtx.Int()!= null)
                function.setReturnType(FunctionType.INT, 1);
            else if (typeCtx.Bool()!= null)
                function.setReturnType(FunctionType.BOOLEAN, 1);
            else if (typeCtx.String()!= null)
                function.setReturnType(FunctionType.STRING, 1);
            else if (typeCtx.Float()!= null)
                function.setReturnType(FunctionType.FLOAT, 1);
        }
        else if (FDCtx.Void() != null)
            function.setReturnType(FunctionType.VOID);

        stm.addFunction(id, function);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, FDCtx);
    }

    @Override
	public void enterEveryRule(ParserRuleContext ctx) {
        if (ctx instanceof ParamsContext) {
            ParamsContext paramsCtx = (ParamsContext) ctx;
            function.getLocalScope().setParent(SymbolTableManager.getInstance().getCurScope());
            SymbolTableManager.getInstance().setCurScope(function.getLocalScope());
            if (paramsCtx.parameter() != null) {
                ParameterAnalyzer analyzer = new ParameterAnalyzer(function);
                analyzer.analyze(paramsCtx.parameter());
            }
        } else if (ctx instanceof BlockStmtContext && !openedScope) {
            openedScope = true;
            RuntimeManager.getInstance().openFunctionDeclaration(function);
            FunctionReturnTracker.getInstance().setCurFunction(function);
            BlockStmtContext bCtx = (BlockStmtContext) ctx;
            CompoundAnalyzer analyzer = new CompoundAnalyzer();
            analyzer.analyze(bCtx);

            if (!FunctionReturnTracker.getInstance().hasReturn() && function.getReturnType() != FunctionType.VOID)
                Console.log("Missing return statement for function \'" + function.getName() + "\'", ctx.getStart().getLine());

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