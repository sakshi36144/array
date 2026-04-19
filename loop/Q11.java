package loop;

import java.util.Scanner;

public class Q11{
   
    public static void main(String[] args){
//   int n= 2;
     

// for(int i=1;i<=10;i++){
//       System.out.println(i*n);
// }
   Scanner sc= new Scanner(System.in);
    int  n=sc.nextInt();
    int i=sc.nextInt();
    int k=1;
    for(int j=1;j<=i;j++){
        k=k*n;
    }
     System.out.println(k);
    }
}

    

