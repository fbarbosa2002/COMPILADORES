import java.util.*;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends StrLangBaseVisitor<String> {
   Map<String,String> variables = new HashMap<>();
   Scanner sc = new Scanner(System.in);
   @Override public String visitProgram(StrLangParser.ProgramContext ctx) {
      Iterator<StrLangParser.StatContext> stats = ctx.stat().iterator();
      while(stats.hasNext()){
         String line = visit(stats.next());
         if (line != null){
            return line;
         }
         else{
            break;
         }
      }
      return null;
   }

   @Override public String visitStatPrint(StrLangParser.StatPrintContext ctx) {
      String res = visit(ctx.expr());
      if (res == null){
         return null;
      }
      System.out.println(res);
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStatAssign(StrLangParser.StatAssignContext ctx) {
      String res = null;
      variables.put(ctx.ID().getText(),visit(ctx.expr()));
      return res;
      
   }

   @Override public String visitExprSwitch(StrLangParser.ExprSwitchContext ctx) {
      String res = visit(ctx.expr(0));
      String to_modify = visit(ctx.expr(1));
      String modifying = visit(ctx.expr(2));  
      res = res.replaceAll(to_modify, modifying);
      return res;
   }

   @Override public String visitExprSum(StrLangParser.ExprSumContext ctx) {
      String string1 = visit(ctx.expr(0));
      String string2 = visit(ctx.expr(1));
      String res = null;
      if (ctx.op.getText().equals("+")){
         res = string1 + string2;
      }
      else{
         res = string1.replaceAll(string2,"");
      }
      return res;
   }

   @Override public String visitExprString(StrLangParser.ExprStringContext ctx) {
      String res = ctx.STRING().getText();
      res = res.substring(1, res.length() - 1 );
      return res;
   }

   @Override public String visitExprParent(StrLangParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public String visitExprInput(StrLangParser.ExprInputContext ctx) {
      System.out.print(visit(ctx.expr()));
      String res = sc.nextLine();
      return res;
   }

   @Override public String visitExprTrim(StrLangParser.ExprTrimContext ctx) {
      String res = visit(ctx.expr());
      res = res.trim();
      return res;
   }

   @Override public String visitExprID(StrLangParser.ExprIDContext ctx) {
      String var = ctx.ID().getText();

      if (variables.containsKey(var)){
         return variables.get(var);
      }
      else{
         System.err.println("ERRO - Variable \"" + var + "\" does not exist");
         return null;
      }
   }
}
