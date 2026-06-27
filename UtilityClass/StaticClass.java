package UtilityClass;
// Static Nested Class ---->Topic

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


  static class Inner{
    int id= 33;
    static float salary= 5555f;

    public void instanceMethod2(){
    // System.out.println(name);
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
public class StaticClass{
    public static void main(String[] args){
     
        outer.Inner inner= new outer.Inner();
        inner.instanceMethod2();
    }
}
//  Get-ChildItem -Recurse *.class | Remove-Item
// javac UtilityClass\StaticClass.java
// java UtilityClass.StaticClass