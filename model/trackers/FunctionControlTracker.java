package model.trackers;

import java.util.*;
import model.representations.*;

public class FunctionControlTracker {
    private static FunctionControlTracker instance = null;
    private Stack<MangcaluaFunction> stack;
    
    public FunctionControlTracker() {
        this.stack = new Stack<MangcaluaFunction>();
    }

    public static FunctionControlTracker getInstance() {
        if (instance == null) {
            instance = new FunctionControlTracker();
            System.out.println("Function Control Tracker initialized");
        }
        
        return instance;
    }

    public void reset() {
        instance = null;
    } 

    public void enterFunction(MangcaluaFunction mangcaluaFunction) {
        this.stack.push(mangcaluaFunction);
        PrintStack(stack);
    }

    public void exitFunction() {
        this.stack.pop();
        PrintStack(stack);
    }

    public boolean isInsideFunction() {
        return this.stack.size() != 0;
    }

    public MangcaluaFunction getCurFunction() {
        return this.stack.peek();
    }

    public void PrintStack(Stack<MangcaluaFunction> s)
    { 
        if (s.size() < 8) {
            Object[] p = s.toArray();
            
            System.out.println("----STACK----");
            for (int i = 0; i < p.length; i++) {
                MangcaluaFunction f = (MangcaluaFunction) p[i];
                System.out.print(f + " = " + f.getReturnValue() + " = " +  f.getReturnValue().getValue() +"\n");
            }
            System.out.println("------------");

        }
    } 

}