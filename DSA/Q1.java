package DSA;


public class Q1 {
    public static void main(String[] args){
        int arr[][]={{1,3,2,4},{2,5,6,7},{6,7,2,9},{2,1,3,1},{4,6,5,2,9},{1,1,1,1}};
        System.out.println(arr[0][1]);
        System.out.println(arr.length);
        System.out.println(arr[0].length);
          System.out.println(arr[1].length);
            System.out.println(arr[2].length);
             System.out.println(arr[3].length);
              System.out.println(arr[4].length);
               System.out.println(arr[5].length);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
