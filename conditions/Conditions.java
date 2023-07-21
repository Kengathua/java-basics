package conditions;
import java.io.*;

public class Conditions {
    public static void main(String... args){
        // creating the instance of class BufferedReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        double score;

        try{
            System.out.println("Enter your score");
                score = Double.parseDouble(reader.readLine()); // taking string input

            System.out.println("The score is " + score);
            if (score < 0 || score > 100){
                System.out.println("Invalid score");
            }
            else if (score >= 80){
                System.out.println("The grade is A");
            }
            else if (score >= 70){
                System.out.println("The grade is B");
            }
            else if (score >= 60){
                System.out.println("The grade is C");
            }
            else if (score >= 50){
                System.out.println("The grade is D");
            }
            else{
                System.out.println("The grade is E");
            }
        }
        catch (Exception e) {
            System.out.println("Found an exception" + e);
        }
    }
}
