import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class anagrams_with_list {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("listen", "silent", "hello", "world", "act", "cat", "top", "pot");

        List<List<String>> anagramGroups = new ArrayList<>();

        for (int i = 0; i < wordList.size(); i++) {
            String word = wordList.get(i);
            boolean addedToGroup = false;

            for (int j = 0; j < anagramGroups.size(); j++) {
                List<String> group = anagramGroups.get(j);
                if (areAnagrams(group.get(0), word)) {
                    group.add(word);
                    addedToGroup = true;
                    break;
                }
            }

            if (!addedToGroup) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(word);
                anagramGroups.add(newGroup);
            }
        }

        System.out.println("Anagram groups in the list:");

        for (List<String> group : anagramGroups) {
            if (group.size() > 1) {
                System.out.println(group);
            }
        }
    }
}
