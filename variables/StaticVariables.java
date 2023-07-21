package variables;

public class StaticVariables {
    // Declared static variable
    public static String name = "Kennedy Gathua";
   
    public static void main(String[] args)
    {
 
        // name variable can be accessed without object
        // creation Displaying O/P GFG.name --> using the
        // static variable
        System.out.println("Name Name is : " + StaticVariables.name);
 
        // static int c=0;
        // above line,when uncommented,
        // will throw an error as static variables cannot be
        // declared locally.
    }
}
