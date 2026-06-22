package DSA;

public class Search{
    public static void main(String[] args) {
        int [] arr= {10, 20 ,30 , 40, 50};
         int element=30;
         boolean found=false;
         for (int i=0; i<arr.length;i++){
            if(arr[i]==element){
                System.out.println("element is found ");
                found=true;
                break;
            }
         }
         if(found=false){
            System.out.println("element is not found ");
         }
    }
}
