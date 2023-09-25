import java.util.Scanner;
public class q5 {

    public static void perm(String str, int length) {
        int n = str.length();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (length == 1) {
                        System.out.println(str.charAt(i));
                    } else if (length == 2) {
                        System.out.println("" + str.charAt(i) + str.charAt(j));
                    } else if (length == 3) {
                        System.out.println("" + str.charAt(i) + str.charAt(j) + str.charAt(k));
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next().toUpperCase();
        int length = 3;

        System.out.println("The permuted strings are:");
        perm(input, length);
    }
}
