import static java.lang.System.*;
import org.stringtemplate.v4.*;

public class SimpleST{
    public static void main(String[] args){
        ST hello = new ST("Hello , <name>");
        hello.add("name","Word");
        System.out.println(hello.render());
    }
}