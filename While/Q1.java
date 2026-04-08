package While;

import java.util.Scanner;


public class Q1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System .in);
        int a = sc.nextInt();
        int rev =0;
        while(a>0){
            int b= a%10;
            rev= rev*10+b;
            a=a/10;
        }
        System.out.println(rev);
    }
}