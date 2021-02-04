package model.syntax;

import model.Console;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangcaluaErrorListener extends BaseErrorListener {

  @Override
  public void syntaxError( Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                           String msg, RecognitionException e ) {

    List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
    Collections.reverse(stack);
    MangcaluaError error = new MangcaluaError();
    error.setLineNumber(line);

    MangcaluaErrorGenerator generator = new MangcaluaErrorGenerator(line);
    // List<String> stack = (recognizer).getRuleInvocationStack(); 
    // Collections.reverse(stack);
                            
    Console.log(generator.generateMsg(msg).getErrorMessage(), line);
  }


}