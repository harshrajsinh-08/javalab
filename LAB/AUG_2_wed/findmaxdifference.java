package AUG_2_wed;
import java.util.Arrays;
import java.util.Scanner;

public class findmaxdifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        findMaxMinDifferencePairs(arr);
        scanner.close();
    }
    public static void findMaxMinDifferencePairs(int[] arr) {
        Arrays.sort(arr);
        int maxDiff = arr[arr.length - 1] - arr[0];
        int minDiff = arr[1] - arr[0];
        int minDiffSecond = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int currentDiff = arr[i] - arr[i - 1];
            if (currentDiff < minDiff) {
                minDiffSecond = minDiff;
                minDiff = currentDiff;
            }
            else if (currentDiff < minDiffSecond && currentDiff != minDiff) {
                minDiffSecond = currentDiff;
            }
            if (currentDiff > maxDiff) {
                maxDiff = currentDiff;
            }
        }
        System.out.println(maxDiff);
        System.out.println(minDiff);
    }
}
