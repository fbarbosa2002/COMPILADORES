@SuppressWarnings("CheckReturnValue")
public class Execute extends HelloBaseVisitor<String> {

   @Override public String visitGreetings(HelloParser.GreetingsContext ctx) {
      String res = null;
      System.out.print("Adeus ");
      System.out.print(ctx.ID());
      return visitChildren(ctx);
      //return res;
   }
}
