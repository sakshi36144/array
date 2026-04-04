package loop;
import java.util.Scanner;

public class q_bonus {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
     System.out.println("Enter the service :");
         int s = sc.nextInt();
 System.out.println("Enter the salary :");
 int sal = sc.nextInt();
  if(s>5){
    int bonus = (sal*5)/100;
    System.out.println( bonus);
  }
  else{
    System.out.println("no bonus");
  }
    }
}
