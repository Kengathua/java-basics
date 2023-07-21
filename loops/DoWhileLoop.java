import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DoWhileLoop {
    public static void main(String... args){
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter the limit value");
            int limit = Integer.parseInt(reader.readLine());
            do {
                System.out.println("Do is active at the limit of " + limit);
                limit ++;
            }
            while(limit <= 10);
        }
        catch (Exception e){
            System.out.println("Caught an exception " + e);
        }
    }
}
