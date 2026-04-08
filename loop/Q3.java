package loop;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
// if (a%2==0||a%3==0 ||a%5==0 ||a%7==0){
//     System.out.println("not prime");
// }
// else{
//     System.out.println(" prime");
    
// }
// for (int i=2; i<a; i++){
//     if (a%i==0){
//         System.out.println("not prime");
//     }

// } 
//     System.out.println("prime");
int[] freq = new int[10];
while (a>0){
    int b=a%10;
     freq[b]++;
    a=a/10;
}}}
    

