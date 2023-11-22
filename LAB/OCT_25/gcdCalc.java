package OCT_25;

import java.util.Scanner;

interface GCD {
    public int findGCD(int n1, int n2);
}
class B implements GCD {
    public int findGCD(int n1, int n2) {

        if (n2 == 0) {
            return n1;
        }
        return findGCD(n2, n2 % n1);

    }
}

public class gcdCalc {
    public static void main(String[] args) {
        B a = new B();
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        System.out.print(a.findGCD(p1, p2));
    }
}