package lab_7;

import java.util.List;

public class p6 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        int targetInteger = 3;
        int indexInteger = indexOfElement(integerList, targetInteger);
        System.out.println("Index of " + targetInteger + ": " + indexInteger);

        List<String> stringList = List.of("apple", "banana", "cherry", "date");
        String targetString = "banana";
        int indexString = indexOfElement(stringList, targetString);
        System.out.println("Index of " + targetString + ": " + indexString);
    }

    public static <T> int indexOfElement(List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }
}