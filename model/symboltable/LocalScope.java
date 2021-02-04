package model.symboltable;

import java.util.*;
import model.representations.*;

public class LocalScope implements Scope{
    private LocalScope parent;
    private HashMap<String, MangcaluaValue> localVars = null;

    public LocalScope() {
        this.parent = null;
        this.localVars = new HashMap<String, MangcaluaValue>();
    }

    public LocalScope(LocalScope parent) {
        this.parent = parent;
        this.localVars = new HashMap<String, MangcaluaValue>();
    }

    public LocalScope getParent() {
        return this.parent;
    }

    public void setParent(LocalScope parent) {
        this.parent = parent;
    }

//    public void addVariable(String type, String id) {
//        MangcaluaValue mangcaluaValue = new MangcaluaValue(null, type);
//        this.localVars.put(id, mangcaluaValue);
//    }
//
//    public void addVariable(String type, String id, String value) {
//        MangcaluaValue mangcaluaValue = new MangcaluaValue(value, type);
//        this.localVars.put(id, mangcaluaValue);
//    }

    public void addVariable(String id, MangcaluaValue mangcaluaValue) {
        this.localVars.put(id, mangcaluaValue);
    }
    public MangcaluaValue getVariable(String id) {
        if (this.localVars.containsKey(id)) {
            return this.localVars.get(id);
        } else {
            return null;
        }
    }

    public MangcaluaValue getVariableAllScope(String id) {
        LocalScope current = this;
        MangcaluaValue mangcaluaValue = null;

        while (current != null) {
            mangcaluaValue = current.getVariable(id);

            if (mangcaluaValue != null) {
                return mangcaluaValue;
            } 

            current = current.getParent();
        }
        
        return mangcaluaValue;
    }

    @Override
    public boolean isParent() {
        return false;
    }
}

