// Generated from C:/Users/Dyonne/Documents/GitHub/MO2-Mangcalua/grammar\Mangcalua.g4 by ANTLR 4.9
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MangcaluaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DoubleQuote=1, Bool=2, ConstantKeyword=3, Create=4, Do=5, Down=6, Else=7, 
		Float=8, For=9, Func=10, If=11, Int=12, Main=13, Print=14, Return=15, 
		Scan=16, String=17, Up=18, Then=19, To=20, Void=21, While=22, AndAnd=23, 
		Assign=24, Colon=25, Comma=26, Div=27, Dot=28, Ellipsis=29, Equal=30, 
		Greater=31, GreaterEqual=32, LeftBrace=33, LeftBracket=34, LeftParen=35, 
		Less=36, LessEqual=37, Minus=38, Not=39, NotEqual=40, OrOr=41, Plus=42, 
		RightBrace=43, RightBracket=44, RightParen=45, Semi=46, Star=47, Upto=48, 
		Downto=49, StringLiteral=50, IntConst=51, FloatConst=52, BoolConst=53, 
		StringConst=54, Identifier=55, BlockComment=56, LineComment=57, WS=58;
	public static final int
		RULE_compilationUnit = 0, RULE_mainDeclaration = 1, RULE_variableDeclaration = 2, 
		RULE_dataType = 3, RULE_arrayDataType = 4, RULE_variableDeclarationInitialize = 5, 
		RULE_scopedVariableDeclaration = 6, RULE_arrayVariableDeclaration = 7, 
		RULE_arrayVariableDeclarationInitialize = 8, RULE_dataTypeSelector = 9, 
		RULE_functionDeclaration = 10, RULE_params = 11, RULE_parameter = 12, 
		RULE_statement = 13, RULE_expressionStmt = 14, RULE_blockStmt = 15, RULE_blockStmtBody = 16, 
		RULE_printStmt = 17, RULE_printParams = 18, RULE_printParamsSelector = 19, 
		RULE_scanStmt = 20, RULE_selectionStmt = 21, RULE_elseSelector = 22, RULE_iterationStmt = 23, 
		RULE_whileStatement = 24, RULE_forStatement = 25, RULE_iterationToStatement = 26, 
		RULE_loopDeclaration = 27, RULE_simpleExpression = 28, RULE_returnStmt = 29, 
		RULE_assignmentStandaloneExpression = 30, RULE_createArrayExpression = 31, 
		RULE_andExpression = 32, RULE_unaryRelExpression = 33, RULE_relExpression = 34, 
		RULE_sumExpression = 35, RULE_mulExpression = 36, RULE_unaryExpression = 37, 
		RULE_factor = 38, RULE_relOperator = 39, RULE_sumOperator = 40, RULE_mulOperator = 41, 
		RULE_unaryOperator = 42, RULE_mutable = 43, RULE_immutable = 44, RULE_call = 45, 
		RULE_args = 46, RULE_constant = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "mainDeclaration", "variableDeclaration", "dataType", 
			"arrayDataType", "variableDeclarationInitialize", "scopedVariableDeclaration", 
			"arrayVariableDeclaration", "arrayVariableDeclarationInitialize", "dataTypeSelector", 
			"functionDeclaration", "params", "parameter", "statement", "expressionStmt", 
			"blockStmt", "blockStmtBody", "printStmt", "printParams", "printParamsSelector", 
			"scanStmt", "selectionStmt", "elseSelector", "iterationStmt", "whileStatement", 
			"forStatement", "iterationToStatement", "loopDeclaration", "simpleExpression", 
			"returnStmt", "assignmentStandaloneExpression", "createArrayExpression", 
			"andExpression", "unaryRelExpression", "relExpression", "sumExpression", 
			"mulExpression", "unaryExpression", "factor", "relOperator", "sumOperator", 
			"mulOperator", "unaryOperator", "mutable", "immutable", "call", "args", 
			"constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'bool'", "'constant'", "'create'", "'do'", "'down'", "'else'", 
			"'float'", "'for'", "'func'", "'if'", "'int'", "'main'", "'print'", "'return'", 
			"'scan'", "'String'", "'up'", "'then'", "'to'", "'void'", "'while'", 
			"'&&'", "'='", "':'", "','", "'/'", "'.'", "'...'", "'=='", "'>'", "'>='", 
			"'{'", "'['", "'('", "'<'", "'<='", "'-'", "'!'", "'!='", "'||'", "'+'", 
			"'}'", "']'", "')'", "';'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DoubleQuote", "Bool", "ConstantKeyword", "Create", "Do", "Down", 
			"Else", "Float", "For", "Func", "If", "Int", "Main", "Print", "Return", 
			"Scan", "String", "Up", "Then", "To", "Void", "While", "AndAnd", "Assign", 
			"Colon", "Comma", "Div", "Dot", "Ellipsis", "Equal", "Greater", "GreaterEqual", 
			"LeftBrace", "LeftBracket", "LeftParen", "Less", "LessEqual", "Minus", 
			"Not", "NotEqual", "OrOr", "Plus", "RightBrace", "RightBracket", "RightParen", 
			"Semi", "Star", "Upto", "Downto", "StringLiteral", "IntConst", "FloatConst", 
			"BoolConst", "StringConst", "Identifier", "BlockComment", "LineComment", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Mangcalua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MangcaluaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public MainDeclarationContext mainDeclaration() {
			return getRuleContext(MainDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MangcaluaParser.EOF, 0); }
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Func) {
				{
				{
				setState(96);
				functionDeclaration();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			mainDeclaration();
			setState(103);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainDeclarationContext extends ParserRuleContext {
		public TerminalNode Void() { return getToken(MangcaluaParser.Void, 0); }
		public TerminalNode Main() { return getToken(MangcaluaParser.Main, 0); }
		public TerminalNode LeftParen() { return getToken(MangcaluaParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MangcaluaParser.RightParen, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public MainDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitMainDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitMainDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(Void);
			setState(106);
			match(Main);
			setState(107);
			match(LeftParen);
			setState(108);
			match(RightParen);
			setState(109);
			blockStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public VariableDeclarationInitializeContext variableDeclarationInitialize() {
			return getRuleContext(VariableDeclarationInitializeContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MangcaluaParser.Semi, 0); }
		public TerminalNode ConstantKeyword() { return getToken(MangcaluaParser.ConstantKeyword, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ConstantKeyword) {
				{
				setState(111);
				match(ConstantKeyword);
				}
			}

			setState(114);
			dataType();
			setState(115);
			variableDeclarationInitialize();
			setState(116);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(MangcaluaParser.Int, 0); }
		public TerminalNode Bool() { return getToken(MangcaluaParser.Bool, 0); }
		public TerminalNode String() { return getToken(MangcaluaParser.String, 0); }
		public TerminalNode Float() { return getToken(MangcaluaParser.Float, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Float) | (1L << Int) | (1L << String))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(MangcaluaParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MangcaluaParser.RightBracket, 0); }
		public ArrayDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterArrayDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitArrayDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitArrayDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDataTypeContext arrayDataType() throws RecognitionException {
		ArrayDataTypeContext _localctx = new ArrayDataTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arrayDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			dataType();
			setState(121);
			match(LeftBracket);
			setState(122);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationInitializeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MangcaluaParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(MangcaluaParser.Assign, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public VariableDeclarationInitializeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationInitialize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterVariableDeclarationInitialize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitVariableDeclarationInitialize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitVariableDeclarationInitialize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationInitializeContext variableDeclarationInitialize() throws RecognitionException {
		VariableDeclarationInitializeContext _localctx = new VariableDeclarationInitializeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclarationInitialize);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(Identifier);
				setState(126);
				match(Assign);
				setState(127);
				simpleExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopedVariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ArrayVariableDeclarationContext arrayVariableDeclaration() {
			return getRuleContext(ArrayVariableDeclarationContext.class,0);
		}
		public ScopedVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopedVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterScopedVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitScopedVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitScopedVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopedVariableDeclarationContext scopedVariableDeclaration() throws RecognitionException {
		ScopedVariableDeclarationContext _localctx = new ScopedVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_scopedVariableDeclaration);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				arrayVariableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayVariableDeclarationContext extends ParserRuleContext {
		public ArrayDataTypeContext arrayDataType() {
			return getRuleContext(ArrayDataTypeContext.class,0);
		}
		public ArrayVariableDeclarationInitializeContext arrayVariableDeclarationInitialize() {
			return getRuleContext(ArrayVariableDeclarationInitializeContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MangcaluaParser.Semi, 0); }
		public TerminalNode ConstantKeyword() { return getToken(MangcaluaParser.ConstantKeyword, 0); }
		public ArrayVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterArrayVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitArrayVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitArrayVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayVariableDeclarationContext arrayVariableDeclaration() throws RecognitionException {
		ArrayVariableDeclarationContext _localctx = new ArrayVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrayVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ConstantKeyword) {
				{
				setState(134);
				match(ConstantKeyword);
				}
			}

			setState(137);
			arrayDataType();
			setState(138);
			arrayVariableDeclarationInitialize();
			setState(139);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayVariableDeclarationInitializeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MangcaluaParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(MangcaluaParser.Assign, 0); }
		public CreateArrayExpressionContext createArrayExpression() {
			return getRuleContext(CreateArrayExpressionContext.class,0);
		}
		public MutableContext mutable() {
			return getRuleContext(MutableContext.class,0);
		}
		public ArrayVariableDeclarationInitializeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVariableDeclarationInitialize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterArrayVariableDeclarationInitialize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitArrayVariableDeclarationInitialize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitArrayVariableDeclarationInitialize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayVariableDeclarationInitializeContext arrayVariableDeclarationInitialize() throws RecognitionException {
		ArrayVariableDeclarationInitializeContext _localctx = new ArrayVariableDeclarationInitializeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayVariableDeclarationInitialize);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(Identifier);
				setState(143);
				match(Assign);
				setState(144);
				createArrayExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(Identifier);
				setState(146);
				match(Assign);
				setState(147);
				mutable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeSelectorContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ArrayDataTypeContext arrayDataType() {
			return getRuleContext(ArrayDataTypeContext.class,0);
		}
		public DataTypeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterDataTypeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitDataTypeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitDataTypeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeSelectorContext dataTypeSelector() throws RecognitionException {
		DataTypeSelectorContext _localctx = new DataTypeSelectorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dataTypeSelector);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				dataType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				arrayDataType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Func() { return getToken(MangcaluaParser.Func, 0); }
		public TerminalNode Identifier() { return getToken(MangcaluaParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(MangcaluaParser.LeftParen, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MangcaluaParser.RightParen, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ArrayDataTypeContext arrayDataType() {
			return getRuleContext(ArrayDataTypeContext.class,0);
		}
		public TerminalNode Void() { return getToken(MangcaluaParser.Void, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(Func);
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(155);
				dataType();
				}
				break;
			case 2:
				{
				setState(156);
				arrayDataType();
				}
				break;
			case 3:
				{
				setState(157);
				match(Void);
				}
				break;
			}
			setState(160);
			match(Identifier);
			setState(161);
			match(LeftParen);
			setState(162);
			params();
			setState(163);
			match(RightParen);
			setState(164);
			blockStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(MangcaluaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MangcaluaParser.Comma, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_params);
		int _la;
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bool:
			case Float:
			case Int:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				parameter();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(167);
					match(Comma);
					setState(168);
					parameter();
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RightParen:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public DataTypeSelectorContext dataTypeSelector() {
			return getRuleContext(DataTypeSelectorContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MangcaluaParser.Identifier, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			dataTypeSelector();
			setState(178);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public ScanStmtContext scanStmt() {
			return getRuleContext(ScanStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public SelectionStmtContext selectionStmt() {
			return getRuleContext(SelectionStmtContext.class,0);
		}
		public IterationStmtContext iterationStmt() {
			return getRuleContext(IterationStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				expressionStmt();
				}
				break;
			case Scan:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				scanStmt();
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				printStmt();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				selectionStmt();
				}
				break;
			case For:
			case While:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				iterationStmt();
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 6);
				{
				setState(185);
				returnStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStmtContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(MangcaluaParser.Semi, 0); }
		public AssignmentStandaloneExpressionContext assignmentStandaloneExpression() {
			return getRuleContext(AssignmentStandaloneExpressionContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ExpressionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterExpressionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitExpressionStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitExpressionStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStmtContext expressionStmt() throws RecognitionException {
		ExpressionStmtContext _localctx = new ExpressionStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(188);
				assignmentStandaloneExpression();
				}
				break;
			case 2:
				{
				setState(189);
				call();
				}
				break;
			}
			setState(192);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStmtContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(MangcaluaParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(MangcaluaParser.RightBrace, 0); }
		public List<BlockStmtBodyContext> blockStmtBody() {
			return getRuleContexts(BlockStmtBodyContext.class);
		}
		public BlockStmtBodyContext blockStmtBody(int i) {
			return getRuleContext(BlockStmtBodyContext.class,i);
		}
		public BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_blockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(LeftBrace);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << ConstantKeyword) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Print) | (1L << Return) | (1L << Scan) | (1L << String) | (1L << While) | (1L << Identifier))) != 0)) {
				{
				{
				setState(195);
				blockStmtBody();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStmtBodyContext extends ParserRuleContext {
		public ScopedVariableDeclarationContext scopedVariableDeclaration() {
			return getRuleContext(ScopedVariableDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStmtBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmtBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterBlockStmtBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitBlockStmtBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitBlockStmtBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStmtBodyContext blockStmtBody() throws RecognitionException {
		BlockStmtBodyContext _localctx = new BlockStmtBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_blockStmtBody);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bool:
			case ConstantKeyword:
			case Float:
			case Int:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				scopedVariableDeclaration();
				}
				break;
			case For:
			case If:
			case Print:
			case Return:
			case Scan:
			case While:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStmtContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(MangcaluaParser.Print, 0); }
		public TerminalNode LeftParen() { return getToken(MangcaluaParser.LeftParen, 0); }
		public PrintParamsContext printParams() {
			return getRuleContext(PrintParamsContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MangcaluaParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(MangcaluaParser.Semi, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(MangcaluaParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(MangcaluaParser.StringLiteral, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(MangcaluaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MangcaluaParser.Identifier, i);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_printStmt);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(Print);
				setState(208);
				match(LeftParen);
				setState(209);
				printParams();
				setState(210);
				match(RightParen);
				setState(211);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(Print);
				setState(214);
				match(LeftParen);
				{
				setState(215);
				_la = _input.LA(1);
				if ( !(_la==StringLiteral || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(216);
					_la = _input.LA(1);
					if ( !(_la==StringLiteral || _la==Identifier) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(219); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral || _la==Identifier );
				}
				notifyErrorListeners("Missing quotation marks for these print parameters.");
				setState(222);
				match(RightParen);
				setState(223);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintParamsContext extends ParserRuleContext {
		public List<PrintParamsSelectorContext> printParamsSelector() {
			return getRuleContexts(PrintParamsSelectorContext.class);
		}
		public PrintParamsSelectorContext printParamsSelector(int i) {
			return getRuleContext(PrintParamsSelectorContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(MangcaluaParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(MangcaluaParser.Plus, i);
		}
		public PrintParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterPrintParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitPrintParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitPrintParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintParamsContext printParams() throws RecognitionException {
		PrintParamsContext _localctx = new PrintParamsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_printParams);
		int _la;
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				printParamsSelector();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Plus) {
					{
					{
					setState(227);
					match(Plus);
					setState(228);
					printParamsSelector();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				printParamsSelector();
				setState(235);
				match(Plus);
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(236);
					printParamsSelector();
					setState(237);
					match(Plus);
					}
					}
					setState(241); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << StringLiteral) | (1L << Identifier))) != 0) );
				notifyErrorListeners("Extra '+' symbols found.");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintParamsSelectorContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(MangcaluaParser.StringLiteral, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MangcaluaParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(MangcaluaParser.LeftParen, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MangcaluaParser.RightParen, 0); }
		public PrintParamsSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printParamsSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterPrintParamsSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitPrintParamsSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitPrintParamsSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintParamsSelectorContext printParamsSelector() throws RecognitionException {
		PrintParamsSelectorContext _localctx = new PrintParamsSelectorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_printParamsSelector);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(StringLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				match(LeftParen);
				setState(252);
				simpleExpression(0);
				setState(253);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScanStmtContext extends ParserRuleContext {
		public TerminalNode Scan() { return getToken(MangcaluaParser.Scan, 0); }
		public TerminalNode LeftParen() { return getToken(MangcaluaParser.LeftParen, 0); }
		public TerminalNode StringLiteral() { return getToken(MangcaluaParser.StringLiteral, 0); }
		public TerminalNode Comma() { return getToken(MangcaluaParser.Comma, 0); }
		public TerminalNode Identifier() { return getToken(MangcaluaParser.Identifier, 0); }
		public TerminalNode RightParen() { return getToken(MangcaluaParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(MangcaluaParser.Semi, 0); }
		public ScanStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterScanStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitScanStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitScanStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanStmtContext scanStmt() throws RecognitionException {
		ScanStmtContext _localctx = new ScanStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_scanStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(Scan);
			setState(258);
			match(LeftParen);
			setState(259);
			match(StringLiteral);
			setState(260);
			match(Comma);
			setState(261);
			match(Identifier);
			setState(262);
			match(RightParen);
			setState(263);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStmtContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(MangcaluaParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(MangcaluaParser.LeftParen, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MangcaluaParser.RightParen, 0); }
		public TerminalNode Then() { return getToken(MangcaluaParser.Then, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public ElseSelectorContext elseSelector() {
			return getRuleContext(ElseSelectorContext.class,0);
		}
		public SelectionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterSelectionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitSelectionStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitSelectionStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStmtContext selectionStmt() throws RecognitionException {
		SelectionStmtContext _localctx = new SelectionStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_selectionStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(If);
			setState(266);
			match(LeftParen);
			setState(267);
			simpleExpression(0);
			setState(268);
			match(RightParen);
			setState(269);
			match(Then);
			setState(270);
			blockStmt();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(271);
				elseSelector();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseSelectorContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(MangcaluaParser.Else, 0); }
		public TerminalNode Then() { return getToken(MangcaluaParser.Then, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public SelectionStmtContext selectionStmt() {
			return getRuleContext(SelectionStmtContext.class,0);
		}
		public ElseSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterElseSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitElseSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitElseSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseSelectorContext elseSelector() throws RecognitionException {
		ElseSelectorContext _localctx = new ElseSelectorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elseSelector);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(Else);
				setState(275);
				match(Then);
				setState(276);
				blockStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(Else);
				setState(278);
				selectionStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStmtContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public IterationStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterIterationStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitIterationStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitIterationStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStmtContext iterationStmt() throws RecognitionException {
		IterationStmtContext _localctx = new IterationStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_iterationStmt);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				whileStatement();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				forStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(MangcaluaParser.While, 0); }
		public TerminalNode Identifier() { return getToken(MangcaluaParser.Identifier, 0); }
		public IterationToStatementContext iterationToStatement() {
			return getRuleContext(IterationToStatementContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(While);
			setState(286);
			match(Identifier);
			setState(287);
			iterationToStatement();
			setState(288);
			simpleExpression(0);
			setState(289);
			blockStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(MangcaluaParser.For, 0); }
		public LoopDeclarationContext loopDeclaration() {
			return getRuleContext(LoopDeclarationContext.class,0);
		}
		public IterationToStatementContext iterationToStatement() {
			return getRuleContext(IterationToStatementContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(For);
			setState(292);
			loopDeclaration();
			setState(293);
			iterationToStatement();
			setState(294);
			simpleExpression(0);
			setState(295);
			blockStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationToStatementContext extends ParserRuleContext {
		public Token g;
		public TerminalNode Upto() { return getToken(MangcaluaParser.Upto, 0); }
		public TerminalNode Downto() { return getToken(MangcaluaParser.Downto, 0); }
		public TerminalNode Up() { return getToken(MangcaluaParser.Up, 0); }
		public TerminalNode Down() { return getToken(MangcaluaParser.Down, 0); }
		public TerminalNode To() { return getToken(MangcaluaParser.To, 0); }
		public TerminalNode StringLiteral() { return getToken(MangcaluaParser.StringLiteral, 0); }
		public IterationToStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationToStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterIterationToStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitIterationToStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitIterationToStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationToStatementContext iterationToStatement() throws RecognitionException {
		IterationToStatementContext _localctx = new IterationToStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_iterationToStatement);
		int _la;
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Upto:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(Upto);
				}
				break;
			case Downto:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(Downto);
				}
				break;
			case Down:
			case Up:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				((IterationToStatementContext)_localctx).g = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Down || _la==Up) ) {
					((IterationToStatementContext)_localctx).g = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				notifyErrorListeners("Missing 'to' after " + (((IterationToStatementContext)_localctx).g!=null?((IterationToStatementContext)_localctx).g.getText():null) + ".");
				}
				break;
			case To:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				match(To);
				notifyErrorListeners("Missing 'up' or 'down' in iteration statement.");
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
				match(StringLiteral);
				notifyErrorListeners("Incorrect iterator. Should be 'up to' or 'down to");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopDeclarationContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(MangcaluaParser.Int, 0); }
		public TerminalNode Identifier() { return getToken(MangcaluaParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(MangcaluaParser.Assign, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public LoopDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterLoopDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitLoopDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitLoopDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopDeclarationContext loopDeclaration() throws RecognitionException {
		LoopDeclarationContext _localctx = new LoopDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_loopDeclaration);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(Int);
				setState(308);
				match(Identifier);
				setState(309);
				match(Assign);
				setState(310);
				simpleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(Int);
				setState(312);
				match(Identifier);
				notifyErrorListeners("Newly declared variables in loops needs to be assigned to a value immediately.");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				match(Identifier);
				setState(315);
				match(Assign);
				setState(316);
				simpleExpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(317);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public TerminalNode OrOr() { return getToken(MangcaluaParser.OrOr, 0); }
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		return simpleExpression(0);
	}

	private SimpleExpressionContext simpleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, _parentState);
		SimpleExpressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_simpleExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(321);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(334);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(323);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(324);
						match(OrOr);
						setState(325);
						andExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(326);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(328); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(327);
								simpleExpression(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(330); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						notifyErrorListeners("Missing valid operators.");
						}
						break;
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(MangcaluaParser.Return, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MangcaluaParser.Semi, 0); }
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(Return);
			setState(340);
			simpleExpression(0);
			setState(341);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStandaloneExpressionContext extends ParserRuleContext {
		public MutableContext mutable() {
			return getRuleContext(MutableContext.class,0);
		}
		public TerminalNode Assign() { return getToken(MangcaluaParser.Assign, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public CreateArrayExpressionContext createArrayExpression() {
			return getRuleContext(CreateArrayExpressionContext.class,0);
		}
		public AssignmentStandaloneExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStandaloneExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterAssignmentStandaloneExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitAssignmentStandaloneExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitAssignmentStandaloneExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStandaloneExpressionContext assignmentStandaloneExpression() throws RecognitionException {
		AssignmentStandaloneExpressionContext _localctx = new AssignmentStandaloneExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assignmentStandaloneExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			mutable();
			setState(344);
			match(Assign);
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case Minus:
			case Not:
			case StringLiteral:
			case IntConst:
			case FloatConst:
			case BoolConst:
			case Identifier:
				{
				setState(345);
				simpleExpression(0);
				}
				break;
			case Create:
				{
				setState(346);
				createArrayExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateArrayExpressionContext extends ParserRuleContext {
		public TerminalNode Create() { return getToken(MangcaluaParser.Create, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(MangcaluaParser.LeftBracket, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(MangcaluaParser.RightBracket, 0); }
		public CreateArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createArrayExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterCreateArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitCreateArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitCreateArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateArrayExpressionContext createArrayExpression() throws RecognitionException {
		CreateArrayExpressionContext _localctx = new CreateArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_createArrayExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(Create);
			setState(350);
			dataType();
			setState(351);
			match(LeftBracket);
			setState(352);
			simpleExpression(0);
			setState(353);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public UnaryRelExpressionContext unaryRelExpression() {
			return getRuleContext(UnaryRelExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode AndAnd() { return getToken(MangcaluaParser.AndAnd, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(356);
			unaryRelExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(358);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(359);
					match(AndAnd);
					setState(360);
					unaryRelExpression();
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryRelExpressionContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(MangcaluaParser.Not, 0); }
		public UnaryRelExpressionContext unaryRelExpression() {
			return getRuleContext(UnaryRelExpressionContext.class,0);
		}
		public RelExpressionContext relExpression() {
			return getRuleContext(RelExpressionContext.class,0);
		}
		public UnaryRelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryRelExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterUnaryRelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitUnaryRelExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitUnaryRelExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryRelExpressionContext unaryRelExpression() throws RecognitionException {
		UnaryRelExpressionContext _localctx = new UnaryRelExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_unaryRelExpression);
		try {
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(Not);
				setState(367);
				unaryRelExpression();
				}
				break;
			case LeftParen:
			case Minus:
			case StringLiteral:
			case IntConst:
			case FloatConst:
			case BoolConst:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				relExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelExpressionContext extends ParserRuleContext {
		public List<SumExpressionContext> sumExpression() {
			return getRuleContexts(SumExpressionContext.class);
		}
		public SumExpressionContext sumExpression(int i) {
			return getRuleContext(SumExpressionContext.class,i);
		}
		public RelOperatorContext relOperator() {
			return getRuleContext(RelOperatorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(MangcaluaParser.Assign, 0); }
		public RelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterRelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitRelExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitRelExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelExpressionContext relExpression() throws RecognitionException {
		RelExpressionContext _localctx = new RelExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_relExpression);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				sumExpression(0);
				setState(372);
				relOperator();
				setState(373);
				sumExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				sumExpression(0);
				setState(376);
				match(Assign);
				notifyErrorListeners("Wrong relational operator '='. Should be '=='.");
				setState(378);
				sumExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				sumExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumExpressionContext extends ParserRuleContext {
		public SumOperatorContext g;
		public MulExpressionContext mulExpression() {
			return getRuleContext(MulExpressionContext.class,0);
		}
		public SumExpressionContext sumExpression() {
			return getRuleContext(SumExpressionContext.class,0);
		}
		public List<SumOperatorContext> sumOperator() {
			return getRuleContexts(SumOperatorContext.class);
		}
		public SumOperatorContext sumOperator(int i) {
			return getRuleContext(SumOperatorContext.class,i);
		}
		public SumExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterSumExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitSumExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitSumExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumExpressionContext sumExpression() throws RecognitionException {
		return sumExpression(0);
	}

	private SumExpressionContext sumExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SumExpressionContext _localctx = new SumExpressionContext(_ctx, _parentState);
		SumExpressionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_sumExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(384);
			mulExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(400);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new SumExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sumExpression);
						setState(386);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(387);
						sumOperator();
						setState(388);
						mulExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new SumExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sumExpression);
						setState(390);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(391);
						sumOperator();
						setState(393); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(392);
								((SumExpressionContext)_localctx).g = sumOperator();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(395); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(397);
						mulExpression(0);
						notifyErrorListeners("An extra '" + (((SumExpressionContext)_localctx).g!=null?_input.getText(((SumExpressionContext)_localctx).g.start,((SumExpressionContext)_localctx).g.stop):null) + "' operator is found. Remove this.");
						}
						break;
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MulExpressionContext extends ParserRuleContext {
		public MulOperatorContext g;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MulExpressionContext mulExpression() {
			return getRuleContext(MulExpressionContext.class,0);
		}
		public List<MulOperatorContext> mulOperator() {
			return getRuleContexts(MulOperatorContext.class);
		}
		public MulOperatorContext mulOperator(int i) {
			return getRuleContext(MulOperatorContext.class,i);
		}
		public MulExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterMulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitMulExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitMulExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExpressionContext mulExpression() throws RecognitionException {
		return mulExpression(0);
	}

	private MulExpressionContext mulExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulExpressionContext _localctx = new MulExpressionContext(_ctx, _parentState);
		MulExpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_mulExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(406);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(422);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new MulExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulExpression);
						setState(408);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(409);
						mulOperator();
						setState(410);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MulExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulExpression);
						setState(412);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(413);
						mulOperator();
						setState(415); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(414);
							((MulExpressionContext)_localctx).g = mulOperator();
							}
							}
							setState(417); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==Div || _la==Star );
						setState(419);
						unaryExpression();
						notifyErrorListeners("An extra '" + (((MulExpressionContext)_localctx).g!=null?_input.getText(((MulExpressionContext)_localctx).g.start,((MulExpressionContext)_localctx).g.stop):null) + "' operator is found. Remove this.");
						}
						break;
					}
					} 
				}
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_unaryExpression);
		try {
			setState(431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Minus:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				unaryOperator();
				setState(428);
				unaryExpression();
				}
				break;
			case LeftParen:
			case StringLiteral:
			case IntConst:
			case FloatConst:
			case BoolConst:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public ImmutableContext immutable() {
			return getRuleContext(ImmutableContext.class,0);
		}
		public MutableContext mutable() {
			return getRuleContext(MutableContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_factor);
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				immutable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				mutable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelOperatorContext extends ParserRuleContext {
		public TerminalNode LessEqual() { return getToken(MangcaluaParser.LessEqual, 0); }
		public TerminalNode Less() { return getToken(MangcaluaParser.Less, 0); }
		public TerminalNode Greater() { return getToken(MangcaluaParser.Greater, 0); }
		public TerminalNode GreaterEqual() { return getToken(MangcaluaParser.GreaterEqual, 0); }
		public TerminalNode Equal() { return getToken(MangcaluaParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(MangcaluaParser.NotEqual, 0); }
		public RelOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterRelOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitRelOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitRelOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOperatorContext relOperator() throws RecognitionException {
		RelOperatorContext _localctx = new RelOperatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_relOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << Greater) | (1L << GreaterEqual) | (1L << Less) | (1L << LessEqual) | (1L << NotEqual))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumOperatorContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(MangcaluaParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(MangcaluaParser.Minus, 0); }
		public SumOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterSumOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitSumOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitSumOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumOperatorContext sumOperator() throws RecognitionException {
		SumOperatorContext _localctx = new SumOperatorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_sumOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_la = _input.LA(1);
			if ( !(_la==Minus || _la==Plus) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulOperatorContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(MangcaluaParser.Star, 0); }
		public TerminalNode Div() { return getToken(MangcaluaParser.Div, 0); }
		public MulOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterMulOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitMulOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitMulOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulOperatorContext mulOperator() throws RecognitionException {
		MulOperatorContext _localctx = new MulOperatorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_mulOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_la = _input.LA(1);
			if ( !(_la==Div || _la==Star) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode Minus() { return getToken(MangcaluaParser.Minus, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_unaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(Minus);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MutableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MangcaluaParser.Identifier, 0); }
		public TerminalNode LeftBracket() { return getToken(MangcaluaParser.LeftBracket, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(MangcaluaParser.RightBracket, 0); }
		public MutableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterMutable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitMutable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitMutable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MutableContext mutable() throws RecognitionException {
		MutableContext _localctx = new MutableContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_mutable);
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				match(Identifier);
				setState(447);
				match(LeftBracket);
				setState(448);
				simpleExpression(0);
				setState(449);
				match(RightBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImmutableContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(MangcaluaParser.LeftParen, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MangcaluaParser.RightParen, 0); }
		public ImmutableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immutable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterImmutable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitImmutable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitImmutable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImmutableContext immutable() throws RecognitionException {
		ImmutableContext _localctx = new ImmutableContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_immutable);
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				call();
				}
				break;
			case StringLiteral:
			case IntConst:
			case FloatConst:
			case BoolConst:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				constant();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(455);
				match(LeftParen);
				setState(456);
				simpleExpression(0);
				setState(457);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MangcaluaParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(MangcaluaParser.LeftParen, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MangcaluaParser.RightParen, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(Identifier);
			setState(462);
			match(LeftParen);
			setState(463);
			args();
			setState(464);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(MangcaluaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MangcaluaParser.Comma, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_args);
		int _la;
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case Minus:
			case Not:
			case StringLiteral:
			case IntConst:
			case FloatConst:
			case BoolConst:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				simpleExpression(0);
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(467);
					match(Comma);
					setState(468);
					simpleExpression(0);
					}
					}
					setState(473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RightParen:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode BoolConst() { return getToken(MangcaluaParser.BoolConst, 0); }
		public TerminalNode IntConst() { return getToken(MangcaluaParser.IntConst, 0); }
		public TerminalNode StringLiteral() { return getToken(MangcaluaParser.StringLiteral, 0); }
		public TerminalNode FloatConst() { return getToken(MangcaluaParser.FloatConst, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MangcaluaListener ) ((MangcaluaListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MangcaluaVisitor ) return ((MangcaluaVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringLiteral) | (1L << IntConst) | (1L << FloatConst) | (1L << BoolConst))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return simpleExpression_sempred((SimpleExpressionContext)_localctx, predIndex);
		case 32:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 35:
			return sumExpression_sempred((SumExpressionContext)_localctx, predIndex);
		case 36:
			return mulExpression_sempred((MulExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean simpleExpression_sempred(SimpleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sumExpression_sempred(SumExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mulExpression_sempred(MulExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u01e2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\7\2d\n\2\f\2\16\2g\13\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\5\4s\n\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u0083\n\7\3\b\3\b\5\b\u0087\n"+
		"\b\3\t\5\t\u008a\n\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0097"+
		"\n\n\3\13\3\13\5\13\u009b\n\13\3\f\3\f\3\f\3\f\5\f\u00a1\n\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u00ac\n\r\f\r\16\r\u00af\13\r\3\r\5\r\u00b2"+
		"\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bd\n\17\3\20"+
		"\3\20\5\20\u00c1\n\20\3\20\3\20\3\21\3\21\7\21\u00c7\n\21\f\21\16\21\u00ca"+
		"\13\21\3\21\3\21\3\22\3\22\5\22\u00d0\n\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\6\23\u00dc\n\23\r\23\16\23\u00dd\3\23\3\23\3\23"+
		"\5\23\u00e3\n\23\3\24\3\24\3\24\7\24\u00e8\n\24\f\24\16\24\u00eb\13\24"+
		"\3\24\3\24\3\24\3\24\3\24\6\24\u00f2\n\24\r\24\16\24\u00f3\3\24\3\24\3"+
		"\24\5\24\u00f9\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0102\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0113\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u011a\n\30\3\31\3"+
		"\31\5\31\u011e\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0134\n\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0141\n\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\6\36\u014b\n\36\r\36\16\36\u014c\3"+
		"\36\3\36\7\36\u0151\n\36\f\36\16\36\u0154\13\36\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \5 \u015e\n \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u016c"+
		"\n\"\f\"\16\"\u016f\13\"\3#\3#\3#\5#\u0174\n#\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\5$\u0180\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\6%\u018c\n%\r%\16%\u018d"+
		"\3%\3%\3%\7%\u0193\n%\f%\16%\u0196\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\6"+
		"&\u01a2\n&\r&\16&\u01a3\3&\3&\3&\7&\u01a9\n&\f&\16&\u01ac\13&\3\'\3\'"+
		"\3\'\3\'\5\'\u01b2\n\'\3(\3(\5(\u01b6\n(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3"+
		"-\3-\3-\3-\3-\5-\u01c6\n-\3.\3.\3.\3.\3.\3.\5.\u01ce\n.\3/\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\7\60\u01d8\n\60\f\60\16\60\u01db\13\60\3\60\5\60\u01de"+
		"\n\60\3\61\3\61\3\61\2\6:BHJ\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\t\6\2\4\4\n\n\16\16\23\23"+
		"\4\2\64\6499\4\2\b\b\24\24\5\2 \"&\'**\4\2((,,\4\2\35\35\61\61\3\2\64"+
		"\67\2\u01ed\2e\3\2\2\2\4k\3\2\2\2\6r\3\2\2\2\bx\3\2\2\2\nz\3\2\2\2\f\u0082"+
		"\3\2\2\2\16\u0086\3\2\2\2\20\u0089\3\2\2\2\22\u0096\3\2\2\2\24\u009a\3"+
		"\2\2\2\26\u009c\3\2\2\2\30\u00b1\3\2\2\2\32\u00b3\3\2\2\2\34\u00bc\3\2"+
		"\2\2\36\u00c0\3\2\2\2 \u00c4\3\2\2\2\"\u00cf\3\2\2\2$\u00e2\3\2\2\2&\u00f8"+
		"\3\2\2\2(\u0101\3\2\2\2*\u0103\3\2\2\2,\u010b\3\2\2\2.\u0119\3\2\2\2\60"+
		"\u011d\3\2\2\2\62\u011f\3\2\2\2\64\u0125\3\2\2\2\66\u0133\3\2\2\28\u0140"+
		"\3\2\2\2:\u0142\3\2\2\2<\u0155\3\2\2\2>\u0159\3\2\2\2@\u015f\3\2\2\2B"+
		"\u0165\3\2\2\2D\u0173\3\2\2\2F\u017f\3\2\2\2H\u0181\3\2\2\2J\u0197\3\2"+
		"\2\2L\u01b1\3\2\2\2N\u01b5\3\2\2\2P\u01b7\3\2\2\2R\u01b9\3\2\2\2T\u01bb"+
		"\3\2\2\2V\u01bd\3\2\2\2X\u01c5\3\2\2\2Z\u01cd\3\2\2\2\\\u01cf\3\2\2\2"+
		"^\u01dd\3\2\2\2`\u01df\3\2\2\2bd\5\26\f\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2"+
		"\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\5\4\3\2ij\7\2\2\3j\3\3\2\2\2kl\7\27"+
		"\2\2lm\7\17\2\2mn\7%\2\2no\7/\2\2op\5 \21\2p\5\3\2\2\2qs\7\5\2\2rq\3\2"+
		"\2\2rs\3\2\2\2st\3\2\2\2tu\5\b\5\2uv\5\f\7\2vw\7\60\2\2w\7\3\2\2\2xy\t"+
		"\2\2\2y\t\3\2\2\2z{\5\b\5\2{|\7$\2\2|}\7.\2\2}\13\3\2\2\2~\u0083\79\2"+
		"\2\177\u0080\79\2\2\u0080\u0081\7\32\2\2\u0081\u0083\5:\36\2\u0082~\3"+
		"\2\2\2\u0082\177\3\2\2\2\u0083\r\3\2\2\2\u0084\u0087\5\6\4\2\u0085\u0087"+
		"\5\20\t\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\17\3\2\2\2\u0088"+
		"\u008a\7\5\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008c\5\n\6\2\u008c\u008d\5\22\n\2\u008d\u008e\7\60\2\2\u008e"+
		"\21\3\2\2\2\u008f\u0097\79\2\2\u0090\u0091\79\2\2\u0091\u0092\7\32\2\2"+
		"\u0092\u0097\5@!\2\u0093\u0094\79\2\2\u0094\u0095\7\32\2\2\u0095\u0097"+
		"\5X-\2\u0096\u008f\3\2\2\2\u0096\u0090\3\2\2\2\u0096\u0093\3\2\2\2\u0097"+
		"\23\3\2\2\2\u0098\u009b\5\b\5\2\u0099\u009b\5\n\6\2\u009a\u0098\3\2\2"+
		"\2\u009a\u0099\3\2\2\2\u009b\25\3\2\2\2\u009c\u00a0\7\f\2\2\u009d\u00a1"+
		"\5\b\5\2\u009e\u00a1\5\n\6\2\u009f\u00a1\7\27\2\2\u00a0\u009d\3\2\2\2"+
		"\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3"+
		"\79\2\2\u00a3\u00a4\7%\2\2\u00a4\u00a5\5\30\r\2\u00a5\u00a6\7/\2\2\u00a6"+
		"\u00a7\5 \21\2\u00a7\27\3\2\2\2\u00a8\u00ad\5\32\16\2\u00a9\u00aa\7\34"+
		"\2\2\u00aa\u00ac\5\32\16\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b2\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00a8\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\31\3\2\2\2\u00b3\u00b4\5\24\13\2\u00b4\u00b5\79\2\2\u00b5\33\3\2\2\2"+
		"\u00b6\u00bd\5\36\20\2\u00b7\u00bd\5*\26\2\u00b8\u00bd\5$\23\2\u00b9\u00bd"+
		"\5,\27\2\u00ba\u00bd\5\60\31\2\u00bb\u00bd\5<\37\2\u00bc\u00b6\3\2\2\2"+
		"\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\35\3\2\2\2\u00be\u00c1\5> \2\u00bf"+
		"\u00c1\5\\/\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c3\7\60\2\2\u00c3\37\3\2\2\2\u00c4\u00c8\7#\2\2\u00c5\u00c7"+
		"\5\"\22\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2"+
		"\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc"+
		"\7-\2\2\u00cc!\3\2\2\2\u00cd\u00d0\5\16\b\2\u00ce\u00d0\5\34\17\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0#\3\2\2\2\u00d1\u00d2\7\20\2\2"+
		"\u00d2\u00d3\7%\2\2\u00d3\u00d4\5&\24\2\u00d4\u00d5\7/\2\2\u00d5\u00d6"+
		"\7\60\2\2\u00d6\u00e3\3\2\2\2\u00d7\u00d8\7\20\2\2\u00d8\u00d9\7%\2\2"+
		"\u00d9\u00db\t\3\2\2\u00da\u00dc\t\3\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\b\23\1\2\u00e0\u00e1\7/\2\2\u00e1\u00e3\7\60\2\2\u00e2\u00d1\3"+
		"\2\2\2\u00e2\u00d7\3\2\2\2\u00e3%\3\2\2\2\u00e4\u00e9\5(\25\2\u00e5\u00e6"+
		"\7,\2\2\u00e6\u00e8\5(\25\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00f9\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00ec\u00ed\5(\25\2\u00ed\u00f1\7,\2\2\u00ee\u00ef\5(\25\2\u00ef"+
		"\u00f0\7,\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\b\24\1\2\u00f6\u00f9\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00e4\3"+
		"\2\2\2\u00f8\u00ec\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\'\3\2\2\2\u00fa\u0102"+
		"\7\64\2\2\u00fb\u0102\5\\/\2\u00fc\u0102\79\2\2\u00fd\u00fe\7%\2\2\u00fe"+
		"\u00ff\5:\36\2\u00ff\u0100\7/\2\2\u0100\u0102\3\2\2\2\u0101\u00fa\3\2"+
		"\2\2\u0101\u00fb\3\2\2\2\u0101\u00fc\3\2\2\2\u0101\u00fd\3\2\2\2\u0102"+
		")\3\2\2\2\u0103\u0104\7\22\2\2\u0104\u0105\7%\2\2\u0105\u0106\7\64\2\2"+
		"\u0106\u0107\7\34\2\2\u0107\u0108\79\2\2\u0108\u0109\7/\2\2\u0109\u010a"+
		"\7\60\2\2\u010a+\3\2\2\2\u010b\u010c\7\r\2\2\u010c\u010d\7%\2\2\u010d"+
		"\u010e\5:\36\2\u010e\u010f\7/\2\2\u010f\u0110\7\25\2\2\u0110\u0112\5 "+
		"\21\2\u0111\u0113\5.\30\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"-\3\2\2\2\u0114\u0115\7\t\2\2\u0115\u0116\7\25\2\2\u0116\u011a\5 \21\2"+
		"\u0117\u0118\7\t\2\2\u0118\u011a\5,\27\2\u0119\u0114\3\2\2\2\u0119\u0117"+
		"\3\2\2\2\u011a/\3\2\2\2\u011b\u011e\5\62\32\2\u011c\u011e\5\64\33\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\61\3\2\2\2\u011f\u0120\7\30\2"+
		"\2\u0120\u0121\79\2\2\u0121\u0122\5\66\34\2\u0122\u0123\5:\36\2\u0123"+
		"\u0124\5 \21\2\u0124\63\3\2\2\2\u0125\u0126\7\13\2\2\u0126\u0127\58\35"+
		"\2\u0127\u0128\5\66\34\2\u0128\u0129\5:\36\2\u0129\u012a\5 \21\2\u012a"+
		"\65\3\2\2\2\u012b\u0134\7\62\2\2\u012c\u0134\7\63\2\2\u012d\u012e\t\4"+
		"\2\2\u012e\u0134\b\34\1\2\u012f\u0130\7\26\2\2\u0130\u0134\b\34\1\2\u0131"+
		"\u0132\7\64\2\2\u0132\u0134\b\34\1\2\u0133\u012b\3\2\2\2\u0133\u012c\3"+
		"\2\2\2\u0133\u012d\3\2\2\2\u0133\u012f\3\2\2\2\u0133\u0131\3\2\2\2\u0134"+
		"\67\3\2\2\2\u0135\u0136\7\16\2\2\u0136\u0137\79\2\2\u0137\u0138\7\32\2"+
		"\2\u0138\u0141\5:\36\2\u0139\u013a\7\16\2\2\u013a\u013b\79\2\2\u013b\u0141"+
		"\b\35\1\2\u013c\u013d\79\2\2\u013d\u013e\7\32\2\2\u013e\u0141\5:\36\2"+
		"\u013f\u0141\79\2\2\u0140\u0135\3\2\2\2\u0140\u0139\3\2\2\2\u0140\u013c"+
		"\3\2\2\2\u0140\u013f\3\2\2\2\u01419\3\2\2\2\u0142\u0143\b\36\1\2\u0143"+
		"\u0144\5B\"\2\u0144\u0152\3\2\2\2\u0145\u0146\f\4\2\2\u0146\u0147\7+\2"+
		"\2\u0147\u0151\5B\"\2\u0148\u014a\f\3\2\2\u0149\u014b\5:\36\2\u014a\u0149"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u014f\b\36\1\2\u014f\u0151\3\2\2\2\u0150\u0145\3"+
		"\2\2\2\u0150\u0148\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153;\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7\21\2\2"+
		"\u0156\u0157\5:\36\2\u0157\u0158\7\60\2\2\u0158=\3\2\2\2\u0159\u015a\5"+
		"X-\2\u015a\u015d\7\32\2\2\u015b\u015e\5:\36\2\u015c\u015e\5@!\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e?\3\2\2\2\u015f\u0160\7\6\2\2"+
		"\u0160\u0161\5\b\5\2\u0161\u0162\7$\2\2\u0162\u0163\5:\36\2\u0163\u0164"+
		"\7.\2\2\u0164A\3\2\2\2\u0165\u0166\b\"\1\2\u0166\u0167\5D#\2\u0167\u016d"+
		"\3\2\2\2\u0168\u0169\f\3\2\2\u0169\u016a\7\31\2\2\u016a\u016c\5D#\2\u016b"+
		"\u0168\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016eC\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7)\2\2\u0171\u0174"+
		"\5D#\2\u0172\u0174\5F$\2\u0173\u0170\3\2\2\2\u0173\u0172\3\2\2\2\u0174"+
		"E\3\2\2\2\u0175\u0176\5H%\2\u0176\u0177\5P)\2\u0177\u0178\5H%\2\u0178"+
		"\u0180\3\2\2\2\u0179\u017a\5H%\2\u017a\u017b\7\32\2\2\u017b\u017c\b$\1"+
		"\2\u017c\u017d\5H%\2\u017d\u0180\3\2\2\2\u017e\u0180\5H%\2\u017f\u0175"+
		"\3\2\2\2\u017f\u0179\3\2\2\2\u017f\u017e\3\2\2\2\u0180G\3\2\2\2\u0181"+
		"\u0182\b%\1\2\u0182\u0183\5J&\2\u0183\u0194\3\2\2\2\u0184\u0185\f\5\2"+
		"\2\u0185\u0186\5R*\2\u0186\u0187\5J&\2\u0187\u0193\3\2\2\2\u0188\u0189"+
		"\f\4\2\2\u0189\u018b\5R*\2\u018a\u018c\5R*\2\u018b\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u0190\5J&\2\u0190\u0191\b%\1\2\u0191\u0193\3\2\2\2\u0192\u0184"+
		"\3\2\2\2\u0192\u0188\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195I\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\b&\1\2\u0198"+
		"\u0199\5L\'\2\u0199\u01aa\3\2\2\2\u019a\u019b\f\5\2\2\u019b\u019c\5T+"+
		"\2\u019c\u019d\5L\'\2\u019d\u01a9\3\2\2\2\u019e\u019f\f\4\2\2\u019f\u01a1"+
		"\5T+\2\u01a0\u01a2\5T+\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\5L"+
		"\'\2\u01a6\u01a7\b&\1\2\u01a7\u01a9\3\2\2\2\u01a8\u019a\3\2\2\2\u01a8"+
		"\u019e\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01abK\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\5V,\2\u01ae\u01af"+
		"\5L\'\2\u01af\u01b2\3\2\2\2\u01b0\u01b2\5N(\2\u01b1\u01ad\3\2\2\2\u01b1"+
		"\u01b0\3\2\2\2\u01b2M\3\2\2\2\u01b3\u01b6\5Z.\2\u01b4\u01b6\5X-\2\u01b5"+
		"\u01b3\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6O\3\2\2\2\u01b7\u01b8\t\5\2\2"+
		"\u01b8Q\3\2\2\2\u01b9\u01ba\t\6\2\2\u01baS\3\2\2\2\u01bb\u01bc\t\7\2\2"+
		"\u01bcU\3\2\2\2\u01bd\u01be\7(\2\2\u01beW\3\2\2\2\u01bf\u01c6\79\2\2\u01c0"+
		"\u01c1\79\2\2\u01c1\u01c2\7$\2\2\u01c2\u01c3\5:\36\2\u01c3\u01c4\7.\2"+
		"\2\u01c4\u01c6\3\2\2\2\u01c5\u01bf\3\2\2\2\u01c5\u01c0\3\2\2\2\u01c6Y"+
		"\3\2\2\2\u01c7\u01ce\5\\/\2\u01c8\u01ce\5`\61\2\u01c9\u01ca\7%\2\2\u01ca"+
		"\u01cb\5:\36\2\u01cb\u01cc\7/\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01c7\3\2"+
		"\2\2\u01cd\u01c8\3\2\2\2\u01cd\u01c9\3\2\2\2\u01ce[\3\2\2\2\u01cf\u01d0"+
		"\79\2\2\u01d0\u01d1\7%\2\2\u01d1\u01d2\5^\60\2\u01d2\u01d3\7/\2\2\u01d3"+
		"]\3\2\2\2\u01d4\u01d9\5:\36\2\u01d5\u01d6\7\34\2\2\u01d6\u01d8\5:\36\2"+
		"\u01d7\u01d5\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da"+
		"\3\2\2\2\u01da\u01de\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd"+
		"\u01d4\3\2\2\2\u01dd\u01dc\3\2\2\2\u01de_\3\2\2\2\u01df\u01e0\t\b\2\2"+
		"\u01e0a\3\2\2\2.er\u0082\u0086\u0089\u0096\u009a\u00a0\u00ad\u00b1\u00bc"+
		"\u00c0\u00c8\u00cf\u00dd\u00e2\u00e9\u00f3\u00f8\u0101\u0112\u0119\u011d"+
		"\u0133\u0140\u014c\u0150\u0152\u015d\u016d\u0173\u017f\u018d\u0192\u0194"+
		"\u01a3\u01a8\u01aa\u01b1\u01b5\u01c5\u01cd\u01d9\u01dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}