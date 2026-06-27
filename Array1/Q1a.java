// WAP to input and display elements of and array of size 15.
import java.util.Scanner;

public class Q1a {


       public static void inputArr(int arr[]) {
        Scanner sc=new Scanner(System.in);
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
    }


    public static void displayArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    } 
    


    public static void main(String[] args) {
        int[] arr = new int[15];
        inputArr(arr);
        displayArr(arr);
    }
}