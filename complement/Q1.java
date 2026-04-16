package complement;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String binary = sc.nextLine();
        String result = "";
        for(int i=0;i<binary.length();i++){
            char ch =binary.charAt(i);
            if (ch=='0'){result=result+'1';}
            else if(ch=='1'){result=result+'0';}
            else {System.out.println("this is invalid input");}
        }
         System.out.println("one's complement "+ result);
    }
   
    
}
