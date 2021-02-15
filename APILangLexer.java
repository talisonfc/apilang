// Generated from APILang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class APILangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, TYPE=9, 
		NAME=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "TYPE", 
			"NAME", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'model'", "'{'", "'}'", "'property'", "'of type'", "'with constraint'", 
			"'required'", "'unique'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "TYPE", "NAME", 
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


	public APILangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "APILang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rv\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\ni\n\n\3\13\6\13l\n"+
		"\13\r\13\16\13m\3\f\6\fq\n\f\r\f\16\fr\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"\2y"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\3\31\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2\13,\3\2\2\2\r\64\3\2"+
		"\2\2\17D\3\2\2\2\21M\3\2\2\2\23h\3\2\2\2\25k\3\2\2\2\27p\3\2\2\2\31\32"+
		"\7o\2\2\32\33\7q\2\2\33\34\7f\2\2\34\35\7g\2\2\35\36\7n\2\2\36\4\3\2\2"+
		"\2\37 \7}\2\2 \6\3\2\2\2!\"\7\177\2\2\"\b\3\2\2\2#$\7r\2\2$%\7t\2\2%&"+
		"\7q\2\2&\'\7r\2\2\'(\7g\2\2()\7t\2\2)*\7v\2\2*+\7{\2\2+\n\3\2\2\2,-\7"+
		"q\2\2-.\7h\2\2./\7\"\2\2/\60\7v\2\2\60\61\7{\2\2\61\62\7r\2\2\62\63\7"+
		"g\2\2\63\f\3\2\2\2\64\65\7y\2\2\65\66\7k\2\2\66\67\7v\2\2\678\7j\2\28"+
		"9\7\"\2\29:\7e\2\2:;\7q\2\2;<\7p\2\2<=\7u\2\2=>\7v\2\2>?\7t\2\2?@\7c\2"+
		"\2@A\7k\2\2AB\7p\2\2BC\7v\2\2C\16\3\2\2\2DE\7t\2\2EF\7g\2\2FG\7s\2\2G"+
		"H\7w\2\2HI\7k\2\2IJ\7t\2\2JK\7g\2\2KL\7f\2\2L\20\3\2\2\2MN\7w\2\2NO\7"+
		"p\2\2OP\7k\2\2PQ\7s\2\2QR\7w\2\2RS\7g\2\2S\22\3\2\2\2TU\7U\2\2UV\7v\2"+
		"\2VW\7t\2\2WX\7k\2\2XY\7p\2\2Yi\7i\2\2Z[\7K\2\2[\\\7p\2\2\\]\7v\2\2]^"+
		"\7g\2\2^_\7i\2\2_`\7g\2\2`i\7t\2\2ab\7D\2\2bc\7q\2\2cd\7q\2\2de\7n\2\2"+
		"ef\7g\2\2fg\7c\2\2gi\7p\2\2hT\3\2\2\2hZ\3\2\2\2ha\3\2\2\2i\24\3\2\2\2"+
		"jl\t\2\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\26\3\2\2\2oq\t\3\2"+
		"\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\b\f\2\2u\30\3\2"+
		"\2\2\6\2hmr\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}