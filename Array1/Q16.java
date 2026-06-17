//WAP to change the search elements size 8.
import java.util.Scanner;

public class Q16{
     static int K;
     static  int newelement;
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
    public static void  newElement (){
     Scanner sc=new Scanner(System.in);
       System.out.println("enter the your element");
         
           newelement =sc.nextInt();
    }
   public static void display(int arr[])
   {
          for(int i:arr){
            // System.out.print(i+" ");
          }
          System.out.println("\n------------------------------------");
    }
    public static void change(int arr[]){
       
      
        for(int i=0;i<arr.length;i++){
           if(arr[i]==K){
              arr[i]=newelement;
             
           }
           System.out.println(arr[i]);
         }
          
         
    }

    public static void main(String[] args){
 int arr[]=new int[8];
      input(arr);
      
     display(arr);
     element();
     newElement();
     change(arr);
  
    }

  } 




