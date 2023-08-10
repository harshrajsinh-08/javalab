import java.util.Arrays;
import java.util.Scanner;

public class q7 {
    
    static int factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }
    static int lexi(String str) {
        int rank = 1;
        int n = str.length();
        
        int[] count = new int[256];
        Arrays.fill(count, 0);
        
        for (int i = 0; i < n; i++) {
            count[str.charAt(i)]++;
        }
        
        for (int i = 1; i < 256; i++) {
            count[i] += count[i - 1];
        }
        
        int mul = factorial(n);
        
        for (int i = 0; i < n; i++) {
            mul /= (n - i);
            rank += count[str.charAt(i) - 1] * mul;
            
            for (int j = str.charAt(i); j < 256; j++) {
                count[j]--;
            }
        }
        
        return rank;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        int rank = lexi(str);
        System.out.println("The Lexicographic rank of the given string is: " + rank);
        
        scanner.close();
    }
}
