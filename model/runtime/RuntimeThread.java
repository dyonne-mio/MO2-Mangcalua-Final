package model.runtime;

import java.util.*;
import model.commands.*;


public class RuntimeThread extends Thread {
    private List<Command> commandList;
    private volatile boolean canExec;
    private volatile int index;
    private boolean noErrors;
    
    public RuntimeThread(List<Command> commandList) {
        this.commandList = commandList;
        this.canExec = true;
        this.noErrors = true;
    }

    @Override
    public void run() {
        System.out.println("Starting a runtime thread. Count: " + commandList.size());

        index = 0;
        while (index < commandList.size() ) {
            if (canExec) {
                System.out.println("Executing " + commandList.get(index).getClass());
                commandList.get(index).execute();
                index++;
            } 
        }
        RuntimeManager.getInstance().reset();
    }

    public boolean canExec() {
        return  this.canExec;
    }

    public void setExecFlag(boolean canExec) { // set it to false if you want to pause other commands
        this.canExec = canExec;
    }

    public boolean isExecuting() {
        return index < commandList.size();
    }

    public void kill() {  // make index go over size to skip all other commands
        this.noErrors = false;
        this.index = commandList.size(); 
    }
}
