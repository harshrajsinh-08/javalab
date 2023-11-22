package lab6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class recordss {
    public static void main(String[] args) {
        String fileName = "/Users/harsh/Code/lab6/employee_records.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String name = line.split(":")[1].trim();
                int id = Integer.parseInt(reader.readLine().split(":")[1].trim());
                String designation = reader.readLine().split(":")[1].trim();
                double salary = Double.parseDouble(reader.readLine().split(":")[1].trim());

                Employee employee = new Employee(name, id, designation, salary);
                if (employee.getSalary() > 10000) {
                    System.out.println("Employee Name: " + employee.getName());
                    System.out.println("Employee ID: " + employee.getId());
                    System.out.println("Designation: " + employee.getDesignation());
                    System.out.println("Salary: " + employee.getSalary());
                    System.out.println();
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
