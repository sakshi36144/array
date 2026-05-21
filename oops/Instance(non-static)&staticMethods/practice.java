class waqtRahtePadLo{
    // imstance variable
    String name;
    // static variable
    static int id;
    // instance method
    public void m1(){
        s1();
        m2();
        System.out.println(id);
        System.out.println(name);
        System.out.println("This is instance method");
    }
    public void m2(){
       
        System.out.println("This is instance method.m2()");
    }
        // static method
        public static void s1(){
            s2();
            // m2(); // error because m2 is instance method and we can not access instance method in static method
            System.out.println(id);
            //  System.out.println(name);  // error because name is instance variable and we can not access instance variable in static method
            System.out.println("This is static method");
        }
        public static void s2(){
            System.out.println("This is static method");
        }
}
public class practice {
    public static void main(String[] args){

    }
}
