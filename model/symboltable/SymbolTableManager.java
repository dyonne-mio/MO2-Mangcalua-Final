package model.symboltable;

import java.util.*;

import model.representations.*;


public class SymbolTableManager {
    private static SymbolTableManager instance = null;
    private HashMap<String, MangcaluaFunction> funcList;
    private LocalScope curLocalScope;

    private SymbolTableManager() {
        this.funcList = new HashMap<String, MangcaluaFunction>();
        this.curLocalScope = null;
    }

    public static SymbolTableManager getInstance() {
        if (instance == null) {
            instance = new SymbolTableManager();
        }
        return instance;
    }

    public void reset() {
        instance = null;
        funcList = new HashMap<String, MangcaluaFunction>();
    }

    public void setCurScope(LocalScope curLocalScope) {
        this.curLocalScope = curLocalScope;
    }

    public LocalScope getCurScope() {
        return this.curLocalScope;
    }

    public void goToParent() {
        if (curLocalScope != null) {
            curLocalScope = curLocalScope.getParent();
        }
    }

    public void addFunction(String id, MangcaluaFunction mangcaluaFunction) {
        this.funcList.put(id, mangcaluaFunction);
    }

    public MangcaluaFunction getFunction(String id) {
        if (this.funcList.containsKey(id)) {
            return this.funcList.get(id);
        } else {
            return null;
        }
    }

    public MangcaluaValue searchMyScopeVariable(String id) {
        LocalScope myLocalScope = curLocalScope;
        MangcaluaValue mangcaluaValue = null;

        // null = it is the outer most scope
        while (myLocalScope != null) {
            mangcaluaValue = myLocalScope.getVariable(id);

            if (mangcaluaValue != null) {
                return mangcaluaValue;
            } 

            myLocalScope = myLocalScope.getParent();
        }

        return mangcaluaValue;
    }
}