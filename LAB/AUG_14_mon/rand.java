package AUG_14_mon;
import java.util.Scanner;

class Person {
    String name;
    int age;
    char gender;

    public Person(String n, int a, char g) {
        name = n;
        age = a;
        gender = g;
    }
}

class Student extends Person {
    String regNo;
    String programme;
    String school;
    double cgpa;

    public Student(String name, int age, char gender, String regNo, String programme, String school, double cgpa) {
        super(name, age, gender);
        this.regNo = regNo;
        this.programme = programme;
        this.school = school;
        this.cgpa = cgpa;
    }

    public void newcgpa(double points) {
        cgpa = cgpa + points;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + regNo);
        System.out.println("CGPA: " + cgpa);
    }
}

class Sport {
    String level;

    public Sport(String level) {
        this.level = level;
    }

    public double cp() {
        if (level.equals("state")) {
            return 0.5;
        } else if (level.equals("national")) {
            return 1.0;
        }
        return 0.0;
    }
}

public class rand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter student's age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter student's gender: ");
        char gender = scanner.nextLine().charAt(0);
        System.out.print("Enter student's registration number: ");
        String regNo = scanner.nextLine();

        System.out.print("Enter student's programme: ");
        String programme = scanner.nextLine();
        

        System.out.print("Enter student's school: ");
        String school = scanner.nextLine();

        System.out.print("Enter student's CGPA: ");
        double cgpa = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter student's sport level (state/national): ");
        String sportLevel = scanner.nextLine();

        Student student = new Student(name, age, gender, regNo, programme, school, cgpa);
        Sport sport = new Sport(sportLevel);

        double points = sport.cp();

        student.newcgpa(points);

        System.out.println("\nStudent Information:");
        student.displayInfo();

        scanner.close();
    }
}

