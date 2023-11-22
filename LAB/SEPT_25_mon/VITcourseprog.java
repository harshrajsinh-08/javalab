package SEPT_25_mon;

import java.util.Scanner;

public class VITcourseprog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two characters (major and year): ");
        String input = scanner.nextLine();

        if (input.length() == 2) {
            char majorCode = input.charAt(0);
            char yearCode = input.charAt(1);

            String major = "";
            String year = "";

            switch (majorCode) {
                case 'C':
                    major = "Computer Science";
                    break;
                case 'B':
                    major = "Computer Science with Spl. in Bio-Informatics";
                    break;
                case 'I':
                    major = "Computer Science with Spl. in Information Security";
                    break;
                case 'S':
                    major = "Computer Science with Spl. in Business Systems";
                    break;
                case 'T':
                    major = "Computer Science with Spl. in IoT";
                    break;
                default:
                    System.out.println("Invalid major code");
                    break;
            }

            switch (yearCode) {
                case '1':
                    year = "Fresher";
                    break;
                case '2':
                    year = "Second Year";
                    break;
                case '3':
                    year = "Pre-Final Year";
                    break;
                case '4':
                    year = "Senior";
                    break;
                default:
                    System.out.println("Invalid year code");
                    break;
            }

            if (!major.isEmpty() && !year.isEmpty()) {
                System.out.println("Course Major: " + major);
                System.out.println("Year: " + year);
            }
        } else {
            System.out.println("Invalid input. Please enter exactly two characters.");
        }

        scanner.close();
    }
}