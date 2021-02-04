package model;
import view.MangcaluaView;

public class ScannerPrompt {
    private static ScannerPrompt instance = null;
    private MangcaluaView view;
    
    public static ScannerPrompt getInstance() {
        if (instance != null) {
            return instance;
        }
        instance = new ScannerPrompt();
        System.out.println("Scanner initialized");

        return instance;
    }

    public void addView(MangcaluaView view) {
        this.view = view;
    }

    public String scan(String prompt) {
        return this.view.getInput(prompt);
    }

}