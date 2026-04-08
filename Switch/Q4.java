package Switch;
import java.util.Scanner;
import java .util.Scanner;
public class Q4{

    public static void main(String[] args){
     Scanner sc  = new Scanner(System.in);
     int a = sc.nextInt();
     switch(a>0?0:a<0?1:2){
        case 0:
            System.out.println("positive");
            break;
            case 1:
                System.out.println("negative");
                break;
                case 2:
                    System.out.println("zero");
                    break;

     }
}
    
}