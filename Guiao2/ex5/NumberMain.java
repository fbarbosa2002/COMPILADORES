import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.HashMap;
import java.util.Scanner;
public class NumberMain {
   public static void main(String[] args) {
      HashMap<String,Integer> newmap = parser();
      Scanner sc = new Scanner(System.in);
      while(sc.hasNextLine()){
         System.out.print(sc.nextLine().split('-'),newmap);
      }
   }

   public HashMap<String,Integer> parser(){
      try {
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromFileName("numbers.txt");
         // create a lexer that feeds off of input CharStream:
         NumberLexer lexer = new NumberLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         NumberParser parser = new NumberParser(tokens);
         // replace error listener:
         //parser.removeErrorListeners(); // remove ConsoleErrorListener
         //parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at stat rule:
         ParseTree tree = parser.stat();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            ParseTreeWalker walker = new ParseTreeWalker();
            LInterpeter listener0 = new LInterpeter();
            walker.walk(listener0, tree);
            return listener0.getMap();
         }
      }
      catch(IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
      return null;
   }
}
