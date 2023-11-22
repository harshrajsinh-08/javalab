package AUG_9_wed;
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
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i<n;i++){
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