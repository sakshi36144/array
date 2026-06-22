package DSA;

public class Delection {
    public static void main(String[] args){
         int[] arr = { 1, 2, 3, 4, 5 };
      int idx=2;
     int[] delection= new int[arr.length-1];
        //   copy paste the elements for old array 
        for(int i=0;i<idx;i++){
            delection[i]=arr[i];
            // System.out.println(insertion[i]);
        }
        // insert provided element
        
     // Copy remaining elements
        for(int i=idx+1;i<arr.length;i++){
            delection[i-1]=arr[i];
        }
    //   traversal
    for(int no: delection){
        System.out.println(no +" ");
    }
    }
}
