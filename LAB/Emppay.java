import employees.Emp;
import java.util.Scanner;
public class Emppay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Emp e = new Emp(name,"Manager", 101, 50000.0, 15000.0, 20000.0);
        e.calculateSalary();
        e.displaySalary();
    }
}