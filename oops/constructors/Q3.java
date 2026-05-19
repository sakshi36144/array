package constructors;
class person{
    private String name;
    private int age;
    private String gender;
    private String city;

public person(String name, int age, String gender, String city){
    this.name=name;
    this.age=age;
    this.gender=gender;
    this.city=city;
}
public void printDescriptions(){
    System.out.println("Name is : " + name);
    System.out.println("Age is : " + age);
    System.out.println("Gender is:" +gender);
    System.out.println("City is : " + city);
    System.out.println("--------------------------");
}
}
public class Q3{

    
    public static void main(String[] args){
        // step 1: create object
        person vikas =new person("vikas",31,"male","noida");
        vikas.printDescriptions();
}
}