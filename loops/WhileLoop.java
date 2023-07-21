import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WhileLoop {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("Enter limit value");
            int limit = Integer.parseInt(reader.readLine());
            while (limit <= 10){
                System.out.println("Printing at " + limit);
                limit ++;
            }
        }
        catch (Exception e){
            System.out.println("Caught an exception " + e);
        }
    }
}
