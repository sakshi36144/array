package polymorphism;
class A11{
    void m1(int no1){
     System.out.println("This is the method with one parameter:" +no1);
    }
    void m1(int no1, int no2){
     System.out.println("This is the method with two parameters:" +no1+ "," +no2);
    }
}
public class overloading {
    public static void main(String[] args){
        A11 obj = new A11();
        obj.m1(10);
        obj.m1(10, 20);
    }
}
