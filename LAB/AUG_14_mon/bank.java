package AUG_14_mon;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BankCustomer {
    private String name;
    private String accountNumber;
    private String accountType;
    private String status;
    private double balance;
    private Date lastTransactionDate;

    public BankCustomer(String name, String accountNumber, String accountType, String status, double balance, String lastTransactionDate) throws ParseException {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.status = status;
        this.balance = balance;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.lastTransactionDate = dateFormat.parse(lastTransactionDate);
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getStatus() {
        return status;
    }

    public double getBalance() {
        return balance;
    }

    public Date getLastTransactionDate() {
        return lastTransactionDate;
    }

    public boolean withdrawFunds(double amount) {
        if (balance - amount < 1000) {
            System.out.println("Alert: Low Balance.");
            return false;
        }
        balance -= amount;
        System.out.println("Transaction Success!");
        return true;
    }

    public void checkAndUpdateStatus(Date currentDate) {
        long timeDifference = currentDate.getTime() - lastTransactionDate.getTime();
        if (timeDifference >= 365 * 24 * 60 * 60 * 1000) {
            status = "Dormant";
            System.out.println("Account status changed to Dormant.");
        }
    }
}

public class bank {
    public static void main(String[] args) throws ParseException {
        Map<String, BankCustomer> customers = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Create sample customers
        BankCustomer customer1 = new BankCustomer("John", "1234567", "Savings", "Active", 1200, "12/02/2022");
        BankCustomer customer2 = new BankCustomer("Sarah", "301139", "Savings", "Active", 500, "20/09/2019");
        customers.put(customer1.getAccountNumber(), customer1);
        customers.put(customer2.getAccountNumber(), customer2);

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        BankCustomer customer = customers.get(accountNumber);

        if (customer != null) {
            System.out.println("Name: " + customer.getName());
            System.out.println("Account Number: " + customer.getAccountNumber());

            System.out.print("Enter amount to withdraw: ");
            double amount = Double.parseDouble(scanner.nextLine());
            boolean success = customer.withdrawFunds(amount);

            if (success) {
                System.out.println("New Balance: " + customer.getBalance());
            }

            customer.checkAndUpdateStatus(new Date());
            System.out.println("Account Status: " + customer.getStatus());
        } else {
            System.out.println("Customer not found.");
        }

        scanner.close();
    }
}
