// WAP to reverse an SDA size 8.

import java.util.Scanner;

public class Q18 {

    public static void input(int arr[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void display(int arr[]) {
        for (int i : arr) {
            // System.out.print(i+" ");
        }
        System.out.println("\n------------------------------------");
    }

    public static void reverse(int arr[]) {

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");

        }
    }

    public static void main(String[] args) {
        int arr[] = new int[8];
        input(arr);

        display(arr);

        reverse(arr);

    }

}
