// Generated from /home/filipe/Documentos/GitHub/COMPILADORES/PROJECT/TESTE/projecto.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class projectoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__9) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << TEXT) | (1L << REAL) | (1L << INTEGER) | (1L << NEWLINE))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__9) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << TEXT) | (1L << REAL) | (1L << INTEGER))) != 0)) {
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

	public static class Out_loop_expressionsContext extends ParserRuleContext {
		public Use_importContext use_import() {
			return getRuleContext(Use_importContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(projectoParser.NEWLINE, 0); }
		public Out_loop_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out_loop_expressions; }
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

	public static class Use_importContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(projectoParser.STRING, 0); }
		public Use_importContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_import; }
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

	public static class End_forContext extends ParserRuleContext {
		public End_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_for; }
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

	public static class Create_str_variableContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(projectoParser.TEXT, 0); }
		public TerminalNode STRING() { return getToken(projectoParser.STRING, 0); }
		public Create_str_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_str_variable; }
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

	public static class Add_to_listContext extends ParserRuleContext {
		public Expression_to_addContext expression_to_add() {
			return getRuleContext(Expression_to_addContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(projectoParser.TEXT, 0); }
		public Add_to_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_to_list; }
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

	public static class Normal_assContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(projectoParser.TEXT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Normal_assContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normal_ass; }
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

	public static class Ind_typeContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(projectoParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(projectoParser.TEXT, i);
		}
		public Ind_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ind_type; }
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
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

	public static class List_typesContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(projectoParser.TEXT, 0); }
		public List_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_types; }
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

	public static class WriteContext extends ParserRuleContext {
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
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

	public static class WritelnContext extends ParserRuleContext {
		public WritelnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeln; }
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

	public static class Personalized_stringContext extends ParserRuleContext {
		public Write_string_typeContext write_string_type() {
			return getRuleContext(Write_string_typeContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(projectoParser.INTEGER, 0); }
		public Personalized_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personalized_string; }
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

	public static class Expression_to_addContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(projectoParser.TEXT, 0); }
		public Expression_to_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_to_add; }
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
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__17) | (1L << T__18))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0148\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\3\3\3\3\3\3\5\3"+
		"R\n\3\3\4\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\3\5\3\5\5\5_\n\5\3\6\3\6"+
		"\3\6\5\6d\n\6\3\6\3\6\3\6\5\6i\n\6\3\6\3\6\3\6\5\6n\n\6\3\6\3\6\3\6\5"+
		"\6s\n\6\5\6u\n\6\3\7\3\7\3\7\5\7z\n\7\3\b\3\b\3\b\5\b\177\n\b\3\b\3\b"+
		"\3\b\5\b\u0084\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u008d\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u0094\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009c\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\5\17\u00ae\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00b7\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u00dd\n\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\5\30\u00e5\n\30\3\30\5\30\u00e8\n\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\32\5\32\u00f2\n\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\7\35\u00fb\n\35\f\35\16\35\u00fe\13\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0104\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0113\n\37\3 \3 \3 \3 \3 \5 \u011a\n \3!\3!\3!\3!\3!\3!\3!"+
		"\5!\u0123\n!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u012b\n\"\f\"\16\"\u012e\13\""+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u013b\n#\3#\3#\3#\3#\3#\3#\7#\u0143"+
		"\n#\f#\16#\u0146\13#\3#\2\4BD$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BD\2\7\3\2\24\25\4\2  \"\"\4\2\22\22\33\33\4"+
		"\2\5\5\24\25\3\2\35\36\2\u0153\2I\3\2\2\2\4Q\3\2\2\2\6S\3\2\2\2\b^\3\2"+
		"\2\2\nt\3\2\2\2\fv\3\2\2\2\16{\3\2\2\2\20\u0085\3\2\2\2\22\u008c\3\2\2"+
		"\2\24\u0093\3\2\2\2\26\u009b\3\2\2\2\30\u009d\3\2\2\2\32\u00a6\3\2\2\2"+
		"\34\u00a9\3\2\2\2\36\u00af\3\2\2\2 \u00b2\3\2\2\2\"\u00b8\3\2\2\2$\u00c4"+
		"\3\2\2\2&\u00c8\3\2\2\2(\u00ce\3\2\2\2*\u00d2\3\2\2\2,\u00d8\3\2\2\2."+
		"\u00e7\3\2\2\2\60\u00ec\3\2\2\2\62\u00f1\3\2\2\2\64\u00f3\3\2\2\2\66\u00f5"+
		"\3\2\2\28\u0103\3\2\2\2:\u0105\3\2\2\2<\u0112\3\2\2\2>\u0119\3\2\2\2@"+
		"\u0122\3\2\2\2B\u0124\3\2\2\2D\u013a\3\2\2\2FH\5\4\3\2GF\3\2\2\2HK\3\2"+
		"\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\2\2\3M\3\3\2\2\2NR\5"+
		"\b\5\2OR\5\6\4\2PR\7#\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2R\5\3\2\2\2SW\5"+
		"\30\r\2TV\5\n\6\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW"+
		"\3\2\2\2Z[\5\32\16\2[\7\3\2\2\2\\_\5\n\6\2]_\5\f\7\2^\\\3\2\2\2^]\3\2"+
		"\2\2_\t\3\2\2\2`a\5\16\b\2ac\7\3\2\2bd\7#\2\2cb\3\2\2\2cd\3\2\2\2du\3"+
		"\2\2\2ef\5\22\n\2fh\7\3\2\2gi\7#\2\2hg\3\2\2\2hi\3\2\2\2iu\3\2\2\2jk\5"+
		"\24\13\2km\7\3\2\2ln\7#\2\2ml\3\2\2\2mn\3\2\2\2nu\3\2\2\2op\5\26\f\2p"+
		"r\7\3\2\2qs\7#\2\2rq\3\2\2\2rs\3\2\2\2su\3\2\2\2t`\3\2\2\2te\3\2\2\2t"+
		"j\3\2\2\2to\3\2\2\2u\13\3\2\2\2vw\5\20\t\2wy\7\3\2\2xz\7#\2\2yx\3\2\2"+
		"\2yz\3\2\2\2z\r\3\2\2\2{~\7\4\2\2|\177\5\60\31\2}\177\7\5\2\2~|\3\2\2"+
		"\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\7 \2\2\u0081\u0084\5,\27\2"+
		"\u0082\u0084\5.\30\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\17"+
		"\3\2\2\2\u0085\u0086\7\6\2\2\u0086\u0087\7\37\2\2\u0087\21\3\2\2\2\u0088"+
		"\u008d\5\34\17\2\u0089\u008d\5\36\20\2\u008a\u008d\5 \21\2\u008b\u008d"+
		"\5\"\22\2\u008c\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2"+
		"\u008c\u008b\3\2\2\2\u008d\23\3\2\2\2\u008e\u0094\5$\23\2\u008f\u0094"+
		"\5&\24\2\u0090\u0094\5*\26\2\u0091\u0094\5(\25\2\u0092\u0094\3\2\2\2\u0093"+
		"\u008e\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0092\3\2\2\2\u0094\25\3\2\2\2\u0095\u0096\5\64\33\2\u0096"+
		"\u0097\58\35\2\u0097\u009c\3\2\2\2\u0098\u0099\5\66\34\2\u0099\u009a\5"+
		"8\35\2\u009a\u009c\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0098\3\2\2\2\u009c"+
		"\27\3\2\2\2\u009d\u009e\7\7\2\2\u009e\u009f\7 \2\2\u009f\u00a0\7\b\2\2"+
		"\u00a0\u00a1\5@!\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3\5@!\2\u00a3\u00a4\7"+
		"\n\2\2\u00a4\u00a5\7#\2\2\u00a5\31\3\2\2\2\u00a6\u00a7\7\13\2\2\u00a7"+
		"\u00a8\7\3\2\2\u00a8\33\3\2\2\2\u00a9\u00aa\5\60\31\2\u00aa\u00ad\7 \2"+
		"\2\u00ab\u00ac\7\b\2\2\u00ac\u00ae\5D#\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\35\3\2\2\2\u00af\u00b0\7 \2\2\u00b0\u00b1\7 \2\2\u00b1"+
		"\37\3\2\2\2\u00b2\u00b3\7\5\2\2\u00b3\u00b6\7 \2\2\u00b4\u00b5\7\b\2\2"+
		"\u00b5\u00b7\7\37\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7!\3"+
		"\2\2\2\u00b8\u00b9\7\f\2\2\u00b9\u00ba\7\r\2\2\u00ba\u00bb\5\62\32\2\u00bb"+
		"\u00bc\7\16\2\2\u00bc\u00bd\7 \2\2\u00bd\u00be\7\b\2\2\u00be\u00bf\7\17"+
		"\2\2\u00bf\u00c0\7\f\2\2\u00c0\u00c1\7\r\2\2\u00c1\u00c2\5\62\32\2\u00c2"+
		"\u00c3\7\16\2\2\u00c3#\3\2\2\2\u00c4\u00c5\5> \2\u00c5\u00c6\7\20\2\2"+
		"\u00c6\u00c7\7 \2\2\u00c7%\3\2\2\2\u00c8\u00c9\7\21\2\2\u00c9\u00ca\7"+
		" \2\2\u00ca\u00cb\5,\27\2\u00cb\u00cc\7\b\2\2\u00cc\u00cd\5D#\2\u00cd"+
		"\'\3\2\2\2\u00ce\u00cf\7 \2\2\u00cf\u00d0\7\b\2\2\u00d0\u00d1\5D#\2\u00d1"+
		")\3\2\2\2\u00d2\u00d3\7 \2\2\u00d3\u00d4\7\b\2\2\u00d4\u00d5\5D#\2\u00d5"+
		"\u00d6\7\22\2\2\u00d6\u00d7\7 \2\2\u00d7+\3\2\2\2\u00d8\u00d9\7\r\2\2"+
		"\u00d9\u00dc\7 \2\2\u00da\u00db\7\23\2\2\u00db\u00dd\7 \2\2\u00dc\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7\16\2\2"+
		"\u00df-\3\2\2\2\u00e0\u00e1\7\r\2\2\u00e1\u00e4\7 \2\2\u00e2\u00e3\7\23"+
		"\2\2\u00e3\u00e5\7 \2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e8\7\16\2\2\u00e7\u00e0\3\2\2\2\u00e7\u00e8\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7\b\2\2\u00ea\u00eb\5B\"\2\u00eb"+
		"/\3\2\2\2\u00ec\u00ed\t\2\2\2\u00ed\61\3\2\2\2\u00ee\u00f2\7\5\2\2\u00ef"+
		"\u00f2\5\60\31\2\u00f0\u00f2\7 \2\2\u00f1\u00ee\3\2\2\2\u00f1\u00ef\3"+
		"\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\63\3\2\2\2\u00f3\u00f4\7\26\2\2\u00f4"+
		"\65\3\2\2\2\u00f5\u00f6\7\27\2\2\u00f6\67\3\2\2\2\u00f7\u00fc\5:\36\2"+
		"\u00f8\u00f9\7\23\2\2\u00f9\u00fb\5:\36\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0104\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00ff\u0100\7\37\2\2\u0100\u0101\7\23\2\2\u0101\u0104\7"+
		" \2\2\u0102\u0104\7\37\2\2\u0103\u00f7\3\2\2\2\u0103\u00ff\3\2\2\2\u0103"+
		"\u0102\3\2\2\2\u01049\3\2\2\2\u0105\u0106\7\5\2\2\u0106\u0107\7\30\2\2"+
		"\u0107\u0108\5<\37\2\u0108\u0109\7\23\2\2\u0109\u010a\7\"\2\2\u010a\u010b"+
		"\7\31\2\2\u010b;\3\2\2\2\u010c\u0113\7\37\2\2\u010d\u0113\7 \2\2\u010e"+
		"\u010f\7 \2\2\u010f\u0110\7\r\2\2\u0110\u0111\t\3\2\2\u0111\u0113\7\16"+
		"\2\2\u0112\u010c\3\2\2\2\u0112\u010d\3\2\2\2\u0112\u010e\3\2\2\2\u0113"+
		"=\3\2\2\2\u0114\u0115\5D#\2\u0115\u0116\7\22\2\2\u0116\u0117\7 \2\2\u0117"+
		"\u011a\3\2\2\2\u0118\u011a\5D#\2\u0119\u0114\3\2\2\2\u0119\u0118\3\2\2"+
		"\2\u011a?\3\2\2\2\u011b\u0123\7\"\2\2\u011c\u0123\7 \2\2\u011d\u011e\7"+
		"\32\2\2\u011e\u011f\7\30\2\2\u011f\u0120\7 \2\2\u0120\u0123\7\31\2\2\u0121"+
		"\u0123\5D#\2\u0122\u011b\3\2\2\2\u0122\u011c\3\2\2\2\u0122\u011d\3\2\2"+
		"\2\u0122\u0121\3\2\2\2\u0123A\3\2\2\2\u0124\u0125\b\"\1\2\u0125\u0126"+
		"\7 \2\2\u0126\u012c\3\2\2\2\u0127\u0128\f\4\2\2\u0128\u0129\t\4\2\2\u0129"+
		"\u012b\5B\"\5\u012a\u0127\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012dC\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130"+
		"\b#\1\2\u0130\u0131\t\5\2\2\u0131\u0132\7\30\2\2\u0132\u0133\5D#\2\u0133"+
		"\u0134\7\31\2\2\u0134\u013b\3\2\2\2\u0135\u0136\7\34\2\2\u0136\u013b\7"+
		"\37\2\2\u0137\u013b\7!\2\2\u0138\u013b\7\"\2\2\u0139\u013b\7 \2\2\u013a"+
		"\u012f\3\2\2\2\u013a\u0135\3\2\2\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013a\u0139\3\2\2\2\u013b\u0144\3\2\2\2\u013c\u013d\f\7\2\2\u013d"+
		"\u013e\t\4\2\2\u013e\u0143\5D#\b\u013f\u0140\f\6\2\2\u0140\u0141\t\6\2"+
		"\2\u0141\u0143\5D#\7\u0142\u013c\3\2\2\2\u0142\u013f\3\2\2\2\u0143\u0146"+
		"\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145E\3\2\2\2\u0146"+
		"\u0144\3\2\2\2 IQW^chmrty~\u0083\u008c\u0093\u009b\u00ad\u00b6\u00dc\u00e4"+
		"\u00e7\u00f1\u00fc\u0103\u0112\u0119\u0122\u012c\u013a\u0142\u0144";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}