import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.HashMap;
@SuppressWarnings("CheckReturnValue")

public class LInterpeter extends NumberBaseListener {

   HashMap<String,Integer> mapa = new HashMap<>();
   @Override public void enterLine(NumberParser.LineContext ctx) {
      mapa.put(ctx.ID().getText() , Integer.parseInt(ctx.Num().getText()));

      
   }
   public HashMap<String,Integer> getMap() {
      return mapa;
   }  
}
