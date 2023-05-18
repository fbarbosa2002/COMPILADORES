import org.stringtemplate.v4.*;
import java.util.* ;

@SuppressWarnings("CheckReturnValue")
public class CalcCompiler extends CalcBaseVisitor<ST> {

   @Override public ST visitMain(CalcParser.MainContext ctx) {
      ST res = templates.getInstanceOf("module");
      Iterator<CalcParser.StatContext> list = ctx.stat().iterator();
      while(list.hasNext()){
         res.add("stat",visit(list.next()).render());
      }
      return res;
      //return res;
   }

   @Override public ST visitStat(CalcParser.StatContext ctx) {
      ST res = templates.getInstanceOf("print");
      res.add("stat",visit(ctx.expr()).render());
      res.add("value", ctx.expr().var);
      return res;
   }

   @Override public ST visitExprAddSub(CalcParser.ExprAddSubContext ctx) {
      ST res = templates.getInstanceOf("binaryOperation");
      ctx.var = newVar();
      res.add("stat", visit(ctx.e1).render());
      res.add("stat", visit(ctx.e2).render());
      res.add("type","double");
      res.add("var",ctx.var);
      res.add("e1",ctx.e1.var);
      res.add("op",ctx.op.getText());
      res.add("e2",ctx.e2.var);
      return res;
   }

   @Override public ST visitExprParent(CalcParser.ExprParentContext ctx) {
      ST res = visit(ctx.expr());
      ctx.var = ctx.expr().var;
      return res;
   }

   @Override public ST visitExprNumber(CalcParser.ExprNumberContext ctx) {
      ST res = templates.getInstanceOf("decl");
      ctx.var = newVar();
      res.add("type","double");
      res.add("var",ctx.var);
      res.add("value",ctx.Number().getText());
      return res;
   }

   @Override public ST visitExprMultDiv(CalcParser.ExprMultDivContext ctx) {
      ST res = templates.getInstanceOf("binaryOperation");
      ctx.var = newVar();
      res.add("stat", visit(ctx.e1).render());
      res.add("stat", visit(ctx.e2).render());
      res.add("type","double");
      res.add("var",ctx.var);
      res.add("e1",ctx.e1.var);
      res.add("op",ctx.op.getText());
      res.add("e2",ctx.e2.var);
      return res;
   }
   private String newVar(){
      numVars++;
      return "v" + numVars;
   }
   private int numVars = 0;
   private STGroup templates = new STGroupFile("java.stg");
}
