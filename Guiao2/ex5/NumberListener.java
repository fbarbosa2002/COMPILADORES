// Generated from Number.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NumberParser}.
 */
public interface NumberListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NumberParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(NumberParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(NumberParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(NumberParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(NumberParser.LineContext ctx);
}