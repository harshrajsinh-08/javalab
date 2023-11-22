package OCT_11_wed;
import java.util.*;

public class dupes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers, separated by spaces:");

        try {
            for (int i = 0; i < size; i++) {
                int num = sc.nextInt();
                numbers[i] = num;

                for (int j = 0; j < i; j++) {
                    if (numbers[j] == num) {
                        throw new DuplicateNumberException(num);
                    }
                }
            }

            System.out.println("No duplicates found. Numbers entered: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }
        catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter valid integers.");
        } 
        catch (DuplicateNumberException e) {
            System.err.println("Duplicate number found: " + e.getDuplicateNumber());
        }
    }
}

class DuplicateNumberException extends Exception {
    public int duplicateNumber;

    public DuplicateNumberException(int num) {
        this.duplicateNumber = num;
    }

    public int getDuplicateNumber() {
        return duplicateNumber;
    }
}