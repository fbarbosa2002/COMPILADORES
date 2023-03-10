import java.util.Scanner;

public class calculadora{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        double number1 = 0 ,number2 = 0 , result = 0;
        System.out.print("Escreva a sua operacao: \n");

        String operation = scanner.nextLine();
        String [] operation_splited = operation.split(" ");
        
        try{
            number1 = Double.parseDouble(operation_splited[0]) ;
            number2 = Double.parseDouble(operation_splited[2]) ;
        } catch(NumberFormatException e){
            System.err.print("Error : Input numbers\n");
            System.exit(0);
        }

        String operators = operation_splited[1];

        switch (operators){
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

        System.out.printf(" = %.2f\n",result);
        scanner.close();
        
    }
}