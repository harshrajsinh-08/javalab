import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char toremove = sc.nextLine().charAt(0);

        String newString = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar != toremove) {
                newString += currentChar;
            }
        }

        System.out.println("The given string is: " + input);
        System.out.println("After removing '" + toremove + "' the new string is: " + newString);
    }
}