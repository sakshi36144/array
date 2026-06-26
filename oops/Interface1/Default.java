package Interface1;

interface MyInterface{
    public default void m1(){
        System.out.println("MyInterface.m1()");
    }
}
class Test implements MyInterface {
}

public class Default {
    public static void main(String[] args){
      Test t = new Test();
        t.m1();
    }
}
