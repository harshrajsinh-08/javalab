package alphabets;
import java.util.Scanner;
import alphabets.Vowels;
import alphabets.Consonants;

public class trial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter some text to find the number of vowels and consonants");
        String text = sc.nextLine();

        int vowelCount = Vowels.countVowels(text);
        int consonantCount = Consonants.countConsonants(text);

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
