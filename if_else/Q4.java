package if_else;
import java.util.Scanner;
public class Q4 {
         public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the traingle sides:");
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            if(a>0&&b>0&&c>0&&a+b>c&&a+c>b&&b+c>a){
                System.out.println("valid triangle");
            }else{
                System.out.println("invalid triangle");
            }

         }
}
