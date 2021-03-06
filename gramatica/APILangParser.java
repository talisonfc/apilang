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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		JOIN_COLUMN=18, JOIN_COLUMN_SETTINGS=19, BINARY=20, TYPE=21, NAME=22, 
		PACKAGE_NAME=23, WS=24;
	public static final int
		RULE_prog = 0, RULE_model = 1, RULE_property = 2, RULE_constraints = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "model", "property", "constraints"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'model'", "'package'", "'table'", "'schema'", "'primary key'", 
			"'{'", "'}'", "'property'", "'of type'", "'of model'", "'with constraint'", 
			"'required'", "'unique'", "'oneToMany'", "'manyToMany'", "'manyToOne'", 
			"'oneToOne'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "JOIN_COLUMN", "JOIN_COLUMN_SETTINGS", 
			"BINARY", "TYPE", "NAME", "PACKAGE_NAME", "WS"
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
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				model(0);
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(13);
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
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
	 
		public ModelContext() { }
		public void copyFrom(ModelContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ModelPackageNameContext extends ModelContext {
		public ModelContext model() {
			return getRuleContext(ModelContext.class,0);
		}
		public TerminalNode PACKAGE_NAME() { return getToken(APILangParser.PACKAGE_NAME, 0); }
		public ModelPackageNameContext(ModelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).enterModelPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).exitModelPackageName(this);
		}
	}
	public static class ModelNameContext extends ModelContext {
		public TerminalNode NAME() { return getToken(APILangParser.NAME, 0); }
		public ModelNameContext(ModelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).enterModelName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).exitModelName(this);
		}
	}
	public static class ModelTableNameContext extends ModelContext {
		public ModelContext model() {
			return getRuleContext(ModelContext.class,0);
		}
		public TerminalNode NAME() { return getToken(APILangParser.NAME, 0); }
		public ModelTableNameContext(ModelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).enterModelTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).exitModelTableName(this);
		}
	}
	public static class ModelPropertiesContext extends ModelContext {
		public ModelContext model() {
			return getRuleContext(ModelContext.class,0);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public ModelPropertiesContext(ModelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).enterModelProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).exitModelProperties(this);
		}
	}
	public static class ModelSchemaNameContext extends ModelContext {
		public ModelContext model() {
			return getRuleContext(ModelContext.class,0);
		}
		public TerminalNode NAME() { return getToken(APILangParser.NAME, 0); }
		public ModelSchemaNameContext(ModelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).enterModelSchemaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).exitModelSchemaName(this);
		}
	}
	public static class ModelPrimaryKeyNameContext extends ModelContext {
		public ModelContext model() {
			return getRuleContext(ModelContext.class,0);
		}
		public TerminalNode NAME() { return getToken(APILangParser.NAME, 0); }
		public ModelPrimaryKeyNameContext(ModelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).enterModelPrimaryKeyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).exitModelPrimaryKeyName(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		return model(0);
	}

	private ModelContext model(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ModelContext _localctx = new ModelContext(_ctx, _parentState);
		ModelContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_model, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ModelNameContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(16);
			match(T__0);
			setState(17);
			match(NAME);
			}
			_ctx.stop = _input.LT(-1);
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(40);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ModelPackageNameContext(new ModelContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_model);
						setState(19);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(20);
						match(T__1);
						setState(21);
						match(PACKAGE_NAME);
						}
						break;
					case 2:
						{
						_localctx = new ModelTableNameContext(new ModelContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_model);
						setState(22);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(23);
						match(T__2);
						setState(24);
						match(NAME);
						}
						break;
					case 3:
						{
						_localctx = new ModelSchemaNameContext(new ModelContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_model);
						setState(25);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(26);
						match(T__3);
						setState(27);
						match(NAME);
						}
						break;
					case 4:
						{
						_localctx = new ModelPrimaryKeyNameContext(new ModelContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_model);
						setState(28);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(29);
						match(T__4);
						setState(30);
						match(NAME);
						}
						break;
					case 5:
						{
						_localctx = new ModelPropertiesContext(new ModelContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_model);
						setState(31);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(32);
						match(T__5);
						setState(34); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(33);
							property(0);
							}
							}
							setState(36); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==T__7 );
						setState(38);
						match(T__6);
						}
						break;
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
	public static class DefinedModelDefContext extends PropertyContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode NAME() { return getToken(APILangParser.NAME, 0); }
		public DefinedModelDefContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).enterDefinedModelDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).exitDefinedModelDef(this);
		}
	}
	public static class PrimitiveTypeDefContext extends PropertyContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(APILangParser.TYPE, 0); }
		public PrimitiveTypeDefContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).enterPrimitiveTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).exitPrimitiveTypeDef(this);
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
	}
	public static class ConstraintsDefContext extends PropertyContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public List<ConstraintsContext> constraints() {
			return getRuleContexts(ConstraintsContext.class);
		}
		public ConstraintsContext constraints(int i) {
			return getRuleContext(ConstraintsContext.class,i);
		}
		public ConstraintsDefContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).enterConstraintsDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).exitConstraintsDef(this);
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

			setState(46);
			match(T__7);
			setState(47);
			match(NAME);
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(62);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new PrimitiveTypeDefContext(new PropertyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_property);
						setState(49);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(50);
						match(T__8);
						setState(51);
						match(TYPE);
						}
						break;
					case 2:
						{
						_localctx = new DefinedModelDefContext(new PropertyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_property);
						setState(52);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(53);
						match(T__9);
						setState(54);
						match(NAME);
						}
						break;
					case 3:
						{
						_localctx = new ConstraintsDefContext(new PropertyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_property);
						setState(55);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(56);
						match(T__10);
						setState(58); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(57);
								constraints();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(60); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ConstraintsContext extends ParserRuleContext {
		public TerminalNode JOIN_COLUMN() { return getToken(APILangParser.JOIN_COLUMN, 0); }
		public ConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).enterConstraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APILangListener ) ((APILangListener)listener).exitConstraints(this);
		}
	}

	public final ConstraintsContext constraints() throws RecognitionException {
		ConstraintsContext _localctx = new ConstraintsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constraints);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << JOIN_COLUMN))) != 0)) ) {
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
		case 1:
			return model_sempred((ModelContext)_localctx, predIndex);
		case 2:
			return property_sempred((PropertyContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean model_sempred(ModelContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean property_sempred(PropertyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32H\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2\16\2\r\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3%\n\3\r"+
		"\3\16\3&\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\6\4=\n\4\r\4\16\4>\7\4A\n\4\f\4\16\4D\13\4\3\5"+
		"\3\5\3\5\2\4\4\6\6\2\4\6\b\2\3\3\2\16\24\2N\2\13\3\2\2\2\4\21\3\2\2\2"+
		"\6/\3\2\2\2\bE\3\2\2\2\n\f\5\4\3\2\13\n\3\2\2\2\f\r\3\2\2\2\r\13\3\2\2"+
		"\2\r\16\3\2\2\2\16\17\3\2\2\2\17\20\7\2\2\3\20\3\3\2\2\2\21\22\b\3\1\2"+
		"\22\23\7\3\2\2\23\24\7\30\2\2\24,\3\2\2\2\25\26\f\7\2\2\26\27\7\4\2\2"+
		"\27+\7\31\2\2\30\31\f\6\2\2\31\32\7\5\2\2\32+\7\30\2\2\33\34\f\5\2\2\34"+
		"\35\7\6\2\2\35+\7\30\2\2\36\37\f\4\2\2\37 \7\7\2\2 +\7\30\2\2!\"\f\3\2"+
		"\2\"$\7\b\2\2#%\5\6\4\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'(\3"+
		"\2\2\2()\7\t\2\2)+\3\2\2\2*\25\3\2\2\2*\30\3\2\2\2*\33\3\2\2\2*\36\3\2"+
		"\2\2*!\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\5\3\2\2\2.,\3\2\2\2/\60"+
		"\b\4\1\2\60\61\7\n\2\2\61\62\7\30\2\2\62B\3\2\2\2\63\64\f\5\2\2\64\65"+
		"\7\13\2\2\65A\7\27\2\2\66\67\f\4\2\2\678\7\f\2\28A\7\30\2\29:\f\3\2\2"+
		":<\7\r\2\2;=\5\b\5\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2"+
		"@\63\3\2\2\2@\66\3\2\2\2@9\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\7\3"+
		"\2\2\2DB\3\2\2\2EF\t\2\2\2F\t\3\2\2\2\t\r&*,>@B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}