import java.util.HashMap;



@SuppressWarnings("CheckReturnValue")
public class VInterpreter extends CalculatorBaseVisitor<Integer> {

   HashMap<String,Integer> mapa = new HashMap<>();

   @Override public Integer visitAssig(CalculatorParser.AssigContext ctx) {
      if (ctx.assignment() != null){
         System.out.print(visit(ctx.assignment()));
      }
      
      return null;
   }

   @Override public Integer visitExp(CalculatorParser.ExpContext ctx) {
      if (ctx.expr() != null){
         System.out.print(visit(ctx.expr()));
      }
      return null;
   }

   @Override public Integer visitAssignment(CalculatorParser.AssignmentContext ctx) {
      mapa.put(ctx.ID().getText(),visit(ctx.expr()));
      
      return visit(ctx.expr());
   }

   @Override public Integer visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Integer number1 = visit(ctx.expr(0));
      Integer number2 = visit(ctx.expr(1));
      switch (ctx.op.getText()){
         case "+": return number1 + number2;
         case "-": return number1 - number2;
      }
      
      return null;
   }

   @Override public Integer visitExprParent(CalculatorParser.ExprParentContext ctx) {
      return visit(ctx.expr());
      
   }

   @Override public Integer visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      return Integer.parseInt(ctx.Integer().getText());
   }

   @Override public Integer visitExprId(CalculatorParser.ExprIdContext ctx) {
      if (mapa.containsKey(ctx.ID().getText())){
         return mapa.get(ctx.ID().getText());
      }
      return null;
   }

   @Override public Integer visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      Integer number1 = visit(ctx.expr(0));
      Integer number2 = visit(ctx.expr(1));
      switch (ctx.op.getText()){
         case "*": return number1 * number2;
         case "/": return number1 / number2;
         case "%": return number1 % number2;
      }   
      return null;
   }
}
