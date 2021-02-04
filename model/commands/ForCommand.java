package model.commands;

import model.runtime.RuntimeManager;
import model.symboltable.LocalScope;
import model.symboltable.SymbolTableManager;
import parser.MangcaluaParser.ForStatementContext;
import parser.MangcaluaParser.LoopDeclarationContext;
import parser.MangcaluaParser.IterationToStatementContext;
import parser.MangcaluaParser.SimpleExpressionContext;

import model.representations.*;

import java.util.*;

public class ForCommand implements ControlledCommand {

    private List<Command> commandList;
    private int counter = 0;
    private LocalScope localScope;
    private MangcaluaValue mangcaluaValue;
    private String iteratorIdentifier ;
    private LoopDeclarationContext loopDeclarationCtx; 
    private IterationToStatementContext iterationToStatementCtx;
    private SimpleExpressionContext simpleExpressionCtx;
    private boolean isLessThan = false;

    public ForCommand(ForStatementContext forStatementContext) {
        this.commandList = new ArrayList<>();
        this.loopDeclarationCtx = forStatementContext.loopDeclaration();
        this.iterationToStatementCtx = forStatementContext.iterationToStatement();
        this.simpleExpressionCtx = forStatementContext.simpleExpression();
        this.iteratorIdentifier = loopDeclarationCtx.Identifier().getText();
        
        this.localScope = SymbolTableManager.getInstance().getCurScope();
        this.mangcaluaValue = localScope.getVariableAllScope(iteratorIdentifier);
        if (!iterationToStatementCtx.getText().contains("up")) {
            this.isLessThan = false;
        } else {
            this.isLessThan = true;
        }
    }

    @Override
    public void execute() {
        this.counter = Integer.parseInt(mangcaluaValue.getValue().toString());

        EvaluateCommand evalCommand = new EvaluateCommand(this.simpleExpressionCtx, this.localScope);
        evalCommand.execute();

        if (!this.isLessThan) {
            if (this.counter > evalCommand.getEvaluated().intValue()) {
                do {
                    int index = 0;
                    if (index < commandList.size()) {
                        do {
                            if (RuntimeManager.getInstance().canExec()) {
                                commandList.get(index).execute();
                                index++;
                            }
                        } while (index < commandList.size());
                    }

                    evalCommand = new EvaluateCommand(this.simpleExpressionCtx, this.localScope);
                    evalCommand.execute();
                    this.updateCounter();
                } while (this.counter > evalCommand.getEvaluated().intValue());
            }

        }
        else {
            if (this.counter < evalCommand.getEvaluated().intValue()) {
                do {
                    int index = 0;
                    while (index < commandList.size()) {
                        if (!RuntimeManager.getInstance().canExec()) {
                            continue;
                        }
                        commandList.get(index).execute();
                        index++;
                    }
                    evalCommand = new EvaluateCommand(this.simpleExpressionCtx, this.localScope);
                    evalCommand.execute();
                    this.updateCounter();
                } while (this.counter < evalCommand.getEvaluated().intValue());
            }

        }
    }

    @Override   
    public void addCommand(Command c) {
        this.commandList.add(c);
    }

    private void updateCounter() {
        if (!this.isLessThan) {
            this.counter = Integer.parseInt(mangcaluaValue.getValue().toString());
            this.counter--;
            this.mangcaluaValue.setValue(this.counter);
        }
        else {
            this.counter = Integer.parseInt(mangcaluaValue.getValue().toString());
            this.counter++;
            this.mangcaluaValue.setValue(this.counter);
        }
    }





    
}