package if_else;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        float a= sc.nextFloat();
        float b=sc.nextFloat();
        float c= a/1000;
        float d= b/1000;
        if (c==d){System.out.println(" they are the same up to three decimal places. ");}
        else{ System.out.println("they are differnt ");}
        

    }
}
