// Generated from dimana.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dimanaParser}.
 */
public interface dimanaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link dimanaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(dimanaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimanaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(dimanaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimanaParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUse(dimanaParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimanaParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUse(dimanaParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statFor}
	 * labeled alternative in {@link dimanaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatFor(dimanaParser.StatForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statFor}
	 * labeled alternative in {@link dimanaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatFor(dimanaParser.StatForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statWrite}
	 * labeled alternative in {@link dimanaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatWrite(dimanaParser.StatWriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statWrite}
	 * labeled alternative in {@link dimanaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatWrite(dimanaParser.StatWriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statDeclare}
	 * labeled alternative in {@link dimanaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatDeclare(dimanaParser.StatDeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statDeclare}
	 * labeled alternative in {@link dimanaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatDeclare(dimanaParser.StatDeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statAssign}
	 * labeled alternative in {@link dimanaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAssign(dimanaParser.StatAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statAssign}
	 * labeled alternative in {@link dimanaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAssign(dimanaParser.StatAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statAppend}
	 * labeled alternative in {@link dimanaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAppend(dimanaParser.StatAppendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statAppend}
	 * labeled alternative in {@link dimanaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAppend(dimanaParser.StatAppendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareList}
	 * labeled alternative in {@link dimanaParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclareList(dimanaParser.DeclareListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareList}
	 * labeled alternative in {@link dimanaParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclareList(dimanaParser.DeclareListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareUnit}
	 * labeled alternative in {@link dimanaParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclareUnit(dimanaParser.DeclareUnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareUnit}
	 * labeled alternative in {@link dimanaParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclareUnit(dimanaParser.DeclareUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareDimension}
	 * labeled alternative in {@link dimanaParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclareDimension(dimanaParser.DeclareDimensionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareDimension}
	 * labeled alternative in {@link dimanaParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclareDimension(dimanaParser.DeclareDimensionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarePrimitiveVariable}
	 * labeled alternative in {@link dimanaParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclarePrimitiveVariable(dimanaParser.DeclarePrimitiveVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarePrimitiveVariable}
	 * labeled alternative in {@link dimanaParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclarePrimitiveVariable(dimanaParser.DeclarePrimitiveVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareDimensionVariable}
	 * labeled alternative in {@link dimanaParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclareDimensionVariable(dimanaParser.DeclareDimensionVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareDimensionVariable}
	 * labeled alternative in {@link dimanaParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclareDimensionVariable(dimanaParser.DeclareDimensionVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprLength}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLength(dimanaParser.ExprLengthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprLength}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLength(dimanaParser.ExprLengthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCast}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCast(dimanaParser.ExprCastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCast}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCast(dimanaParser.ExprCastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStringFormat}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprStringFormat(dimanaParser.ExprStringFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStringFormat}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprStringFormat(dimanaParser.ExprStringFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprRead}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRead(dimanaParser.ExprReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprRead}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRead(dimanaParser.ExprReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(dimanaParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(dimanaParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNewList}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNewList(dimanaParser.ExprNewListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNewList}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNewList(dimanaParser.ExprNewListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprString}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprString(dimanaParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprString}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprString(dimanaParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(dimanaParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(dimanaParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprIndex}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIndex(dimanaParser.ExprIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprIndex}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIndex(dimanaParser.ExprIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNumber}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNumber(dimanaParser.ExprNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNumber}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNumber(dimanaParser.ExprNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMulDiv}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMulDiv(dimanaParser.ExprMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMulDiv}
	 * labeled alternative in {@link dimanaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMulDiv(dimanaParser.ExprMulDivContext ctx);
}