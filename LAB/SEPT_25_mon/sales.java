package SEPT_25_mon;

import java.util.Scanner;

public class sales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num_of_ppl = 5;
        double totSales = 0;

        System.out.println("Enter sales for each of the " + num_of_ppl + " salespeople:");

        for (int i = 1; i <= num_of_ppl; i++) {
            System.out.print("Enter sales for Salesperson " + i + ": Rs. ");
            double sales = sc.nextDouble();
            totSales += sales;
            System.out.println("Salesperson " + i + " Sales: Rs. " + sales);
        }

        double avgSales = totSales / num_of_ppl;

        System.out.println("Average Sales: Rs. " + avgSales);
        System.out.println("Total Sales: Rs. " + totSales);

    }
}
