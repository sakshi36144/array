package DSA;

import java.util.Scanner;

public class Arrays_2D {

	public static void inputAnArray(int arr[]) {

		System.out.println("Taking user input in an array..............");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter for arr[" + i + "]");
			arr[i] = sc.nextInt();

		}

		System.out.println("\n---------------------------------------");
	}

	public static void printAnArray(int arr[]) {

		System.out.println("Printing an array..............");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

		System.out.println("\n------------------------------------");

	}

	public static void sumOfAnArray(int arr[]) {

		System.out.println("Printing Sum of an array..............");

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		System.out.println("Sum of all integrs : " + sum);

		System.out.println("------------------------------------");

	}

	public static void main(String[] args) {

		int actualArr[][] = { { 2, 3, 5, 6, 303, 57 }, { 55 ,5, 57 }, { 2, 3, 5, 6, 33, 57 }, { 2, 3, 5, 6, 33, 57 },
				{ 2, 3, 5, 6, 33, 57 }, { 92, 3, 5, 6, 33, 57, 77, 77, 55 } };

//		System.out.println(actualArr[5][0]);
//		
		System.out.println(actualArr.length);
		System.out.println(actualArr[0].length);
		System.out.println(actualArr[1].length);
		System.out.println(actualArr[2].length);
		System.out.println(actualArr[3].length);
		System.out.println(actualArr[4].length);
		System.out.println(actualArr[5].length);
		
		
		System.out.println("==============================");

		for (int i = 0; i < actualArr.length; i++) {
			for (int j = 0; j < actualArr[i].length; j++) {
				System.out.print(actualArr[i][j] + "  ");
			}
			System.out.println();

		}

	}
}