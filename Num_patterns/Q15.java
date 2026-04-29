package Num_patterns;

public class Q15 {
     public static void main(String[] args){
        
         for(int i=1;i<=5;i++){
            for (int j=1;j<=5;j++)
                {
                    if(i==1&&j==1){ System.out.print(1);}
                     else if(i+j==3){ System.out.print(2);}
                     else if(i+j==4){ System.out.print(3);}
                      else if(i+j==5){ System.out.print(4);}
                      else{  System.out.print(5);}
            }
             System.out.println(" ");
        }
       
    }
}

