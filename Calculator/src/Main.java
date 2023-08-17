import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<BigInteger> answers = new ArrayList<>();
        answers.add(new BigInteger(String.valueOf("1")));
        for (int i = 1; i <= num; i++) {
            BigInteger answer = factorial(new BigInteger(String.valueOf(i)), answers.get(i - 1));
            answers.add(answer);
        }
    }

    public static BigInteger factorial(BigInteger n, BigInteger p) {
        BigInteger result = p;
        result = result.multiply(n);

        return result;
    }
}
