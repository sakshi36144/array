// WAP to display square of all elements of an array of size 8.
import java.util.Scanner;

public class Q4 {
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
          System.out.println("------------------------------------");
    }
    public static void square(int arr[]){
         for(int i:arr){
            System.out.println(arr[i]*arr[i] + " ");
         }
    }
   
    public static void main(String[] args){
 int arr[]=new int[8];
input(arr);
display(arr);
square(arr);
    }
}
