package trials;
import java.util.Arrays;

public class one {
    static public void prntu(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int[] array1 = {4, 2, 7, 1, 9};
        int[] array2 = {5, 3, 8, 6, 10};
        System.out.println("Array before meerge and sort : ");
        prntu(array1);
        System.out.println("Array before meerge and sort : ");
        prntu(array2);


        // Sorting the arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Merging the arrays
        int[] mergedArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }

        while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }

        System.out.println("Merged and Sorted Array: " + Arrays.toString(mergedArray));
    }
}
