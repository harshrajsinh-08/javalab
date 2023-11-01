package OCT_25;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter " + size + " integers for the array:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < size; i++) {
                try {
                    if (i == 0) {
                        int result = arr[i] / i;
                        System.out.println("Result at index " + i + ": " + result);
                    } else {
                        int result = arr[i] / i;
                        System.out.println("Result at index " + i + ": " + result);
                    }
                } catch (ArithmeticException e) {
                    System.err.println("ArithmeticException: Division by 0 at index " + i);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println("ArrayIndexOutOfBoundsException: Index " + i + " is out of bounds.");
                }
            }
        } catch (java.util.InputMismatchException e) {
            System.err.println("InputMismatchException: Please enter valid integers.");
        }
    }
}
