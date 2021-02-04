// Generated from C:/Users/Dyonne/Documents/GitHub/MO2-Mangcalua/grammar\Mangcalua.g4 by ANTLR 4.9
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
		Less=36, LessEqual=37, Minus=38, Not=39, NotEqual=40, OrOr=41, Plus=42, 
		RightBrace=43, RightBracket=44, RightParen=45, Semi=46, Star=47, Upto=48, 
		Downto=49, StringLiteral=50, IntConst=51, FloatConst=52, BoolConst=53, 
		StringConst=54, Identifier=55, BlockComment=56, LineComment=57, WS=58;
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
			"Not", "NotEqual", "OrOr", "Plus", "RightBrace", "RightBracket", "RightParen", 
			"Semi", "Star", "NonDigit", "DoubleQuotation", "NegativePrefix", "Digit", 
			"DigitSequence", "FloatSuffix", "FractionalConstant", "DecimalFloatingConstant", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u01ba\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3."+
		"\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\6\65"+
		"\u0143\n\65\r\65\16\65\u0144\3\66\3\66\3\67\5\67\u014a\n\67\3\67\3\67"+
		"\3\67\3\67\3\67\5\67\u0151\n\67\38\38\38\39\39\3:\3:\3:\3;\3;\3;\3;\3"+
		";\3;\3;\5;\u0162\n;\3<\6<\u0165\n<\r<\16<\u0166\3=\3=\3>\3>\6>\u016d\n"+
		">\r>\16>\u016e\3>\3>\3?\3?\6?\u0175\n?\r?\16?\u0176\3?\3?\3@\3@\7@\u017d"+
		"\n@\f@\16@\u0180\13@\3@\3@\3A\5A\u0185\nA\3A\3A\3B\3B\3C\3C\3D\3D\5D\u018f"+
		"\nD\3D\3D\3E\3E\3E\7E\u0196\nE\fE\16E\u0199\13E\3F\3F\3F\3F\7F\u019f\n"+
		"F\fF\16F\u01a2\13F\3F\3F\3F\3F\3F\3G\3G\3G\3G\7G\u01ad\nG\fG\16G\u01b0"+
		"\13G\3G\3G\3H\6H\u01b5\nH\rH\16H\u01b6\3H\3H\3\u01a0\2I\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2"+
		"{\62}\63\177\64\u0081\65\u0083\66\u0085\67\u00878\u00899\u008b:\u008d"+
		";\u008f<\3\2\n\5\2C\\aac|\3\2\62;\f\2$$))AA^^cdhhppttvvxx\6\2\f\f\17\17"+
		"$$^^\3\2\"\"\4\2HHVV\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u01bd\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2{\3\2\2\2\2"+
		"}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2"+
		"\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\3\u0091\3\2\2\2\5\u0093\3\2\2\2\7\u0098\3\2\2\2\t\u00a1\3\2\2"+
		"\2\13\u00a8\3\2\2\2\r\u00ab\3\2\2\2\17\u00b0\3\2\2\2\21\u00b5\3\2\2\2"+
		"\23\u00bb\3\2\2\2\25\u00bf\3\2\2\2\27\u00c4\3\2\2\2\31\u00c7\3\2\2\2\33"+
		"\u00cb\3\2\2\2\35\u00d0\3\2\2\2\37\u00d6\3\2\2\2!\u00dd\3\2\2\2#\u00e2"+
		"\3\2\2\2%\u00e9\3\2\2\2\'\u00ec\3\2\2\2)\u00f1\3\2\2\2+\u00f4\3\2\2\2"+
		"-\u00f9\3\2\2\2/\u00ff\3\2\2\2\61\u0102\3\2\2\2\63\u0104\3\2\2\2\65\u0106"+
		"\3\2\2\2\67\u0108\3\2\2\29\u010a\3\2\2\2;\u010c\3\2\2\2=\u0110\3\2\2\2"+
		"?\u0113\3\2\2\2A\u0115\3\2\2\2C\u0118\3\2\2\2E\u011a\3\2\2\2G\u011c\3"+
		"\2\2\2I\u011e\3\2\2\2K\u0120\3\2\2\2M\u0123\3\2\2\2O\u0125\3\2\2\2Q\u0127"+
		"\3\2\2\2S\u012a\3\2\2\2U\u012d\3\2\2\2W\u012f\3\2\2\2Y\u0131\3\2\2\2["+
		"\u0133\3\2\2\2]\u0135\3\2\2\2_\u0137\3\2\2\2a\u0139\3\2\2\2c\u013b\3\2"+
		"\2\2e\u013d\3\2\2\2g\u013f\3\2\2\2i\u0142\3\2\2\2k\u0146\3\2\2\2m\u0150"+
		"\3\2\2\2o\u0152\3\2\2\2q\u0155\3\2\2\2s\u0157\3\2\2\2u\u0161\3\2\2\2w"+
		"\u0164\3\2\2\2y\u0168\3\2\2\2{\u016a\3\2\2\2}\u0172\3\2\2\2\177\u017a"+
		"\3\2\2\2\u0081\u0184\3\2\2\2\u0083\u0188\3\2\2\2\u0085\u018a\3\2\2\2\u0087"+
		"\u018c\3\2\2\2\u0089\u0192\3\2\2\2\u008b\u019a\3\2\2\2\u008d\u01a8\3\2"+
		"\2\2\u008f\u01b4\3\2\2\2\u0091\u0092\7$\2\2\u0092\4\3\2\2\2\u0093\u0094"+
		"\7d\2\2\u0094\u0095\7q\2\2\u0095\u0096\7q\2\2\u0096\u0097\7n\2\2\u0097"+
		"\6\3\2\2\2\u0098\u0099\7e\2\2\u0099\u009a\7q\2\2\u009a\u009b\7p\2\2\u009b"+
		"\u009c\7u\2\2\u009c\u009d\7v\2\2\u009d\u009e\7c\2\2\u009e\u009f\7p\2\2"+
		"\u009f\u00a0\7v\2\2\u00a0\b\3\2\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7t"+
		"\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7"+
		"\7g\2\2\u00a7\n\3\2\2\2\u00a8\u00a9\7f\2\2\u00a9\u00aa\7q\2\2\u00aa\f"+
		"\3\2\2\2\u00ab\u00ac\7f\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7y\2\2\u00ae"+
		"\u00af\7p\2\2\u00af\16\3\2\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7n\2\2\u00b2"+
		"\u00b3\7u\2\2\u00b3\u00b4\7g\2\2\u00b4\20\3\2\2\2\u00b5\u00b6\7h\2\2\u00b6"+
		"\u00b7\7n\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7v\2\2"+
		"\u00ba\22\3\2\2\2\u00bb\u00bc\7h\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7"+
		"t\2\2\u00be\24\3\2\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2"+
		"\7p\2\2\u00c2\u00c3\7e\2\2\u00c3\26\3\2\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6"+
		"\7h\2\2\u00c6\30\3\2\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca"+
		"\7v\2\2\u00ca\32\3\2\2\2\u00cb\u00cc\7o\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce"+
		"\7k\2\2\u00ce\u00cf\7p\2\2\u00cf\34\3\2\2\2\u00d0\u00d1\7r\2\2\u00d1\u00d2"+
		"\7t\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7v\2\2\u00d5"+
		"\36\3\2\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7v\2\2\u00d9"+
		"\u00da\7w\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7p\2\2\u00dc \3\2\2\2\u00dd"+
		"\u00de\7u\2\2\u00de\u00df\7e\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7p\2\2"+
		"\u00e1\"\3\2\2\2\u00e2\u00e3\7U\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7t"+
		"\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7i\2\2\u00e8$\3"+
		"\2\2\2\u00e9\u00ea\7w\2\2\u00ea\u00eb\7r\2\2\u00eb&\3\2\2\2\u00ec\u00ed"+
		"\7v\2\2\u00ed\u00ee\7j\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7p\2\2\u00f0"+
		"(\3\2\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7q\2\2\u00f3*\3\2\2\2\u00f4\u00f5"+
		"\7x\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7f\2\2\u00f8"+
		",\3\2\2\2\u00f9\u00fa\7y\2\2\u00fa\u00fb\7j\2\2\u00fb\u00fc\7k\2\2\u00fc"+
		"\u00fd\7n\2\2\u00fd\u00fe\7g\2\2\u00fe.\3\2\2\2\u00ff\u0100\7(\2\2\u0100"+
		"\u0101\7(\2\2\u0101\60\3\2\2\2\u0102\u0103\7?\2\2\u0103\62\3\2\2\2\u0104"+
		"\u0105\7<\2\2\u0105\64\3\2\2\2\u0106\u0107\7.\2\2\u0107\66\3\2\2\2\u0108"+
		"\u0109\7\61\2\2\u01098\3\2\2\2\u010a\u010b\7\60\2\2\u010b:\3\2\2\2\u010c"+
		"\u010d\7\60\2\2\u010d\u010e\7\60\2\2\u010e\u010f\7\60\2\2\u010f<\3\2\2"+
		"\2\u0110\u0111\7?\2\2\u0111\u0112\7?\2\2\u0112>\3\2\2\2\u0113\u0114\7"+
		"@\2\2\u0114@\3\2\2\2\u0115\u0116\7@\2\2\u0116\u0117\7?\2\2\u0117B\3\2"+
		"\2\2\u0118\u0119\7}\2\2\u0119D\3\2\2\2\u011a\u011b\7]\2\2\u011bF\3\2\2"+
		"\2\u011c\u011d\7*\2\2\u011dH\3\2\2\2\u011e\u011f\7>\2\2\u011fJ\3\2\2\2"+
		"\u0120\u0121\7>\2\2\u0121\u0122\7?\2\2\u0122L\3\2\2\2\u0123\u0124\7/\2"+
		"\2\u0124N\3\2\2\2\u0125\u0126\7#\2\2\u0126P\3\2\2\2\u0127\u0128\7#\2\2"+
		"\u0128\u0129\7?\2\2\u0129R\3\2\2\2\u012a\u012b\7~\2\2\u012b\u012c\7~\2"+
		"\2\u012cT\3\2\2\2\u012d\u012e\7-\2\2\u012eV\3\2\2\2\u012f\u0130\7\177"+
		"\2\2\u0130X\3\2\2\2\u0131\u0132\7_\2\2\u0132Z\3\2\2\2\u0133\u0134\7+\2"+
		"\2\u0134\\\3\2\2\2\u0135\u0136\7=\2\2\u0136^\3\2\2\2\u0137\u0138\7,\2"+
		"\2\u0138`\3\2\2\2\u0139\u013a\t\2\2\2\u013ab\3\2\2\2\u013b\u013c\7$\2"+
		"\2\u013cd\3\2\2\2\u013d\u013e\7/\2\2\u013ef\3\2\2\2\u013f\u0140\t\3\2"+
		"\2\u0140h\3\2\2\2\u0141\u0143\5g\64\2\u0142\u0141\3\2\2\2\u0143\u0144"+
		"\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145j\3\2\2\2\u0146"+
		"\u0147\7h\2\2\u0147l\3\2\2\2\u0148\u014a\5i\65\2\u0149\u0148\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\7\60\2\2\u014c\u0151\5"+
		"i\65\2\u014d\u014e\5i\65\2\u014e\u014f\7\60\2\2\u014f\u0151\3\2\2\2\u0150"+
		"\u0149\3\2\2\2\u0150\u014d\3\2\2\2\u0151n\3\2\2\2\u0152\u0153\5m\67\2"+
		"\u0153\u0154\5k\66\2\u0154p\3\2\2\2\u0155\u0156\5s:\2\u0156r\3\2\2\2\u0157"+
		"\u0158\7^\2\2\u0158\u0159\t\4\2\2\u0159t\3\2\2\2\u015a\u0162\n\5\2\2\u015b"+
		"\u0162\5q9\2\u015c\u015d\7^\2\2\u015d\u0162\7\f\2\2\u015e\u015f\7^\2\2"+
		"\u015f\u0160\7\17\2\2\u0160\u0162\7\f\2\2\u0161\u015a\3\2\2\2\u0161\u015b"+
		"\3\2\2\2\u0161\u015c\3\2\2\2\u0161\u015e\3\2\2\2\u0162v\3\2\2\2\u0163"+
		"\u0165\5u;\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2\2"+
		"\2\u0166\u0167\3\2\2\2\u0167x\3\2\2\2\u0168\u0169\t\6\2\2\u0169z\3\2\2"+
		"\2\u016a\u016c\5%\23\2\u016b\u016d\5y=\2\u016c\u016b\3\2\2\2\u016d\u016e"+
		"\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0171\5)\25\2\u0171|\3\2\2\2\u0172\u0174\5\r\7\2\u0173\u0175\5y=\2\u0174"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2"+
		"\2\2\u0177\u0178\3\2\2\2\u0178\u0179\5)\25\2\u0179~\3\2\2\2\u017a\u017e"+
		"\5c\62\2\u017b\u017d\5w<\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2"+
		"\2\2\u0181\u0182\5c\62\2\u0182\u0080\3\2\2\2\u0183\u0185\5e\63\2\u0184"+
		"\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\5i"+
		"\65\2\u0187\u0082\3\2\2\2\u0188\u0189\5o8\2\u0189\u0084\3\2\2\2\u018a"+
		"\u018b\t\7\2\2\u018b\u0086\3\2\2\2\u018c\u018e\5c\62\2\u018d\u018f\5w"+
		"<\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0191\5c\62\2\u0191\u0088\3\2\2\2\u0192\u0197\5a\61\2\u0193\u0196\5a"+
		"\61\2\u0194\u0196\5g\64\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u008a\3\2"+
		"\2\2\u0199\u0197\3\2\2\2\u019a\u019b\7\61\2\2\u019b\u019c\7,\2\2\u019c"+
		"\u01a0\3\2\2\2\u019d\u019f\13\2\2\2\u019e\u019d\3\2\2\2\u019f\u01a2\3"+
		"\2\2\2\u01a0\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a3\u01a4\7,\2\2\u01a4\u01a5\7\61\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6\u01a7\bF\2\2\u01a7\u008c\3\2\2\2\u01a8\u01a9\7\61\2\2\u01a9"+
		"\u01aa\7\61\2\2\u01aa\u01ae\3\2\2\2\u01ab\u01ad\n\b\2\2\u01ac\u01ab\3"+
		"\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b1\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\bG\2\2\u01b2\u008e\3\2"+
		"\2\2\u01b3\u01b5\t\t\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\bH"+
		"\2\2\u01b9\u0090\3\2\2\2\22\2\u0144\u0149\u0150\u0161\u0166\u016e\u0176"+
		"\u017e\u0184\u018e\u0195\u0197\u01a0\u01ae\u01b6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}