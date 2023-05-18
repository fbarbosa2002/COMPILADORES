// Generated from projecto.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link projectoParser}.
 */
public interface projectoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link projectoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(projectoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(projectoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(projectoParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(projectoParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(projectoParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(projectoParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#normal_expressions}.
	 * @param ctx the parse tree
	 */
	void enterNormal_expressions(projectoParser.Normal_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#normal_expressions}.
	 * @param ctx the parse tree
	 */
	void exitNormal_expressions(projectoParser.Normal_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#in_loop_expressions}.
	 * @param ctx the parse tree
	 */
	void enterIn_loop_expressions(projectoParser.In_loop_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#in_loop_expressions}.
	 * @param ctx the parse tree
	 */
	void exitIn_loop_expressions(projectoParser.In_loop_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#out_loop_expressions}.
	 * @param ctx the parse tree
	 */
	void enterOut_loop_expressions(projectoParser.Out_loop_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#out_loop_expressions}.
	 * @param ctx the parse tree
	 */
	void exitOut_loop_expressions(projectoParser.Out_loop_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#create_dimension}.
	 * @param ctx the parse tree
	 */
	void enterCreate_dimension(projectoParser.Create_dimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#create_dimension}.
	 * @param ctx the parse tree
	 */
	void exitCreate_dimension(projectoParser.Create_dimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#use_import}.
	 * @param ctx the parse tree
	 */
	void enterUse_import(projectoParser.Use_importContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#use_import}.
	 * @param ctx the parse tree
	 */
	void exitUse_import(projectoParser.Use_importContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#create_variable}.
	 * @param ctx the parse tree
	 */
	void enterCreate_variable(projectoParser.Create_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#create_variable}.
	 * @param ctx the parse tree
	 */
	void exitCreate_variable(projectoParser.Create_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(projectoParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(projectoParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(projectoParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(projectoParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#init_for}.
	 * @param ctx the parse tree
	 */
	void enterInit_for(projectoParser.Init_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#init_for}.
	 * @param ctx the parse tree
	 */
	void exitInit_for(projectoParser.Init_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#end_for}.
	 * @param ctx the parse tree
	 */
	void enterEnd_for(projectoParser.End_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#end_for}.
	 * @param ctx the parse tree
	 */
	void exitEnd_for(projectoParser.End_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#create_normal_variable}.
	 * @param ctx the parse tree
	 */
	void enterCreate_normal_variable(projectoParser.Create_normal_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#create_normal_variable}.
	 * @param ctx the parse tree
	 */
	void exitCreate_normal_variable(projectoParser.Create_normal_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#create_dim_variable}.
	 * @param ctx the parse tree
	 */
	void enterCreate_dim_variable(projectoParser.Create_dim_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#create_dim_variable}.
	 * @param ctx the parse tree
	 */
	void exitCreate_dim_variable(projectoParser.Create_dim_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#create_str_variable}.
	 * @param ctx the parse tree
	 */
	void enterCreate_str_variable(projectoParser.Create_str_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#create_str_variable}.
	 * @param ctx the parse tree
	 */
	void exitCreate_str_variable(projectoParser.Create_str_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#create_list}.
	 * @param ctx the parse tree
	 */
	void enterCreate_list(projectoParser.Create_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#create_list}.
	 * @param ctx the parse tree
	 */
	void exitCreate_list(projectoParser.Create_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#add_to_list}.
	 * @param ctx the parse tree
	 */
	void enterAdd_to_list(projectoParser.Add_to_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#add_to_list}.
	 * @param ctx the parse tree
	 */
	void exitAdd_to_list(projectoParser.Add_to_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#unit_ass}.
	 * @param ctx the parse tree
	 */
	void enterUnit_ass(projectoParser.Unit_assContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#unit_ass}.
	 * @param ctx the parse tree
	 */
	void exitUnit_ass(projectoParser.Unit_assContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#normal_ass}.
	 * @param ctx the parse tree
	 */
	void enterNormal_ass(projectoParser.Normal_assContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#normal_ass}.
	 * @param ctx the parse tree
	 */
	void exitNormal_ass(projectoParser.Normal_assContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#dim_ass}.
	 * @param ctx the parse tree
	 */
	void enterDim_ass(projectoParser.Dim_assContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#dim_ass}.
	 * @param ctx the parse tree
	 */
	void exitDim_ass(projectoParser.Dim_assContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#ind_type}.
	 * @param ctx the parse tree
	 */
	void enterInd_type(projectoParser.Ind_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#ind_type}.
	 * @param ctx the parse tree
	 */
	void exitInd_type(projectoParser.Ind_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#dep_type}.
	 * @param ctx the parse tree
	 */
	void enterDep_type(projectoParser.Dep_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#dep_type}.
	 * @param ctx the parse tree
	 */
	void exitDep_type(projectoParser.Dep_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(projectoParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(projectoParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#list_types}.
	 * @param ctx the parse tree
	 */
	void enterList_types(projectoParser.List_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#list_types}.
	 * @param ctx the parse tree
	 */
	void exitList_types(projectoParser.List_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(projectoParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(projectoParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#writeln}.
	 * @param ctx the parse tree
	 */
	void enterWriteln(projectoParser.WritelnContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#writeln}.
	 * @param ctx the parse tree
	 */
	void exitWriteln(projectoParser.WritelnContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#string_to_print}.
	 * @param ctx the parse tree
	 */
	void enterString_to_print(projectoParser.String_to_printContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#string_to_print}.
	 * @param ctx the parse tree
	 */
	void exitString_to_print(projectoParser.String_to_printContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#personalized_string}.
	 * @param ctx the parse tree
	 */
	void enterPersonalized_string(projectoParser.Personalized_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#personalized_string}.
	 * @param ctx the parse tree
	 */
	void exitPersonalized_string(projectoParser.Personalized_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#write_string_type}.
	 * @param ctx the parse tree
	 */
	void enterWrite_string_type(projectoParser.Write_string_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#write_string_type}.
	 * @param ctx the parse tree
	 */
	void exitWrite_string_type(projectoParser.Write_string_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#expression_to_add}.
	 * @param ctx the parse tree
	 */
	void enterExpression_to_add(projectoParser.Expression_to_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#expression_to_add}.
	 * @param ctx the parse tree
	 */
	void exitExpression_to_add(projectoParser.Expression_to_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#integers}.
	 * @param ctx the parse tree
	 */
	void enterIntegers(projectoParser.IntegersContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#integers}.
	 * @param ctx the parse tree
	 */
	void exitIntegers(projectoParser.IntegersContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#expression_dimension}.
	 * @param ctx the parse tree
	 */
	void enterExpression_dimension(projectoParser.Expression_dimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#expression_dimension}.
	 * @param ctx the parse tree
	 */
	void exitExpression_dimension(projectoParser.Expression_dimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(projectoParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(projectoParser.ExprContext ctx);
}