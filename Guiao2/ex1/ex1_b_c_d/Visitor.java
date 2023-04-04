@SuppressWarnings("CheckReturnValue")
public class Visitor extends HelloBaseVisitor<String> {

   @Override public String visitGreetings(HelloParser.GreetingsContext ctx) {
      String res = null;
      System.out.println("Ola " + ctx.ID());
      
      
      return null;
   }
}
