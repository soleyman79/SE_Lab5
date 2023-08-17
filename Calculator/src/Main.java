public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 50;
        int b = 12;
        System.out.println(calculator.add(a, b));
        System.out.println(calculator.multiply(a, b));
        System.out.println(calculator.factorial(a));
    }
}
