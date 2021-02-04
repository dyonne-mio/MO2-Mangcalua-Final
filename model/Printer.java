package model;
import view.MangcaluaView;

public class Printer {
    private static Printer instance = null;
    private MangcaluaView view;
    
    public static Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    public void addView(MangcaluaView view) {
        this.view = view;
    }

    public void print(String msg) {
        view.printToConsole(msg);
    }

    public void print(String msg, int line) {
        view.printToConsole("Runtime Error: [Line " + line + "] " + msg);
    }


}