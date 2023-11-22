package AUG_7_mon;
import java.util.Scanner;

public class strobo {
    public static boolean isStrob(String num) {
        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {
            char leftChar = num.charAt(left);
            char rightChar = num.charAt(right);

            if ((leftChar == '0' && rightChar == '0') || 
                (leftChar == '1' && rightChar == '1') || 
                (leftChar == '8' && rightChar == '8') || 
                (leftChar == '6' && rightChar == '9') || 
                (leftChar == '9' && rightChar == '6')) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        if (isStrob(num)) {
            System.out.println(num + " is Strobogrammatic.");
        } else {
            System.out.println(num + " is not Strobogrammatic.");
        }
    }
}

