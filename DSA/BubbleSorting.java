package DSA;

public class BubbleSorting {
    public static void main(String[] args){
        int [] arr= {11,9,2,12,8,7};
        int temp;
        for(int i=0;i<arr.length;i++){
             int flag =0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                 flag=1;
                } 
            } 
           
            if(flag==0){
                break;
                }}
                 for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
               }
       
    }
}

