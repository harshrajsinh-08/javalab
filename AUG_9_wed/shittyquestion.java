package AUG_9_wed;

import java.util.Scanner;
//Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.
public class shittyquestion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = n +8;
        res = res/3;
        res = res%5;
        res = res*5;
        System.out.println(res);

    }
}