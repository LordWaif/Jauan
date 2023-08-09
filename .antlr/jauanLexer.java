// Generated from c:\Users\bibil\Dropbox\PC\Documents\Jauan\jauan.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jauanLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		TRUE=18, FALSE=19, INT=20, CONST=21, FLOAT=22, TIPO=23, ID_L=24, DIGITO=25, 
		MUL=26, DIV=27, ADD=28, SUB=29, OPERADOR=30, STRING=31, ESC=32, WS=33, 
		LINE_COMMENT=34, COMMENT=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"TRUE", "FALSE", "INT", "CONST", "FLOAT", "TIPO", "ID_L", "DIGITO", "MUL", 
			"DIV", "ADD", "SUB", "OPERADOR", "STRING", "ESC", "WS", "LINE_COMMENT", 
			"COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "':'", "'end'", "'('", "')'", "','", "';'", "'return'", 
			"'var'", "'='", "'if'", "'else'", "'while'", "'scanf'", "'print'", "'break'", 
			"'!'", "'true'", "'false'", null, "'const'", null, null, null, null, 
			"'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "TRUE", "FALSE", "INT", "CONST", 
			"FLOAT", "TIPO", "ID_L", "DIGITO", "MUL", "DIV", "ADD", "SUB", "OPERADOR", 
			"STRING", "ESC", "WS", "LINE_COMMENT", "COMMENT"
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


	public jauanLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "jauan.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u0110\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\6\25\u0098\n\25\r\25\16\25\u0099\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\6\27\u00a3\n\27\r\27\16\27\u00a4\3\27\3\27\6\27"+
		"\u00a9\n\27\r\27\16\27\u00aa\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00c0\n\30"+
		"\3\31\3\31\3\31\7\31\u00c5\n\31\f\31\16\31\u00c8\13\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u00dd\n\37\3 \3 \3 \7 \u00e2\n \f \16 \u00e5\13 \3 \3"+
		" \3!\3!\3!\3!\5!\u00ed\n!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\7#\u00f7\n#\f#\16"+
		"#\u00fa\13#\3#\5#\u00fd\n#\3#\3#\3#\3#\3$\3$\3$\3$\7$\u0107\n$\f$\16$"+
		"\u010a\13$\3$\3$\3$\3$\3$\5\u00e3\u00f8\u0108\2%\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\6\5"+
		"\2C\\aac|\3\2\62;\4\2>>@@\5\2\13\f\16\17\"\"\2\u0122\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5N\3"+
		"\2\2\2\7P\3\2\2\2\tT\3\2\2\2\13V\3\2\2\2\rX\3\2\2\2\17Z\3\2\2\2\21\\\3"+
		"\2\2\2\23c\3\2\2\2\25g\3\2\2\2\27i\3\2\2\2\31l\3\2\2\2\33q\3\2\2\2\35"+
		"w\3\2\2\2\37}\3\2\2\2!\u0083\3\2\2\2#\u0089\3\2\2\2%\u008b\3\2\2\2\'\u0090"+
		"\3\2\2\2)\u0097\3\2\2\2+\u009b\3\2\2\2-\u00a2\3\2\2\2/\u00bf\3\2\2\2\61"+
		"\u00c1\3\2\2\2\63\u00c9\3\2\2\2\65\u00cb\3\2\2\2\67\u00cd\3\2\2\29\u00cf"+
		"\3\2\2\2;\u00d1\3\2\2\2=\u00dc\3\2\2\2?\u00de\3\2\2\2A\u00ec\3\2\2\2C"+
		"\u00ee\3\2\2\2E\u00f2\3\2\2\2G\u0102\3\2\2\2IJ\7o\2\2JK\7c\2\2KL\7k\2"+
		"\2LM\7p\2\2M\4\3\2\2\2NO\7<\2\2O\6\3\2\2\2PQ\7g\2\2QR\7p\2\2RS\7f\2\2"+
		"S\b\3\2\2\2TU\7*\2\2U\n\3\2\2\2VW\7+\2\2W\f\3\2\2\2XY\7.\2\2Y\16\3\2\2"+
		"\2Z[\7=\2\2[\20\3\2\2\2\\]\7t\2\2]^\7g\2\2^_\7v\2\2_`\7w\2\2`a\7t\2\2"+
		"ab\7p\2\2b\22\3\2\2\2cd\7x\2\2de\7c\2\2ef\7t\2\2f\24\3\2\2\2gh\7?\2\2"+
		"h\26\3\2\2\2ij\7k\2\2jk\7h\2\2k\30\3\2\2\2lm\7g\2\2mn\7n\2\2no\7u\2\2"+
		"op\7g\2\2p\32\3\2\2\2qr\7y\2\2rs\7j\2\2st\7k\2\2tu\7n\2\2uv\7g\2\2v\34"+
		"\3\2\2\2wx\7u\2\2xy\7e\2\2yz\7c\2\2z{\7p\2\2{|\7h\2\2|\36\3\2\2\2}~\7"+
		"r\2\2~\177\7t\2\2\177\u0080\7k\2\2\u0080\u0081\7p\2\2\u0081\u0082\7v\2"+
		"\2\u0082 \3\2\2\2\u0083\u0084\7d\2\2\u0084\u0085\7t\2\2\u0085\u0086\7"+
		"g\2\2\u0086\u0087\7c\2\2\u0087\u0088\7m\2\2\u0088\"\3\2\2\2\u0089\u008a"+
		"\7#\2\2\u008a$\3\2\2\2\u008b\u008c\7v\2\2\u008c\u008d\7t\2\2\u008d\u008e"+
		"\7w\2\2\u008e\u008f\7g\2\2\u008f&\3\2\2\2\u0090\u0091\7h\2\2\u0091\u0092"+
		"\7c\2\2\u0092\u0093\7n\2\2\u0093\u0094\7u\2\2\u0094\u0095\7g\2\2\u0095"+
		"(\3\2\2\2\u0096\u0098\5\63\32\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2"+
		"\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a*\3\2\2\2\u009b\u009c"+
		"\7e\2\2\u009c\u009d\7q\2\2\u009d\u009e\7p\2\2\u009e\u009f\7u\2\2\u009f"+
		"\u00a0\7v\2\2\u00a0,\3\2\2\2\u00a1\u00a3\5\63\32\2\u00a2\u00a1\3\2\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a8\7\60\2\2\u00a7\u00a9\5\63\32\2\u00a8\u00a7\3\2\2"+
		"\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab."+
		"\3\2\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00c0\7v\2\2\u00af"+
		"\u00b0\7u\2\2\u00b0\u00b1\7v\2\2\u00b1\u00c0\7t\2\2\u00b2\u00b3\7h\2\2"+
		"\u00b3\u00b4\7n\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7c\2\2\u00b6\u00c0"+
		"\7v\2\2\u00b7\u00b8\7d\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7q\2\2\u00ba"+
		"\u00c0\7n\2\2\u00bb\u00bc\7x\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7k\2\2"+
		"\u00be\u00c0\7f\2\2\u00bf\u00ac\3\2\2\2\u00bf\u00af\3\2\2\2\u00bf\u00b2"+
		"\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00bb\3\2\2\2\u00c0\60\3\2\2\2\u00c1"+
		"\u00c6\t\2\2\2\u00c2\u00c5\t\2\2\2\u00c3\u00c5\5\63\32\2\u00c4\u00c2\3"+
		"\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\62\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\t\3\2"+
		"\2\u00ca\64\3\2\2\2\u00cb\u00cc\7,\2\2\u00cc\66\3\2\2\2\u00cd\u00ce\7"+
		"\61\2\2\u00ce8\3\2\2\2\u00cf\u00d0\7-\2\2\u00d0:\3\2\2\2\u00d1\u00d2\7"+
		"/\2\2\u00d2<\3\2\2\2\u00d3\u00d4\7?\2\2\u00d4\u00dd\7?\2\2\u00d5\u00d6"+
		"\7#\2\2\u00d6\u00dd\7?\2\2\u00d7\u00d8\7@\2\2\u00d8\u00dd\7?\2\2\u00d9"+
		"\u00da\7>\2\2\u00da\u00dd\7?\2\2\u00db\u00dd\t\4\2\2\u00dc\u00d3\3\2\2"+
		"\2\u00dc\u00d5\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dc\u00db"+
		"\3\2\2\2\u00dd>\3\2\2\2\u00de\u00e3\7$\2\2\u00df\u00e2\5A!\2\u00e0\u00e2"+
		"\13\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2"+
		"\u00e3\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e6\u00e7\7$\2\2\u00e7@\3\2\2\2\u00e8\u00e9\7^\2\2\u00e9\u00ed"+
		"\7$\2\2\u00ea\u00eb\7^\2\2\u00eb\u00ed\7^\2\2\u00ec\u00e8\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00edB\3\2\2\2\u00ee\u00ef\t\5\2\2\u00ef\u00f0\3\2\2\2"+
		"\u00f0\u00f1\b\"\2\2\u00f1D\3\2\2\2\u00f2\u00f3\7\61\2\2\u00f3\u00f4\7"+
		"\61\2\2\u00f4\u00f8\3\2\2\2\u00f5\u00f7\13\2\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\7\17\2\2\u00fc\u00fb\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7\f\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0101\b#\2\2\u0101F\3\2\2\2\u0102\u0103\7\61\2\2\u0103\u0104"+
		"\7,\2\2\u0104\u0108\3\2\2\2\u0105\u0107\13\2\2\2\u0106\u0105\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010b\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7,\2\2\u010c\u010d\7\61\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010f\b$\2\2\u010fH\3\2\2\2\20\2\u0099\u00a4\u00aa"+
		"\u00bf\u00c4\u00c6\u00dc\u00e1\u00e3\u00ec\u00f8\u00fc\u0108\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}