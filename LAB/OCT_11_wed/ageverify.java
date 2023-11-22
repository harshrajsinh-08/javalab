package OCT_11_wed;
import java.util.Scanner;

public class ageverify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {

            elgib(age);
            System.out.println("You can vote and drive\nDon't give votes randomly,use your vote wisely");
        } catch (Exception e) {
            System.err.println("You are not eligible to vote or drive \nbecause you are younger than 18.");
        }
    }

    public static void elgib(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age is less than 18");
        }
    }
}
