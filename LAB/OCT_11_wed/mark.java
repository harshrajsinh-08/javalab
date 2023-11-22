package OCT_11_wed;
import java.util.Scanner;

public class mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter number: ");
            int mark = sc.nextInt();
            vermrk(mark);
        } catch (Myexcpt e) {
            System.err.println("Exception: " + e);
        }
    }

    public static void vermrk(int mark) throws Myexcpt {
        if (mark < 0) {
            throw new Myexcpt("Mark is Negative");
        } else {
            throw new Myexcpt("Mark is Positive");
        }
    }

    public static class Myexcpt extends Exception {
        public Myexcpt(String message) {
            super(message);
        }
    }
}
