// Generated from /home/filipe/Documentos/GitHub/COMPILADORES/TeoricalExamples/TableCSV/TableCSV.g4 by ANTLR 4.9.2
 
    import static java.lang.System.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TableCSVParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
			null, "','", "'\r'", "'\n'"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << STRING) | (1L << TEXT))) != 0)) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7)\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\7\2\13\n\2\f\2\16\2\16\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\3\5\3\36\n\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\5\4\'\n\4\3\4\2\2\5\2\4\6\2\2\2*\2\b\3\2\2\2\4\21\3\2\2\2\6"+
		"&\3\2\2\2\b\f\5\4\3\2\t\13\5\4\3\2\n\t\3\2\2\2\13\16\3\2\2\2\f\n\3\2\2"+
		"\2\f\r\3\2\2\2\r\17\3\2\2\2\16\f\3\2\2\2\17\20\7\2\2\3\20\3\3\2\2\2\21"+
		"\22\5\6\4\2\22\31\b\3\1\2\23\24\7\3\2\2\24\25\5\6\4\2\25\26\b\3\1\2\26"+
		"\30\3\2\2\2\27\23\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32"+
		"\35\3\2\2\2\33\31\3\2\2\2\34\36\7\4\2\2\35\34\3\2\2\2\35\36\3\2\2\2\36"+
		"\37\3\2\2\2\37 \7\5\2\2 \5\3\2\2\2!\"\7\6\2\2\"\'\b\4\1\2#$\7\7\2\2$\'"+
		"\b\4\1\2%\'\3\2\2\2&!\3\2\2\2&#\3\2\2\2&%\3\2\2\2\'\7\3\2\2\2\6\f\31\35"+
		"&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}