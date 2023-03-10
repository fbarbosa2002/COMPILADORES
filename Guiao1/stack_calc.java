import java.util.Scanner;
import java.util.Stack;

public class stack_calc {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double number1 = 0,number2 = 0;
        while(sc.hasNextLine()){
            Scanner sl = new Scanner(sc.nextLine());
            Stack<String> stack = new Stack<>();

            while (sl.hasNext()){
                if(sl.hasNextDouble()){
                    stack.push(sl.next());
                    System.out.print("\nStack: ");
                    System.out.print(stack);
                }
                else{
                    if(stack.size() < 2){
                        System.err.print("\nLess than two operators\n");
                        break;
                    }
                    number2 = Double.parseDouble(stack.pop());
                    number1 = Double.parseDouble(stack.pop());
                    stack.push(Double.toString(makeanoperation(number1,sl.next(),number2)));
                    System.out.print("\nStack: " + stack);
                }
            }
        }
        sc.close();
    }
    public static double makeanoperation(Double number1, String operation, Double number2){
        double result = 0;
        switch (operation){
            case "+":
               result = number1 + number2;
               break;
            case "*":
                result = number1 * number2 ;
                break;
            case "/":
                result = number1 / number2 ;
                break;
            case "-":
                result = number1 - number2 ;
                break;
            default:
                System.err.print("Not a valid operator\n");
                System.exit(0);
        }
        return result;
    }
}
