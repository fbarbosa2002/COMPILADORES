import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Stack;

public class make_a_number {
    public static void main(String [] args) throws FileNotFoundException{
        File file = new File("numbers.txt");
        Scanner sc = new Scanner(file);
        int number1 = 0 , number2 = 0 ;
        HashMap<String,Integer> hashmap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        while(sc.hasNextLine()){
            String [] operation_slipted = sc.nextLine().split(" ");
            hashmap.put(operation_slipted[2],Integer.parseInt(operation_slipted[0]));
        }
        sc.close();
        Scanner input = new Scanner(System.in);
        
        while(input.hasNextLine()){
            Scanner sl = new Scanner(input.nextLine());

            while(sl.hasNext()){
                String auxiliar = sl.next();

                if (hashmap.containsKey(auxiliar)){
                    if(number1 == 0){
                        number1 = hashmap.get(auxiliar);
                    } else if(number1 > number2){
                        
                    }
                     
                    
                } 
                else{
                    System.out.printf("%s ",auxiliar);
                }

            }
        }

        
        while(stack.size() != 1){
            
            number1 = stack.pop();

            
        }
        input.close();
    }
}
