// Generated from PredSemant.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PredSemantParser}.
 */
public interface PredSemantListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PredSemantParser#all}.
	 * @param ctx the parse tree
	 */
	void enterAll(PredSemantParser.AllContext ctx);
	/**
	 * Exit a parse tree produced by {@link PredSemantParser#all}.
	 * @param ctx the parse tree
	 */
	void exitAll(PredSemantParser.AllContext ctx);
	/**
	 * Enter a parse tree produced by {@link PredSemantParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(PredSemantParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PredSemantParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(PredSemantParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PredSemantParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(PredSemantParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PredSemantParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(PredSemantParser.ElementsContext ctx);
}