import java.util.Scanner;

public class printACenteredDiamond {
    private final static String asterisk = "*";
    private final static String space = " ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input n:");
        int n = sc.nextInt();
        for (int line = 1; line <= n; line++) {
            drawLine(n, line);
        }
        for (int line = n - 1; line > 0; line--) {
            drawLine(n, line);
        }
    }

    public static void drawLine(int totalLine, int line) {
        int numberOfAsterisk = 2 * line - 1;
        int numberOfSpace = totalLine - line;
        while (numberOfSpace > 0) {
            System.out.print(space);
            numberOfSpace--;
        }
        while (numberOfAsterisk > 0) {
            System.out.print(asterisk);
            numberOfAsterisk--;
        }
        System.out.println();
    }
}
