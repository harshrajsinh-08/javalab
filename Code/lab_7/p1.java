package lab_7;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        sc.close();

        String[] words = sentence.split(" ");

        Map<String, Integer> wordfreq = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            if (wordfreq.containsKey(word)) {
                int count = wordfreq.get(word);
                wordfreq.put(word, count + 1);
            } else {
                wordfreq.put(word, 1);
            }
        }

        System.out.println("Word Frequencies");
        for (Map.Entry<String, Integer> entry : wordfreq.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
