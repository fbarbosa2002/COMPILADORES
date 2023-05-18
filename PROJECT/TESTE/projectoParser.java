// Generated from projecto.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class projectoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, STRING=29, TEXT=30, REAL=31, INTEGER=32, 
		NEWLINE=33, WS=34, COMMENT=35;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_for_loop = 2, RULE_normal_expressions = 3, 
		RULE_in_loop_expressions = 4, RULE_out_loop_expressions = 5, RULE_create_dimension = 6, 
		RULE_use_import = 7, RULE_create_variable = 8, RULE_assignment = 9, RULE_print = 10, 
		RULE_init_for = 11, RULE_end_for = 12, RULE_create_normal_variable = 13, 
		RULE_create_dim_variable = 14, RULE_create_str_variable = 15, RULE_create_list = 16, 
		RULE_add_to_list = 17, RULE_unit_ass = 18, RULE_normal_ass = 19, RULE_dim_ass = 20, 
		RULE_ind_type = 21, RULE_dep_type = 22, RULE_type = 23, RULE_list_types = 24, 
		RULE_write = 25, RULE_writeln = 26, RULE_string_to_print = 27, RULE_personalized_string = 28, 
		RULE_write_string_type = 29, RULE_expression_to_add = 30, RULE_integers = 31, 
		RULE_expression_dimension = 32, RULE_expr = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "for_loop", "normal_expressions", "in_loop_expressions", 
			"out_loop_expressions", "create_dimension", "use_import", "create_variable", 
			"assignment", "print", "init_for", "end_for", "create_normal_variable", 
			"create_dim_variable", "create_str_variable", "create_list", "add_to_list", 
			"unit_ass", "normal_ass", "dim_ass", "ind_type", "dep_type", "type", 
			"list_types", "write", "writeln", "string_to_print", "personalized_string", 
			"write_string_type", "expression_to_add", "integers", "expression_dimension", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'dimension'", "'string'", "'use'", "'for'", "'='", "'to'", 
			"'do'", "'end'", "'list'", "'['", "']'", "'new'", "'>>'", "'unit'", "'*'", 
			"','", "'real'", "'integer'", "'write'", "'writeln'", "'('", "')'", "'length'", 
			"'/'", "'read'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "STRING", "TEXT", "REAL", "INTEGER", "NEWLINE", 
			"WS", "COMMENT"
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
	public String getGrammarFileName() { return "projecto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public projectoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(projectoParser.EOF, 0); }
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
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16177202238L) != 0)) {
				{
				{
				setState(68);
				stat();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
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
	public static class StatContext extends ParserRuleContext {
		public Normal_expressionsContext normal_expressions() {
			return getRuleContext(Normal_expressionsContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(projectoParser.NEWLINE, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__9:
			case T__14:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__25:
			case TEXT:
			case REAL:
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				normal_expressions();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				for_loop();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(NEWLINE);
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
	public static class For_loopContext extends ParserRuleContext {
		public Init_forContext init_for() {
			return getRuleContext(Init_forContext.class,0);
		}
		public End_forContext end_for() {
			return getRuleContext(End_forContext.class,0);
		}
		public List<In_loop_expressionsContext> in_loop_expressions() {
			return getRuleContexts(In_loop_expressionsContext.class);
		}
		public In_loop_expressionsContext in_loop_expressions(int i) {
			return getRuleContext(In_loop_expressionsContext.class,i);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			init_for();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7587267598L) != 0)) {
				{
				{
				setState(82);
				in_loop_expressions();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			end_for();
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
	public static class Normal_expressionsContext extends ParserRuleContext {
		public In_loop_expressionsContext in_loop_expressions() {
			return getRuleContext(In_loop_expressionsContext.class,0);
		}
		public Out_loop_expressionsContext out_loop_expressions() {
			return getRuleContext(Out_loop_expressionsContext.class,0);
		}
		public Normal_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normal_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterNormal_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitNormal_expressions(this);
		}
	}

	public final Normal_expressionsContext normal_expressions() throws RecognitionException {
		Normal_expressionsContext _localctx = new Normal_expressionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_normal_expressions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__9:
			case T__14:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__25:
			case TEXT:
			case REAL:
			case INTEGER:
				{
				setState(90);
				in_loop_expressions();
				}
				break;
			case T__3:
				{
				setState(91);
				out_loop_expressions();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class In_loop_expressionsContext extends ParserRuleContext {
		public Create_dimensionContext create_dimension() {
			return getRuleContext(Create_dimensionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(projectoParser.NEWLINE, 0); }
		public Create_variableContext create_variable() {
			return getRuleContext(Create_variableContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public In_loop_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_loop_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterIn_loop_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitIn_loop_expressions(this);
		}
	}

	public final In_loop_expressionsContext in_loop_expressions() throws RecognitionException {
		In_loop_expressionsContext _localctx = new In_loop_expressionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_in_loop_expressions);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				create_dimension();
				setState(95);
				match(T__0);
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(96);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				create_variable();
				setState(100);
				match(T__0);
				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(101);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				assignment();
				setState(105);
				match(T__0);
				setState(107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(106);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				print();
				setState(110);
				match(T__0);
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(111);
					match(NEWLINE);
					}
					break;
				}
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
	public static class Out_loop_expressionsContext extends ParserRuleContext {
		public Use_importContext use_import() {
			return getRuleContext(Use_importContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(projectoParser.NEWLINE, 0); }
		public Out_loop_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out_loop_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterOut_loop_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitOut_loop_expressions(this);
		}
	}

	public final Out_loop_expressionsContext out_loop_expressions() throws RecognitionException {
		Out_loop_expressionsContext _localctx = new Out_loop_expressionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_out_loop_expressions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			use_import();
			setState(117);
			match(T__0);
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(118);
				match(NEWLINE);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Create_dimensionContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(projectoParser.TEXT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Ind_typeContext ind_type() {
			return getRuleContext(Ind_typeContext.class,0);
		}
		public Dep_typeContext dep_type() {
			return getRuleContext(Dep_typeContext.class,0);
		}
		public Create_dimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterCreate_dimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitCreate_dimension(this);
		}
	}

	public final Create_dimensionContext create_dimension() throws RecognitionException {
		Create_dimensionContext _localctx = new Create_dimensionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_create_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__1);
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
				{
				setState(122);
				type();
				}
				break;
			case T__2:
				{
				setState(123);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(126);
			match(TEXT);
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(127);
				ind_type();
				}
				break;
			case 2:
				{
				setState(128);
				dep_type();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Use_importContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(projectoParser.STRING, 0); }
		public Use_importContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_import; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterUse_import(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitUse_import(this);
		}
	}

	public final Use_importContext use_import() throws RecognitionException {
		Use_importContext _localctx = new Use_importContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_use_import);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__3);
			setState(132);
			match(STRING);
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
	public static class Create_variableContext extends ParserRuleContext {
		public Create_normal_variableContext create_normal_variable() {
			return getRuleContext(Create_normal_variableContext.class,0);
		}
		public Create_dim_variableContext create_dim_variable() {
			return getRuleContext(Create_dim_variableContext.class,0);
		}
		public Create_str_variableContext create_str_variable() {
			return getRuleContext(Create_str_variableContext.class,0);
		}
		public Create_listContext create_list() {
			return getRuleContext(Create_listContext.class,0);
		}
		public Create_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterCreate_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitCreate_variable(this);
		}
	}

	public final Create_variableContext create_variable() throws RecognitionException {
		Create_variableContext _localctx = new Create_variableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_create_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
				{
				setState(134);
				create_normal_variable();
				}
				break;
			case TEXT:
				{
				setState(135);
				create_dim_variable();
				}
				break;
			case T__2:
				{
				setState(136);
				create_str_variable();
				}
				break;
			case T__9:
				{
				setState(137);
				create_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Add_to_listContext add_to_list() {
			return getRuleContext(Add_to_listContext.class,0);
		}
		public Unit_assContext unit_ass() {
			return getRuleContext(Unit_assContext.class,0);
		}
		public Dim_assContext dim_ass() {
			return getRuleContext(Dim_assContext.class,0);
		}
		public Normal_assContext normal_ass() {
			return getRuleContext(Normal_assContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(140);
				add_to_list();
				}
				break;
			case 2:
				{
				setState(141);
				unit_ass();
				}
				break;
			case 3:
				{
				setState(142);
				dim_ass();
				}
				break;
			case 4:
				{
				setState(143);
				normal_ass();
				}
				break;
			case 5:
				{
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public String_to_printContext string_to_print() {
			return getRuleContext(String_to_printContext.class,0);
		}
		public WritelnContext writeln() {
			return getRuleContext(WritelnContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(147);
				write();
				setState(148);
				string_to_print();
				}
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(150);
				writeln();
				setState(151);
				string_to_print();
				}
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
	public static class Init_forContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(projectoParser.TEXT, 0); }
		public List<IntegersContext> integers() {
			return getRuleContexts(IntegersContext.class);
		}
		public IntegersContext integers(int i) {
			return getRuleContext(IntegersContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(projectoParser.NEWLINE, 0); }
		public Init_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterInit_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitInit_for(this);
		}
	}

	public final Init_forContext init_for() throws RecognitionException {
		Init_forContext _localctx = new Init_forContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_init_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__4);
			setState(156);
			match(TEXT);
			setState(157);
			match(T__5);
			setState(158);
			integers();
			setState(159);
			match(T__6);
			setState(160);
			integers();
			setState(161);
			match(T__7);
			setState(162);
			match(NEWLINE);
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
	public static class End_forContext extends ParserRuleContext {
		public End_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterEnd_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitEnd_for(this);
		}
	}

	public final End_forContext end_for() throws RecognitionException {
		End_forContext _localctx = new End_forContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_end_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__8);
			setState(165);
			match(T__0);
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
	public static class Create_normal_variableContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(projectoParser.TEXT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_normal_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_normal_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterCreate_normal_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitCreate_normal_variable(this);
		}
	}

	public final Create_normal_variableContext create_normal_variable() throws RecognitionException {
		Create_normal_variableContext _localctx = new Create_normal_variableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_normal_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			type();
			setState(168);
			match(TEXT);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(169);
				match(T__5);
				setState(170);
				expr(0);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Create_dim_variableContext extends ParserRuleContext {
		public Token e1;
		public Token e2;
		public List<TerminalNode> TEXT() { return getTokens(projectoParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(projectoParser.TEXT, i);
		}
		public Create_dim_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_dim_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterCreate_dim_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitCreate_dim_variable(this);
		}
	}

	public final Create_dim_variableContext create_dim_variable() throws RecognitionException {
		Create_dim_variableContext _localctx = new Create_dim_variableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_create_dim_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			((Create_dim_variableContext)_localctx).e1 = match(TEXT);
			setState(174);
			((Create_dim_variableContext)_localctx).e2 = match(TEXT);
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
	public static class Create_str_variableContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(projectoParser.TEXT, 0); }
		public TerminalNode STRING() { return getToken(projectoParser.STRING, 0); }
		public Create_str_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_str_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterCreate_str_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitCreate_str_variable(this);
		}
	}

	public final Create_str_variableContext create_str_variable() throws RecognitionException {
		Create_str_variableContext _localctx = new Create_str_variableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_create_str_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__2);
			setState(177);
			match(TEXT);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(178);
				match(T__5);
				setState(179);
				match(STRING);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Create_listContext extends ParserRuleContext {
		public List<List_typesContext> list_types() {
			return getRuleContexts(List_typesContext.class);
		}
		public List_typesContext list_types(int i) {
			return getRuleContext(List_typesContext.class,i);
		}
		public TerminalNode TEXT() { return getToken(projectoParser.TEXT, 0); }
		public Create_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterCreate_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitCreate_list(this);
		}
	}

	public final Create_listContext create_list() throws RecognitionException {
		Create_listContext _localctx = new Create_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_create_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__9);
			setState(183);
			match(T__10);
			setState(184);
			list_types();
			setState(185);
			match(T__11);
			setState(186);
			match(TEXT);
			setState(187);
			match(T__5);
			setState(188);
			match(T__12);
			setState(189);
			match(T__9);
			setState(190);
			match(T__10);
			setState(191);
			list_types();
			setState(192);
			match(T__11);
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
	public static class Add_to_listContext extends ParserRuleContext {
		public Expression_to_addContext expression_to_add() {
			return getRuleContext(Expression_to_addContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(projectoParser.TEXT, 0); }
		public Add_to_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_to_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterAdd_to_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitAdd_to_list(this);
		}
	}

	public final Add_to_listContext add_to_list() throws RecognitionException {
		Add_to_listContext _localctx = new Add_to_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_add_to_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			expression_to_add();
			setState(195);
			match(T__13);
			setState(196);
			match(TEXT);
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
	public static class Unit_assContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(projectoParser.TEXT, 0); }
		public Ind_typeContext ind_type() {
			return getRuleContext(Ind_typeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Unit_assContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit_ass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterUnit_ass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitUnit_ass(this);
		}
	}

	public final Unit_assContext unit_ass() throws RecognitionException {
		Unit_assContext _localctx = new Unit_assContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unit_ass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__14);
			setState(199);
			match(TEXT);
			setState(200);
			ind_type();
			setState(201);
			match(T__5);
			setState(202);
			expr(0);
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
	public static class Normal_assContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(projectoParser.TEXT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Normal_assContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normal_ass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterNormal_ass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitNormal_ass(this);
		}
	}

	public final Normal_assContext normal_ass() throws RecognitionException {
		Normal_assContext _localctx = new Normal_assContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_normal_ass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(TEXT);
			setState(205);
			match(T__5);
			setState(206);
			expr(0);
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
	public static class Dim_assContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(projectoParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(projectoParser.TEXT, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Dim_assContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim_ass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterDim_ass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitDim_ass(this);
		}
	}

	public final Dim_assContext dim_ass() throws RecognitionException {
		Dim_assContext _localctx = new Dim_assContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dim_ass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(208);
			match(TEXT);
			setState(209);
			match(T__5);
			setState(210);
			expr(0);
			setState(211);
			match(T__15);
			setState(212);
			match(TEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ind_typeContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(projectoParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(projectoParser.TEXT, i);
		}
		public Ind_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ind_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterInd_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitInd_type(this);
		}
	}

	public final Ind_typeContext ind_type() throws RecognitionException {
		Ind_typeContext _localctx = new Ind_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ind_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__10);
			setState(215);
			match(TEXT);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(216);
				match(T__16);
				setState(217);
				match(TEXT);
				}
			}

			setState(220);
			match(T__11);
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
	public static class Dep_typeContext extends ParserRuleContext {
		public Expression_dimensionContext expression_dimension() {
			return getRuleContext(Expression_dimensionContext.class,0);
		}
		public List<TerminalNode> TEXT() { return getTokens(projectoParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(projectoParser.TEXT, i);
		}
		public Dep_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dep_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterDep_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitDep_type(this);
		}
	}

	public final Dep_typeContext dep_type() throws RecognitionException {
		Dep_typeContext _localctx = new Dep_typeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dep_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(222);
				match(T__10);
				setState(223);
				match(TEXT);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(224);
					match(T__16);
					setState(225);
					match(TEXT);
					}
				}

				setState(228);
				match(T__11);
				}
			}

			setState(231);
			match(T__5);
			setState(232);
			expression_dimension(0);
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
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class List_typesContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(projectoParser.TEXT, 0); }
		public List_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterList_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitList_types(this);
		}
	}

	public final List_typesContext list_types() throws RecognitionException {
		List_typesContext _localctx = new List_typesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_list_types);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(236);
				match(T__2);
				}
				break;
			case T__17:
			case T__18:
				{
				setState(237);
				type();
				}
				break;
			case TEXT:
				{
				setState(238);
				match(TEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WriteContext extends ParserRuleContext {
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__19);
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
	public static class WritelnContext extends ParserRuleContext {
		public WritelnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeln; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterWriteln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitWriteln(this);
		}
	}

	public final WritelnContext writeln() throws RecognitionException {
		WritelnContext _localctx = new WritelnContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_writeln);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__20);
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
	public static class String_to_printContext extends ParserRuleContext {
		public List<Personalized_stringContext> personalized_string() {
			return getRuleContexts(Personalized_stringContext.class);
		}
		public Personalized_stringContext personalized_string(int i) {
			return getRuleContext(Personalized_stringContext.class,i);
		}
		public TerminalNode STRING() { return getToken(projectoParser.STRING, 0); }
		public TerminalNode TEXT() { return getToken(projectoParser.TEXT, 0); }
		public String_to_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_to_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterString_to_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitString_to_print(this);
		}
	}

	public final String_to_printContext string_to_print() throws RecognitionException {
		String_to_printContext _localctx = new String_to_printContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_string_to_print);
		int _la;
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(245);
				personalized_string();
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(246);
					match(T__16);
					setState(247);
					personalized_string();
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(STRING);
				setState(254);
				match(T__16);
				setState(255);
				match(TEXT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(STRING);
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
	public static class Personalized_stringContext extends ParserRuleContext {
		public Write_string_typeContext write_string_type() {
			return getRuleContext(Write_string_typeContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(projectoParser.INTEGER, 0); }
		public Personalized_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personalized_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterPersonalized_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitPersonalized_string(this);
		}
	}

	public final Personalized_stringContext personalized_string() throws RecognitionException {
		Personalized_stringContext _localctx = new Personalized_stringContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_personalized_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__2);
			setState(260);
			match(T__21);
			setState(261);
			write_string_type();
			setState(262);
			match(T__16);
			setState(263);
			match(INTEGER);
			setState(264);
			match(T__22);
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
	public static class Write_string_typeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(projectoParser.STRING, 0); }
		public List<TerminalNode> TEXT() { return getTokens(projectoParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(projectoParser.TEXT, i);
		}
		public TerminalNode INTEGER() { return getToken(projectoParser.INTEGER, 0); }
		public Write_string_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_string_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterWrite_string_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitWrite_string_type(this);
		}
	}

	public final Write_string_typeContext write_string_type() throws RecognitionException {
		Write_string_typeContext _localctx = new Write_string_typeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_write_string_type);
		int _la;
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(TEXT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				match(TEXT);
				setState(269);
				match(T__10);
				setState(270);
				_la = _input.LA(1);
				if ( !(_la==TEXT || _la==INTEGER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(271);
				match(T__11);
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
	public static class Expression_to_addContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(projectoParser.TEXT, 0); }
		public Expression_to_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_to_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterExpression_to_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitExpression_to_add(this);
		}
	}

	public final Expression_to_addContext expression_to_add() throws RecognitionException {
		Expression_to_addContext _localctx = new Expression_to_addContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expression_to_add);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(274);
				expr(0);
				setState(275);
				match(T__15);
				setState(276);
				match(TEXT);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				expr(0);
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
	public static class IntegersContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(projectoParser.INTEGER, 0); }
		public TerminalNode TEXT() { return getToken(projectoParser.TEXT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IntegersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterIntegers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitIntegers(this);
		}
	}

	public final IntegersContext integers() throws RecognitionException {
		IntegersContext _localctx = new IntegersContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_integers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(281);
				match(INTEGER);
				}
				break;
			case 2:
				{
				setState(282);
				match(TEXT);
				}
				break;
			case 3:
				{
				setState(283);
				match(T__23);
				setState(284);
				match(T__21);
				setState(285);
				match(TEXT);
				setState(286);
				match(T__22);
				}
				break;
			case 4:
				{
				setState(287);
				expr(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_dimensionContext extends ParserRuleContext {
		public Token op;
		public TerminalNode TEXT() { return getToken(projectoParser.TEXT, 0); }
		public List<Expression_dimensionContext> expression_dimension() {
			return getRuleContexts(Expression_dimensionContext.class);
		}
		public Expression_dimensionContext expression_dimension(int i) {
			return getRuleContext(Expression_dimensionContext.class,i);
		}
		public Expression_dimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterExpression_dimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitExpression_dimension(this);
		}
	}

	public final Expression_dimensionContext expression_dimension() throws RecognitionException {
		return expression_dimension(0);
	}

	private Expression_dimensionContext expression_dimension(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_dimensionContext _localctx = new Expression_dimensionContext(_ctx, _parentState);
		Expression_dimensionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_expression_dimension, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(291);
			match(TEXT);
			}
			_ctx.stop = _input.LT(-1);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_dimensionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression_dimension);
					setState(293);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(294);
					((Expression_dimensionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__15 || _la==T__24) ) {
						((Expression_dimensionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(295);
					expression_dimension(3);
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Token p1;
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STRING() { return getToken(projectoParser.STRING, 0); }
		public TerminalNode REAL() { return getToken(projectoParser.REAL, 0); }
		public TerminalNode INTEGER() { return getToken(projectoParser.INTEGER, 0); }
		public TerminalNode TEXT() { return getToken(projectoParser.TEXT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectoListener ) ((projectoListener)listener).exitExpr(this);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__17:
			case T__18:
				{
				setState(302);
				((ExprContext)_localctx).p1 = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 786440L) != 0)) ) {
					((ExprContext)_localctx).p1 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(303);
				match(T__21);
				setState(304);
				expr(0);
				setState(305);
				match(T__22);
				}
				break;
			case T__25:
				{
				setState(307);
				match(T__25);
				setState(308);
				match(STRING);
				}
				break;
			case REAL:
				{
				setState(309);
				match(REAL);
				}
				break;
			case INTEGER:
				{
				setState(310);
				match(INTEGER);
				}
				break;
			case TEXT:
				{
				setState(311);
				match(TEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(320);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(314);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(315);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__24) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(316);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(317);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(318);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(319);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		case 32:
			return expression_dimension_sempred((Expression_dimensionContext)_localctx, predIndex);
		case 33:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_dimension_sempred(Expression_dimensionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001#\u0146\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0005"+
		"\u0000F\b\u0000\n\u0000\f\u0000I\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001P\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0005\u0002T\b\u0002\n\u0002\f\u0002W\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0003\u0003]\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004b\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004g\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004l\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004q\b\u0004"+
		"\u0003\u0004s\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"x\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006}\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0082\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u008b\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0092\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u009a\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r"+
		"\u00ac\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00b5\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00db\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u00e3\b\u0016\u0001\u0016\u0003\u0016\u00e6\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u00f0\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u00f9"+
		"\b\u001b\n\u001b\f\u001b\u00fc\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0102\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0111\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0118\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u0121\b\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0005 \u0129\b \n \f \u012c\t \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u0139"+
		"\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u0141\b!\n!\f!\u0144"+
		"\t!\u0001!\u0000\u0002@B\"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@B\u0000\u0005\u0001"+
		"\u0000\u0012\u0013\u0002\u0000\u001e\u001e  \u0002\u0000\u0010\u0010\u0019"+
		"\u0019\u0002\u0000\u0003\u0003\u0012\u0013\u0001\u0000\u001b\u001c\u0151"+
		"\u0000G\u0001\u0000\u0000\u0000\u0002O\u0001\u0000\u0000\u0000\u0004Q"+
		"\u0001\u0000\u0000\u0000\u0006\\\u0001\u0000\u0000\u0000\br\u0001\u0000"+
		"\u0000\u0000\nt\u0001\u0000\u0000\u0000\fy\u0001\u0000\u0000\u0000\u000e"+
		"\u0083\u0001\u0000\u0000\u0000\u0010\u008a\u0001\u0000\u0000\u0000\u0012"+
		"\u0091\u0001\u0000\u0000\u0000\u0014\u0099\u0001\u0000\u0000\u0000\u0016"+
		"\u009b\u0001\u0000\u0000\u0000\u0018\u00a4\u0001\u0000\u0000\u0000\u001a"+
		"\u00a7\u0001\u0000\u0000\u0000\u001c\u00ad\u0001\u0000\u0000\u0000\u001e"+
		"\u00b0\u0001\u0000\u0000\u0000 \u00b6\u0001\u0000\u0000\u0000\"\u00c2"+
		"\u0001\u0000\u0000\u0000$\u00c6\u0001\u0000\u0000\u0000&\u00cc\u0001\u0000"+
		"\u0000\u0000(\u00d0\u0001\u0000\u0000\u0000*\u00d6\u0001\u0000\u0000\u0000"+
		",\u00e5\u0001\u0000\u0000\u0000.\u00ea\u0001\u0000\u0000\u00000\u00ef"+
		"\u0001\u0000\u0000\u00002\u00f1\u0001\u0000\u0000\u00004\u00f3\u0001\u0000"+
		"\u0000\u00006\u0101\u0001\u0000\u0000\u00008\u0103\u0001\u0000\u0000\u0000"+
		":\u0110\u0001\u0000\u0000\u0000<\u0117\u0001\u0000\u0000\u0000>\u0120"+
		"\u0001\u0000\u0000\u0000@\u0122\u0001\u0000\u0000\u0000B\u0138\u0001\u0000"+
		"\u0000\u0000DF\u0003\u0002\u0001\u0000ED\u0001\u0000\u0000\u0000FI\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0005\u0000\u0000"+
		"\u0001K\u0001\u0001\u0000\u0000\u0000LP\u0003\u0006\u0003\u0000MP\u0003"+
		"\u0004\u0002\u0000NP\u0005!\u0000\u0000OL\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000P\u0003\u0001\u0000\u0000"+
		"\u0000QU\u0003\u0016\u000b\u0000RT\u0003\b\u0004\u0000SR\u0001\u0000\u0000"+
		"\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0003"+
		"\u0018\f\u0000Y\u0005\u0001\u0000\u0000\u0000Z]\u0003\b\u0004\u0000[]"+
		"\u0003\n\u0005\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000"+
		"]\u0007\u0001\u0000\u0000\u0000^_\u0003\f\u0006\u0000_a\u0005\u0001\u0000"+
		"\u0000`b\u0005!\u0000\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bs\u0001\u0000\u0000\u0000cd\u0003\u0010\b\u0000df\u0005\u0001\u0000"+
		"\u0000eg\u0005!\u0000\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gs\u0001\u0000\u0000\u0000hi\u0003\u0012\t\u0000ik\u0005\u0001\u0000"+
		"\u0000jl\u0005!\u0000\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000ls\u0001\u0000\u0000\u0000mn\u0003\u0014\n\u0000np\u0005\u0001\u0000"+
		"\u0000oq\u0005!\u0000\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qs\u0001\u0000\u0000\u0000r^\u0001\u0000\u0000\u0000rc\u0001\u0000"+
		"\u0000\u0000rh\u0001\u0000\u0000\u0000rm\u0001\u0000\u0000\u0000s\t\u0001"+
		"\u0000\u0000\u0000tu\u0003\u000e\u0007\u0000uw\u0005\u0001\u0000\u0000"+
		"vx\u0005!\u0000\u0000wv\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"x\u000b\u0001\u0000\u0000\u0000y|\u0005\u0002\u0000\u0000z}\u0003.\u0017"+
		"\u0000{}\u0005\u0003\u0000\u0000|z\u0001\u0000\u0000\u0000|{\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0081\u0005\u001e\u0000\u0000"+
		"\u007f\u0082\u0003*\u0015\u0000\u0080\u0082\u0003,\u0016\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\r\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005\u0004\u0000\u0000\u0084\u0085\u0005"+
		"\u001d\u0000\u0000\u0085\u000f\u0001\u0000\u0000\u0000\u0086\u008b\u0003"+
		"\u001a\r\u0000\u0087\u008b\u0003\u001c\u000e\u0000\u0088\u008b\u0003\u001e"+
		"\u000f\u0000\u0089\u008b\u0003 \u0010\u0000\u008a\u0086\u0001\u0000\u0000"+
		"\u0000\u008a\u0087\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u0011\u0001\u0000\u0000"+
		"\u0000\u008c\u0092\u0003\"\u0011\u0000\u008d\u0092\u0003$\u0012\u0000"+
		"\u008e\u0092\u0003(\u0014\u0000\u008f\u0092\u0003&\u0013\u0000\u0090\u0092"+
		"\u0001\u0000\u0000\u0000\u0091\u008c\u0001\u0000\u0000\u0000\u0091\u008d"+
		"\u0001\u0000\u0000\u0000\u0091\u008e\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0013"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u00032\u0019\u0000\u0094\u0095\u0003"+
		"6\u001b\u0000\u0095\u009a\u0001\u0000\u0000\u0000\u0096\u0097\u00034\u001a"+
		"\u0000\u0097\u0098\u00036\u001b\u0000\u0098\u009a\u0001\u0000\u0000\u0000"+
		"\u0099\u0093\u0001\u0000\u0000\u0000\u0099\u0096\u0001\u0000\u0000\u0000"+
		"\u009a\u0015\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0005\u0000\u0000"+
		"\u009c\u009d\u0005\u001e\u0000\u0000\u009d\u009e\u0005\u0006\u0000\u0000"+
		"\u009e\u009f\u0003>\u001f\u0000\u009f\u00a0\u0005\u0007\u0000\u0000\u00a0"+
		"\u00a1\u0003>\u001f\u0000\u00a1\u00a2\u0005\b\u0000\u0000\u00a2\u00a3"+
		"\u0005!\u0000\u0000\u00a3\u0017\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005"+
		"\t\u0000\u0000\u00a5\u00a6\u0005\u0001\u0000\u0000\u00a6\u0019\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0003.\u0017\u0000\u00a8\u00ab\u0005\u001e\u0000"+
		"\u0000\u00a9\u00aa\u0005\u0006\u0000\u0000\u00aa\u00ac\u0003B!\u0000\u00ab"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac"+
		"\u001b\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u001e\u0000\u0000\u00ae"+
		"\u00af\u0005\u001e\u0000\u0000\u00af\u001d\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0005\u0003\u0000\u0000\u00b1\u00b4\u0005\u001e\u0000\u0000\u00b2"+
		"\u00b3\u0005\u0006\u0000\u0000\u00b3\u00b5\u0005\u001d\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u001f\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\n\u0000\u0000\u00b7\u00b8"+
		"\u0005\u000b\u0000\u0000\u00b8\u00b9\u00030\u0018\u0000\u00b9\u00ba\u0005"+
		"\f\u0000\u0000\u00ba\u00bb\u0005\u001e\u0000\u0000\u00bb\u00bc\u0005\u0006"+
		"\u0000\u0000\u00bc\u00bd\u0005\r\u0000\u0000\u00bd\u00be\u0005\n\u0000"+
		"\u0000\u00be\u00bf\u0005\u000b\u0000\u0000\u00bf\u00c0\u00030\u0018\u0000"+
		"\u00c0\u00c1\u0005\f\u0000\u0000\u00c1!\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0003<\u001e\u0000\u00c3\u00c4\u0005\u000e\u0000\u0000\u00c4\u00c5"+
		"\u0005\u001e\u0000\u0000\u00c5#\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005"+
		"\u000f\u0000\u0000\u00c7\u00c8\u0005\u001e\u0000\u0000\u00c8\u00c9\u0003"+
		"*\u0015\u0000\u00c9\u00ca\u0005\u0006\u0000\u0000\u00ca\u00cb\u0003B!"+
		"\u0000\u00cb%\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u001e\u0000\u0000"+
		"\u00cd\u00ce\u0005\u0006\u0000\u0000\u00ce\u00cf\u0003B!\u0000\u00cf\'"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u001e\u0000\u0000\u00d1\u00d2"+
		"\u0005\u0006\u0000\u0000\u00d2\u00d3\u0003B!\u0000\u00d3\u00d4\u0005\u0010"+
		"\u0000\u0000\u00d4\u00d5\u0005\u001e\u0000\u0000\u00d5)\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0005\u000b\u0000\u0000\u00d7\u00da\u0005\u001e\u0000"+
		"\u0000\u00d8\u00d9\u0005\u0011\u0000\u0000\u00d9\u00db\u0005\u001e\u0000"+
		"\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\f\u0000\u0000"+
		"\u00dd+\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u000b\u0000\u0000\u00df"+
		"\u00e2\u0005\u001e\u0000\u0000\u00e0\u00e1\u0005\u0011\u0000\u0000\u00e1"+
		"\u00e3\u0005\u001e\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e6\u0005\f\u0000\u0000\u00e5\u00de\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0005\u0006\u0000\u0000\u00e8\u00e9\u0003@ \u0000\u00e9-\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0007\u0000\u0000\u0000\u00eb/\u0001\u0000\u0000"+
		"\u0000\u00ec\u00f0\u0005\u0003\u0000\u0000\u00ed\u00f0\u0003.\u0017\u0000"+
		"\u00ee\u00f0\u0005\u001e\u0000\u0000\u00ef\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f01\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\u0014\u0000\u0000\u00f2"+
		"3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u0015\u0000\u0000\u00f45\u0001"+
		"\u0000\u0000\u0000\u00f5\u00fa\u00038\u001c\u0000\u00f6\u00f7\u0005\u0011"+
		"\u0000\u0000\u00f7\u00f9\u00038\u001c\u0000\u00f8\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u0102\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u001d\u0000"+
		"\u0000\u00fe\u00ff\u0005\u0011\u0000\u0000\u00ff\u0102\u0005\u001e\u0000"+
		"\u0000\u0100\u0102\u0005\u001d\u0000\u0000\u0101\u00f5\u0001\u0000\u0000"+
		"\u0000\u0101\u00fd\u0001\u0000\u0000\u0000\u0101\u0100\u0001\u0000\u0000"+
		"\u0000\u01027\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u0003\u0000\u0000"+
		"\u0104\u0105\u0005\u0016\u0000\u0000\u0105\u0106\u0003:\u001d\u0000\u0106"+
		"\u0107\u0005\u0011\u0000\u0000\u0107\u0108\u0005 \u0000\u0000\u0108\u0109"+
		"\u0005\u0017\u0000\u0000\u01099\u0001\u0000\u0000\u0000\u010a\u0111\u0005"+
		"\u001d\u0000\u0000\u010b\u0111\u0005\u001e\u0000\u0000\u010c\u010d\u0005"+
		"\u001e\u0000\u0000\u010d\u010e\u0005\u000b\u0000\u0000\u010e\u010f\u0007"+
		"\u0001\u0000\u0000\u010f\u0111\u0005\f\u0000\u0000\u0110\u010a\u0001\u0000"+
		"\u0000\u0000\u0110\u010b\u0001\u0000\u0000\u0000\u0110\u010c\u0001\u0000"+
		"\u0000\u0000\u0111;\u0001\u0000\u0000\u0000\u0112\u0113\u0003B!\u0000"+
		"\u0113\u0114\u0005\u0010\u0000\u0000\u0114\u0115\u0005\u001e\u0000\u0000"+
		"\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0118\u0003B!\u0000\u0117\u0112"+
		"\u0001\u0000\u0000\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118=\u0001"+
		"\u0000\u0000\u0000\u0119\u0121\u0005 \u0000\u0000\u011a\u0121\u0005\u001e"+
		"\u0000\u0000\u011b\u011c\u0005\u0018\u0000\u0000\u011c\u011d\u0005\u0016"+
		"\u0000\u0000\u011d\u011e\u0005\u001e\u0000\u0000\u011e\u0121\u0005\u0017"+
		"\u0000\u0000\u011f\u0121\u0003B!\u0000\u0120\u0119\u0001\u0000\u0000\u0000"+
		"\u0120\u011a\u0001\u0000\u0000\u0000\u0120\u011b\u0001\u0000\u0000\u0000"+
		"\u0120\u011f\u0001\u0000\u0000\u0000\u0121?\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0006 \uffff\uffff\u0000\u0123\u0124\u0005\u001e\u0000\u0000\u0124"+
		"\u012a\u0001\u0000\u0000\u0000\u0125\u0126\n\u0002\u0000\u0000\u0126\u0127"+
		"\u0007\u0002\u0000\u0000\u0127\u0129\u0003@ \u0003\u0128\u0125\u0001\u0000"+
		"\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012bA\u0001\u0000\u0000"+
		"\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u012e\u0006!\uffff\uffff"+
		"\u0000\u012e\u012f\u0007\u0003\u0000\u0000\u012f\u0130\u0005\u0016\u0000"+
		"\u0000\u0130\u0131\u0003B!\u0000\u0131\u0132\u0005\u0017\u0000\u0000\u0132"+
		"\u0139\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u001a\u0000\u0000\u0134"+
		"\u0139\u0005\u001d\u0000\u0000\u0135\u0139\u0005\u001f\u0000\u0000\u0136"+
		"\u0139\u0005 \u0000\u0000\u0137\u0139\u0005\u001e\u0000\u0000\u0138\u012d"+
		"\u0001\u0000\u0000\u0000\u0138\u0133\u0001\u0000\u0000\u0000\u0138\u0135"+
		"\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0137"+
		"\u0001\u0000\u0000\u0000\u0139\u0142\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\n\u0005\u0000\u0000\u013b\u013c\u0007\u0002\u0000\u0000\u013c\u0141\u0003"+
		"B!\u0006\u013d\u013e\n\u0004\u0000\u0000\u013e\u013f\u0007\u0004\u0000"+
		"\u0000\u013f\u0141\u0003B!\u0005\u0140\u013a\u0001\u0000\u0000\u0000\u0140"+
		"\u013d\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142"+
		"\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143"+
		"C\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u001eGO"+
		"U\\afkprw|\u0081\u008a\u0091\u0099\u00ab\u00b4\u00da\u00e2\u00e5\u00ef"+
		"\u00fa\u0101\u0110\u0117\u0120\u012a\u0138\u0140\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}