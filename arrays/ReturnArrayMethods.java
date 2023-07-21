package arrays;

public class ReturnArrayMethods {
    public static void main(String[] args){
        int myArray[] = method1();
        for (int i=0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        };
    };

    public static int[] method1(){
        return new int[]{2, 3 ,4, 5, 6};
    };
};
