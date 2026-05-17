package Methods;
import java.util.Scanner;

public class M9 {

    static void rev(int a){
while(a>0){
            int b=a%10;
             a=a/10;
            System.out.print(b + " ");
    }
     }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        rev(a);
    }
   
}
