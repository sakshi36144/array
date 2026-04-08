package Switch;
import java.util.Scanner;
public class Q3 {
    // even or odd
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a%2==0?0:1){
            case 0:
                System.out.println("even");
                break;
                case 1:
                    System.out.println("odd");
                    break;
        }
        
    }
    
}
