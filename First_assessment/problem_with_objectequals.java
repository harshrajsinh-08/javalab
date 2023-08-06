import java.util.Scanner;

public class problem_with_objectequals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");

        System.out.print("comparing str1 with str2: ");
        System.out.println(str1.equals(str2));
        System.out.print("comparing str2 with str1: ");
        System.out.println(str2.equals(str1));
        System.out.print("comparing str1 with str3: ");
        System.out.println(str1.equals(str3));
        
        System.out.println(" ");
        System.out.print("comparing str1 with str2 using  == : ");
        System.out.println(str1 == str2);
        System.out.print("comparing str2 with str1 using  == : ");
        System.out.println(str2 == str1);
        System.out.print("comparing str1 with str3 using  == : ");
        System.out.println(str1 == str3);
        System.out.println("NOTE THE RESULT FOR STR 3 is false");

        System.out.println("this is because str3 is in heap and a new instance/object str3 is pointing a value java to it \nwhereas the str1 and str2 are in pool because new keyword is not used ");

        System.out.println(" ");
        System.out.println("when the .equals() is used it checks the content of the strings but when == is used it checks the objects/instances and not what the instance is holding\nfor example here str1 and str2 are same instances holding same value so it says true but when str1 and str2 are checked it returns false because str1 != str3 and they are seperate instances , one in pool and one in heap so it returns false");
        
    }
}
