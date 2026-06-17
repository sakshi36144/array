// WAP to multiply all elements even position of SDA size 8.
import java.util.Scanner;

public class Q6{
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
    public static void evenposition(int arr[]){
        for(int i=0;i<arr.length;i++){
           if(i%2!=0){
            System.out.println(arr[i]);
           }
         }
    }

    public static void main(String[] args){
    int arr[]=new int[8];
    input(arr);
    display(arr);
    evenposition(arr);
    }

  }