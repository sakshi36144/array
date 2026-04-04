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
// anonymous array defination
    //   anonymous array is an array that is created without a reference variable .
    // It is used when we want to pass an array as an argument to a method without creating a separate variable for it . 
    // it can be used only once and cannot be reused .
