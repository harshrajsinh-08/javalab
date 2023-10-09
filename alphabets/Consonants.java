package alphabets;

public class Consonants {
    public static int countConsonants(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) == -1 && Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }
}
