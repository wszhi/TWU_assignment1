import java.util.Scanner;

public class printNAsterisksOnOneLine {
    private final static String asterisk = "*";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input n:");
        int n = sc.nextInt();
        while (n > 0) {
            System.out.print(asterisk);
            n--;
        }

    }
}
