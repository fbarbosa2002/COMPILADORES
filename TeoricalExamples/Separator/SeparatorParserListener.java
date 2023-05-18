// Generated from SeparatorParser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SeparatorParser}.
 */
public interface SeparatorParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SeparatorParser#all}.
	 * @param ctx the parse tree
	 */
	void enterAll(SeparatorParser.AllContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeparatorParser#all}.
	 * @param ctx the parse tree
	 */
	void exitAll(SeparatorParser.AllContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeparatorParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(SeparatorParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeparatorParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(SeparatorParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeparatorParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(SeparatorParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeparatorParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(SeparatorParser.ElementsContext ctx);
}