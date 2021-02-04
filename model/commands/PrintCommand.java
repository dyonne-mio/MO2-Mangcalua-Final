package model.commands;

import java.util.*;

import model.runtime.RuntimeManager;
import model.semantics.UndeclaredChecker;
import model.symboltable.LocalScope;
import model.symboltable.SymbolTableManager;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import javafx.application.Platform;
import parser.MangcaluaParser.PrintParamsContext;
import parser.MangcaluaParser.PrintParamsSelectorContext;
import model.*;
import model.representations.*;

public class PrintCommand implements Command, ParseTreeListener {
    private PrintParamsContext paramsCtx;
    private String msg = "";
    private LocalScope scope;

    public PrintCommand(PrintParamsContext paramsCtx) {
        this.paramsCtx = paramsCtx;
        this.scope = SymbolTableManager.getInstance().getCurScope();
        List<PrintParamsSelectorContext> paramsList = paramsCtx.printParamsSelector();
        for (PrintParamsSelectorContext param : paramsList) {
            if (param.Identifier() != null) {
                MangcaluaValue mangcaluaValue = SymbolTableManager.getInstance().searchMyScopeVariable(param.Identifier().getText());
                if(mangcaluaValue == null) {
                    Console.log("Undeclared variable error found at print statement", paramsCtx.getStart().getLine());
                }
            } else if (param.call() != null) {
                MangcaluaFunction mangcaluaFunction = SymbolTableManager.getInstance().getFunction(param.call().Identifier().getText());
                if (mangcaluaFunction == null) {
                    Console.log("Undeclared function error found at print statement",  paramsCtx.getStart().getLine());
                }
            }
        }
    }

    @Override
    public void execute() {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.paramsCtx);
        final String printMsg = this.msg.replace("\\\\", "\\");
        Platform.runLater(new Runnable() {
            @Override public void run() {
                Printer.getInstance().print(printMsg);
            }
        });
        this.msg = "";
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if (ctx instanceof PrintParamsSelectorContext) {
            PrintParamsSelectorContext printParamsCtx = (PrintParamsSelectorContext) ctx;
            if (printParamsCtx.StringLiteral()!= null) {
                this.msg += printParamsCtx.StringLiteral().getText().replaceAll("^\"+|\"+$", "");
            } else if (printParamsCtx.LeftParen() != null) {
                EvaluateCommand evaluateCommand = new EvaluateCommand(printParamsCtx.simpleExpression(), this.scope);
                evaluateCommand.execute();
                this.msg += evaluateCommand.getEvaluated().toPlainString();
            } else if (printParamsCtx.Identifier() != null) {
                MangcaluaValue mangcaluaValue = scope.getVariableAllScope(printParamsCtx.Identifier().getText());
                this.msg += mangcaluaValue.getValue().toString();
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

}