package lab_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListManager {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("Menu:");
            System.out.println("1. Input elements for the list ");
            System.out.println("2. Display elements of the list");
            System.out.println("3. Search an element in the list");
            System.out.println("4. Sort the list");
            System.out.println("5. Remove an element from the list");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer to add into the list: ");
                    int number = sc.nextInt();
                    list.add(number);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Elements in the list:");
                    for (int num : list) {
                        System.out.printf("%d ", num);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter the element to search: ");
                    int search_elem = sc.nextInt();
                    if (list.contains(search_elem)) {
                        System.out.println(search_elem + " found in the list.");
                    } else {
                        System.out.println(search_elem + " not found in the list.");
                    }
                    System.out.println();
                    break;
                case 4:
                    Collections.sort(list);
                    System.out.println("List sorted in ascending order.");
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Enter the element to remove: ");
                    int removeElement = sc.nextInt();
                    if (list.remove(Integer.valueOf(removeElement))) {
                        System.out.println(removeElement + " removed from the list.");
                    } else {
                        System.out.println(removeElement + " not found in the list.");
                    }
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Please give a valid input.");
                    System.out.println();
                    break;
            }
        } while (choice != 6);
    }
}
