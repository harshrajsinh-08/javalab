package AUG_7_mon;
import java.util.Arrays;
import java.util.Scanner;

public class duplicate {
    public static void find(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        int count = 1;

        System.out.println("Element\tFrequency");

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count > 1) {
                    System.out.println(arr[i - 1] +" "+ count);
                }
                count = 1;
            }
        }

        if (count > 1) {
            System.out.println(arr[n - 1] + " "+count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        System.out.println("Duplicate Frequencies:");
        find(arr);
    }
}