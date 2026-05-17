package Methods;

import java.util.Scanner;

public class M10 {

    static int rev(int a){
        int b=0;
       while(a>0){
            int  rem=a%10;
             b = b * 10 + rem; 
             a=a/10;
    }
     return b ;
     }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        M10 m10=new M10();
        System.out.println(
            m10.rev(a)
        ); 
    }
   
}
