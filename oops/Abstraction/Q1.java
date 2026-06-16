package Abstraction;
 abstract class Vehicle{
     int typres;
    //  concrete method 
     void displaytypres(){
        System.out.println("The number of typres in the vehicle is: "+typres);
     }
        // abstract method
      abstract void Start();
       
}
class Car extends Vehicle{
        
         @Override
     void Start(){
         typres=4;
        System.out.println("The car is Starting");
     }
}
class Scooty extends Vehicle{

         @Override
     void Start(){
         typres=11;
        System.out.println("The scooty is Starting");
     }
}
public class Q1 {
    public static void main(String[] args){
       Vehicle car = new Car(); 
        //upcasting and polymorphism achieved and loose coupling provied by using abstract class 
        // and methods
       car.Start();
       car.displaytypres();
       
       Vehicle scooty = new Scooty();
       scooty.Start();
       scooty.displaytypres();
       
    }
    
}
