package pattern;

public class Q16 {
    public static void main(String[] args) {
        for (int i = 0; i <= 12; i++) {
            for (int j = 0; j <= 12; j++) {
                if (Math.abs(i - 6) + Math.abs(j - 6) > 6) {
                    System.out.print(" ");

                } else if (i == 6 && j == 6) {
                    System.out.print("G");
                } else if (i == 6 && j == 5 || i == 5 && j == 6 || i == 7 && j == 6 || i == 6 && j == 7) {
                    System.out.print("F");
                } else if (j - i == 2 || i - j == 2 || i == 5 && j == 5 || i == 7 && j == 7) {
                    System.out.print("E");
                } else if (i + j == 9 || j - i == 3 || i - j == 3 || i + j == 15) {
                    System.out.print("D");
                }
                // 👉 NEW CONDITIONS (C, B, A)
                else if (i + j == 8 || i + j == 16 || j - i == 4 || i - j == 4) {
                    System.out.print("C");
                } else if (i + j == 7 || i + j == 17 || j - i == 5 || i - j == 5) {
                    System.out.print("B");
                } else if (i + j == 6 || i + j == 18 || j - i == 6 || i - j == 6) {
                    System.out.print("A");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}