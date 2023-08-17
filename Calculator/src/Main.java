import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(calculator.add(a, b));
        System.out.println(calculator.multiply(a, b));
        System.out.println(calculator.factorial(a));
    }
}
