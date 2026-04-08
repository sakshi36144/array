package While;

import java.util.Scanner;


public class Q2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System .in);
        int a = sc.nextInt();
        // int c = sc.nextInt();
        // int rev =0;
        // while(a>0){
        //     int b= a%10;
        //     rev= rev*10+b;
        //     a=a/10;
        // }
        // System.out.println(rev);
        
            switch(a){
                case 0:
                System.out.print("zero");
                break;
                case 1:
                System.out.print("one"); break;
                case 2:
            System.out.print("two");
            break;
            case 3:
            System.out.print("three"); break;
            case 4:
            System.out.print("four"); break;
            case 5:
            System.out.print("five"); break;
            case 6:
            System.out.print("six"); break;
            case 7:
            System.out.print("seven"); break;
            case 8:
            System.out.print("eight"); break;
            case 9:
            System.out.print("nine"); break;

        }
    }
}
