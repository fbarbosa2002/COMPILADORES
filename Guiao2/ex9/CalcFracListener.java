// Generated from CalcFrac.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcFracParser}.
 */
public interface CalcFracListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcFracParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalcFracParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcFracParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalcFracParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatPrin}
	 * labeled alternative in {@link CalcFracParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatPrin(CalcFracParser.StatPrinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatPrin}
	 * labeled alternative in {@link CalcFracParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatPrin(CalcFracParser.StatPrinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatAssign}
	 * labeled alternative in {@link CalcFracParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAssign(CalcFracParser.StatAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatAssign}
	 * labeled alternative in {@link CalcFracParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAssign(CalcFracParser.StatAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatNew}
	 * labeled alternative in {@link CalcFracParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatNew(CalcFracParser.StatNewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatNew}
	 * labeled alternative in {@link CalcFracParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatNew(CalcFracParser.StatNewContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcFracParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CalcFracParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcFracParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CalcFracParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcFracParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CalcFracParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcFracParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CalcFracParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(CalcFracParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(CalcFracParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRead(CalcFracParser.ExprReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRead(CalcFracParser.ExprReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNum}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNum(CalcFracParser.ExprNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNum}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNum(CalcFracParser.ExprNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMulDiv(CalcFracParser.ExprMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMulDiv(CalcFracParser.ExprMulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(CalcFracParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(CalcFracParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReduce(CalcFracParser.ExprReduceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReduce(CalcFracParser.ExprReduceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNumbarNum}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNumbarNum(CalcFracParser.ExprNumbarNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNumbarNum}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNumbarNum(CalcFracParser.ExprNumbarNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprId(CalcFracParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprId(CalcFracParser.ExprIdContext ctx);
}