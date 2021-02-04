package model.commands;

import model.runtime.RuntimeManager;
import model.symboltable.LocalScope;
import model.symboltable.SymbolTableManager;
import parser.MangcaluaParser.WhileStatementContext;
import parser.MangcaluaParser.IterationToStatementContext;
import parser.MangcaluaParser.SimpleExpressionContext;
import model.representations.*;
import java.util.*;

public class WhileCommand implements ControlledCommand {
    private List<Command> commandList;
    private MangcaluaValue mangcaluaValue;
    private IterationToStatementContext iterationToStatementCtx;
    private SimpleExpressionContext simpleExpressionCtx;
    private LocalScope localScope;
    private String iteratorIdentifier;
    private int counter = 0;
    private String strExpression = "";
    private boolean isLessThan = false;

    public WhileCommand(WhileStatementContext whileStatementContext) {
        this.commandList = new ArrayList<>();
        this.iteratorIdentifier = whileStatementContext.Identifier().getText();
        this.iterationToStatementCtx = whileStatementContext.iterationToStatement();
        this.simpleExpressionCtx = whileStatementContext.simpleExpression();
        this.localScope = SymbolTableManager.getInstance().getCurScope();
        this.mangcaluaValue = localScope.getVariableAllScope(iteratorIdentifier);

        if (iterationToStatementCtx.getText().contains("up"))
            this.isLessThan = true;
        else
            this.isLessThan = false;
    }

    @Override
    public void execute() {
        this.counter = Integer.parseInt(mangcaluaValue.getValue().toString());
        EvaluateCommand evalCommand = new EvaluateCommand(this.simpleExpressionCtx, this.localScope);
        evalCommand.execute();
        if (this.isLessThan) {
            while (this.counter < evalCommand.getEvaluated().intValue()) {
                int index = 0;
                while (index < commandList.size() ) {
                    if (RuntimeManager.getInstance().canExec()) {
                        commandList.get(index).execute();
                        index++;
                    } 
                }
                evalCommand = new EvaluateCommand(this.simpleExpressionCtx, this.localScope);
                evalCommand.execute();
                this.updateCounter();
            }

        } else {
            while (this.counter > evalCommand.getEvaluated().intValue()) {
                int index = 0;
                while (index < commandList.size() ) {
                    if (RuntimeManager.getInstance().canExec()) {
                        commandList.get(index).execute();
                        index++;
                    } 
                }
                evalCommand = new EvaluateCommand(this.simpleExpressionCtx, this.localScope);
                evalCommand.execute();
                this.updateCounter();
            }
        }
    }

    @Override   
    public void addCommand(Command c) {
        this.commandList.add(c);
    }

    private void updateCounter() {
        if (this.isLessThan) {
            this.counter = Integer.parseInt(mangcaluaValue.getValue().toString());
            this.counter++;
            this.mangcaluaValue.setValue(this.counter);
        }
        else {
            this.counter = Integer.parseInt(mangcaluaValue.getValue().toString());
            this.counter--;
            this.mangcaluaValue.setValue(this.counter);
        }
    }
}