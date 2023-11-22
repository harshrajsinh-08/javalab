package AUG_23_wed;
import java.util.Scanner;

class Employee {
    private String name;
    private double salary;
    private int hireYear;
    private int hireMonth;
    private int hireDay;

    public Employee(String name, double salary, int hireYear, int hireMonth, int hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
        this.hireMonth = hireMonth;
        this.hireDay = hireDay;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getHireYear() {
        return hireYear;
    }

    public int getHireMonth() {
        return hireMonth;
    }

    public int getHireDay() {
        return hireDay;
    }

    public int calculateYearsOfService(int currentYear,int currentMonth,int currentDay) {
        int yearsOfService = currentYear - hireYear;
        // int currentMonth = sc.nextInt();
        // int currentDay = sc.nextInt();

        if (hireMonth > currentMonth || (hireMonth == currentMonth && hireDay > currentDay)) {
            yearsOfService--;
        }

        return yearsOfService;
    }
}

public class emp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        
        System.out.print("Enter hire day: ");
        int hireDay = scanner.nextInt();
        
        System.out.print("Enter hire month: ");
        int hireMonth = scanner.nextInt();
        
        System.out.print("Enter hire year: ");
        int hireYear = scanner.nextInt();

        System.out.print("Current day: ");
        int currentDay = sc.nextInt();
        System.out.print("Current month: ");
        int currentMonth = sc.nextInt();
        System.out.print("Current year: ");
        int currentYear = sc.nextInt();
        
        Employee employee = new Employee(name, salary, hireYear, hireMonth, hireDay);

        System.out.println("\nEmployee Information:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: $" + employee.getSalary());
        System.out.println("Hire Date: " + employee.getHireDay() + "-" + employee.getHireMonth() + "-" + employee.getHireYear());
        System.out.println("Years of Service: " + employee.calculateYearsOfService(currentYear,currentMonth,currentDay));

        scanner.close();
    }
}
