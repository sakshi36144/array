package constructors;
 class MicrosoftEmp{
    int id;
    String name;
    String address;
    // Static variable to hold the company name, shared by all instances of MicrosoftEmp
    static String companyName;
    public MicrosoftEmp(int id, String name, String address){
        this.id=id;
        this.name=name;
        this.address=address;
        
    }
    public void printDetails(){
        System.out.println("Employee Id is : " + id);
        System.out.println("Employee Name is : " + name);
        System.out.println("Employee Address is : " + address);
        System.out.println("Company Name is : " + companyName);
        System.out.println("--------------------------");
    }
}
public class Q4 {
    public static void main(String[] args) {
        // Accessing the static variable directly using the class name without creating an instance
        MicrosoftEmp.companyName = "Microsoft";
        System.out.println( MicrosoftEmp.companyName);
        MicrosoftEmp emp1 = new MicrosoftEmp(1, "John Doe", "Main St");
        MicrosoftEmp emp2 = new MicrosoftEmp(2, "Jane Smith", "Oak Ave");
        emp1.printDetails();
        emp2.printDetails();
    }
}
