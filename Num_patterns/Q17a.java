package Num_patterns;
public class Q17a {
    
    public static void main(String[] args){
        for (char row='E'; row>='A'; row--){                      
            for(char i='A'; i<=row; i++){
                 System.out.print(i + " ");
            }
          System.out.println(" ");
         }
    }
} 
