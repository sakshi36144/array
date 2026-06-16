class test1{
    String name;
    String address;
    static int id;
    static String course;
       public test1(){
        System.out.println("test2");
        System.out.println("test3 ");
    }
    {System.out.println("this is instance block2"); }
    {
        System.out.println("this is instance block4");}
        {System.out.println("this is instance block7");}
        {System.out.println("this is instance block1");}
        static{
            System.out.println("this is static 101");
        }
        {System.out.println("this is instance block");}
        static{
            System.out.println("this is static 102");
        }
        public void  m1() {
            System.out.println("this is m1 method");
        }
}
public class practice1 {
    public static void main(String[] args){
        test1 t1=new test1();
        t1.m1();
        {System.out.println("this is main1"); }
        {System.out.println("this is main2"); }
    }
}
