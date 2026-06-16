package polymorphism;
        // question 1:can we overload the main method in java? if yes, then how?
// answer: yes, we can overload the main method in java. we can create multiple main
// methods with different parameter lists. the main method with the signature public
//  static void main(String[] args) will be the entry point of the program, and the 
// other main methods can be called from it or from other methods in the program.
class as{
     void As(){
        System.out.println("This is the main method with no parameters");
    }
}
public class InterviewOverloading {
    public static void main(String[] args) {
      System.out.println("This is the main method with String array parameter");  
      as obj = new as();
      obj.As();
    //  InterviewOverloading.main();
    }
    public static void main(int[] args){
        System.out.println("This is the main method with int array parameter");


    }
}