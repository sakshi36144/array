package if_else;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the operation (1-add, 2-subtract, 3-multiply, 4-divide,5-mod ,6-power,7-square root, 8-cube root ):");
             int op= sc.nextInt();
            System.out.println("enter the two number:");
            int a= sc.nextInt();
             int b= sc.nextInt();
             if(op==1){
                System.out.println("result: "+(a+b));
             }else if(op==2){
                 System.out.println("result: "+(a-b));
             }else if(op==3){
                 System.out.println("result: "+(a*b));
             }else if(op==4){
                System.out.println("result: "+(a/b));
               }else if(op==5){
                 System.out.println("result: "+(a%b));
                  }else if(op==6){
                 System.out.println("result: "+Math.pow(a,b));
                }else if(op==7){
                    System.out.println("result: "+Math.sqrt(a));
                    System.out.println("result: "+Math.sqrt(b));
                }else if(op==8){
                 System.out.println("result: "+Math.cbrt(a));
                  System.out.println("result: "+Math.cbrt(b));
                }

             
             else{
                System.out.println("invalid input");
     }
           
    } 
}

