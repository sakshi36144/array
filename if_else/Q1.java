package if_else;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args)
    {
          Scanner sc = new Scanner(System.in);
     System.out.println("Enter the month :");
        int n = sc.nextInt();
         System.out.println("Enter the year:");
        int year = sc.nextInt();
        if(n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12){
            System.out.println("31 days");
        }
        else if(n==2){
            System.out.println("28 or 29 days");
            if (year%4==0) {
                System.out.println("It's a leap year.");
            }
            else{
                System.out.println("It's not a leap year."); 
            }
        }
        else if(n==4 || n==6 || n==9 || n==11){
            System.out.println("30 days");
        }
        else{
            System.out.println("Invalid month");
        }
    }
    
}
