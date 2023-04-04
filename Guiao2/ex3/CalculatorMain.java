import java.io.IOException;
import java.util.Scanner;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CalculatorMain {
   public static void main(String[] args) {
      try {
         Scanner sc = new Scanner(System.in);
         String lineText = null;
         int numLines = 1;

         if (sc.hasNextLine()){
            lineText = sc.nextLine();
         }
         CalculatorParser parser = new CalculatorParser(null);

         Interpreter visitor0 = new Interpreter();
         
         while (lineText != null){
            CharStream input = CharStreams.fromString(lineText + '\n');
            
            CalculatorLexer lexer = new CalculatorLexer(input);
            lexer.setLine(numLines);
            lexer.setCharPositionInLine(0);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            parser.setInputStream(tokens);

            ParseTree tree = parser.program();
            if (parser.getNumberOfSyntaxErrors() == 0) {
               // print LISP-style tree:
               visitor0.visit(tree);
               // System.out.println(tree.toStringTree(parser));
            }
            
            if (sc.hasNextLine()){
               lineText = sc.nextLine();
            } else {
               lineText = null;
            }
            numLines++;
         }
         
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
}
