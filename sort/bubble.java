public class bubble {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

       // bubbleSort(arr);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
// bubble sort defination
// Bubble Sort is a simple algorithm that repeatedly compares adjacent elements and swaps them if they are in the wrong order. You can easily adapt it to sort arrays in ascending or descending order by changing the comparison condition