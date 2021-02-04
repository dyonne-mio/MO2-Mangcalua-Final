package model.syntax;

import java.util.ArrayList;

public class MangcaluaErrorGenerator { // for syntax errors
    private int line;
    private ArrayList<MangcaluaError> errors = new ArrayList<>();

    public MangcaluaErrorGenerator(int line){
        this.line = line;
    }

    public MangcaluaError generateMsg(String msg) {
        // default ANTLR template messages
        String EXTRANEOUS_ERR = "extraneous input";
        String MISSING_ERR = "missing";
        String MISMATCHED_ERR = "mismatched input";
        String NO_VIABLE_ERR = "no viable alternative at input";
        String TOKEN_RECOGNITION_ERR = "token recognition error";
        String INT_CONST_TOK = "INTEGERCONSTANT";
        String FLOAT_CONST_TOK = "FLOATINGCONSTANT";
        String BOOL_CONST_TOK = "BOOLCONSTANT";
        String STRING_TOK = "StringLiteral";
        String IDENTIFIER_TOK = "IDENTIFIER";

        MangcaluaError error = new MangcaluaError();

        if (msg.contains(NO_VIABLE_ERR)) {
            String strList[] = msg.split(NO_VIABLE_ERR);

            error.setErrorType(MangcaluaError.ErrorType.NO_VIABLE_ERR);
            error.setErrorMessage("Could not resolve token " + strList[1] + ". Consider removing or editing.");
            error.setLineNumber(line);

        } else if (msg.contains(MISMATCHED_ERR)) {
            String strList[] = msg.split(MISMATCHED_ERR);
            String tokList[] = splitTokens(strList[1]);
            String offending = tokList[0];
            String alts = tokList[1];

            error.setErrorType(MangcaluaError.ErrorType.MISMATCHED_ERR);
            error.setLineNumber(line);

            if (alts.contains(INT_CONST_TOK) && alts.contains(FLOAT_CONST_TOK) && alts.contains(BOOL_CONST_TOK) && alts.contains(STRING_TOK) && alts.contains(IDENTIFIER_TOK)) {
                error.setErrorMessage("Input mismatch found on " + offending + ". Try replacing it with a proper expression.");
            } else if (alts.contains(IDENTIFIER_TOK)) {
                error.setErrorMessage("Input mismatch found on " + offending +". Expecting an identifier.");
            } else if (offending.contains("(")) {
                error.setErrorMessage("Input mismatch found on " + offending +". Possible redundant parenthesis. Perhaps remove it.");
            } else {
                error.setErrorMessage("Input mismatch found on " + offending + ". Try replacing it with " + alts + ".");
            }

        } else if (msg.contains(MISSING_ERR)) {
            String strList[] = msg.split(MISSING_ERR);
            String tokens[] = strList[1].split("at");

            error.setErrorType(MangcaluaError.ErrorType.MISSING_ERR);
            error.setLineNumber(line);
            error.setErrorMessage("There is a token " + tokens[0] + " missing before " + tokens[1] + "." + " Perhaps insert " + tokens[0] + " before " + tokens[1] + ".");
        } else if (msg.contains(EXTRANEOUS_ERR)) {

            String strList[] = msg.split(EXTRANEOUS_ERR);
            String tokList[] = new String[1];
            error.setErrorType(MangcaluaError.ErrorType.EXTRANEOUS_ERR);
            error.setLineNumber(line);

            for (int i = 0; i < strList.length; i++) { 
                tokList = splitTokens(strList[i].trim());
            }
            String offending = tokList[0];
            String alts = tokList[1];

            if (offending.contains("func")) {
                error.setErrorMessage("Unpaired brackets found. Consider closing brackets before this function declaration.");
            }
            else if (alts.contains(INT_CONST_TOK) && alts.contains(FLOAT_CONST_TOK) && alts.contains(BOOL_CONST_TOK) && alts.contains(STRING_TOK) && alts.contains(IDENTIFIER_TOK)) {
                error.setErrorMessage("An extra " + offending + " is found. Consider replacing it with an expression.");
            } else if (alts.contains(IDENTIFIER_TOK))  {
                error.setErrorMessage("An extra " + offending + " is found. Consider replacing it with an identifier.");
            } else {
                error.setErrorMessage("An extra " + offending + " is found. Consider replacing it with " + alts + ".");
            }

        } else if (msg.contains(TOKEN_RECOGNITION_ERR)) {
            String strList[] = msg.split(TOKEN_RECOGNITION_ERR + " at: ");

            String offending = strList[1];

            error.setErrorType(MangcaluaError.ErrorType.TOKEN_RECOGNITION_ERR);
            error.setLineNumber(line);
            error.setErrorMessage("Offending token " + offending + " found. Consider removing this token.");
        }
        else {
            error.setErrorType(MangcaluaError.ErrorType.UNIQUE_ERR);
            error.setLineNumber(line);

            error.setErrorMessage(msg);
        }

        return error;
    }


    private String[] splitTokens(String str) {
        String list[] = new String[1];

        if (str.contains("expecting")) {
            list = str.split("expecting");
        }

        return list;
    }

}