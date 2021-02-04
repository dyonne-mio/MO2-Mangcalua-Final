package model.trackers;

import model.representations.*;


public class FunctionReturnTracker {
    private static FunctionReturnTracker instance = null;
    private MangcaluaFunction curFunction;
    private boolean hasReturn;

    public FunctionReturnTracker() {
        curFunction = null;
        hasReturn = false;
    }

    public static FunctionReturnTracker getInstance() {
        if (instance == null) {
            instance = new FunctionReturnTracker();
            System.out.println("Function Declaration Tracker initialized");
        }
        
        return instance;
    }

    public void reset() {
        instance = null;
        hasReturn = false;
        curFunction = null;
    } 

    public void setCurFunction(MangcaluaFunction curFunction) {
        this.curFunction = curFunction;
    }

    public MangcaluaFunction getCurFunction() {
        return curFunction;
    }

    public boolean hasReturn() {
        return hasReturn;
    }

    public void setHasReturn(boolean hasReturn) {
        this.hasReturn = hasReturn;
    }

}