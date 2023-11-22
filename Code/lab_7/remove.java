package lab_7;
import java.util.Scanner;
import java.util.ArrayList;
public class remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        arrayList.add("Fourth");

        System.out.println();
        System.out.println("Original ArrayList: " + arrayList);

        System.out.print("enter text to replace the second: ");
        String replacement = sc.nextLine();

        replaceSecondElement(arrayList, replacement);

        System.out.println("Modified ArrayList: " + arrayList);
    }

    public static void replaceSecondElement(ArrayList<String> list, String replacement) {
        if (list.size() >= 2) {
            list.set(1, replacement);
        } else {
            System.out.println("The ArrayList does not have a second element.");
        }
    }
}
