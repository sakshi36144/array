package polymorphism;
 class A1{
        // this is the parent class 
        void show(){
            System.out.println("This is the parent class method");
        }
    }
    class B1 extends A1{
        // this is the child class 
        @Override
        void show(){
            System.out.println("This is the child class method");
        }
    }
public class overriding {
    
    public static void main(String[] args){
        // uppercasting 
      A1 obj1 = new B1();
      obj1.show(); // this will call the parent class method
    //   B1 obj2 = new B1();
    //   obj2.show(); // this will call the child class method
    }
}
