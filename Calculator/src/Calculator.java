public class Calculator {
    public Calculator() {
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int  b) {
        return a * b;
    }

    public int factorial(int a) {
        if (a == 0) {
            return 1;
        }
        else {
            return a * this.factorial(a - 1);
        }
    }
}
