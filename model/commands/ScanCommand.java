package model.commands;

import model.*;
import javafx.application.Platform;
import model.representations.*;
import model.runtime.RuntimeManager;
import model.symboltable.LocalScope;
import model.symboltable.SymbolTableManager;

public class ScanCommand implements Command {
    private String id;
    private String val = "";
    private LocalScope localScope;
    public ScanCommand(String val, String id) {
        this.val = val.replaceAll("^\"+|\"+$", "");
        this.id = id;
        this.localScope = SymbolTableManager.getInstance().getCurScope();
    }

    @Override
    public void execute() {
        RuntimeManager.getInstance().pauseExecution();
        Platform.runLater(new Runnable() {
            @Override public void run() {
                String input = ScannerPrompt.getInstance().scan(val);
                MangcaluaValue value = localScope.getVariableAllScope(id);
                try {
                    switch(value.getPrimitiveType()) {
                        case INT: value.setValue(Integer.valueOf(input));
                        case FLOAT: value.setValue(Float.valueOf(input));
                        case BOOLEAN: value.setValue(Boolean.valueOf(input));
                        case STRING: value.setValue(input.replaceAll("^\"+|\"+$", ""));
                        default: value.setValue(input);
                    }
                    RuntimeManager.getInstance().resumeExecution();
                } catch (NumberFormatException e) {
                    Printer.getInstance().print("Mismatch scan value detected. Execution ended.");
                    RuntimeManager.getInstance().killExecution();
                }
            }
        });
    }
}