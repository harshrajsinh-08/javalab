package AUG_9_wed;
import java.util.Scanner;

public class cases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        String result = checkCase(character);
        System.out.println("The character '" + character + "' is " + result + ".");
    }

    public static String checkCase(char character) {
        if (character >= 'a' && character <= 'z') {
            return "Lowercase";
        } else if (character >= 'A' && character <= 'Z') {
            return "Uppercase";
        } else {
            return "Not a letter";
        }
    }
}