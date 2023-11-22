package OCT_11_wed;

import java.util.Scanner;

public class arith {
    public static int div(int denominator, int numerator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numerator :");
        int numerator = sc.nextInt();
        System.out.print("Denominator: ");
        int denominator = sc.nextInt();

        try {
            int ans = div(denominator, numerator);
            System.out.println("Result: " + ans);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by zero is infinite");
        }
    }

}
