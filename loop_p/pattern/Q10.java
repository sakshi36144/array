package loop_p.pattern;

public class Q10{
    public static void main(String[] args){
        for(int i=0;i<=6;i++){
            for( int j=0;j<=6;j++){
              if(j==0&&i<=3||j==3&&i<=6||i==3&&j<=6||i==6&&j<=3||j==6&&i>=3||i==0&&j>=3){
                  System.out.print("*");}
               else{
                System.out.print(" ");
            }}
            System.out.println();  
    }
           
        }
        
    }

