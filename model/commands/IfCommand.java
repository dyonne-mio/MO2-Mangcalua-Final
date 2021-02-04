package model.commands;

import model.runtime.RuntimeManager;
import model.symboltable.LocalScope;
import model.symboltable.SymbolTableManager;
import parser.MangcaluaParser.SelectionStmtContext;
import parser.MangcaluaParser.SimpleExpressionContext;
import model.*;
import java.util.*;

public class IfCommand implements ConditionalCommand {
    private List<Command> ifCommands;
    private List<Command> elseCommands;
    private SelectionStmtContext ifCtx;
    private SimpleExpressionContext expCtx;
    private String strExpression;
    private LocalScope localScope;

    public IfCommand(SelectionStmtContext ifCtx) {
        this.ifCtx = ifCtx;
        ifCommands = new ArrayList<>();
        elseCommands = new ArrayList<>();
        this.localScope = SymbolTableManager.getInstance().getCurScope();
    }

    @Override
    public void execute() {
        SimpleExpressionContext expCtx = ifCtx.simpleExpression();
        if(Util.checkCondition(expCtx, localScope)) {
            int index = 0;
            while (index < ifCommands.size() ) {
                if (RuntimeManager.getInstance().canExec()) {
                    ifCommands.get(index).execute();
                    index ++;
                } 
            }
        } else {
            int index = 0;
            while (index < elseCommands.size() ) {
                if (RuntimeManager.getInstance().canExec()) {
                    elseCommands.get(index).execute();
                    index ++;
                } 
            }
        }
    }

    @Override
    public void addIfCommand(Command c) {
        this.ifCommands.add(c);
    }

    @Override
    public void addElseCommand(Command c) {
        this.elseCommands.add(c);
    }
    
}