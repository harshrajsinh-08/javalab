package lab_7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.Scanner;

public class leap_years {
    public static <T> List<T> filterList(List<T> originalList, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T element : originalList) {
            if (predicate.test(element)) {
                filteredList.add(element);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {

        List<Integer> years = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("number of years to enter");
        int ele = sc.nextInt();
        System.out.println("enter any" + ele + "years");
        for (int i = 0; i < ele; i++) {
            years.add(sc.nextInt());
        }

        System.out.println("Original list of years: " + years);

        List<Integer> leap = filterList(years, n -> n % 4 == 0);
        System.out.println("Leap years: " + leap);

        List<Integer> nonleap = filterList(years, n -> n % 4 != 0);
        System.out.println("Non Leap years: " + nonleap);
        System.out.println("enter number of states to enter");
        List<String> states = new ArrayList<>();

        int str = sc.nextInt();
        System.out.println("enter any" + str + " states in india");
        for (int i = 0; i < str; i++) {
            states.add(sc.next());
        }

        System.out.println("\nOriginal list of states: " + states);

        List<String> mystate = filterList(states, state -> state.startsWith("t"));
        System.out.println("States starting with 't': " + mystate);

    }
}