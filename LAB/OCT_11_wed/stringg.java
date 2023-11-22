package OCT_11_wed;
import java.util.Scanner;

public class stringg {

    public static void vowchck(String inp) throws NoVowelsException {
        if (!hasvow(inp)) {
            throw new NoVowelsException();
        }
    }

    public static boolean hasvow(String str) {
        str = str.toLowerCase();
        return str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String inp = sc.nextLine();
            vowchck(inp);
            System.out.println("The string has vowels.");
        } catch (NoVowelsException e) {
            System.err.println("No vowels found in the string.");
        }
    }

}

class NoVowelsException extends Exception {
    public NoVowelsException() {
        super("No vowels found in the string.");
    }
}
