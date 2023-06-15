// Generated from /home/filipe/Documentos/GitHub/COMPILADORES/PROJECT/TESTE/dimana/dimana.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dimanaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__24) | (1L << T__25) | (1L << STRING) | (1L << NUMBER) | (1L << ID))) != 0)) {
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

	public static class UseContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
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
	public static class StatAppendContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public StatAppendContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class StatDeclareContext extends StatContext {
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatDeclareContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class StatAssignContext extends StatContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatAssignContext(StatContext ctx) { copyFrom(ctx); }
	}
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
	}
	public static class StatWriteContext extends StatContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StatWriteContext(StatContext ctx) { copyFrom(ctx); }
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__24) | (1L << T__25) | (1L << STRING) | (1L << NUMBER) | (1L << ID))) != 0)) {
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
	public static class DeclareListContext extends DeclareContext {
		public Token type;
		public Token var;
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public DeclareListContext(DeclareContext ctx) { copyFrom(ctx); }
	}
	public static class DeclareDimensionContext extends DeclareContext {
		public Token type;
		public Token var;
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public DeclareDimensionContext(DeclareContext ctx) { copyFrom(ctx); }
	}
	public static class DeclareDimensionVariableContext extends DeclareContext {
		public Token var;
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public DeclareDimensionVariableContext(DeclareContext ctx) { copyFrom(ctx); }
	}
	public static class DeclareUnitContext extends DeclareContext {
		public Token var;
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public DeclareUnitContext(DeclareContext ctx) { copyFrom(ctx); }
	}
	public static class DeclarePrimitiveVariableContext extends DeclareContext {
		public Token type;
		public Token var;
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public DeclarePrimitiveVariableContext(DeclareContext ctx) { copyFrom(ctx); }
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
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << ID))) != 0)) ) {
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
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
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
	public static class ExprLengthContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprLengthContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprCastContext extends ExprContext {
		public Token type;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprCastContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprStringFormatContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprStringFormatContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprReadContext extends ExprContext {
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public ExprReadContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprAddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprNewListContext extends ExprContext {
		public Token type;
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public ExprNewListContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprStringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public ExprStringContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIDContext extends ExprContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public ExprIDContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIndexContext extends ExprContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprIndexContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprNumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(dimanaParser.NUMBER, 0); }
		public ExprNumberContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprMulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMulDivContext(ExprContext ctx) { copyFrom(ctx); }
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
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << ID))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u009b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\"\n\4\f\4\16"+
		"\4%\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4.\n\4\f\4\16\4\61\13\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\48\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4F\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5[\n\5\3\5\5\5^\n\5\3\5\3\5\3\5\5\5c\n\5\3\5\3\5\3"+
		"\5\3\5\5\5i\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0087\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6\u008e\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0096"+
		"\n\6\f\6\16\6\u0099\13\6\3\6\2\3\n\7\2\4\6\b\n\2\b\3\2\n\13\4\2\20\22"+
		"!!\3\2\20\21\3\2\20\22\3\2\26\27\3\2\35\36\2\u00b0\2\20\3\2\2\2\4\25\3"+
		"\2\2\2\6E\3\2\2\2\bh\3\2\2\2\n\u008d\3\2\2\2\f\17\5\4\3\2\r\17\5\6\4\2"+
		"\16\f\3\2\2\2\16\r\3\2\2\2\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21"+
		"\23\3\2\2\2\22\20\3\2\2\2\23\24\7\2\2\3\24\3\3\2\2\2\25\26\7\3\2\2\26"+
		"\27\7\37\2\2\27\30\7\4\2\2\30\5\3\2\2\2\31\32\7\5\2\2\32\33\7!\2\2\33"+
		"\34\7\6\2\2\34\35\5\n\6\2\35\36\7\7\2\2\36\37\5\n\6\2\37#\7\b\2\2 \"\5"+
		"\6\4\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'"+
		"\7\t\2\2\'(\7\4\2\2(F\3\2\2\2)*\t\2\2\2*/\5\n\6\2+,\7\f\2\2,.\5\n\6\2"+
		"-+\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2"+
		"\62\63\7\4\2\2\63F\3\2\2\2\64\67\5\b\5\2\65\66\7\6\2\2\668\5\n\6\2\67"+
		"\65\3\2\2\2\678\3\2\2\289\3\2\2\29:\7\4\2\2:F\3\2\2\2;<\7!\2\2<=\7\6\2"+
		"\2=>\5\n\6\2>?\7\4\2\2?F\3\2\2\2@A\5\n\6\2AB\7\r\2\2BC\7!\2\2CD\7\4\2"+
		"\2DF\3\2\2\2E\31\3\2\2\2E)\3\2\2\2E\64\3\2\2\2E;\3\2\2\2E@\3\2\2\2F\7"+
		"\3\2\2\2GH\7\16\2\2HI\7\17\2\2IJ\t\3\2\2JK\7\23\2\2Ki\7!\2\2LM\7\24\2"+
		"\2MN\7!\2\2NO\7\17\2\2OP\7!\2\2PQ\7\f\2\2QR\7!\2\2Ri\7\23\2\2ST\7\25\2"+
		"\2TU\t\4\2\2U]\7!\2\2VW\7\17\2\2WZ\7!\2\2XY\7\f\2\2Y[\7!\2\2ZX\3\2\2\2"+
		"Z[\3\2\2\2[\\\3\2\2\2\\^\7\23\2\2]V\3\2\2\2]^\3\2\2\2^b\3\2\2\2_`\7\6"+
		"\2\2`a\7\26\2\2ac\7\27\2\2b_\3\2\2\2bc\3\2\2\2ci\3\2\2\2de\t\5\2\2ei\7"+
		"!\2\2fg\7!\2\2gi\7!\2\2hG\3\2\2\2hL\3\2\2\2hS\3\2\2\2hd\3\2\2\2hf\3\2"+
		"\2\2i\t\3\2\2\2jk\b\6\1\2kl\7\30\2\2lm\7\16\2\2mn\7\17\2\2no\t\3\2\2o"+
		"\u008e\7\23\2\2pq\7!\2\2qr\7\17\2\2rs\5\n\6\2st\7\23\2\2t\u008e\3\2\2"+
		"\2uv\t\4\2\2vw\7\31\2\2wx\5\n\6\2xy\7\32\2\2y\u008e\3\2\2\2z{\7\33\2\2"+
		"{\u008e\7\37\2\2|}\7\34\2\2}~\7\31\2\2~\177\5\n\6\2\177\u0080\7\32\2\2"+
		"\u0080\u008e\3\2\2\2\u0081\u0082\7\22\2\2\u0082\u0083\7\31\2\2\u0083\u0086"+
		"\5\n\6\2\u0084\u0085\7\f\2\2\u0085\u0087\5\n\6\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\32\2\2\u0089\u008e\3"+
		"\2\2\2\u008a\u008e\7\37\2\2\u008b\u008e\7 \2\2\u008c\u008e\7!\2\2\u008d"+
		"j\3\2\2\2\u008dp\3\2\2\2\u008du\3\2\2\2\u008dz\3\2\2\2\u008d|\3\2\2\2"+
		"\u008d\u0081\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c"+
		"\3\2\2\2\u008e\u0097\3\2\2\2\u008f\u0090\f\7\2\2\u0090\u0091\t\6\2\2\u0091"+
		"\u0096\5\n\6\b\u0092\u0093\f\6\2\2\u0093\u0094\t\7\2\2\u0094\u0096\5\n"+
		"\6\7\u0095\u008f\3\2\2\2\u0095\u0092\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\13\3\2\2\2\u0099\u0097\3\2\2"+
		"\2\20\16\20#/\67EZ]bh\u0086\u008d\u0095\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}