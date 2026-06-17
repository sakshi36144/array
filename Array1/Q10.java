// WAP to multiply even by 2 and odd by 3 in SDA size 8.



import java.util.Scanner;

public class Q10{
    public static void input(int arr[]){
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
     }
    }
    
   public static void display(int arr[])
   {
          for(int i:arr){
            System.out.print(i+" ");
          }
          System.out.println("\n------------------------------------");
    }
    public static void evenSquare(int arr[]){
        for(int i=0;i<arr.length;i++){
           if(arr[i]%2==0){
             System.out.println(arr[i]=arr[i]*2);
           }else{
               System.out.println(arr[i]=arr[i]*3);
           }
         }
    }

    public static void main(String[] args){
 int arr[]=new int[8];
      input(arr);
    display(arr);
    evenSquare(arr);
    }

  } 

