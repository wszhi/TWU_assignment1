import java.util.ArrayList;
import java.util.List;

public class primeFactorsExercise {

    public static List<Integer> primeList = new ArrayList();

    public static void main(String[] args) {
        generate(30);
        if (primeList.size() > 0) {
            for (int prime : primeList) {
                System.out.print(prime + " ");
            }
        } else {
            System.out.print("Prime List is empty.");
        }
    }

    public static void generate(int n) {
        calculate(n, 2);
    }

    public static void calculate(int n, int prime) {
        if (n / prime == 0)
            return;
        if (n % prime == 0) {
            primeList.add(prime);
            if (n / prime == 1) {
                return;
            }
            calculate(n / prime, 2);
        } else {
            calculate(n, prime + 1);
        }
    }
}
