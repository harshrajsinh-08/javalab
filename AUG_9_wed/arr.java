package AUG_9_wed;
<<<<<<< HEAD

import java.util.Arrays;
import java.util.Scanner;
public class arr{
  public static int removeDuplicates(int arr[], int count){
    if (count==0 || count==1){
      return count;
    }
    
    //temp array kyuki kahi to store karna hai !
    int[] temp = new int[count];
    int j = 0;
    for (int i=0; i<count-1; i++){
      if (arr[i] != arr[i+1]){
        temp[j++] = arr[i];
      }
    }
    temp[j++] = arr[count-1];
    
    //temp ko vaapis original mai store karna:
    for (int i=0; i<j; i++){
      arr[i] = temp[i];
    }
    return j;
  }

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[7];
    for(int i = 0;i<7;i++){
        arr[i] = sc.nextInt();
    }

    //Sort karna 
    Arrays.sort(arr);
    int length = arr.length;
    
    //naye array ki size nikalna
    length = removeDuplicates(arr, length);

    //display
	System.out.print(length+ " ");
    for (int i=0; i<length; i++)
      System.out.print(arr[i]+" ");
  }	 	  	 	  	   	      	  	  	    	       	 	
}
=======
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
>>>>>>> 368cc72 (new lab day 4)
