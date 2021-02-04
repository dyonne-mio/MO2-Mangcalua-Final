
package model;
import java.util.*;

public class Console {
    private static Console instance = null;
    private static List<ConsoleItem> errorList;
    
    public static void startInstance() {
        if (instance == null) {
            instance = new Console();
        }
        errorList = new ArrayList<>();
    }

    public static void reset() {
        if (errorList != null) {
            errorList.clear();
        }
    }

    public static void log(String msg, int line) {
        ConsoleItem item = new ConsoleItem(msg, line);
        errorList.add(item);
    }

    public static List<String> getErrorList() {

        Collections.sort(errorList, new Comparator<ConsoleItem>() {
            public int compare(ConsoleItem i1, ConsoleItem i2) {
                return i1.getLine() - i2.getLine();
            }
        });

        List<String> list = new ArrayList<>();

        for (ConsoleItem c : errorList) {
            list.add(c.getFullMsg());
        }

        return list;
    }
}

class ConsoleItem {
    private String msg; 
    private int line;

    ConsoleItem(String msg, int line) {
        this.line = line;
        this.msg = msg;
    }

    public int getLine() {
        return this.line;
    }

    public String getFullMsg() {
        return "[Line " + this.line + "] " + this.msg;
    }
}