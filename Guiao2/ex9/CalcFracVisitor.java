// Generated from CalcFrac.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcFracParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcFracVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcFracParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CalcFracParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatPrin}
	 * labeled alternative in {@link CalcFracParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatPrin(CalcFracParser.StatPrinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatAssign}
	 * labeled alternative in {@link CalcFracParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatAssign(CalcFracParser.StatAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatNew}
	 * labeled alternative in {@link CalcFracParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatNew(CalcFracParser.StatNewContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcFracParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(CalcFracParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcFracParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CalcFracParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(CalcFracParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRead(CalcFracParser.ExprReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNum}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNum(CalcFracParser.ExprNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMulDiv(CalcFracParser.ExprMulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParent(CalcFracParser.ExprParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprReduce(CalcFracParser.ExprReduceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNumbarNum}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumbarNum(CalcFracParser.ExprNumbarNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(CalcFracParser.ExprIdContext ctx);
}