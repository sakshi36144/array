package if_else;

public class Q9 {
public static void main(String[] args) {
    int a = 10, b = 25, c = 7, d = 18;

int max = a;

if (b > max) {
    max = b;
}
if (c > max) {
    max = c;
}
if (d > max) {
    max = d;
}

System.out.println("Maximum = " + max);
}
}
