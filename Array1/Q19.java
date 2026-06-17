// WAP to reverse then display SDA size 8.
 

import java.util.Scanner;

public class Q19{
    
    public static void input(int arr[]){
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
     }
    }
    
   public static void display(int arr[])
   {
          for(int i:arr){
             System.out.print(i+" ");
          }
          System.out.println("\n------------------------------------");
    }
    public static void reverse(int arr[]){
       int a=0;
       int b= arr.length-1;
       while(a<b){
        int c=arr[a];
        arr[a]=arr[b];
        arr[b]=c;
        a++;
        b--;
       }
      
       
    }
    public static void main(String[] args){
 int arr[]=new int[8];
      input(arr);
      
     display(arr);
    
     reverse(arr);
      display(arr);
    }

  } 




   
