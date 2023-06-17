import java.util.*;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends FracLangBaseVisitor<Fraction> {

   Map<String,Fraction> variables = new HashMap<>();
   Scanner sc = new Scanner(System.in);

   @Override public Fraction visitStatDisplay(FracLangParser.StatDisplayContext ctx) {
      
      Fraction res = visit(ctx.expr());

      if (res != null){
         System.out.println(res.toString());
         return res;
      }
      else{
         return null;
      }
      
   }

   @Override public Fraction visitStatAssignment(FracLangParser.StatAssignmentContext ctx) {
      variables.put(ctx.ID().getText(),visit(ctx.expr()));
      return null;
   }

   @Override public Fraction visitExprRead(FracLangParser.ExprReadContext ctx) {
      String stringtoprint = ctx.STRING().getText();
      stringtoprint = stringtoprint.substring(1,stringtoprint.length() -1) ;
      System.out.print(stringtoprint + ": ");
      String aux = sc.nextLine();
      String[]frac = aux.split("/");
      Fraction fraction = new Fraction(Integer.parseInt(frac[0]), Integer.parseInt(frac[1]));
      return fraction;
      

   }

   @Override public Fraction visitExprMulDiv(FracLangParser.ExprMulDivContext ctx) {
      Fraction frac1 = visit(ctx.expr(0));
      Fraction frac2 = visit(ctx.expr(1));
      Fraction result;
      if (ctx.op.getText().equals("*")){
         result = frac1.multiply(frac2);
      }
      else{
         result = frac1.divide(frac2);
      }
      return result;
   }

   @Override public Fraction visitExprParent(FracLangParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Fraction visitExprSumLess(FracLangParser.ExprSumLessContext ctx) {
      Fraction frac1 = visit(ctx.expr(0));
      Fraction frac2 = visit(ctx.expr(1));
      Fraction result;
      
      if (ctx.op.getText().equals("+")){
         result = frac1.add(frac2);
      }else{
         result = frac1.subtract(frac2);
      }
      return result;
   }

   @Override public Fraction visitExprNumber(FracLangParser.ExprNumberContext ctx) {
      Fraction res = new Fraction(Integer.parseInt(ctx.NUMBER().getText()), 1);
      return res;
   }

   @Override public Fraction visitExprNegative(FracLangParser.ExprNegativeContext ctx) {
      Fraction result = visit(ctx.expr());
      return result.tonegative();
   }

   @Override public Fraction visitExprReduce(FracLangParser.ExprReduceContext ctx) {
      Fraction res = visit(ctx.expr());
      Fraction reduced = res.reduce(res.getNumerator(),res.getDenominator());
      return reduced;
   }

   @Override public Fraction visitExprID(FracLangParser.ExprIDContext ctx) {
      String var = ctx.ID().getText();
   
      if (variables.containsKey(var)){
         return variables.get(var);
      }
      else{
         System.err.println("ERRO - Variable \"" + var + "\" not found ");
         return null;
      }
   }

   @Override public Fraction visitExprFraction(FracLangParser.ExprFractionContext ctx) {
      Fraction res = new Fraction(Integer.parseInt(ctx.NUMBER(0).getText()),Integer.parseInt(ctx.NUMBER(1).getText()));
      return res;
   }
}
