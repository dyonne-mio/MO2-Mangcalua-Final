package model.analyzers;

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.MangcaluaParser.DataTypeContext;
import parser.MangcaluaParser.ParameterContext;
import parser.MangcaluaParser.DataTypeSelectorContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

import model.representations.*;
import model.Console;

public class ParameterAnalyzer implements ParseTreeListener {
    private MangcaluaFunction func;

    public ParameterAnalyzer(MangcaluaFunction func) {
        this.func = func;
    }
    public void analyze(List<ParameterContext> params) {
        for (ParameterContext paramCtx : params) {
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(this, paramCtx);
        }
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
        if (PRCtx instanceof ParameterContext) {
            ParameterContext parameterCtx = (ParameterContext) PRCtx;
            DataTypeSelectorContext typeSpecifierSelectorContext= parameterCtx.dataTypeSelector();
            if (func.searchParameter(parameterCtx.Identifier().getText()))
                Console.log("Duplicate parameter found", PRCtx.getStart().getLine());
            else {
                MangcaluaValue mangcaluaValue = null;
                if (typeSpecifierSelectorContext.dataType() != null) {
                    DataTypeContext typeSpecifierContext= typeSpecifierSelectorContext.dataType();
                    if (typeSpecifierContext.Int() != null) {
                        mangcaluaValue = new MangcaluaValue(null, "int");
                        this.func.addParameter(parameterCtx.Identifier().getText(), mangcaluaValue);
                    } else if (typeSpecifierContext.Float() != null) {
                        mangcaluaValue = new MangcaluaValue(null, "float");
                        this.func.addParameter(parameterCtx.Identifier().getText(), mangcaluaValue);
                    } else if (typeSpecifierContext.Bool() != null) {
                        mangcaluaValue = new MangcaluaValue(null, "bool");
                        this.func.addParameter(parameterCtx.Identifier().getText(), mangcaluaValue);
                    } else if (typeSpecifierContext.String() != null) {
                        mangcaluaValue = new MangcaluaValue(null, "String");
                        this.func.addParameter(parameterCtx.Identifier().getText(), mangcaluaValue);
                    }
                } else if (typeSpecifierSelectorContext.arrayDataType() != null ) {
                    DataTypeContext typeSpecifierContext= typeSpecifierSelectorContext.arrayDataType().dataType();
                    MangcaluaArray mangcaluaArray = null;
                    if (typeSpecifierContext.Int() != null) {
                    mangcaluaArray = MangcaluaArray.createArray("int", parameterCtx.Identifier().getText());
                    } else if (typeSpecifierContext.Bool() != null) {
                    mangcaluaArray = MangcaluaArray.createArray("bool", parameterCtx.Identifier().getText());
                    } else if (typeSpecifierContext.Float() != null) {
                    mangcaluaArray = MangcaluaArray.createArray("float", parameterCtx.Identifier().getText());
                    } else if (typeSpecifierContext.String() != null) {
                    mangcaluaArray = MangcaluaArray.createArray("String", parameterCtx.Identifier().getText());
                    }
                    mangcaluaValue = new MangcaluaValue(mangcaluaArray, "array");
                    this.func.addParameter(parameterCtx.Identifier().getText(), mangcaluaValue);
                } 
            }
        }
	}

    @Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
	}
    
}