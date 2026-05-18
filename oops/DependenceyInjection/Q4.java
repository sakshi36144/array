package DependenceyInjection;
class car{
    int carId;
     String brand; 
     String model;
     String color;
     double price;
     String fuelType;
     double mileage;
// method to display car details
public void CarDetails(){
    System.out.println("Car Id is : " + carId);
    System.out.println(" Brand is : " + brand);
    System.out.println("Model is : " + model);
    System.out.println("Color is : " + color);
    System.out.println("Price is : " + price);
    System.out.println("Fuel Type is : " + fuelType);
    System.out.println("Mileage is : " + mileage);
    System.out.println("--------------------------");
}
// method for dependency 
public void DI(int carId, String brand, String model, String color, 
    double price, String fuelType, double mileage){
    this.carId=carId;
    this.brand=brand;
    this.model=model;
    this.color=color;
    this.price=price;
    this.fuelType=fuelType;
    this.mileage=mileage;

 }}
public class Q4 {
    public static void main(String[] args) {
        // step 1: create object
        car c1=new car();
        // step 2: object initialization
        c1.carId=101;
        c1.brand="Toyota";
        c1.model="Camry";
        c1.color="Red";
        c1.price=30000;
        c1.fuelType="Petrol";
        c1.mileage=25.5;
        c1.CarDetails();
        //step2: create another object
        car c2=new car();
        // step 3: object initialization
        c2.carId=102;
        c2.brand="Honda";
        c2.model="Civic";
        c2.color="Blue";
        c2.price=25000;
        c2.fuelType="Diesel";
        c2.mileage=30.0;
        c2.CarDetails();
    }
}
