import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

public class word_to_number {
    public static void main(String [] args) throws FileNotFoundException{
        File file = new File("numbers.txt");
        Scanner sc = new Scanner(file);
        HashMap<String,Integer> hashmap = new HashMap<>();
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
                    System.out.printf("%d ",hashmap.get(auxiliar));

                } else{
                    System.out.printf("%s ",auxiliar);
                }
            }
        }
        input.close();
    }
}
