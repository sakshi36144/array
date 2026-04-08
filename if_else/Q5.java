package if_else;
import java.util.Scanner;;
public class Q5 {
    public static void main(String[] argss){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alp :");
        char alp = sc.next().charAt(0); 
        if(alp=='a' || alp=='e' || alp=='i' || alp=='o' || alp=='u' || alp=='A' || alp=='E' || alp=='I' || alp=='O' || alp=='U'){
            System.out.println("Vowel");
        }
        else if(alp>='a' && alp<='z' || alp>='A' && alp<='Z'){
            System.out.println("Consonant");
        }

    }
    
}
