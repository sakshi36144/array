package loop;
import java.util.Scanner;
public class Q1{
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int c=a;
int rev=0;
for(;a!=0;a=a/10){
     int b= a%10;
    rev = rev*10 + b;
}
System.out.println(rev);
if (rev == c){
    System.out.println("palindrome");
}
else{
    System.out.println("not palindrome");
}
}

    }

