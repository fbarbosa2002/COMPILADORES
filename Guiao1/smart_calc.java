import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class smart_calc{        

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        HashMap <String,Double> hashmap = new HashMap<>();
        while(sc.hasNextLine()){
            run(sc.nextLine(),hashmap,"");
        }
        sc.close();
    }

    public static void run(String string , HashMap<String,Double> hashmap,String auxiliar){
        Scanner sl = new Scanner(string);
        int state = 0 ;
        double number1 = 0,number2 = 0;
        String variable = "",operation = "",aux = "",arg = "";
        for(Map.Entry<String,Double> entry : hashmap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        while(sl.hasNext()){
            
            switch(state){

                // STATE 0 - INITIAL STATE , CAN BE NUMBER OR VARIABLE
                case 0:
                    aux = sl.next();
                    if (isNumeric(aux)){
                        number1 = Double.parseDouble(aux);
                        state = state + 1;
            
                    }
                    else if(isVariable(aux)){
                        variable = aux;
                        state = state + 2 ;
                    }
                    else{
                        System.err.print("First token incorrect\n");
                    }

                    break;
                
                // STATE 1 - PREVIOUS STATE -> 0 -> NUMBER
                //           CAN BE A OPERATION ONLY
                case 1:
                    aux = sl.next();
                    if (!isOperation(aux)){
                        System.err.print("Operation invalid\n");
                    }                    
                    else{
                        operation = aux;
                        state = state + 2;
                    }
                    break;
                
                // STATE 2 - PREVIOUS STATE -> 0 -> VARIABLE
                // CAN BE A OPERATION OR A EQUAL
                case 2:
                    aux = sl.next();
                    if (isOperation(aux)){
                        operation = aux;
                        if (hashmap.containsKey(variable)){
                            number1 = hashmap.get(variable);
                            state = state + 1;
                        }
                        else{
                            System.err.print("Variable not defined\n");
                            break;
                        }
                    }
                    else if(aux.equals("=")){
                        state = state + 2;

                    } else{
                        System.err.print("Operation invalid!\n");
                    }

                    break;
                
                // STATE 3 - PREVIOUS STATE -> 1 -> 0
                //                          OPERATION -> NUMBER
                // CAN BE ONLY A NUMBER OR VARIABLE
                case 3:
                    aux = sl.next();
                    if(isNumeric(aux)){
                        if(operation.equals("*") || operation.equals("/")){
                            
                            number2 = makeanoperation(number1,operation,Double.parseDouble(aux));
                            
                            if (sl.hasNextLine()){
                                String aux2 = sl.nextLine();

                                if (auxiliar.equals("")){
                                    arg = Double.toString(number2) + aux2;
                                }
                                else{
                                    arg = auxiliar + " " + Double.toString(number2) + aux2; 
                                }
                                run(arg,hashmap,"");
                            }
                            else{
                                if (auxiliar.equals("")){
                                    state = state + 97;
                                }
                                else{
                                    arg = auxiliar + " " + Double.toString(number2);
                                    run(arg,hashmap,"");
                                }
                            }
                        }
                        else{
                            if (sl.hasNextLine()){
                                String aux2 = sl.nextLine();

                                if (auxiliar.equals("")){
                                    auxiliar = Double.toString(number1) + " " + operation;
                                }
                                else{
                                    auxiliar = auxiliar + " " + Double.toString(number1) + " " + operation;
                                }
                                arg = aux + aux2;
                                run(arg,hashmap,auxiliar);
                            }
                            else{

                                number2 = makeanoperation(number1, operation, Double.parseDouble(aux));

                                if (auxiliar.equals("")){
                                    state = state + 97;
                                }
                                else{
                                    arg = auxiliar + " " + number2;
                                    run(arg,hashmap,"");

                                }

                                number2 = makeanoperation(number1, operation,Double.parseDouble(aux));
                                
                            }
                        }     
                    }

                    break;

                    // STATE 4 -> PREVIOUS STATES -> 2 -> 0
                    //                            -> EQUAL -> VARIABLE
                case 4:
                    number2 = Double.parseDouble(sl.next());
                    hashmap.put(variable,number2);
                    state = state + 96;
                    break;

                
            }
        }
        if(state == 1){
            System.out.printf("%f",number1);
        }
        if (state == 100){
            System.out.printf("Result: %.2f\n",number2);
        }
        sl.close();
    }

    public static boolean isVariable(String string){
        boolean verify = true;
        if (!Character.isLetter(string.charAt(0)) && string.charAt(0) != '_' && string.charAt(0) != '$' ){
            verify = false;
        }

        for (int i = 1; i < string.length() ; i++){
            char c = string.charAt(i);

            if (!Character.isLetter(c) && c != '_' && c != '$' ){
                verify = false;
            }
        }
        return verify;
    }

    public static boolean isOperation(String string){
        if (string.equals("/") || string.equals("*") || string.equals("+") || string.equals("-")){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isNumeric(String string){
        try{
            Double.parseDouble(string);
            return true; 
        }
        catch(NumberFormatException e){
            return false;
        }
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

