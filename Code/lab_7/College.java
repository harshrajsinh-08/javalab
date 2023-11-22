package lab_7;

import java.util.Scanner;
import java.util.ArrayList;

public class College {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> pythonStudents = new ArrayList<>();
        ArrayList<String> javaStudents = new ArrayList<>();
        int choice;
        do {
            System.out.print("For which language do you want to add student?\n1 - Python\n2 - Java\n3 - proceed to process the data\n");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("enter name: ");
                    pythonStudents.add(sc.next());
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    javaStudents.add(sc.next());
                    System.out.println();
                    break;
                case 3: {
                    System.out.println("Students who have taken Python:");
                    for (String student : pythonStudents) {
                        System.out.println(student);
                    }

                    System.out.println("\nStudents who have taken Java:");
                    for (String student : javaStudents) {
                        System.out.println(student);
                    }

                    ArrayList<String> bothlangs = new ArrayList<>(pythonStudents);
                    bothlangs.retainAll(javaStudents);

                    System.out.println("\nStudents who have taken both Python and Java:");
                    for (String student : bothlangs) {
                        System.out.println(student);
                    }

                }
                    break;

                default:
                    System.out.println("please enter from given options");
                    break;
            }

        } while (choice != 3);
        sc.close();
    }
}
