package constructors;
class Student{
   private  int id;
   private  String name;
   private String course;
   private int fee;

//   constructor
    Student(int id, String name, String course, int fee){
    this.id=id;
    this.name=name;
    this.course=course;
    this.fee=fee;
    }
    //  this is instance method 
    public void Studentdetails(){
    System.out.println("Student Id is : " + id);
    System.out.println(" Student Name is : " + name);
    System.out.println("Course is : " + course);
    System.out.println("Fee is : " + fee);
    System.out.println("--------------------------");

        }
}
public class Q1 {
    public static void main(String[] args){
        Student s1=new Student(101,"vikas","java",10000);
        s1.Studentdetails();
        Student s2=new Student(102,"raj","python",15000);
        s2.Studentdetails();
        Student s3=new Student(103,"priya","java",10000);
        s3.Studentdetails();
        Student s4=new Student(104,"rohit","python",15000);
        s4.Studentdetails();
    }
}
