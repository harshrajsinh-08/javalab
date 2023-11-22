import java.util.Scanner;

public class fact {
    public static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
    
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = factorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }

        scanner.close();
    }
}
