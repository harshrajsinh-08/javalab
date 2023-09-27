package SEPT_27_wed;

import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    private int employeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle + " (" + employeeId + ")";
    }
}

public class job {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ppl,people;
        System.out.println("how many persons do you want?");
        ppl = sc.nextInt();
        people = ppl;

        sc.nextLine();
        do {
            for (int i = 0; i < ppl; i++) {
                System.out.print("Enter first name: ");
                String firstName = sc.nextLine();

                System.out.print("Enter last name: ");
                String lastName = sc.nextLine();

                System.out.print("Enter employee ID: ");
                int employeeId = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter job title: ");
                String jobTitle = sc.nextLine();

                Employee employee = new Employee(firstName, lastName, employeeId, jobTitle);

                System.out.println(employee.getFirstName() + " " + employee.getLastName());
                System.out.println("");
                if (i == ppl) {
                    break;
                }
            }
        } while (people<ppl);
    }
}