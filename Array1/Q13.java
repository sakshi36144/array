// WAP to replace even by 0 odd by 1 element in SDA size 5.

import java.util.Scanner;

public class Q13{
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
       
        for(int i=0;i<arr.length;i++){
           if(arr[i]%2==0){
              arr[i]=0;
              System.out.println(arr[i]);
           }else{
            arr[i]=1;
              System.out.println(arr[i]);
           }
         }
         
    }

    public static void main(String[] args){
 int arr[]=new int[5];
      input(arr);
    display(arr);
    evenSquare(arr);
  
    }

  } 


