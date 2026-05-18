package DependenceyInjection;

class mobile{
    int mobileId;
     String brand; 
     String model;
     double price;
     String os;
     double batteryLife;

// method to display mobile details
public void MobileDetails(){
    System.out.println("Mobile Id is : " + mobileId);
    System.out.println(" Brand is : " + brand);
    System.out.println("Model is : " + model);
    System.out.println("Price is : " + price);
    System.out.println("Operating System is : " + os);
    System.out.println("Battery Life is : " + batteryLife + " hours");
    System.out.println("--------------------------");}
    public void DI(int mobileId, String brand, String model, double price, String os, 
        double batteryLife){
    this.mobileId=mobileId;
    this.brand=brand;
    this.model=model;
    this.price=price;
    this.os=os;
    this.batteryLife=batteryLife;
        }
}
public class Q5 {
    public static void main(String[] args){
        // step 1: create object
        mobile m1=new mobile();
        // step 2: object initialization using method for dependency injection
        m1.DI(101, "Apple", "iPhone 13", 999.99, "iOS", 
        20.0);
        m1.MobileDetails();
        mobile m2=new mobile();
        m2.DI(102, "Samsung", "Galaxy S21", 799.99, "Android",
         25.0);
        m2.MobileDetails();
    }
}
