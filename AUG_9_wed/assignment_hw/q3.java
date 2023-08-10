import java.util.Scanner;
public class q3 {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }

    public static String lpld(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        
        int maxl = 0;
        String longest = "";
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substr = s.substring(i, j);
                if (isPalindrome(substr) && substr.length() > maxl) {
                    maxl = substr.length();
                    longest = substr;
                }
            }
        }
        
        return longest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String longest = lpld(input);
        int length = longest.length();
        sc.close();        
        System.out.println("The given string is: " + input);
        System.out.println("The longest palindrome substring in the given string is: " + longest);
        System.out.println("The length of the palindromic substring is: " + length);
    }
}

