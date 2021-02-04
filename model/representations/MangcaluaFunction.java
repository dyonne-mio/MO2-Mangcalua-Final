package model.representations;

import java.util.*;

import model.commands.*;
import model.runtime.RuntimeManager;
import model.symboltable.LocalScope;

public class MangcaluaFunction implements Command {

    private String funcName;
    private List<Command> commandList;

    private LocalScope localScope;

    private LinkedHashMap<String, MangcaluaValue> parameters;

    private MangcaluaValue returnValue;
    private FunctionType returnType;

    private MangcaluaFunction funcInstance = null;

    public MangcaluaFunction() {
        // initialize function as blank
        this.parameters = new LinkedHashMap<>();
        this.commandList = new ArrayList<>();
        this.returnType = FunctionType.VOID;
        this.localScope = new LocalScope();
    }

    private MangcaluaFunction(String name, MangcaluaValue mangcaluaValue, LinkedHashMap<String, MangcaluaValue> parameters, List<Command> commandList, FunctionType functionType, LocalScope localScope) {
        this.parameters = new LinkedHashMap<>(parameters); 
        this.commandList = new ArrayList<>(commandList);
        this.returnValue = new MangcaluaValue(mangcaluaValue);
        this.funcName = name;
        this.returnType = functionType;
        this.localScope = localScope;
    }

    public MangcaluaFunction(MangcaluaFunction mangcaluaFunction) {
        this(mangcaluaFunction.funcName, mangcaluaFunction.returnValue, mangcaluaFunction.parameters, mangcaluaFunction.commandList, mangcaluaFunction.returnType, mangcaluaFunction.localScope);
    }

    @Override 
    public void execute() {
        int index = 0;
        while (index < this.commandList.size() ) {
            if (RuntimeManager.getInstance().canExec()) {

                if (this.getReturnType() != FunctionType.VOID && this.getReturnValue().getValue() != null)  {
                    // leave function when a return is found
                    index = this.commandList.size();
                }
                else {
                    this.commandList.get(index).execute();
                    index ++;
                }
            } 
        }
    }

    public void setReturnType(FunctionType functionType) {
		this.returnType = functionType;
		
		switch(this.returnType) {
			case BOOLEAN: this.returnValue = new MangcaluaValue(null, "bool"); break;
			case INT: this.returnValue = new MangcaluaValue(null, "int"); break;
			case FLOAT: this.returnValue = new MangcaluaValue(null, "float"); break;
			case STRING: this.returnValue = new MangcaluaValue(null, "String"); break;
			default:break;	
		}
	}

    public void setReturnType(FunctionType functionType, int isArray) {
		this.returnType = functionType;
		
        if (isArray == 1) {
            MangcaluaArray mangcaluaArray = null;
            switch(this.returnType) {
                case BOOLEAN: mangcaluaArray = MangcaluaArray.createArray("boolean", null); break;
                case INT: mangcaluaArray = MangcaluaArray.createArray("int", null); break;
                case FLOAT: mangcaluaArray = MangcaluaArray.createArray("float", null); break;
                case STRING: mangcaluaArray = MangcaluaArray.createArray("String", null); break;
                default:break;	
            }
            this.returnValue = new MangcaluaValue(mangcaluaArray, "array");
        }
		
	}

    public void addParameter(String id, MangcaluaValue mangcaluaValue) {
        this.parameters.put(id, mangcaluaValue);

        this.localScope.addVariable(id ,this.parameters.get(id));

    }

    public MangcaluaValue getParamAt(int index) {
        int i = 0;

        for(MangcaluaValue mangcaluaValue : this.parameters.values()) {
            if(i == index) {
                return mangcaluaValue;
            }
            i++;
        }

        return null;
    }

    public void mapArrayParameter(String id, MangcaluaValue mangcaluaValue, int index) {
        if (index >= this.getParameterCount()) {
            return;
        }
        MangcaluaArray mangcaluaArray = (MangcaluaArray) mangcaluaValue.getValue();

        MangcaluaArray copyArray = new MangcaluaArray(mangcaluaArray.getPrimitiveType(), id);
        MangcaluaValue copyValue = new MangcaluaValue(copyArray, PrimitiveType.ARRAY);
        copyArray.initSize(mangcaluaArray.getSize());
        
        for (int i = 0; i<copyArray.getSize(); i++) {
            copyArray.updateValueAt(mangcaluaArray.getValueAt(i), i);
        }

        String iden = this.getParamIdAt(index);
        this.parameters.put(iden, copyValue);
    }

    public String getParamIdAt(int index) {
        int x = 0;

        for (String id : this.parameters.keySet()) {
            if (index == x) {
                return id;
            }
            x++;
        }
        return null;
    }

    public void setLocalScope(LocalScope localScope) {
        this.localScope = localScope;
    }

    public LocalScope getLocalScope() {
        return localScope;
    }

    public MangcaluaValue getReturnValue() {
        return this.returnValue;
    }

    public void addCommand(Command c) {
        commandList.add(c);
    }

    public void setReturnValue(MangcaluaValue returnValue) {
        this.returnValue = returnValue;
    }

    public FunctionType getReturnType() {
        return this.returnType;
    }

    public void setName(String name) {
        this.funcName = name;
    }

    public String getName() {
        return this.funcName;
    }

    public int getParameterCount() {
        return this.parameters.size();
    }

    public boolean searchParameter(String id) {
        return parameters.containsKey(id);
    }
}