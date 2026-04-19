package  pattern;

public class Q17{
    public static void main(String[] args){
        for(int i=0;i<=10;i++){
            
                if(i==1||i==10){

                System.out.print(5);
            }else if(i==2||i==9){
               System.out.print(1);
            }else if(i==3||i==8){
               System.out.print(4);
        }else if(i==4||i==7){
             System.out.print(2);
        }
        else {
             System.out.print(3);
        }
              
        System.out.println();
    }
}
}