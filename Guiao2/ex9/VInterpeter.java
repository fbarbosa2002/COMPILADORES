import java.util.HashMap;
import java.util.Scanner;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
@SuppressWarnings("CheckReturnValue")
public class VInterpeter extends CalcFracBaseVisitor<Fraction> {

   File MyJavaFile = new File("MyJavaFile.java");

   HashMap<String,Fraction> mapa = new HashMap<>();
   
   @Override public Fraction visitProgram(CalcFracParser.ProgramContext ctx){
      try {
         if (MyJavaFile.createNewFile()) {
           System.out.println("File created: " + MyJavaFile.getName());
         } else {
           System.out.println("File already exists.");
         }
       } catch (IOException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
       }

   
      return null;
   }
   @Override public Fraction visitStatPrin(CalcFracParser.StatPrinContext ctx) {
        
      if (ctx.print() != null)
      {
         System.out.print(visit(ctx.print()));
      }
      return null;
   }

   @Override public Fraction visitStatAssign(CalcFracParser.StatAssignContext ctx) {
      
      if (ctx.assignment() != null)
      {
         System.out.print(visit(ctx.assignment()));
      }
      return null;
   }

   @Override public Fraction visitStatNew(CalcFracParser.StatNewContext ctx) {
      return null;
   }

   @Override public Fraction visitPrint(CalcFracParser.PrintContext ctx) {
      
      return visit(ctx.expr());
   }

   @Override public Fraction visitAssignment(CalcFracParser.AssignmentContext ctx) {
      Fraction expr = visit(ctx.expr());
      String id = ctx.ID().getText();
      mapa.put(id,expr);
      return expr;
   }

   @Override public Fraction visitExprAddSub(CalcFracParser.ExprAddSubContext ctx) {
      Fraction one = visit(ctx.expr(0));
      Fraction two = visit(ctx.expr(1));
      switch(ctx.op.getText()){
         case "+": return one.add(two);
         case "-": return one.subtract(two);
      }
      return null;
   }

   @Override public Fraction visitExprRead(CalcFracParser.ExprReadContext ctx) {
      String string = ctx.Text().getText();
      System.out.print(string + ":");
      Scanner sc = new Scanner(System.in);
      int one = sc.nextInt();
      System.out.print("/");
      int two = sc.nextInt();
      Fraction newfraction = new Fraction(one,two);
      return newfraction;
   }

   @Override public Fraction visitExprNum(CalcFracParser.ExprNumContext ctx) {
      Fraction toreturn = new Fraction(Integer.parseInt(ctx.Number().getText()),1);
      return toreturn;
   }

   @Override public Fraction visitExprMulDiv(CalcFracParser.ExprMulDivContext ctx) {
      Fraction one = visit(ctx.expr(0));
      Fraction two = visit(ctx.expr(1));
      switch(ctx.op.getText()){
         case "*": return one.multiply(two);
         case "/": return one.divide(two);
      }
      return null;
   }

   @Override public Fraction visitExprParent(CalcFracParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Fraction visitExprReduce(CalcFracParser.ExprReduceContext ctx) {
      Fraction reduced = visit(ctx.expr());
      reduced = reduced.reduce(reduced.getNumerator(),reduced.getDenominator());
      return reduced;
   }

   @Override public Fraction visitExprNumbarNum(CalcFracParser.ExprNumbarNumContext ctx) {
      Fraction toreturn = new Fraction(Integer.parseInt(ctx.Number(0).getText()),Integer.parseInt(ctx.Number(1).getText()));
      return toreturn;
   }

   @Override public Fraction visitExprId(CalcFracParser.ExprIdContext ctx) {
      if (mapa.containsKey(ctx.ID().getText())){
         return mapa.get(ctx.ID().getText());
      }
      return null; 
   }
}
