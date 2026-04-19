package pattern;

public class Q12{
    public static void main(String[] args){
        for(int i=0;i<=4;i++){
            for( int j=0;j<=8;j++){
              if(i+j==4||i+j==8||i==0&&j==5||i==0&&j==6||i==0&&j==7||i==4&&j==1||i==4&&j==2||i==4&&j==3){
                  System.out.print("*");}
               else{
                System.out.print(" ");
            }}
            System.out.println();  
    }
           
        }
        
    }

