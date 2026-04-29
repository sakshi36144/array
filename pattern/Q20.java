package pattern;

public class Q20 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=9;j++){
                 if((i==1&&j<=9)||i==2&&j<8||i==3&&j<6||i==4&&j<5||i==5&&j==5){
                //    if(i<=5&&j+j==10){
                    System.out.print("*");
                }
                else {System.out.print(" ");}
            }
            System.out.println();
        }
    }
}
