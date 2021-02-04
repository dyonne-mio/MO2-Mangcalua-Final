package model.trackers;

import java.util.*;
import model.commands.*;
import model.runtime.RuntimeManager;

public class StatementControlTracker {
    private static StatementControlTracker instance = null;
    private Stack<Command> stack;
    private Command curCommand = null;
    private boolean inIf;
    
    public StatementControlTracker() {
        this.stack = new Stack<Command>();
    }

    public static StatementControlTracker getInstance() {
        if (instance == null) {
            instance = new StatementControlTracker();
            System.out.println("Statement Control Tracker initialized");
        }
        
        return instance;
    }

    public void reset() {
        instance = null;
        instance.curCommand = null;
    } 

    public boolean inIf() {
        return this.inIf;
    }

    public void exitIfCommand() {
        this.inIf = false;
    }

    public void enterConditionalCommand(ConditionalCommand command) {
        if(!this.stack.isEmpty()) {
            this.addCommands(command);
        } else {
            this.curCommand = command;
            this.stack.push(command);
        }
        this.inIf = true;
    }
    
    public void addCommands(Command command) {

        if (this.isConditionalCommand()) {
            ConditionalCommand ifCommand = (ConditionalCommand) this.curCommand;

            if (this.inIf()) {
                ifCommand.addIfCommand(command);
            }  else {
                ifCommand.addElseCommand(command);
            }
                
        } else {
            ControlledCommand controlledCommand = (ControlledCommand) this.curCommand;
            controlledCommand.addCommand(command);
        }

        this.curCommand = command;
        this.stack.push(command);
    }

    public void enterControlledCommand(ControlledCommand command) {
        this.stack.push(command);
        this.curCommand = command;
    }

    public void exitControlledCommand() {
        if (this.stack.size() == 1) {
            RuntimeManager.getInstance().addCommand(this.stack.pop());
            this.curCommand = null;
        } else if (this.stack.size() > 1) {
            Command child = this.stack.pop();
            Command parentGeneral = this.stack.peek();
            this.curCommand = parentGeneral;

            if (parentGeneral instanceof ControlledCommand) {
                ControlledCommand parent = (ControlledCommand) parentGeneral;
                parent.addCommand(child);
            }
        }
    }

    public boolean isControlledCommand() {
        return (this.curCommand != null && this.curCommand instanceof ControlledCommand );
    }

    public boolean isConditionalCommand() {
        return (this.curCommand != null && this.curCommand instanceof ConditionalCommand );
    }

    public Command getCurCommand() {
        return this.curCommand;
    }
}