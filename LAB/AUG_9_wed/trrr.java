package AUG_9_wed;

import java.util.Arrays;
import java.util.Scanner;
public class trrr{
  public static int removeDuplicates(int arr[], int count){
    if (count==0 || count==1){
      return count;
    }
    // creating a temporary array to hold non-duplicate elements
    int[] temp = new int[count];
    int j = 0;
    for (int i=0; i<count-1; i++){
      if (arr[i] != arr[i+1]){
        temp[j++] = arr[i];
      }
    }
    temp[j++] = arr[count-1];
    // copying the temp array to the original array
    for (int i=0; i<j; i++){
      arr[i] = temp[i];
    }
    return j;
  }

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    //Sorting the given unsorted array
    Arrays.sort(arr);
    int length = arr.length;
    //getting the new array size after removing duplicates
    length = removeDuplicates(arr, length);

    //for new line
    System.out.println("");

    //display
	System.out.print(length+ " ");
    for (int i=0; i<length; i++)
      System.out.print(arr[i]+" ");
  }
}