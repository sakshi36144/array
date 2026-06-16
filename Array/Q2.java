package Array;

public class Q2 {
    public static void main(String[] args){
        int[] num = {2, 7, 11, 15};
        int target = 9;
        // int[] result = twoSum(num, target);
        for (int row = 0; row < num.length; row++) {
            for (int col = row + 1; col < num.length; col++) {
                if (num[row] + num[col] == target) {
                    System.out.println("Indices: " + row + ", " + col);
                
                }
            }
        }
    }
}
