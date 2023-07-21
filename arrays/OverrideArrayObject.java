package arrays;

class Student2{
    public String name;
    Student2(String name)
    {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}

public class OverrideArrayObject {
    public static void main (String[] args)
    {
           // declares an Array and initializing  the elements of the array
        Student2[] myStudents = new Student2[]{new Student2("John"),new Student2("Jane"),new Student2("Mark"),new Student2("Mary")};
   
        // accessing the elements of the specified array
        for(Student2 student:myStudents){   
            System.out.println(student);
        }
    }
}
