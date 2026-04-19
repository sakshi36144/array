package pattern;

public class Q9{
    public static void main(String[] args){
        for(int i=0;i<=5;i++){
            for( int j=0;j<=6;j++){
              if(i-j==2||i+j==8||i+j==1||j-i==5||i==0&&j==2||i==1&&j==3||i==0&&j==4){
                  System.out.print("*");}
               else{
                System.out.print(" ");
            }}
            System.out.println();  
    }
           
        }
        
    }

