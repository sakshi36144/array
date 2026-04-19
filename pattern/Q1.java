package pattern;
public class Q1{
    public static void main(String[] args){
      for(int i=0;i<=3;i++){
        for(int j=0;j<=6;j++){
            if((i+j==3)|| (i+j==5)||(i+j==7)||(i+j==9)||(i+j==11)){
                System.out.print("* ");
            } else {
                System.out.print(" ");
            }
              
        }
         System.out.println();
      }
    }
}
