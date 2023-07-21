package conditions;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SwitchStatements {
    public static void main(String... args){
        BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));

        try{
            System.out.println("Enter name of staff");
            String name= reader.readLine();

            switch (name){
                case "Michael":
                case "Mary":
                    System.out.println("Developer");
                    break;
                case "James":  System.out.println("Manager");
                                break;
                case "Joan":   System.out.println("Human Resource");
                                break;
                case "Jack":   System.out.println("CEO");
                                break;
                default: System.out.println("Unknown staff");
            }
        }
        catch (Exception e){
            System.out.println("Caught an excepton " + e);
        }
    }
}
