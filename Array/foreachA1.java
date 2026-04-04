package Array;
public class foreachA1 {
    public static void main(String[] args){
        // int[] a = {1,2,3,4,5};
        // for(int i: a){
        //     System.out.print(i + " ");
        //     // 1 2 3 4 5 
        // }
        int[][]  a = {{1,2,3},{4,5,6},{7,8,9}};
        for(int[] ii: a){
            for(int i: ii){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        // 1 2 3
        // 4 5 6
        // 7 8 9

    }
}