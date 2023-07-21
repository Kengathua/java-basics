package arrays;

class Student {
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class ArrayObjects {
    public static void main(String... args){
        // allocating memory for 5 objects of type Student.
        Student[] arr = new Student[5];

        // initialize the first elements of the array
        arr[0] = new Student(1, "Kennedy");
        arr[1] = new Student(2, "John");
        arr[2] = new Student(3, "James");
        arr[3] = new Student(4, "Jone");
        arr[4] = new Student(5, "Doe");

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++){
            Student student = arr[i];
            System.out.println(student.roll_no);
            System.out.println(student.name);
        }
    }
}
