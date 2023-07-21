package examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorials {
    public static void main(String... args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("Enter value to supply factorial for:");
            int number = Integer.parseInt(reader.readLine());
            int result = 1;
            for (int i=number; i>0; i--){
                result *= i;
            }
            System.out.println(result);
        }
        catch (Exception e){
            System.out.println("Caught an exception " + e);
        }
    }
}
