package Association;
class Accenture{
    private String empName;
    private String address;
    private int empId;
    public Accenture(String empName, String address, int empId){
        this.empName=empName;
        this.address=address;
        this.empId=empId;
    }
       @Override
    public String toString() {
        return "Accenture [empName= " + empName + ", address=" + address + ", empId=" + empId + "]";
        // return  "\n+-------------------------------+" +
        //         "\n| Accenture Employee Record     |" +
        //         "\n+-------------------------------+" +
        //         "\n| Name:    " + empName + 
        //         "\n| Address: " + address + 
        //         "\n| ID:      " + empId + 
        //         "\n+-------------------------------+";
}
}
public class Q1 {
    public static void main(String[] args){
        Accenture emp1 = new Accenture("Madhav", "Dwarika", 1);
        System.out.println(emp1);
        System.out.println(emp1.toString());
    }
}
