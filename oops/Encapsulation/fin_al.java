package Encapsulation;
// create class
 class Student{
   private String name,address,course,gender;
   public static final String SCHOOL_NAME="ABC School";
   private int age;
//    create constructor
    public Student(String name, String address, String course ,String gender,int age){
        this.name=name;
        this.address=address;
        this.course=course;
        this.gender=gender;
        this.age=age;
        System.out.println("Student.Student(5)");
    }
    // create print method
    public void print(){
        System.out.println("Name is : " + name);
        System.out.println("Address is : " + address);
        System.out.println("Course is : " + course);
        System.out.println("Gender is : " + gender);
        System.out.println("Age is : " + age);
        System.out.println("School Name is : " + SCHOOL_NAME);
}

 }
public class fin_al {
    public static void main(String[] args){
        // john studen1
        Student john= new Student("John", "123 Main St", "Computer Science", "Male", 20);
        john.print();
        System.out.println("-------------------------------------");
         Student sonu= new Student("sonu", "123 Main St", "Computer Science", "Male", 21);
        sonu.print();
}
}
