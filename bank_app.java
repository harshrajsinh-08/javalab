import java.util.Scanner;

class Account {
    String name;
    private int accnum;
    String type;
    private double balance;

    void initval(String name, int accnum, String type) {
        this.name = name;
        this.accnum = accnum;
        this.type = type;
        this.balance = 0;
    }

    double get_balance() {
        return balance;
    }

    void update_balance(double amount) {
        balance = balance - amount;
    }

    void service_charge(double serviceCharge) {
        balance -= serviceCharge;
    }

    void update_interest(double interest) {
        balance += interest;
    }

    int get_accnum() {
        return accnum;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }
}

class currentacc extends Account {
    double minblns = 1000;
    double serviceCharge = 50;

    void withdraw(double amount) {
        if (get_balance() - amount >= minblns) {
            update_balance(amount);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkminblns() {
        if (get_balance() < minblns) {
            service_charge(serviceCharge);
            System.out.println("Service charge imposed: " + serviceCharge);
        }
    }
}

class SavingsAccount extends Account {
    double roi = 0.05;

    void depositInterest() {
        double interest = get_balance() * roi;
        update_interest(interest);
        System.out.println("Interest deposited: " + interest);
    }

    void withdraw(double amount) {
        if (get_balance() >= amount) {
            update_balance(amount);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class bank_app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        currentacc currentacc = new currentacc();
        SavingsAccount savingsAccount = new SavingsAccount();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Current Account");
            System.out.println("2. Create Savings Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Display Balance");
            System.out.println("6. Deposit Interest (Savings Account)");
            System.out.println("7. Check Minimum Balance (Current Account)");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter account number: ");
                    int accnum = sc.nextInt();
                    sc.nextLine();
                    currentacc.initval(name, accnum, "Current");
                    System.out.println("Current account created.");
                    break;

                case 2:
                    System.out.print("Enter your name: ");
                    name = sc.nextLine();
                    System.out.print("Enter account number: ");
                    accnum = sc.nextInt();
                    sc.nextLine();
                    savingsAccount.initval(name, accnum, "Savings");
                    System.out.println("Savings account created.");
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter account type (Current/Savings): ");
                    String type = sc.nextLine();
                    if (type.equalsIgnoreCase("Current")) {
                        currentacc.deposit(depositAmount);
                    } else if (type.equalsIgnoreCase("Savings")) {
                        savingsAccount.deposit(depositAmount);
                    } else {
                        System.out.println("Invalid account type.");
                    }
                    break;

                case 4:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter account type (Current/Savings): ");
                    type = sc.nextLine();
                    if (type.equalsIgnoreCase("Current")) {
                        currentacc.withdraw(withdrawAmount);
                    } else if (type.equalsIgnoreCase("Savings")) {
                        savingsAccount.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Invalid account type.");
                    }
                    break;

                case 5:
                    System.out.print("Enter account type (Current/Savings): ");
                    type = sc.nextLine();
                    if (type.equalsIgnoreCase("Current")) {
                        currentacc.displayBalance();
                    } else if (type.equalsIgnoreCase("Savings")) {
                        savingsAccount.displayBalance();
                    } else {
                        System.out.println("Invalid account type.");
                    }
                    break;

                case 6:
                    System.out.print("Enter account number: ");
                    accnum = sc.nextInt();
                    sc.nextLine();
                    if (savingsAccount.get_accnum() == accnum) {
                        savingsAccount.depositInterest();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 7:
                    System.out.print("Enter account number: ");
                    accnum = sc.nextInt();
                    sc.nextLine();
                    if (currentacc.get_accnum() == accnum) {
                        currentacc.checkminblns();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 8:
                    System.out.println("Exiting program.");
                    sc.close();
                    System.exit(0);

            }
        }
    }
}
