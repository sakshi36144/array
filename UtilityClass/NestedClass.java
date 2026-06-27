package UtilityClass;
// Non -Static Nested Class ---->Topic

class outer{
   String name="vinay";
   static String compName ="HCL";
     
   public void instanceMethod(){
    System.out.println(name);
    System.out.println(compName);
   }

   public static void staticMethod(){
    // System.out.println(name);
    System.out.println(compName);
   }


class Inner{
    int id= 33;
    static float salary= 5555f;

    public void instanceMethod2(){
    System.out.println(name);
    System.out.println(compName);
    System.out.println(id);
    System.out.println(salary);
   }

   public static void staticMethod2(){
    // System.out.println(name);
    System.out.println(compName);
    // System.out.println(id);
    System.out.println(salary);

   }
    
}
}
public class NestedClass {
    public static void main(String[] args){
        System.out.println(outer.compName);
        outer.staticMethod();


        outer Outer=new outer();
         Outer.instanceMethod();
        outer.Inner inner=Outer.new Inner();
    }
}
