package UtilityClass;

interface  carrr{

   
    public abstract void start();
    public abstract void stop();
    public abstract void run();
    public abstract void device();
}

public class interface1{
    String outerStr ="Hello";
    static String outerstr2="hello";
public void m1(){
    String localvar="hellllllll0";

    carrr c1=new carrr(){
    @Override
    public void start(){
        System.out.println("BMW.start()");
         System.out.println(outerStr);
          System.out.println(outerstr2);
           System.out.println(localvar);
    }
     @Override
    public void stop(){
        System.out.println("BMW.stop()");
    }
     @Override
    public void run(){
        System.out.println("BMW.run()");
    }
     @Override
    public void device(){
        System.out.println("BMW.device()");
}};
    
           c1.start();
           c1.stop();
           c1.run();
           c1.device();


                  }
    public static void main(String[] args){
        interface1 m = new interface1();
        m.m1();
        System.out.println("this is local class");
         
    }
}
 