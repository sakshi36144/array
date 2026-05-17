package Methods;
import java.util.Scanner;

public class M12 {

    static int rev(int a){
          int or = a;
          int b=0;
          while(a>0){
           int  rem=a%10;
             b = b * 10 + rem; 
             a=a/10;
              
    }
     System.out.println(palin(or, b));
        return b ;
       
     
     }
     static String palin(int or,int b){
        if(or==b){
            return "Palindrome";
        }
        else{
            return "Not Palindrome" ;
      
       }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
         System.out.println(rev(a));
            }

   
        }
