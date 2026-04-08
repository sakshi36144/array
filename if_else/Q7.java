package if_else;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the elec unit :");
        int un = sc.nextInt();
        double am;
        double total;
        if(un == 50){
            am = (un*0.50);
        }else if(un<=150){
            am= ((50*0.50)+(un-50 * 0.70));
        }else if(un<=250){
            am= ((100*0.70)+(50*0.50)-(un-100*1.20));
        }
        else{
            am= ((100*0.70)+(50*0.50)+(100*1.20)-(un-250*1.50));
        }
        total = am+(am *0.2);
        System.out.println(total); 

    }
}
