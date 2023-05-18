// Generated from TableCSV.g4 by ANTLR 4.12.0
 
    import static java.lang.System.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TableCSVParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, STRING=4, TEXT=5;
	public static final int
		RULE_file = 0, RULE_line = 1, RULE_field = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "line", "field"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'\\r'", "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "STRING", "TEXT"
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
	public String getGrammarFileName() { return "TableCSV.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private List<String> names = new ArrayList<>();

	public TableCSVParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public TerminalNode EOF() { return getToken(TableCSVParser.EOF, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TableCSVListener ) ((TableCSVListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TableCSVListener ) ((TableCSVListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			line(true);
			setState(10);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) {
				{
				{
				setState(7);
				line(false);
				}
				}
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public boolean CheckFL;
		public int col = 0;
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LineContext(ParserRuleContext parent, int invokingState, boolean CheckFL) {
			super(parent, invokingState);
			this.CheckFL = CheckFL;
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TableCSVListener ) ((TableCSVListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TableCSVListener ) ((TableCSVListener)listener).exitLine(this);
		}
	}

	public final LineContext line(boolean CheckFL) throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState(), CheckFL);
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			field( _localctx.CheckFL , _localctx.col);
			_localctx.col++;
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(17);
				match(T__0);
				setState(18);
				field(_localctx.CheckFL , _localctx.col);
				_localctx.col++;
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(26);
				match(T__1);
				}
			}

			setState(29);
			match(T__2);
			}
			_ctx.stop = _input.LT(-1);

			    if (!_localctx.CheckFL){
			        out.println();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldContext extends ParserRuleContext {
		public boolean FirstLine;
		public int column;
		public String val = "";
		public Token STRING;
		public Token TEXT;
		public TerminalNode STRING() { return getToken(TableCSVParser.STRING, 0); }
		public TerminalNode TEXT() { return getToken(TableCSVParser.TEXT, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FieldContext(ParserRuleContext parent, int invokingState, boolean FirstLine, int column) {
			super(parent, invokingState);
			this.FirstLine = FirstLine;
			this.column = column;
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TableCSVListener ) ((TableCSVListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TableCSVListener ) ((TableCSVListener)listener).exitField(this);
		}
	}

	public final FieldContext field(boolean FirstLine,int column) throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState(), FirstLine, column);
		enterRule(_localctx, 4, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(31);
				((FieldContext)_localctx).STRING = match(STRING);
				((FieldContext)_localctx).val =  (((FieldContext)_localctx).STRING!=null?((FieldContext)_localctx).STRING.getText():null).trim() ; 
				}
				break;
			case TEXT:
				{
				setState(33);
				((FieldContext)_localctx).TEXT = match(TEXT);
				((FieldContext)_localctx).val =  (((FieldContext)_localctx).TEXT!=null?((FieldContext)_localctx).TEXT.getText():null).trim() ; 
				}
				break;
			case T__0:
			case T__1:
			case T__2:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);

			        if (_localctx.FirstLine){
			            if (_localctx.val.isEmpty()){
			                err.println("Error: column names empty");
			            }
			            else{
			                names.add(_localctx.val);
			            }
			        }
			        else{
			            if(_localctx.column >= names.size())
			            {
			                err.println("ERROR: More columns added");
			            }
			            else{
			                out.print("\t"+names.get(_localctx.column)+ " : " + _localctx.val);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0005\'\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0005\u0000\t\b\u0000\n\u0000"+
		"\f\u0000\f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0016\b\u0001\n"+
		"\u0001\f\u0001\u0019\t\u0001\u0001\u0001\u0003\u0001\u001c\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002%\b\u0002\u0001\u0002\u0000\u0000\u0003\u0000\u0002"+
		"\u0004\u0000\u0000(\u0000\u0006\u0001\u0000\u0000\u0000\u0002\u000f\u0001"+
		"\u0000\u0000\u0000\u0004$\u0001\u0000\u0000\u0000\u0006\n\u0003\u0002"+
		"\u0001\u0000\u0007\t\u0003\u0002\u0001\u0000\b\u0007\u0001\u0000\u0000"+
		"\u0000\t\f\u0001\u0000\u0000\u0000\n\b\u0001\u0000\u0000\u0000\n\u000b"+
		"\u0001\u0000\u0000\u0000\u000b\r\u0001\u0000\u0000\u0000\f\n\u0001\u0000"+
		"\u0000\u0000\r\u000e\u0005\u0000\u0000\u0001\u000e\u0001\u0001\u0000\u0000"+
		"\u0000\u000f\u0010\u0003\u0004\u0002\u0000\u0010\u0017\u0006\u0001\uffff"+
		"\uffff\u0000\u0011\u0012\u0005\u0001\u0000\u0000\u0012\u0013\u0003\u0004"+
		"\u0002\u0000\u0013\u0014\u0006\u0001\uffff\uffff\u0000\u0014\u0016\u0001"+
		"\u0000\u0000\u0000\u0015\u0011\u0001\u0000\u0000\u0000\u0016\u0019\u0001"+
		"\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001"+
		"\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u001a\u001c\u0005\u0002\u0000\u0000\u001b\u001a\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001d\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0005\u0003\u0000\u0000\u001e\u0003\u0001"+
		"\u0000\u0000\u0000\u001f \u0005\u0004\u0000\u0000 %\u0006\u0002\uffff"+
		"\uffff\u0000!\"\u0005\u0005\u0000\u0000\"%\u0006\u0002\uffff\uffff\u0000"+
		"#%\u0001\u0000\u0000\u0000$\u001f\u0001\u0000\u0000\u0000$!\u0001\u0000"+
		"\u0000\u0000$#\u0001\u0000\u0000\u0000%\u0005\u0001\u0000\u0000\u0000"+
		"\u0004\n\u0017\u001b$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}