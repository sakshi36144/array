
import java.util.Scanner;
public class cal_70_pen{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number :");
        int n = sc.nextInt();
        int total = n*70;
        if(total>1000){
            int discount = total*20/100;
             System.out.println( "Total price is : " + (total-discount));
           
        }
          else{
            int discount = total*10/100;
             System.out.println( "Total price is : " + (total-discount));

          }

    }
}