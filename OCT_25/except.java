package OCT_25;

import java.util.Scanner;

public class except {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int numerator = sc.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = sc.nextInt();

        try {
            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero.");
        }
    }

    public static int divide(int numerator, int denominator) {
        if (numerator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return numerator / denominator;
    }
}

