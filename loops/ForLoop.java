import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ForLoop {
    public static void main(String... args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter limit value");
            int limit = Integer.parseInt(reader.readLine());
            for (int i=0; i< limit; i++){
                System.out.println("Looping at index " + i);
            }
        }
        catch (Exception e){
            System.out.println("Caught the exception " + e);
        }
    };
};
