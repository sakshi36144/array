package Encapsulation;

// create class
class Student1{

    private String name, address, course, gender;

    // final keyword
    public final String SCHOOL_NAME;

    private int age;

    // create constructor
    public Student1(String name,
                   String address,
                   String course,
                   String gender,
                   int age,
                   String nName) {

        this.name = name;
        this.address = address;
        this.course = course;
        this.gender = gender;
        this.age = age;

        // System.out.println("Student Constructor Called");

        SCHOOL_NAME = nName;
    }

    // create print method
    public void print() {

        System.out.println("Name is : " + name);
        System.out.println("Address is : " + address);
        System.out.println("Course is : " + course);
        System.out.println("Gender is : " + gender);
        System.out.println("Age is : " + age);
        System.out.println("School Name is : " + SCHOOL_NAME);
    }
}

public class fin_al2  {

    public static void main(String[] args) {

        System.out.println("-------------------------------------");

        Student1 john = new Student1(
                "John",
                "123 Main St",
                "Computer Science",
                "Male",
                20,
                "Royal Public School"
        );

        john.print();

        System.out.println("-------------------------------------");
    }
}