import java.util.*;
import java.util.Scanner;



class Stickler {
    public static int maxsum(int arr[], int n) {
        int sum1 = arr[0];
        int sum2 = 0;
        int result;
        for (int i = 1; i < n; i++) {
            result = (sum1 > sum2) ? sum1 : sum2;
            sum1 = sum2 + arr[i];
            sum2 = result;
        }
        return ((sum1 > sum2) ? sum1 : sum2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }
            int res = maxsum(arr, n);
            System.out.println(res);
        }
    }
}