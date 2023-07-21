package examples;

public class SwappingNumbers {
    public static void main(String... args){
        int x = 150;
        int y = 120;
        System.out.println("X was " + x);
        System.out.println("Y was " + y);

        int temp = x;
        x=y;
        y=temp;
        System.out.println("X is " + x);
        System.out.println("Y is " + y);
    }
}
