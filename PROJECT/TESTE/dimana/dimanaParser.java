// Generated from dimana.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class dimanaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, STRING=29, NUMBER=30, ID=31, COMMENT=32, 
		WS=33;
	public static final int
		RULE_program = 0, RULE_use = 1, RULE_stat = 2, RULE_declare = 3, RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "use", "stat", "declare", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "';'", "'for'", "'='", "'to'", "'do'", "'end'", "'write'", 
			"'writeln'", "','", "'>>'", "'list'", "'['", "'integer'", "'real'", "'string'", 
			"']'", "'unit'", "'dimension'", "'*'", "'/'", "'new'", "'('", "')'", 
			"'read'", "'length'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "STRING", "NUMBER", "ID", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "dimana.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public dimanaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(dimanaParser.EOF, 0); }
		public List<UseContext> use() {
			return getRuleContexts(UseContext.class);
		}
		public UseContext use(int i) {
			return getRuleContext(UseContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3863859978L) != 0)) {
				{
				setState(12);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(10);
					use();
					}
					break;
				case T__2:
				case T__7:
				case T__8:
				case T__11:
				case T__13:
				case T__14:
				case T__15:
				case T__17:
				case T__18:
				case T__21:
				case T__24:
				case T__25:
				case STRING:
				case NUMBER:
				case ID:
					{
					setState(11);
					stat();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17);
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
	public static class UseContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitUse(this);
		}
	}

	public final UseContext use() throws RecognitionException {
		UseContext _localctx = new UseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(T__0);
			setState(20);
			match(STRING);
			setState(21);
			match(T__1);
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
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatAppendContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public StatAppendContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterStatAppend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitStatAppend(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatDeclareContext extends StatContext {
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatDeclareContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterStatDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitStatDeclare(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatAssignContext extends StatContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatAssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterStatAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitStatAssign(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatForContext extends StatContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public StatForContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterStatFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitStatFor(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatWriteContext extends StatContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StatWriteContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterStatWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitStatWrite(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		int _la;
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new StatForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				match(T__2);
				setState(24);
				match(ID);
				setState(25);
				match(T__3);
				setState(26);
				expr(0);
				setState(27);
				match(T__4);
				setState(28);
				expr(0);
				setState(29);
				match(T__5);
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3863859976L) != 0)) {
					{
					{
					setState(30);
					stat();
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(36);
				match(T__6);
				setState(37);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new StatWriteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				((StatWriteContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
					((StatWriteContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(40);
				expr(0);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(41);
					match(T__9);
					setState(42);
					expr(0);
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(48);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new StatDeclareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				declare();
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(51);
					match(T__3);
					setState(52);
					expr(0);
					}
				}

				setState(55);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new StatAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				match(ID);
				setState(58);
				match(T__3);
				setState(59);
				expr(0);
				setState(60);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new StatAppendContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				expr(0);
				setState(63);
				match(T__10);
				setState(64);
				match(ID);
				setState(65);
				match(T__1);
				}
				break;
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
	public static class DeclareContext extends ParserRuleContext {
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
	 
		public DeclareContext() { }
		public void copyFrom(DeclareContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclareListContext extends DeclareContext {
		public Token type;
		public Token var;
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public DeclareListContext(DeclareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterDeclareList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitDeclareList(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclareDimensionContext extends DeclareContext {
		public Token type;
		public Token var;
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public DeclareDimensionContext(DeclareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterDeclareDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitDeclareDimension(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclareDimensionVariableContext extends DeclareContext {
		public Token var;
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public DeclareDimensionVariableContext(DeclareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterDeclareDimensionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitDeclareDimensionVariable(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclareUnitContext extends DeclareContext {
		public Token var;
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public DeclareUnitContext(DeclareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterDeclareUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitDeclareUnit(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarePrimitiveVariableContext extends DeclareContext {
		public Token type;
		public Token var;
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public DeclarePrimitiveVariableContext(DeclareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterDeclarePrimitiveVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitDeclarePrimitiveVariable(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declare);
		int _la;
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new DeclareListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(T__11);
				setState(70);
				match(T__12);
				setState(71);
				((DeclareListContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2147598336L) != 0)) ) {
					((DeclareListContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(72);
				match(T__16);
				setState(73);
				((DeclareListContext)_localctx).var = match(ID);
				}
				break;
			case T__17:
				_localctx = new DeclareUnitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__17);
				setState(75);
				((DeclareUnitContext)_localctx).var = match(ID);
				setState(76);
				match(T__12);
				setState(77);
				match(ID);
				setState(78);
				match(T__9);
				setState(79);
				match(ID);
				setState(80);
				match(T__16);
				}
				break;
			case T__18:
				_localctx = new DeclareDimensionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(T__18);
				setState(82);
				((DeclareDimensionContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__14) ) {
					((DeclareDimensionContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(83);
				((DeclareDimensionContext)_localctx).var = match(ID);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(84);
					match(T__12);
					setState(85);
					match(ID);
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__9) {
						{
						setState(86);
						match(T__9);
						setState(87);
						match(ID);
						}
					}

					setState(90);
					match(T__16);
					}
				}

				setState(96);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(93);
					match(T__3);
					setState(94);
					match(T__19);
					setState(95);
					match(T__20);
					}
					break;
				}
				}
				break;
			case T__13:
			case T__14:
			case T__15:
				_localctx = new DeclarePrimitiveVariableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				((DeclarePrimitiveVariableContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 114688L) != 0)) ) {
					((DeclarePrimitiveVariableContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(99);
				((DeclarePrimitiveVariableContext)_localctx).var = match(ID);
				}
				break;
			case ID:
				_localctx = new DeclareDimensionVariableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				match(ID);
				setState(101);
				((DeclareDimensionVariableContext)_localctx).var = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLengthContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprLengthContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterExprLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitExprLength(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprCastContext extends ExprContext {
		public Token type;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprCastContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterExprCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitExprCast(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStringFormatContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprStringFormatContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterExprStringFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitExprStringFormat(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprReadContext extends ExprContext {
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public ExprReadContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterExprRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitExprRead(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitExprAddSub(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNewListContext extends ExprContext {
		public Token type;
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public ExprNewListContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterExprNewList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitExprNewList(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public ExprStringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterExprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitExprString(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIDContext extends ExprContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public ExprIDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterExprID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitExprID(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIndexContext extends ExprContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprIndexContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterExprIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitExprIndex(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(dimanaParser.NUMBER, 0); }
		public ExprNumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterExprNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitExprNumber(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterExprMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitExprMulDiv(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new ExprNewListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(105);
				match(T__21);
				setState(106);
				match(T__11);
				setState(107);
				match(T__12);
				setState(108);
				((ExprNewListContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2147598336L) != 0)) ) {
					((ExprNewListContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(109);
				match(T__16);
				}
				break;
			case 2:
				{
				_localctx = new ExprIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(ID);
				setState(111);
				match(T__12);
				setState(112);
				expr(0);
				setState(113);
				match(T__16);
				}
				break;
			case 3:
				{
				_localctx = new ExprCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				((ExprCastContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__14) ) {
					((ExprCastContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				match(T__22);
				setState(117);
				expr(0);
				setState(118);
				match(T__23);
				}
				break;
			case 4:
				{
				_localctx = new ExprReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(T__24);
				setState(121);
				match(STRING);
				}
				break;
			case 5:
				{
				_localctx = new ExprLengthContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(T__25);
				setState(123);
				match(T__22);
				setState(124);
				expr(0);
				setState(125);
				match(T__23);
				}
				break;
			case 6:
				{
				_localctx = new ExprStringFormatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(T__15);
				setState(128);
				match(T__22);
				setState(129);
				expr(0);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(130);
					match(T__9);
					setState(131);
					expr(0);
					}
				}

				setState(134);
				match(T__23);
				}
				break;
			case 7:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new ExprNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				match(NUMBER);
				}
				break;
			case 9:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(142);
						((ExprMulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((ExprMulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(145);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(146);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001!\u0099\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\r\b\u0000\n\u0000\f\u0000\u0010\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002 \b\u0002\n\u0002\f\u0002#\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002,\b\u0002\n\u0002\f\u0002/\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002D\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003Y\b\u0003\u0001\u0003"+
		"\u0003\u0003\\\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"a\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"g\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0085\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u008c\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u0094\b\u0004\n\u0004\f\u0004\u0097"+
		"\t\u0004\u0001\u0004\u0000\u0001\b\u0005\u0000\u0002\u0004\u0006\b\u0000"+
		"\u0006\u0001\u0000\b\t\u0002\u0000\u000e\u0010\u001f\u001f\u0001\u0000"+
		"\u000e\u000f\u0001\u0000\u000e\u0010\u0001\u0000\u0014\u0015\u0001\u0000"+
		"\u001b\u001c\u00ae\u0000\u000e\u0001\u0000\u0000\u0000\u0002\u0013\u0001"+
		"\u0000\u0000\u0000\u0004C\u0001\u0000\u0000\u0000\u0006f\u0001\u0000\u0000"+
		"\u0000\b\u008b\u0001\u0000\u0000\u0000\n\r\u0003\u0002\u0001\u0000\u000b"+
		"\r\u0003\u0004\u0002\u0000\f\n\u0001\u0000\u0000\u0000\f\u000b\u0001\u0000"+
		"\u0000\u0000\r\u0010\u0001\u0000\u0000\u0000\u000e\f\u0001\u0000\u0000"+
		"\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\u0011\u0001\u0000\u0000"+
		"\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0011\u0012\u0005\u0000\u0000"+
		"\u0001\u0012\u0001\u0001\u0000\u0000\u0000\u0013\u0014\u0005\u0001\u0000"+
		"\u0000\u0014\u0015\u0005\u001d\u0000\u0000\u0015\u0016\u0005\u0002\u0000"+
		"\u0000\u0016\u0003\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0003\u0000"+
		"\u0000\u0018\u0019\u0005\u001f\u0000\u0000\u0019\u001a\u0005\u0004\u0000"+
		"\u0000\u001a\u001b\u0003\b\u0004\u0000\u001b\u001c\u0005\u0005\u0000\u0000"+
		"\u001c\u001d\u0003\b\u0004\u0000\u001d!\u0005\u0006\u0000\u0000\u001e"+
		" \u0003\u0004\u0002\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001"+
		"\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005\u0007"+
		"\u0000\u0000%&\u0005\u0002\u0000\u0000&D\u0001\u0000\u0000\u0000\'(\u0007"+
		"\u0000\u0000\u0000(-\u0003\b\u0004\u0000)*\u0005\n\u0000\u0000*,\u0003"+
		"\b\u0004\u0000+)\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u000001\u0005\u0002\u0000\u00001D\u0001\u0000\u0000"+
		"\u000025\u0003\u0006\u0003\u000034\u0005\u0004\u0000\u000046\u0003\b\u0004"+
		"\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u000078\u0005\u0002\u0000\u00008D\u0001\u0000\u0000\u00009:\u0005"+
		"\u001f\u0000\u0000:;\u0005\u0004\u0000\u0000;<\u0003\b\u0004\u0000<=\u0005"+
		"\u0002\u0000\u0000=D\u0001\u0000\u0000\u0000>?\u0003\b\u0004\u0000?@\u0005"+
		"\u000b\u0000\u0000@A\u0005\u001f\u0000\u0000AB\u0005\u0002\u0000\u0000"+
		"BD\u0001\u0000\u0000\u0000C\u0017\u0001\u0000\u0000\u0000C\'\u0001\u0000"+
		"\u0000\u0000C2\u0001\u0000\u0000\u0000C9\u0001\u0000\u0000\u0000C>\u0001"+
		"\u0000\u0000\u0000D\u0005\u0001\u0000\u0000\u0000EF\u0005\f\u0000\u0000"+
		"FG\u0005\r\u0000\u0000GH\u0007\u0001\u0000\u0000HI\u0005\u0011\u0000\u0000"+
		"Ig\u0005\u001f\u0000\u0000JK\u0005\u0012\u0000\u0000KL\u0005\u001f\u0000"+
		"\u0000LM\u0005\r\u0000\u0000MN\u0005\u001f\u0000\u0000NO\u0005\n\u0000"+
		"\u0000OP\u0005\u001f\u0000\u0000Pg\u0005\u0011\u0000\u0000QR\u0005\u0013"+
		"\u0000\u0000RS\u0007\u0002\u0000\u0000S[\u0005\u001f\u0000\u0000TU\u0005"+
		"\r\u0000\u0000UX\u0005\u001f\u0000\u0000VW\u0005\n\u0000\u0000WY\u0005"+
		"\u001f\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z\\\u0005\u0011\u0000\u0000[T\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\`\u0001\u0000\u0000\u0000]^\u0005\u0004"+
		"\u0000\u0000^_\u0005\u0014\u0000\u0000_a\u0005\u0015\u0000\u0000`]\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ag\u0001\u0000\u0000\u0000"+
		"bc\u0007\u0003\u0000\u0000cg\u0005\u001f\u0000\u0000de\u0005\u001f\u0000"+
		"\u0000eg\u0005\u001f\u0000\u0000fE\u0001\u0000\u0000\u0000fJ\u0001\u0000"+
		"\u0000\u0000fQ\u0001\u0000\u0000\u0000fb\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000g\u0007\u0001\u0000\u0000\u0000hi\u0006\u0004\uffff"+
		"\uffff\u0000ij\u0005\u0016\u0000\u0000jk\u0005\f\u0000\u0000kl\u0005\r"+
		"\u0000\u0000lm\u0007\u0001\u0000\u0000m\u008c\u0005\u0011\u0000\u0000"+
		"no\u0005\u001f\u0000\u0000op\u0005\r\u0000\u0000pq\u0003\b\u0004\u0000"+
		"qr\u0005\u0011\u0000\u0000r\u008c\u0001\u0000\u0000\u0000st\u0007\u0002"+
		"\u0000\u0000tu\u0005\u0017\u0000\u0000uv\u0003\b\u0004\u0000vw\u0005\u0018"+
		"\u0000\u0000w\u008c\u0001\u0000\u0000\u0000xy\u0005\u0019\u0000\u0000"+
		"y\u008c\u0005\u001d\u0000\u0000z{\u0005\u001a\u0000\u0000{|\u0005\u0017"+
		"\u0000\u0000|}\u0003\b\u0004\u0000}~\u0005\u0018\u0000\u0000~\u008c\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005\u0010\u0000\u0000\u0080\u0081\u0005"+
		"\u0017\u0000\u0000\u0081\u0084\u0003\b\u0004\u0000\u0082\u0083\u0005\n"+
		"\u0000\u0000\u0083\u0085\u0003\b\u0004\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005\u0018\u0000\u0000\u0087\u008c\u0001\u0000\u0000"+
		"\u0000\u0088\u008c\u0005\u001d\u0000\u0000\u0089\u008c\u0005\u001e\u0000"+
		"\u0000\u008a\u008c\u0005\u001f\u0000\u0000\u008bh\u0001\u0000\u0000\u0000"+
		"\u008bn\u0001\u0000\u0000\u0000\u008bs\u0001\u0000\u0000\u0000\u008bx"+
		"\u0001\u0000\u0000\u0000\u008bz\u0001\u0000\u0000\u0000\u008b\u007f\u0001"+
		"\u0000\u0000\u0000\u008b\u0088\u0001\u0000\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u0095\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\n\u0005\u0000\u0000\u008e\u008f\u0007\u0004"+
		"\u0000\u0000\u008f\u0094\u0003\b\u0004\u0006\u0090\u0091\n\u0004\u0000"+
		"\u0000\u0091\u0092\u0007\u0005\u0000\u0000\u0092\u0094\u0003\b\u0004\u0005"+
		"\u0093\u008d\u0001\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000"+
		"\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0001\u0000\u0000\u0000\u0096\t\u0001\u0000\u0000\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u000e\f\u000e!-5CX[`f\u0084\u008b\u0093"+
		"\u0095";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}