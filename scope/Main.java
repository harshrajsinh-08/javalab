package scope;
import scope.Department;
import scope.ISDepartment;

public class Main {
    public static void main(String[] args) {
        Department dept = new Department("HR");
        ISDepartment isdept = new ISDepartment("Information Systems");

        System.out.println();
        System.out.println("This is in Department ");
        dept.display();
        System.out.println("This is in IS Department");
        isdept.display();
    }
}