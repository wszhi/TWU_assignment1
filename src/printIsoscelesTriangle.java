import java.util.Scanner;

public class printIsoscelesTriangle {
    private final static String asterisk = "*";
    private final static String space = " ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input n:");
        int n = sc.nextInt();
        for (int line=1;line<=n;line++) {
            int numberOfAsterisk=2*line-1;
            int numberOfSpace=n-line;
            while (numberOfSpace > 0){
                System.out.print(space);
                numberOfSpace--;
            }
            while (numberOfAsterisk >0) {
                System.out.print(asterisk);
                numberOfAsterisk--;
            }
            System.out.println();
        }
    }
}
