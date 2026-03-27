package Array;

public class anonymousArray {
    public static void main(String[] args){
        // single dimensional array 
        //  anonymousArray.sum(new int[]{1,2,3,4,5});
        // duble dimensional array 
        anonymousArray. sum(new int[][]{{10, 20, 30},{40,50,60}});
    }
     static void sum(int[][] no){
        int total =0;
        // for(int i: no){
        //     total = total + i;
        // }
        //   System.out.println("sum of array is :" + total);
        for (int ii[]: no){
            for(int i: ii){
                total = total + i;
            }
        }
            System.out.println("sum of array is :" + total);
     }
    }

// one dimensional array 
    // sum of array is :15
// two dimensional array 
     // sum of array is :210   

