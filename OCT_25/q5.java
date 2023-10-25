package OCT_25;
import java.util.InputMismatchException;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        try {
            for (int i = 0; i < size; i++) {
                System.out.print("Enter an integer value for element " + i + ": ");
                array[i] = sc.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException caught: Invalid input.");
            return;
        }

        for (int i = 0; i < size; i++) {
            try {
                int result = performDivision(array[i], i);
                System.out.println("Result of division for element " + i + ": " + result);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught: Division by zero.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException caught: Index out of bounds.");
            } catch (NullPointerException e) {
                System.out.println("NullPointerException caught: Null element in the array.");
            }
        }
    }

    public static int performDivision(int value, int index) {
        if (index == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return value / index;
    }
}
