package controller;

import model.runtime.RuntimeManager;
import model.symboltable.SymbolTableManager;
import model.trackers.FunctionControlTracker;
import model.trackers.FunctionReturnTracker;
import model.trackers.StatementControlTracker;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;

import model.*;
import view.MangcaluaView;

public class MangcaluaController {

    private Parser parser;
    private MangcaluaView view;

    public MangcaluaController(Parser parser, MangcaluaView view) {
        this.parser = parser;
        this.view = view;        
        init();
    }

    public void parse(String input) {
        System.err.println("Parsing...");
        SymbolTableManager.getInstance().reset();
        RuntimeManager.getInstance().reset();
        Console.reset();
        CharStream stream = CharStreams.fromString(input);
        parser.setInput(stream);
        parser.parse();
        if (!Console.getErrorList().isEmpty()) {
            view.updateLogs(Console.getErrorList());
        } else {
            view.updateLogs(null);
        }
    }

    public void execute() {
        if (Console.getErrorList().size() == 0) {
            System.err.println("Executing...");
            RuntimeManager.getInstance().executeAll();
        }
    }

    public void terminate() {
        if (Console.getErrorList().size() == 0) {
            System.err.println("Terminating...");
            RuntimeManager.getInstance().forceKillExecution();
        } 
    }

    private void init() {
        System.err.println("Initializing...");
        Console.startInstance(); 
        Printer.getInstance();
        Printer.getInstance().addView(this.view);
        ScannerPrompt.getInstance();
        ScannerPrompt.getInstance().addView(this.view);
        FunctionReturnTracker.getInstance();
        FunctionControlTracker.getInstance();
        StatementControlTracker.getInstance();
        RuntimeManager.getInstance();
    }

}