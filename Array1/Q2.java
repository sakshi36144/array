//Q2.WAP to add all elements of SDA size 8.
import java.util.Scanner;
public class Q2 {
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
    }
   
    public static void add(int arr[])
   {
            int b=0;
          for(int i:arr){
          b=i+arr[i];
          }
          System.out.println("Sum of all elements :"+b);
          
    }
    public static void main(String [] args){
       int arr[]=new int[8];
       input(arr);
       display(arr);
       add(arr);
    }
}
