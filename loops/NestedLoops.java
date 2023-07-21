import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NestedLoops{
    public static void main(String... args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter number of weeks");
            int number = Integer.parseInt(reader.readLine());
            int week = 1;
            String[]days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            while (week <= number){
                System.out.println("Week " + week);
                for (int i = 0; i < days.length; i++){
                    System.out.println(days[i]);
                }
                week ++;
            }
        }
        catch (Exception e){
            System.out.println("Caught the exception " + e);
        }
    }
}