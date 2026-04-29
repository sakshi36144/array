package Num_patterns;

public class Q12 {
     public static void main(String[] args){
         for(int i=1;i<=5;i++){
            for (var j=1;j<=5;j++)
                {
                      if(j==1){System.out.print(i);}
                      else if(j==2){System.out.print(i+1);}
                       else if(j==3){System.out.print(i+2);}
                     else if(j==4){System.out.print(i+3);}
                       else{System.out.print(i+4);}
                    System.out.print(" ");
                   
            }
             System.out.println(" ");
        }
       
    }
}

