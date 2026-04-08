// Write a C program to count total number of notes in given amount.

package if_else;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
     System.out.println("Enter the month :");
        int n = sc.nextInt();
        int a,b, c, d,e;

        if(n>0){
             a =n/2000;
            b = n/500;
            c= n/200;
            d=n/100;
            e=n/50;
             System.out.println("2000 notes : " + a);
            System.out.println("500 notes : " + b);
            System.out.println("200 notes : " + c);
            System.out.println("100 notes : " + d);
            System.out.println("50 notes : " + e);
            

        }
    }
}
