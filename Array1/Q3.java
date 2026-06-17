//Q3.WAP to multiply all elements of SDA size 8.

import java.util.Scanner;
public class Q3 {
    public static void input(int arr[]){
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
       }
    }
    public static void display(int arr[]){
       for(int i:arr){
        System.out.print(i+" ");
       }
    }
    public static void multiply(int arr[]){
         int mul=1;
         for(int i:arr){
            mul=mul*i;
         }
         System.out.println("Product of all elements: " + mul);
    }
    public static void main(String[] args){
    
        int[] arr=new int[8];
        input(arr);
        display(arr);
        multiply(arr);
    }
}
