package AUG_9_wed;
import java.util.Scanner;

public class taken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int newn = incr(n);
        int t = (n / 1000 + 2) % 10;
        int h = ((n / 100) % 10 + 2) % 10;
        int tn = ((n / 10) % 10 + 2) % 10;
        int un = (n % 10 + 2) % 10;

        int newn= t * 1000 + h * 100 + tn * 10 + un;
        System.out.println(newn);
    }
}
