package alphabets;
public class Vowels {
    public static int countVowels(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
