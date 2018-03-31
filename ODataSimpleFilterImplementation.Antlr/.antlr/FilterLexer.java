// Generated from c:\Projects\ODataSimpleFilterImplementation\ODataSimpleFilterImplementation.Antlr\Filter.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FilterLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, OR=4, AND=5, EQ=6, NE=7, GT=8, GE=9, LT=10, LE=11, 
		ENDSWITH=12, STARTSWITH=13, SUBSTRINGOF=14, STRING=15, ID=16, INT=17, 
		NEWLINE=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "OR", "AND", "EQ", "NE", "GT", "GE", "LT", "LE", 
		"ENDSWITH", "STARTSWITH", "SUBSTRINGOF", "STRING", "ID", "INT", "NEWLINE", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "','", "')'", "'or'", "'and'", "'eq'", "'ne'", "'gt'", "'ge'", 
		"'lt'", "'le'", "'endswith'", "'startswith'", "'substringof'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "OR", "AND", "EQ", "NE", "GT", "GE", "LT", "LE", 
		"ENDSWITH", "STARTSWITH", "SUBSTRINGOF", "STRING", "ID", "INT", "NEWLINE", 
		"WS"
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


	public FilterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Filter.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0086\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\6\20k\n\20\r\20\16\20l\3\20\3\20\3\21"+
		"\6\21r\n\21\r\21\16\21s\3\22\6\22w\n\22\r\22\16\22x\3\23\5\23|\n\23\3"+
		"\23\3\23\3\24\6\24\u0081\n\24\r\24\16\24\u0082\3\24\3\24\3l\2\25\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25\3\2\5\4\2C\\c|\3\2\62;\4\2\13\13\"\"\2\u008a\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\62\3"+
		"\2\2\2\r\66\3\2\2\2\179\3\2\2\2\21<\3\2\2\2\23?\3\2\2\2\25B\3\2\2\2\27"+
		"E\3\2\2\2\31H\3\2\2\2\33Q\3\2\2\2\35\\\3\2\2\2\37h\3\2\2\2!q\3\2\2\2#"+
		"v\3\2\2\2%{\3\2\2\2\'\u0080\3\2\2\2)*\7*\2\2*\4\3\2\2\2+,\7.\2\2,\6\3"+
		"\2\2\2-.\7+\2\2.\b\3\2\2\2/\60\7q\2\2\60\61\7t\2\2\61\n\3\2\2\2\62\63"+
		"\7c\2\2\63\64\7p\2\2\64\65\7f\2\2\65\f\3\2\2\2\66\67\7g\2\2\678\7s\2\2"+
		"8\16\3\2\2\29:\7p\2\2:;\7g\2\2;\20\3\2\2\2<=\7i\2\2=>\7v\2\2>\22\3\2\2"+
		"\2?@\7i\2\2@A\7g\2\2A\24\3\2\2\2BC\7n\2\2CD\7v\2\2D\26\3\2\2\2EF\7n\2"+
		"\2FG\7g\2\2G\30\3\2\2\2HI\7g\2\2IJ\7p\2\2JK\7f\2\2KL\7u\2\2LM\7y\2\2M"+
		"N\7k\2\2NO\7v\2\2OP\7j\2\2P\32\3\2\2\2QR\7u\2\2RS\7v\2\2ST\7c\2\2TU\7"+
		"t\2\2UV\7v\2\2VW\7u\2\2WX\7y\2\2XY\7k\2\2YZ\7v\2\2Z[\7j\2\2[\34\3\2\2"+
		"\2\\]\7u\2\2]^\7w\2\2^_\7d\2\2_`\7u\2\2`a\7v\2\2ab\7t\2\2bc\7k\2\2cd\7"+
		"p\2\2de\7i\2\2ef\7q\2\2fg\7h\2\2g\36\3\2\2\2hj\7)\2\2ik\13\2\2\2ji\3\2"+
		"\2\2kl\3\2\2\2lm\3\2\2\2lj\3\2\2\2mn\3\2\2\2no\7)\2\2o \3\2\2\2pr\t\2"+
		"\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\"\3\2\2\2uw\t\3\2\2vu\3"+
		"\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y$\3\2\2\2z|\7\17\2\2{z\3\2\2\2{|"+
		"\3\2\2\2|}\3\2\2\2}~\7\f\2\2~&\3\2\2\2\177\u0081\t\4\2\2\u0080\177\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\b\24\2\2\u0085(\3\2\2\2\b\2lsx{\u0082\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}