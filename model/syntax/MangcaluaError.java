package model.syntax;

public class MangcaluaError {
    private int lineNumber;
    private int charNumber = -1;
    private String errorMessage;
    private ErrorType errorType;

    public enum ErrorType {
        EXTRANEOUS_ERR,
        MISSING_ERR,
        MISMATCHED_ERR,
        NO_VIABLE_ERR,
        TOKEN_RECOGNITION_ERR,
        UNIQUE_ERR,
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getCharNumber() {
        return charNumber;
    }

    public void setCharNumber(int charNumber) {
        this.charNumber = charNumber;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ErrorType getErrorType() {
        return errorType;
    }

    public void setErrorType(ErrorType errorType) {
        this.errorType = errorType;
    }

}
