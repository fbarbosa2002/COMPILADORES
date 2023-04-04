@SuppressWarnings("CheckReturnValue")
public class Interpreter extends CalculatorBaseVisitor<Integer> {

   @Override public Integer visitProgram(CalculatorParser.ProgramContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitStat(CalculatorParser.StatContext ctx) {
      Integer res = null;
      System.out.println(visit(ctx.expr()));
      return res;
   }

   @Override public Integer visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Integer res = null;
      Integer number1 = visit(ctx.expr(0));
      Integer number2 = visit(ctx.expr(1));
      switch (ctx.op.getText()){
         case "+": return number1 + number2;
         case "-": return number1 - number2;
      }
      return res;
   }

   @Override public Integer visitExprParent(CalculatorParser.ExprParentContext ctx) {
      Integer res = null;
      return visit(ctx.expr());
      //return res;
   }

   @Override public Integer visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      Integer res = null;
      return Integer.parseInt(ctx.Integer().getText());
      //return res;
   }

   @Override public Integer visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      Integer res = null;
      Integer number1 = visit(ctx.expr(0));
      Integer number2 = visit(ctx.expr(1));
      switch (ctx.op.getText()){
         case "*": return number1 * number2;
         case "/": return number1 / number2;
         case "%": return number1 % number2;
      }      
      return res;
   }
}
