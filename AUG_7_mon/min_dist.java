package AUG_7_mon;
import java.util.Scanner;

public class min_dist {
    public static int minDistance(int[] arr, int x, int y) {
        int minDist = Integer.MAX_VALUE;
        int prevIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x || arr[i] == y) {
                if (prevIndex != -1 && arr[prevIndex] != arr[i]) {
                    minDist = Math.min(minDist, i - prevIndex);
                }
                prevIndex = i;
            }
        }

        return minDist;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arrayOne= new int[num];
        for(int i = 0;i<num;i++){
            arrayOne[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int y = sc.nextInt();

        int minimumDistance = minDistance(arrayOne, x, y);

        System.out.println(minimumDistance);
    }
}

