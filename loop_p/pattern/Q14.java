package loop_p.pattern;

public class Q14 {
    public static void main(String[] args){
        for(int i=0;i<=12;i++){
            for(int j=0;j<=12;j++){

                if(i==6 && j==6){
                    System.out.print("G");
                }
                else if(i==6&&j==5 || i==5&&j==6 || i==7&&j==6 || i==6&&j==7){
                    System.out.print("F");
                }
                else if(i<=4&&j<=5 || 7<=i&&9<=j || 9<=i&&7<=j || i==5&&j==3){
                    System.out.print(" ");
                }
                else if(j-i==2 || i-j==2 || i==5&&j==5 || i==7&&j==7){
                    System.out.print("E");
                }
                else if(i<=4&&j<=5 || 7<=i&&9<=j || 9<=i&&7<=j || i==5&&j==3){
                    System.out.print(" ");
                }
                else if(i+j==9 || j-i==3 || i+j==15 || i-j==3){
                    System.out.print("D");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}