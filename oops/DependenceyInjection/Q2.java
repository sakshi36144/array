package DependenceyInjection;
class student{
    int id;
    String name;
    String course;
    int fee;

public void StudentDetails(){
    System.out.println("Student Id is : " + id);
    System.out.println(" Student Name is : " + name);
    System.out.println("Course is : " + course);
    System.out.println("Fee is : " + fee);
    System.out.println("--------------------------");
}
      public void dependencyInjection(int id, String name, String course, int fee){
        this.id=id;
        this.name=name;
        this.course=course;
        this.fee=fee;
}}
public class Q2 {
    public static void main(String[] args){
        // step 1:create object
        student s1=new student();
        // step 2: object initialization
        s1.id=101;
        s1.name="vikas";
        s1.course="java";
        s1.fee=10000;
        s1.StudentDetails();
        student s2=new student();
        // student2 details 
        s2.id=102;
        s2.name="raj";
        s2.course="python";
        s2.fee=15000;
        s2.StudentDetails();
        
            
    }
}
