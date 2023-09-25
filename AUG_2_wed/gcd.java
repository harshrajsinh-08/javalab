package AUG_2_wed;

import java.util.Scanner;
public class gcd{
    public static int find(int a,int b){
        if(b == 0){
            return a;
        }
        else{
            return find(b,a%b);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = find(a,b);
        System.out.println("GCD of "+a+" & "+b+" is "+gcd);
        
    }
}