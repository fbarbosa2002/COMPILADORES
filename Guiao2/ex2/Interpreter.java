@SuppressWarnings("CheckReturnValue")
public class Interpreter extends SuffixCalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
      Double res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitStat(SuffixCalculatorParser.StatContext ctx) {
      Double res = null;
      System.out.println(visit(ctx.expr()));
      return res;
   }

   @Override public Double visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      Double res = null;
      
      Double number1 = visit(ctx.expr(0));
      Double number2 = visit(ctx.expr(1));

      switch(ctx.op.getText()){
         case "*": return number1 * number2;
         case "/": return number1 / number2;
         case "+": return number1 + number2;
         case "-": return number1 - number2;
      }
      System.out.println(number1);
      return visitChildren(ctx);
      //return res;
   }
   @Override public Double visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      Double res = null;
      
      return Double.parseDouble(ctx.Number().getText());

      //return res;
   }

}
