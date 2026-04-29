package oops;
// class
public class c2{
    // int no_of_eyes=2;
    // String color="brown";
    // instance variable 
    int no_of_eyes;
    String color;
    public void details(String name){
        // System.out.println("Eyes:" +no_of_eyes); value are not provied than automizer 0
        // System.out.println("color:" +color);  value are not provied than automizer Null
        System.out.println("--------Details of "+name+"-------");
        System.out.println("Eyes:" +no_of_eyes);
        System.out.println("color:" +color);
    }
      public static void main(String[] args)
      {
        
         c2 jumbo=new c2(); 
        //  value initialize
        jumbo.no_of_eyes=2;
        jumbo.color="black";
        jumbo.details("jumbo");

        c2 buzo=new c2(); 
        //  value initialize
        buzo.no_of_eyes=2;
        buzo.color="white";
        buzo.details("buzo");
      }
    }
    
    

