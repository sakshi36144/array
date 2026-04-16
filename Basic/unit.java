import java.util.Scanner;

public class unit {
    public static void main(String[] args){ 
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if(n<=100){System.out.println(n*2);}
        else if(n>100 && n<=200){System.out.println((100*2)+((n-100)*5));}
        else if(n>200 && n<=300){System.out.println((100*2)+(100*5)+((n-200)*7));}
        else if(n>300 && n<=400){System.out.println((100*2)+(100*5)+(100*7)+((n-300)*10));}
        else if(n>400 && n<=500){System.out.println((100*2)+(100*5)+(100*7)+(100*10)+((n-400)*12));}
        else if(n>500){System.out.println((100*2)+(100*5)+(100*7)+(100*10)+(100*12)+((n-500)*15));}
         else{System.out.println("invalid input");}
    }
} 