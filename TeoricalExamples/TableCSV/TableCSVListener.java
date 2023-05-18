// Generated from TableCSV.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TableCSVParser}.
 */
public interface TableCSVListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TableCSVParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(TableCSVParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableCSVParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(TableCSVParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableCSVParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(TableCSVParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableCSVParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(TableCSVParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableCSVParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(TableCSVParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableCSVParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(TableCSVParser.FieldContext ctx);
}