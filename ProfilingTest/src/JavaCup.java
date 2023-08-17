import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaCup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press number1: ");
        int i = scanner.nextInt();
        System.out.println("Press number2: ");
        int j = scanner.nextInt();
        System.out.println("Press number3: ");
        int k = scanner.nextInt();
        temp();
        eval(i, j, k);
    }

    public static void eval(int i, int j, int k) {
        if (i * i + j * j == k * k || i * i == j * j + k * k || j * j == i * i + k * k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void temp() {
        int[] a = new int[10000 * 20000];

        int value = 0;
        for (int i = 0; i < a.length; i++) {
            int group = i / 20000;
            a[i] = group + value++;
            value %= 20000;
        }
    }
}
