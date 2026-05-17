package Methods;
import java.util.Scanner;

public class M11 {

    static void rev(int a){
          int or = a;
        int b=0;
while(a>0){
           int  rem=a%10;
             b = b * 10 + rem; 
             a=a/10;
              
    }
     System.out.print(b + " ");
     palin(or, b);
     }
     static void palin(int or,int b){
        if(or==b){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
      
       }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
         rev(a);
            }

   
}
