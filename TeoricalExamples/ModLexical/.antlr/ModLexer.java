// Generated from /home/filipe/Documentos/GitHub/COMPILADORES/TeoricalExamples/ModLexical/ModLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_BRACE=1, OTHER=2, CLOSE_BRACE=3, OPEN_BRACE_INSIDE=4, OTHER_INSIDE=5;
	public static final int
		INSIDE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPEN_BRACE", "OTHER", "CLOSE_BRACE", "OPEN_BRACE_INSIDE", "OTHER_INSIDE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN_BRACE", "OTHER", "CLOSE_BRACE", "OPEN_BRACE_INSIDE", "OTHER_INSIDE"
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


	public ModLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ModLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7$\b\1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\3\6\3\24\n\3\r\3"+
		"\16\3\25\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\6\6!\n\6\r\6\16\6\"\2\2\7"+
		"\4\3\6\4\b\5\n\6\f\7\4\2\3\4\3\2}}\4\2}}\177\177\2$\2\4\3\2\2\2\2\6\3"+
		"\2\2\2\3\b\3\2\2\2\3\n\3\2\2\2\3\f\3\2\2\2\4\16\3\2\2\2\6\23\3\2\2\2\b"+
		"\27\3\2\2\2\n\33\3\2\2\2\f \3\2\2\2\16\17\7}\2\2\17\20\3\2\2\2\20\21\b"+
		"\2\2\2\21\5\3\2\2\2\22\24\n\2\2\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3"+
		"\2\2\2\25\26\3\2\2\2\26\7\3\2\2\2\27\30\7\177\2\2\30\31\3\2\2\2\31\32"+
		"\b\4\3\2\32\t\3\2\2\2\33\34\7}\2\2\34\35\3\2\2\2\35\36\b\5\2\2\36\13\3"+
		"\2\2\2\37!\n\3\2\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\r\3\2"+
		"\2\2\6\2\3\25\"\4\7\3\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}