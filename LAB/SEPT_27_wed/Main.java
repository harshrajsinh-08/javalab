package SEPT_27_wed;

import java.util.Scanner;

interface Sortable {
    void sort(int[] array);
}

class QuickSort implements Sortable {
    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] >= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

class MergeSort implements Sortable {
    @Override
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    private void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] >= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int choice = sc.nextInt();

        int opt;
        do {
            System.out.println("What do you want to do ?\n1) Quick sort\n2)Merge sort\n3)Exit");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    int[] array1 = new int[choice];
                    for (int i = 0; i < array1.length; i++) {
                        int elem;
                        System.out.print("Enter element for index " + i + 1 + ": ");
                        elem = sc.nextInt();
                        array1[i] = elem;
                    }
                    Sortable quickSort = new QuickSort();
                    quickSort.sort(array1);
                    System.out.println("QuickSort: " + java.util.Arrays.toString(array1));
                    break;
                case 2:
                    int[] array2 = new int[choice];
                    for (int i = 0; i < array2.length; i++) {
                        int elem;
                        System.out.print("Enter element for index " + i + 1 + ": ");
                        elem = sc.nextInt();
                        array2[i] = elem;
                    }
                    Sortable mergeSort = new MergeSort();
                    mergeSort.sort(array2);
                    System.out.println("MergeSort: " + java.util.Arrays.toString(array2));
                    break;

            }
        } while (opt != 3);
    }
}
