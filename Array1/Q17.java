// WAP to find prime no in SDA elements size 8.

import java.util.Scanner;

public class Q17 {

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

    public static void primeNo(int arr[]) {

        // prime no logic
        int primeCount = 0;
        for (int i = 0; i < arr.length; i++) {

        }
    }

    public static void main(String[] args) {
        int arr[] = new int[8];
        input(arr);

        display(arr);

        primeNo(arr);

    }

}
