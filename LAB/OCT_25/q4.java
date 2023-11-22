package OCT_25;
import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            try {
                arr[i] = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You entered invalid input");
                return;
            }
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum: " + sum);
    }
}

