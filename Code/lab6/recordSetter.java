package lab6;

import java.io.*;
import java.util.Arrays;

class Employee {
    private String name;
    private int id;
    private String designation;
    private double salary;

    public Employee(String name, int id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }
}

public class recordSetter {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter the number of employees: ");
            int n = Integer.parseInt(reader.readLine());

            Employee[] employees = new Employee[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for Employee " + (i + 1));
                System.out.print("Name: ");
                String name = reader.readLine();
                System.out.print("Employee ID: ");
                int id = Integer.parseInt(reader.readLine());
                System.out.print("Designation: ");
                String designation = reader.readLine();
                System.out.print("Salary: ");
                double salary = Double.parseDouble(reader.readLine());

                employees[i] = new Employee(name, id, designation, salary);
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("employee_records.txt"))) {
                for (Employee employee : employees) {
                    writer.write("Employee Name: " + employee.getName());
                    writer.newLine();
                    writer.write("Employee ID: " + employee.getId());
                    writer.newLine();
                    writer.write("Designation: " + employee.getDesignation());
                    writer.newLine();
                    writer.write("Salary: " + employee.getSalary());
                    writer.newLine();
                }
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }

             System.out.println("Employees with salary above 10,000:");
            for (Employee employee : employees) {
                if (employee.getSalary() > 10000) {
                    System.out.println("Employee Name: " + employee.getName());
                    System.out.println("Employee ID: " + employee.getId());
                    System.out.println("Designation: " + employee.getDesignation());
                    System.out.println("Salary: " + employee.getSalary());
                    System.out.println();
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }
}