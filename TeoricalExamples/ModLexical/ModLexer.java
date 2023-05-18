// Generated from ModLexer.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ModLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

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
		"\u0004\u0000\u0005\"\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007"+
		"\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007"+
		"\u0003\u0002\u0004\u0007\u0004\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0004\u0001\u0012\b\u0001\u000b\u0001\f\u0001\u0013"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004\u001f\b\u0004\u000b\u0004"+
		"\f\u0004 \u0000\u0000\u0005\u0002\u0001\u0004\u0002\u0006\u0003\b\u0004"+
		"\n\u0005\u0002\u0000\u0001\u0002\u0001\u0000{{\u0002\u0000{{}}\"\u0000"+
		"\u0002\u0001\u0000\u0000\u0000\u0000\u0004\u0001\u0000\u0000\u0000\u0001"+
		"\u0006\u0001\u0000\u0000\u0000\u0001\b\u0001\u0000\u0000\u0000\u0001\n"+
		"\u0001\u0000\u0000\u0000\u0002\f\u0001\u0000\u0000\u0000\u0004\u0011\u0001"+
		"\u0000\u0000\u0000\u0006\u0015\u0001\u0000\u0000\u0000\b\u0019\u0001\u0000"+
		"\u0000\u0000\n\u001e\u0001\u0000\u0000\u0000\f\r\u0005{\u0000\u0000\r"+
		"\u000e\u0001\u0000\u0000\u0000\u000e\u000f\u0006\u0000\u0000\u0000\u000f"+
		"\u0003\u0001\u0000\u0000\u0000\u0010\u0012\b\u0000\u0000\u0000\u0011\u0010"+
		"\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0011"+
		"\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0005"+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0005}\u0000\u0000\u0016\u0017\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0006\u0002\u0001\u0000\u0018\u0007\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0005{\u0000\u0000\u001a\u001b\u0001\u0000"+
		"\u0000\u0000\u001b\u001c\u0006\u0003\u0000\u0000\u001c\t\u0001\u0000\u0000"+
		"\u0000\u001d\u001f\b\u0001\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000"+
		"\u001f \u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!\u000b\u0001\u0000\u0000\u0000\u0004\u0000\u0001\u0013"+
		" \u0002\u0005\u0001\u0000\u0004\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}