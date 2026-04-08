package loop_p;
import java.util.Scanner;

public class loopbasic {
    public static void main(String[] args) {
        // for(int i=19; i<=190; i++){if(i%19==0){System.out.println(i);}}
    //     // /print the table of 'n'n .here 'n' is a number which is given by user .
    //     Scanner sc = new Scanner(System.in);
    //  System.out.println("Enter the number :");
    //      int n = sc.nextInt();
        // for (int i=n; i<=n*10; i+=n){System.out.println(i);}



        // display this ap 1,3,5,7    upto 'n'terms  
        // for (int i=1; i<=n*2; i+=2)
        // for (int i=1; i<=n*2-1; i+=2){System.out.println(i);}/


        // display this ap 4,7,10,13    upto 'n'terms  
    //    /
        //   i<=4+(n-1)*3
        //  int a=0;
        // for(int i=0; i<=6; i++){
        //       a=a+i;
                
        // }
        // System.out.println(a);



        // for(int i=0; i<=15; i++){
        //       if (i%2==0)
        //          {
                    
        //             a=a+i;
        //       }        
        //  }
        //  System.out.println(a);
//       int   count = 0;

// for ( ; n != 0; n = n % 10) {
//     System.out.println(n);
    
//     count++;
// }
// System.out.println(count);

// }
// int num =123;
// int last = num%10;
// int swap = 0;
// for ( ; num>=10;num/=10){
//    int first = num/10;
//    System.out.println(first+ ""+ last);
// }
// swap = first;
//    first = last;
//    last= swap;
//    System.out.println( first + "" + last);
// }
// calculate sum of digits of a number 
int num =123;
int sum =0;


for ( ; num != 0; num /=10){
    int last = num%10;
    sum = sum + last;
  
    
   

    }
    System.out.println(sum);
}
}
