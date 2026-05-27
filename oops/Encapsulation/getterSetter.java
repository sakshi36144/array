package Encapsulation;
// create class
 class Student2{
   private String name,address,course,gender;
   private int age;
//    create constructor
    public Student2(String name, String address, String course ,String gender,int age){
        this.name=name;
        this.address=address;
        this.course=course;
        this.gender=gender;
        this.age=age;
        System.out.println("Student.Student(5)");}
    // create print method
    public void print(){
        System.out.println("Name is : " + name);
        System.out.println("Address is : " + address);
        System.out.println("Course is : " + course);
        System.out.println("Gender is : " + gender);
        System.out.println("Age is : " + age);
}
// create  setter method
public void setName(String name){this.name=name;}
public void setAddress(String address){this.address=address;}
public void setCourse(String course){this.course=course;}
public void setGender(String gender){this.gender=gender;}
public void setAge(int age){this.age=age;}
// create getter method 
public String getName(){return name;}
public String getAddress(){return address;}
public String getCourse(){return course;}
public String getGender(){return gender;}
public int getAge(){return age;}
 }
public class getterSetter {
    public static void main(String[] args){
        // john studen1
        Student2 john= new Student2("John", "123 Main St", "Computer Science", "Male", 20);
        john.print();
         System.out.println("--------------------------------------------------");
        // update the name and age using setter method
        john.setName("john singh ");
        System.out.println("After updating name using setter method : " + john.getName());
        john.setAge(21);
        System.out.println("After updating age using setter method :" +john.getAge());
        john.setAddress("shamli");
        System.out.println("After updating address using setter method : " + john.getAddress());
        john.setCourse("civil eng");
        System.out.println("After updating course using setter method : " + john.getCourse());
        System.out.println("--------------------------------------------------");
        //   aditya student 2
          Student2 aditya= new Student2("Aditya", "456 Oak Ave", "Mechanical Engineering", "Male", 22);
        aditya.print();
         System.out.println("--------------------------------------------------");
        // update the name and age using setter method
        aditya.setName("aditya kumar ");
        System.out.println("After updating name using setter method : " + aditya.getName());
        aditya.setAge(23);
        System.out.println("After updating age using setter method :" +aditya.getAge());
        aditya.setAddress("shamli");
        System.out.println("After updating address using setter method : " + aditya.getAddress());
        aditya.setCourse("civil eng");
        System.out.println("After updating course using setter method : " + aditya.getCourse());
         System.out.println("--------------------------------------------------");


    }
}
