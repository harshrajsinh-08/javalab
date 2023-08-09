package AUG_9_wed;
import java.util.Arrays;
import java.util.Scanner;


public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int nl = dup(nums);
        
        // System.out.println("Array safter removing duplicates: " + Arrays.toString(nums));
        System.out.print(nl+" ");
        printArr(nums);
        
    }

    public static void printArr(int[] nums){
        for(int i =0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
    }

    public static int dup(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }
}
