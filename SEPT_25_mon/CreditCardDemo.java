package SEPT_25_mon;
import java.util.Scanner;

class Customer {
    public int custId;
    public int accId;
    public double cc_charges;

    public Customer(int custId, int accId, double cc_charges) {
        this.custId = custId;
        this.accId = accId;
        this.cc_charges = cc_charges;
    }

    public int getCustId() {
        return custId;
    }

    public int getAccId() {
        return accId;
    }

    public double getcc_charges() {
        return cc_charges;
    }
}

class CreditCardCompany {
    public double clcPayback(Customer customer) {
        double charges = customer.getcc_charges();
        double payamt = 0.0;

        if (charges <= 500) {
            payamt = charges * 0.0025;
        } else if (charges <= 1500) {
            payamt = 500 * 0.0025 + (charges - 500) * 0.0050;
        } else if (charges <= 2500) {
            payamt = 500 * 0.0025 + 1000 * 0.0050 + (charges - 1500) * 0.0075;
        } else {
            payamt = 500 * 0.0025 + 1000 * 0.0050 + 1000 * 0.0075 + (charges - 2500) * 0.01;
        }

        return payamt;
    }
}

public class CreditCardDemo {
    public static void main(String[] args) {
        CreditCardCompany creditCardCompany = new CreditCardCompany();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter customer " + i + " details:");
            System.out.print("Customer ID: ");
            int custId = sc.nextInt();
            System.out.print("Account ID: ");
            int accId = sc.nextInt();
            System.out.print("Credit Card Charges: ");
            double cc_charges = sc.nextDouble();

            Customer customer = new Customer(custId, accId, cc_charges);

            double payamt = creditCardCompany.clcPayback(customer);
            System.out.println("Customer " + i + " Payback Amount: Rs. " + payamt);
        }
    }
}
