package OCT_25;

import java.util.Scanner;

interface Number {
    int sq(int n); 
}

class A implements Number {
    @Override
    public int sq(int n) {
        return n * n;
    }
}

public class num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A a = new A();

        System.out.print("Enter a number: ");
        
        int number = sc.nextInt();
        int square = a.sq(number);
        System.out.println(square);
    }
}
