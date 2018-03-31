// Generated from c:\Projects\ODataSimpleFilterImplementation\ODataSimpleFilterImplementation.Antlr\Filter.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FilterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, OR=5, AND=6, EQ=7, NE=8, GT=9, GE=10, 
		LT=11, LE=12, ENDSWITH=13, STARTSWITH=14, SUBSTRINGOF=15, STRING=16, EMPTY=17, 
		ID=18, INT=19, NEWLINE=20, WS=21;
	public static final int
		RULE_filter = 0, RULE_expr = 1;
	public static final String[] ruleNames = {
		"filter", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'null'", "'('", "','", "')'", "'or'", "'and'", "'eq'", "'ne'", 
		"'gt'", "'ge'", "'lt'", "'le'", "'endswith'", "'startswith'", "'substringof'", 
		null, "''''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "OR", "AND", "EQ", "NE", "GT", "GE", "LT", 
		"LE", "ENDSWITH", "STARTSWITH", "SUBSTRINGOF", "STRING", "EMPTY", "ID", 
		"INT", "NEWLINE", "WS"
	};
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
	public String getGrammarFileName() { return "Filter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FilterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FilterContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				expr(0);
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ENDSWITH) | (1L << STARTSWITH) | (1L << SUBSTRINGOF) | (1L << ID))) != 0) );
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncOpContext extends ExprContext {
		public Token func;
		public TerminalNode ID() { return getToken(FilterParser.ID, 0); }
		public TerminalNode STRING() { return getToken(FilterParser.STRING, 0); }
		public FuncOpContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class OrContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AndContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IntOpContext extends ExprContext {
		public Token op;
		public TerminalNode ID() { return getToken(FilterParser.ID, 0); }
		public TerminalNode INT() { return getToken(FilterParser.INT, 0); }
		public IntOpContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class StringOpContext extends ExprContext {
		public Token op;
		public TerminalNode ID() { return getToken(FilterParser.ID, 0); }
		public TerminalNode STRING() { return getToken(FilterParser.STRING, 0); }
		public TerminalNode EMPTY() { return getToken(FilterParser.EMPTY, 0); }
		public StringOpContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IsNullContext extends ExprContext {
		public Token op;
		public TerminalNode ID() { return getToken(FilterParser.ID, 0); }
		public IsNullContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new StringOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(10);
				match(ID);
				setState(11);
				((StringOpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NE) ) {
					((StringOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(12);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==EMPTY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new IsNullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(13);
				match(ID);
				setState(14);
				((IsNullContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NE) ) {
					((IsNullContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(15);
				match(T__0);
				}
				break;
			case 3:
				{
				_localctx = new IntOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(16);
				match(ID);
				setState(17);
				((IntOpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE))) != 0)) ) {
					((IntOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(18);
				match(INT);
				}
				break;
			case 4:
				{
				_localctx = new FuncOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(19);
				((FuncOpContext)_localctx).func = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENDSWITH) | (1L << STARTSWITH) | (1L << SUBSTRINGOF))) != 0)) ) {
					((FuncOpContext)_localctx).func = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(20);
				match(T__1);
				setState(21);
				match(ID);
				setState(22);
				match(T__2);
				setState(23);
				match(STRING);
				setState(24);
				match(T__3);
				}
				break;
			case 5:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(25);
				match(T__1);
				setState(26);
				expr(0);
				setState(27);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(37);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(31);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(32);
						((AndContext)_localctx).op = match(AND);
						setState(33);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(34);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(35);
						((OrContext)_localctx).op = match(OR);
						setState(36);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(41);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27-\4\2\t\2\4\3\t"+
		"\3\3\2\6\2\b\n\2\r\2\16\2\t\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3 \n\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3(\n\3\f\3\16\3+\13\3\3\3\2\3\4\4\2\4\2\6\3\2\t\n\3\2\22\23\3\2\t"+
		"\16\3\2\17\21\2\61\2\7\3\2\2\2\4\37\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b"+
		"\t\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2\2\n\3\3\2\2\2\13\f\b\3\1\2\f\r\7\24\2"+
		"\2\r\16\t\2\2\2\16 \t\3\2\2\17\20\7\24\2\2\20\21\t\2\2\2\21 \7\3\2\2\22"+
		"\23\7\24\2\2\23\24\t\4\2\2\24 \7\25\2\2\25\26\t\5\2\2\26\27\7\4\2\2\27"+
		"\30\7\24\2\2\30\31\7\5\2\2\31\32\7\22\2\2\32 \7\6\2\2\33\34\7\4\2\2\34"+
		"\35\5\4\3\2\35\36\7\6\2\2\36 \3\2\2\2\37\13\3\2\2\2\37\17\3\2\2\2\37\22"+
		"\3\2\2\2\37\25\3\2\2\2\37\33\3\2\2\2 )\3\2\2\2!\"\f\t\2\2\"#\7\b\2\2#"+
		"(\5\4\3\n$%\f\b\2\2%&\7\7\2\2&(\5\4\3\t\'!\3\2\2\2\'$\3\2\2\2(+\3\2\2"+
		"\2)\'\3\2\2\2)*\3\2\2\2*\5\3\2\2\2+)\3\2\2\2\6\t\37\')";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}