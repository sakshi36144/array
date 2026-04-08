// Write a C program to input angles of a triangle and check whether triangle is valid or not.

package if_else;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter the angles of triangle :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>0&&b>0&&c>0&&a+b+c==180){
            System.out.println("valid triangle");
        }
        else{
            System.out.println("invalid triangle");
        }
    }
}
