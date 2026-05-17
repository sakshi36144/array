package pattern;
public class Q21{
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {      // rows
            for (int j = i; j >= 1; j--) {  // reverse numbers
                System.out.print(j + " ");
            }
            System.out.println(); // next line
        }

    }
}