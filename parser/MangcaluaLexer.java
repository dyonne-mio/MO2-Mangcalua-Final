// Generated from C:/Users/Jerald Edric/Documents/DLSU 4th year/CMPILER/interpreter/MO2-Mangcalua/grammar\Mangcalua.g4 by ANTLR 4.9
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MangcaluaLexer extends Lexer {
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
		Less=36, LessEqual=37, Minus=38, Modulo=39, Not=40, NotEqual=41, OrOr=42, 
		Plus=43, RightBrace=44, RightBracket=45, RightParen=46, Semi=47, Star=48, 
		Upto=49, Downto=50, StringLiteral=51, IntConst=52, FloatConst=53, BoolConst=54, 
		StringConst=55, Identifier=56, BlockComment=57, LineComment=58, WS=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DoubleQuote", "Bool", "ConstantKeyword", "Create", "Do", "Down", "Else", 
			"Float", "For", "Func", "If", "Int", "Main", "Print", "Return", "Scan", 
			"String", "Up", "Then", "To", "Void", "While", "AndAnd", "Assign", "Colon", 
			"Comma", "Div", "Dot", "Ellipsis", "Equal", "Greater", "GreaterEqual", 
			"LeftBrace", "LeftBracket", "LeftParen", "Less", "LessEqual", "Minus", 
			"Modulo", "Not", "NotEqual", "OrOr", "Plus", "RightBrace", "RightBracket", 
			"RightParen", "Semi", "Star", "NonDigit", "DoubleQuotation", "NegativePrefix", 
			"Digit", "DigitSequence", "FloatSuffix", "FractionalConstant", "DecimalFloatingConstant", 
			"EscapeSequence", "SimpleEscapeSequence", "SChar", "SCharSequence", "Space", 
			"Upto", "Downto", "StringLiteral", "IntConst", "FloatConst", "BoolConst", 
			"StringConst", "Identifier", "BlockComment", "LineComment", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'bool'", "'constant'", "'create'", "'do'", "'down'", "'else'", 
			"'float'", "'for'", "'func'", "'if'", "'int'", "'main'", "'print'", "'return'", 
			"'scan'", "'String'", "'up'", "'then'", "'to'", "'void'", "'while'", 
			"'&&'", "'='", "':'", "','", "'/'", "'.'", "'...'", "'=='", "'>'", "'>='", 
			"'{'", "'['", "'('", "'<'", "'<='", "'-'", "'%'", "'!'", "'!='", "'||'", 
			"'+'", "'}'", "']'", "')'", "';'", "'*'"
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
			"Modulo", "Not", "NotEqual", "OrOr", "Plus", "RightBrace", "RightBracket", 
			"RightParen", "Semi", "Star", "Upto", "Downto", "StringLiteral", "IntConst", 
			"FloatConst", "BoolConst", "StringConst", "Identifier", "BlockComment", 
			"LineComment", "WS"
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


	public MangcaluaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mangcalua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u01be\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3"+
		"-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3"+
		"\65\3\66\6\66\u0147\n\66\r\66\16\66\u0148\3\67\3\67\38\58\u014e\n8\38"+
		"\38\38\38\38\58\u0155\n8\39\39\39\3:\3:\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<"+
		"\5<\u0166\n<\3=\6=\u0169\n=\r=\16=\u016a\3>\3>\3?\3?\6?\u0171\n?\r?\16"+
		"?\u0172\3?\3?\3@\3@\6@\u0179\n@\r@\16@\u017a\3@\3@\3A\3A\7A\u0181\nA\f"+
		"A\16A\u0184\13A\3A\3A\3B\5B\u0189\nB\3B\3B\3C\3C\3D\3D\3E\3E\5E\u0193"+
		"\nE\3E\3E\3F\3F\3F\7F\u019a\nF\fF\16F\u019d\13F\3G\3G\3G\3G\7G\u01a3\n"+
		"G\fG\16G\u01a6\13G\3G\3G\3G\3G\3G\3H\3H\3H\3H\7H\u01b1\nH\fH\16H\u01b4"+
		"\13H\3H\3H\3I\6I\u01b9\nI\rI\16I\u01ba\3I\3I\3\u01a4\2J\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2"+
		"{\2}\63\177\64\u0081\65\u0083\66\u0085\67\u00878\u00899\u008b:\u008d;"+
		"\u008f<\u0091=\3\2\n\5\2C\\aac|\3\2\62;\f\2$$))AA^^cdhhppttvvxx\6\2\f"+
		"\f\17\17$$^^\3\2\"\"\4\2HHVV\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u01c1"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\3\u0093\3\2\2\2\5\u0095\3\2\2\2\7\u009a"+
		"\3\2\2\2\t\u00a3\3\2\2\2\13\u00aa\3\2\2\2\r\u00ad\3\2\2\2\17\u00b2\3\2"+
		"\2\2\21\u00b7\3\2\2\2\23\u00bd\3\2\2\2\25\u00c1\3\2\2\2\27\u00c6\3\2\2"+
		"\2\31\u00c9\3\2\2\2\33\u00cd\3\2\2\2\35\u00d2\3\2\2\2\37\u00d8\3\2\2\2"+
		"!\u00df\3\2\2\2#\u00e4\3\2\2\2%\u00eb\3\2\2\2\'\u00ee\3\2\2\2)\u00f3\3"+
		"\2\2\2+\u00f6\3\2\2\2-\u00fb\3\2\2\2/\u0101\3\2\2\2\61\u0104\3\2\2\2\63"+
		"\u0106\3\2\2\2\65\u0108\3\2\2\2\67\u010a\3\2\2\29\u010c\3\2\2\2;\u010e"+
		"\3\2\2\2=\u0112\3\2\2\2?\u0115\3\2\2\2A\u0117\3\2\2\2C\u011a\3\2\2\2E"+
		"\u011c\3\2\2\2G\u011e\3\2\2\2I\u0120\3\2\2\2K\u0122\3\2\2\2M\u0125\3\2"+
		"\2\2O\u0127\3\2\2\2Q\u0129\3\2\2\2S\u012b\3\2\2\2U\u012e\3\2\2\2W\u0131"+
		"\3\2\2\2Y\u0133\3\2\2\2[\u0135\3\2\2\2]\u0137\3\2\2\2_\u0139\3\2\2\2a"+
		"\u013b\3\2\2\2c\u013d\3\2\2\2e\u013f\3\2\2\2g\u0141\3\2\2\2i\u0143\3\2"+
		"\2\2k\u0146\3\2\2\2m\u014a\3\2\2\2o\u0154\3\2\2\2q\u0156\3\2\2\2s\u0159"+
		"\3\2\2\2u\u015b\3\2\2\2w\u0165\3\2\2\2y\u0168\3\2\2\2{\u016c\3\2\2\2}"+
		"\u016e\3\2\2\2\177\u0176\3\2\2\2\u0081\u017e\3\2\2\2\u0083\u0188\3\2\2"+
		"\2\u0085\u018c\3\2\2\2\u0087\u018e\3\2\2\2\u0089\u0190\3\2\2\2\u008b\u0196"+
		"\3\2\2\2\u008d\u019e\3\2\2\2\u008f\u01ac\3\2\2\2\u0091\u01b8\3\2\2\2\u0093"+
		"\u0094\7$\2\2\u0094\4\3\2\2\2\u0095\u0096\7d\2\2\u0096\u0097\7q\2\2\u0097"+
		"\u0098\7q\2\2\u0098\u0099\7n\2\2\u0099\6\3\2\2\2\u009a\u009b\7e\2\2\u009b"+
		"\u009c\7q\2\2\u009c\u009d\7p\2\2\u009d\u009e\7u\2\2\u009e\u009f\7v\2\2"+
		"\u009f\u00a0\7c\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7v\2\2\u00a2\b\3\2"+
		"\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7"+
		"\7c\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7g\2\2\u00a9\n\3\2\2\2\u00aa\u00ab"+
		"\7f\2\2\u00ab\u00ac\7q\2\2\u00ac\f\3\2\2\2\u00ad\u00ae\7f\2\2\u00ae\u00af"+
		"\7q\2\2\u00af\u00b0\7y\2\2\u00b0\u00b1\7p\2\2\u00b1\16\3\2\2\2\u00b2\u00b3"+
		"\7g\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7g\2\2\u00b6"+
		"\20\3\2\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7q\2\2\u00ba"+
		"\u00bb\7c\2\2\u00bb\u00bc\7v\2\2\u00bc\22\3\2\2\2\u00bd\u00be\7h\2\2\u00be"+
		"\u00bf\7q\2\2\u00bf\u00c0\7t\2\2\u00c0\24\3\2\2\2\u00c1\u00c2\7h\2\2\u00c2"+
		"\u00c3\7w\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7e\2\2\u00c5\26\3\2\2\2\u00c6"+
		"\u00c7\7k\2\2\u00c7\u00c8\7h\2\2\u00c8\30\3\2\2\2\u00c9\u00ca\7k\2\2\u00ca"+
		"\u00cb\7p\2\2\u00cb\u00cc\7v\2\2\u00cc\32\3\2\2\2\u00cd\u00ce\7o\2\2\u00ce"+
		"\u00cf\7c\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7p\2\2\u00d1\34\3\2\2\2\u00d2"+
		"\u00d3\7r\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7p\2\2"+
		"\u00d6\u00d7\7v\2\2\u00d7\36\3\2\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7"+
		"g\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7w\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de"+
		"\7p\2\2\u00de \3\2\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2"+
		"\7c\2\2\u00e2\u00e3\7p\2\2\u00e3\"\3\2\2\2\u00e4\u00e5\7U\2\2\u00e5\u00e6"+
		"\7v\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7p\2\2\u00e9"+
		"\u00ea\7i\2\2\u00ea$\3\2\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7r\2\2\u00ed"+
		"&\3\2\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7j\2\2\u00f0\u00f1\7g\2\2\u00f1"+
		"\u00f2\7p\2\2\u00f2(\3\2\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7q\2\2\u00f5"+
		"*\3\2\2\2\u00f6\u00f7\7x\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7k\2\2\u00f9"+
		"\u00fa\7f\2\2\u00fa,\3\2\2\2\u00fb\u00fc\7y\2\2\u00fc\u00fd\7j\2\2\u00fd"+
		"\u00fe\7k\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7g\2\2\u0100.\3\2\2\2\u0101"+
		"\u0102\7(\2\2\u0102\u0103\7(\2\2\u0103\60\3\2\2\2\u0104\u0105\7?\2\2\u0105"+
		"\62\3\2\2\2\u0106\u0107\7<\2\2\u0107\64\3\2\2\2\u0108\u0109\7.\2\2\u0109"+
		"\66\3\2\2\2\u010a\u010b\7\61\2\2\u010b8\3\2\2\2\u010c\u010d\7\60\2\2\u010d"+
		":\3\2\2\2\u010e\u010f\7\60\2\2\u010f\u0110\7\60\2\2\u0110\u0111\7\60\2"+
		"\2\u0111<\3\2\2\2\u0112\u0113\7?\2\2\u0113\u0114\7?\2\2\u0114>\3\2\2\2"+
		"\u0115\u0116\7@\2\2\u0116@\3\2\2\2\u0117\u0118\7@\2\2\u0118\u0119\7?\2"+
		"\2\u0119B\3\2\2\2\u011a\u011b\7}\2\2\u011bD\3\2\2\2\u011c\u011d\7]\2\2"+
		"\u011dF\3\2\2\2\u011e\u011f\7*\2\2\u011fH\3\2\2\2\u0120\u0121\7>\2\2\u0121"+
		"J\3\2\2\2\u0122\u0123\7>\2\2\u0123\u0124\7?\2\2\u0124L\3\2\2\2\u0125\u0126"+
		"\7/\2\2\u0126N\3\2\2\2\u0127\u0128\7\'\2\2\u0128P\3\2\2\2\u0129\u012a"+
		"\7#\2\2\u012aR\3\2\2\2\u012b\u012c\7#\2\2\u012c\u012d\7?\2\2\u012dT\3"+
		"\2\2\2\u012e\u012f\7~\2\2\u012f\u0130\7~\2\2\u0130V\3\2\2\2\u0131\u0132"+
		"\7-\2\2\u0132X\3\2\2\2\u0133\u0134\7\177\2\2\u0134Z\3\2\2\2\u0135\u0136"+
		"\7_\2\2\u0136\\\3\2\2\2\u0137\u0138\7+\2\2\u0138^\3\2\2\2\u0139\u013a"+
		"\7=\2\2\u013a`\3\2\2\2\u013b\u013c\7,\2\2\u013cb\3\2\2\2\u013d\u013e\t"+
		"\2\2\2\u013ed\3\2\2\2\u013f\u0140\7$\2\2\u0140f\3\2\2\2\u0141\u0142\7"+
		"/\2\2\u0142h\3\2\2\2\u0143\u0144\t\3\2\2\u0144j\3\2\2\2\u0145\u0147\5"+
		"i\65\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149l\3\2\2\2\u014a\u014b\7h\2\2\u014bn\3\2\2\2\u014c"+
		"\u014e\5k\66\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0150\7\60\2\2\u0150\u0155\5k\66\2\u0151\u0152\5k\66\2\u0152"+
		"\u0153\7\60\2\2\u0153\u0155\3\2\2\2\u0154\u014d\3\2\2\2\u0154\u0151\3"+
		"\2\2\2\u0155p\3\2\2\2\u0156\u0157\5o8\2\u0157\u0158\5m\67\2\u0158r\3\2"+
		"\2\2\u0159\u015a\5u;\2\u015at\3\2\2\2\u015b\u015c\7^\2\2\u015c\u015d\t"+
		"\4\2\2\u015dv\3\2\2\2\u015e\u0166\n\5\2\2\u015f\u0166\5s:\2\u0160\u0161"+
		"\7^\2\2\u0161\u0166\7\f\2\2\u0162\u0163\7^\2\2\u0163\u0164\7\17\2\2\u0164"+
		"\u0166\7\f\2\2\u0165\u015e\3\2\2\2\u0165\u015f\3\2\2\2\u0165\u0160\3\2"+
		"\2\2\u0165\u0162\3\2\2\2\u0166x\3\2\2\2\u0167\u0169\5w<\2\u0168\u0167"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"z\3\2\2\2\u016c\u016d\t\6\2\2\u016d|\3\2\2\2\u016e\u0170\5%\23\2\u016f"+
		"\u0171\5{>\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2"+
		"\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\5)\25\2\u0175~"+
		"\3\2\2\2\u0176\u0178\5\r\7\2\u0177\u0179\5{>\2\u0178\u0177\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2"+
		"\2\2\u017c\u017d\5)\25\2\u017d\u0080\3\2\2\2\u017e\u0182\5e\63\2\u017f"+
		"\u0181\5y=\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2"+
		"\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186"+
		"\5e\63\2\u0186\u0082\3\2\2\2\u0187\u0189\5g\64\2\u0188\u0187\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\5k\66\2\u018b\u0084\3\2"+
		"\2\2\u018c\u018d\5q9\2\u018d\u0086\3\2\2\2\u018e\u018f\t\7\2\2\u018f\u0088"+
		"\3\2\2\2\u0190\u0192\5e\63\2\u0191\u0193\5y=\2\u0192\u0191\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\5e\63\2\u0195\u008a\3\2"+
		"\2\2\u0196\u019b\5c\62\2\u0197\u019a\5c\62\2\u0198\u019a\5i\65\2\u0199"+
		"\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2"+
		"\2\2\u019b\u019c\3\2\2\2\u019c\u008c\3\2\2\2\u019d\u019b\3\2\2\2\u019e"+
		"\u019f\7\61\2\2\u019f\u01a0\7,\2\2\u01a0\u01a4\3\2\2\2\u01a1\u01a3\13"+
		"\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a8\7,"+
		"\2\2\u01a8\u01a9\7\61\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\bG\2\2\u01ab"+
		"\u008e\3\2\2\2\u01ac\u01ad\7\61\2\2\u01ad\u01ae\7\61\2\2\u01ae\u01b2\3"+
		"\2\2\2\u01af\u01b1\n\b\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2"+
		"\2\2\u01b5\u01b6\bH\2\2\u01b6\u0090\3\2\2\2\u01b7\u01b9\t\t\2\2\u01b8"+
		"\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\bI\2\2\u01bd\u0092\3\2\2\2\22\2\u0148"+
		"\u014d\u0154\u0165\u016a\u0172\u017a\u0182\u0188\u0192\u0199\u019b\u01a4"+
		"\u01b2\u01ba\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}