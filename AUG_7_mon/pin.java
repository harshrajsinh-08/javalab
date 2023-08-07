package AUG_7_mon;
import java.util.Scanner;

public class pin {
    public static boolean isPIN(String pin) {
        int length = pin.length();
        
        if (length != 4 && length != 6 && length != 8) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            if (Character.isDigit(pin.charAt(i)) == false) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a PIN: ");
        String pin = scanner.nextLine();

        if (isPIN(pin)) {
            System.out.println("Valid PIN");
        } else {
            System.out.println("Invalid PIN");
        }

        scanner.close();
    }
}