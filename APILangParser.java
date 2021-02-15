// Generated from APILang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class APILangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, TYPE=6, NAME=7, WS=8;
	public static final int
		RULE_prog = 0, RULE_model = 1, RULE_property = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "model", "property"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'model'", "'{'", "'}'", "'property'", "'of type'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "TYPE", "NAME", "WS"
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
	public String getGrammarFileName() { return "APILang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public APILangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(APILangParser.EOF, 0); }
		public List<ModelContext> model() {
			return getRuleContexts(ModelContext.class);
		}
		public ModelContext model(int i) {
			return getRuleContext(ModelContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APILangVisitor ) return ((APILangVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				model();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(11);
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

	public static class ModelContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(APILangParser.NAME, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APILangVisitor ) return ((APILangVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			match(T__0);
			setState(14);
			match(NAME);
			setState(15);
			match(T__1);
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				property(0);
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(21);
			match(T__2);
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

	public static class PropertyContext extends ParserRuleContext {
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	 
		public PropertyContext() { }
		public void copyFrom(PropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertyDefContext extends PropertyContext {
		public TerminalNode NAME() { return getToken(APILangParser.NAME, 0); }
		public PropertyDefContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).enterPropertyDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).exitPropertyDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APILangVisitor ) return ((APILangVisitor<? extends T>)visitor).visitPropertyDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeDefContext extends PropertyContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(APILangParser.TYPE, 0); }
		public TypeDefContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).enterTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).exitTypeDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APILangVisitor ) return ((APILangVisitor<? extends T>)visitor).visitTypeDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		return property(0);
	}

	private PropertyContext property(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PropertyContext _localctx = new PropertyContext(_ctx, _parentState);
		PropertyContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_property, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PropertyDefContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(24);
			match(T__3);
			setState(25);
			match(NAME);
			}
			_ctx.stop = _input.LT(-1);
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeDefContext(new PropertyContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_property);
					setState(27);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(28);
					match(T__4);
					setState(29);
					match(TYPE);
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return property_sempred((PropertyContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean property_sempred(PropertyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n&\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\2\3\2\3\3\3\3\3\3\3\3\6\3\24\n"+
		"\3\r\3\16\3\25\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4!\n\4\f\4\16\4$"+
		"\13\4\3\4\2\3\6\5\2\4\6\2\2\2%\2\t\3\2\2\2\4\17\3\2\2\2\6\31\3\2\2\2\b"+
		"\n\5\4\3\2\t\b\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\r\3\2"+
		"\2\2\r\16\7\2\2\3\16\3\3\2\2\2\17\20\7\3\2\2\20\21\7\t\2\2\21\23\7\4\2"+
		"\2\22\24\5\6\4\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2"+
		"\2\26\27\3\2\2\2\27\30\7\5\2\2\30\5\3\2\2\2\31\32\b\4\1\2\32\33\7\6\2"+
		"\2\33\34\7\t\2\2\34\"\3\2\2\2\35\36\f\3\2\2\36\37\7\7\2\2\37!\7\b\2\2"+
		" \35\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\7\3\2\2\2$\"\3\2\2\2\5\13"+
		"\25\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}