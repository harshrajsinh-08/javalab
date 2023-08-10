import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] frequency = new int[26];
         
        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                frequency[c - 'a']++;
            }
        }

        int maxFreq = -1;
        int secondMaxFreq = -1;
        char maxChar = ' ';
        char secondMaxChar = ' ';

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFreq) {
                secondMaxFreq = maxFreq;
                secondMaxChar = maxChar;
                maxFreq = frequency[i];
                maxChar = (char) ('a' + i);
            } 
            else if (frequency[i] > secondMaxFreq && frequency[i] < maxFreq) {
                secondMaxFreq = frequency[i];
                secondMaxChar = (char) ('a' + i);
            }
        }

        System.out.println("The second most frequent char in the string is: " + secondMaxChar);
    }
}