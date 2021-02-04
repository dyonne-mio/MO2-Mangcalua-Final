package model;

import java.util.*;

import model.syntax.MangcaluaErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.gui.TreeViewer;

import parser.MangcaluaLexer;
import parser.MangcaluaParser;

public class Parser {

    private CharStream input;

    public Parser() { }

    public Parser(CharStream input) {
        this.input = input;
    }
    
    public void setInput(CharStream input) {
        this.input = input;
    }

    public void parse() {
        Lexer lexer = new MangcaluaLexer(this.input);

        MangcaluaErrorListener syntaxListener = new MangcaluaErrorListener();
        lexer.removeErrorListeners();
        lexer.addErrorListener( syntaxListener );
        
        TokenStream tokenStream = new CommonTokenStream(lexer);
        MangcaluaParser parser = new MangcaluaParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener( syntaxListener );

        ParseTree tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();
        MangcaluaCustomListener listener = new MangcaluaCustomListener();
        walker.walk(listener, tree);
   }

   public void showTree() {
       Lexer lexer = new MangcaluaLexer(this.input);
       lexer.removeErrorListeners();

       TokenStream tokenStream = new CommonTokenStream(lexer);
       MangcaluaParser parser = new MangcaluaParser(tokenStream);
       parser.removeErrorListeners();
       
       ParseTree tree = parser.compilationUnit();

        // Tree inspector
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
        viewer.open();
   }


}
