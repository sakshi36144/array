package DependenceyInjection;
// ei->employee information
class ei{
    int empid;
    String name;
    int salary;
    String department;
    int age;
    String gender;
    String companyname;

// method to display employee details
public void EmployeeDetails(){
    System.out.println("Employee Id is : " + empid);
    System.out.println(" Employee Name is : " + name);
    System.out.println("Salary is : " + salary);
    System.out.println("Department is : " + department);
    System.out.println("Age is : " + age);
    System.out.println("Gender is : " + gender);
    System.out.println("Company Name is : " + companyname);
    System.out.println("--------------------------");
}
// method for dependency injection
 public void DI(int empid, String name, int salary, String department, int age, String gender, String companyname){
    this.empid=empid;
    this.name=name;
    this.salary=salary;
    this.department=department;
    this.age=age;
    this.gender=gender;
    this.companyname=companyname;

 }}
//  main class
public class Q3 {
    public static void main(String[] args){
        // step 1: create object
        ei e1=new ei();
        // step 2: object initialization
        e1.empid=101;
        e1.name="vikas";
        e1.salary=50000;
        e1.department="IT";
        e1.age=30;
        e1.gender="male";
        e1.companyname="tcs";
        e1.EmployeeDetails();
        //step2: create another object
        ei e2=new ei();
        // step 3: object initialization
        e2.empid=102;
        e2.name="raj";
        e2.salary=6000;
        e2.department="IT";
        e2.age=31;
        e2.gender="male";
        e2.companyname="tcs";
        e2.EmployeeDetails();

    } 
}
