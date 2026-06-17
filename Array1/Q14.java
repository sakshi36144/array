// WAP to find |couunt an element in SDA size 8.



import java.util.Scanner;

public class Q14{
     static int K;
    public static void input(int arr[]){
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
     }
    }
     public static void  element (){
     Scanner sc=new Scanner(System.in);
       System.out.println("enter the your element");
         
           K =sc.nextInt();
    }
   public static void display(int arr[])
   {
          for(int i:arr){
            // System.out.print(i+" ");
          }
          System.out.println("\n------------------------------------");
    }
    public static void count(int arr[]){
       
         int count =0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]==K){
              count++;
             
           }
         }
          System.out.println(count);
         
    }

    public static void main(String[] args){
 int arr[]=new int[5];
      input(arr);
      
     display(arr);
     element();
     count(arr);
  
    }

  } 


