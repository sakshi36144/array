package DSA;
public class SelectionSorting {
    public static void main(String [] args){
     int [] arr = {38,52,9,18,6,62,13};
         int m;int temp=0; 
     for(int i=0; i<arr.length;i++){
            m=i; 
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[m]){
              m=j;  
            }
        }
            temp=arr[i];
            arr[i]=arr[m];
            arr[m]= temp;
     } 
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");

        }
    }
}
