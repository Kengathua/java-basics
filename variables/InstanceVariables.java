package variables;

class InstanceVariables {
    // Declared Instance Variable
    public String developer;
    public int i;
    public int j;
    public Integer I;
    public InstanceVariables()
    {
        // Default Constructor
        // initializing Instance Variable
        this.developer = "Kennedy Gathua";
        this.j = 20;
    }
    public static void main(String[] args){
        InstanceVariables name = new InstanceVariables();
 
        // Displaying O/P
        System.out.println("Developer name is: " + name.developer);
        System.out.println("Default value for int is "
                           + name.i);
        System.out.println("Assigned value of j is " + name.j);
       
        // toString() called internally
        System.out.println("Default value for Integer is "
                           + name.I);
    }
}
