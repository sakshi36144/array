package DSA;

public class Insertion {

    public static void main(String[] args){
        // create  array
    int[] arr = { 1, 2, 3, 4, 5 };
      int idx=2;
      int value =7;
    //   create new array
     int[] insertion= new int[arr.length+1];
        //   copy paste the elements for old array 
        for(int i=0;i<idx;i++){
            insertion[i]=arr[i];
            // System.out.println(insertion[i]);
        }
        // insert provided element
        insertion[idx]=value;
     // Copy remaining elements
        for(int i=idx;i<arr.length;i++){
            insertion[i+1]=arr[i];
        }
    //   traversal
    for(int no: insertion){
        System.out.println(no +" ");
    }

}                             
}
    

