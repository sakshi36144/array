package Switch;
import java.util.Scanner;

public class alp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day:");
        String day = sc.nextLine();

        switch (day) {
            case "Monday":
                System.out.println("Start of week");
                break;

            case "Friday":
                System.out.println("Weekend coming");
                break;

            case "Sunday":
                System.out.println("Holiday");
                break;

            default:
                System.out.println("Normal day");
        }
    }
}