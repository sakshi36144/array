//WAP to find | Count even odd elements in SDA size 8.

import java.util.Scanner;

public class Q11{
    public static void input(int arr[]){
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
     }
    }
    
   public static void display(int arr[])
   {
          for(int i:arr){
            // System.out.print(i+" ");
          }
          System.out.println("\n------------------------------------");
    }
    public static void evenSquare(int arr[]){
        int evencount =0;
        int oddcount=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]%2==0){
             evencount++;
            //  System.out.println(evencount);
           }else{
               oddcount++;
                //  System.out.println(oddcount);
           }
         }
          System.out.println("Even Count = " + evencount);
    System.out.println("Odd Count = " + oddcount);
    }

    public static void main(String[] args){
 int arr[]=new int[8];
      input(arr);
    display(arr);
    evenSquare(arr);
  
    }

  } 

