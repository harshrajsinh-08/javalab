package AUG_30_wed;
import java.util.Scanner;

class Account {
    String name;
    int accountNumber;
    String accountType;
    double balance;

    void assignInitialValues(String name, int accountNumber, String accountType) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0;
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

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CurrentAccount extends Account {
    double minimumBalance = 1000;
    double serviceCharge = 50;

    @Override
    void withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkMinimumBalance() {
        if (balance < minimumBalance) {
            balance -= serviceCharge;
            System.out.println("Service charge imposed: " + serviceCharge);
        }
    }
}

class SavingsAccount extends Account {
    double interestRate = 0.05;

    void depositInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest deposited: " + interest);
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class BankMen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAccounts = 10; // Maximum number of accounts
        Account[] accounts = new Account[maxAccounts];
        int accountCount = 0;


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
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    if (accountCount < maxAccounts) {
                        System.out.print("Enter your name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter account number: ");
                        int accountNumber = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline
                        CurrentAccount currentAccount = new CurrentAccount();
                        currentAccount.assignInitialValues(name, accountNumber, "Current");
                        accounts[accountCount] = currentAccount;
                        accountCount++;
                        System.out.println("Current account created.");
                    } else {
                        System.out.println("Maximum number of accounts reached.");
                    }
                    break;
                
                case 2:
                    if (accountCount < maxAccounts) {
                        System.out.print("Enter your name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter account number: ");
                        int accountNumber = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline
                        SavingsAccount savingsAccount = new SavingsAccount();
                        savingsAccount.assignInitialValues(name, accountNumber, "Savings");
                        accounts[accountCount] = savingsAccount;
                        accountCount++;
                        System.out.println("Savings account created.");
                    } else {
                        System.out.println("Maximum number of accounts reached.");
                    }
                    break;
                
                case 3:
                    System.out.print("Enter account number: ");
                    int depositAccountNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    int depositAccountIndex = findAccountIndex(accounts, accountCount, depositAccountNumber);
                    if (depositAccountIndex != -1) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        scanner.nextLine(); // Consume the newline
                        accounts[depositAccountIndex].deposit(depositAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                
                case 4:
                    System.out.print("Enter account number: ");
                    int withdrawAccountNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    int withdrawAccountIndex = findAccountIndex(accounts, accountCount, withdrawAccountNumber);
                    if (withdrawAccountIndex != -1) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        scanner.nextLine(); // Consume the newline
                        accounts[withdrawAccountIndex].withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                
                case 5:
                    System.out.print("Enter account number: ");
                    int balanceAccountNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    int balanceAccountIndex = findAccountIndex(accounts, accountCount, balanceAccountNumber);
                    if (balanceAccountIndex != -1) {
                        accounts[balanceAccountIndex].displayBalance();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                
                case 6:
                    System.out.print("Enter account number: ");
                    int interestAccountNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    int interestAccountIndex = findAccountIndex(accounts, accountCount, interestAccountNumber);
                    if (interestAccountIndex != -1 && accounts[interestAccountIndex] instanceof SavingsAccount) {
                        ((SavingsAccount) accounts[interestAccountIndex]).depositInterest();
                    } else {
                        System.out.println("Account not found or not a Savings Account.");
                    }
                    break;
                
                case 7:
                    System.out.print("Enter account number: ");
                    int checkBalanceAccountNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    int checkBalanceAccountIndex = findAccountIndex(accounts, accountCount, checkBalanceAccountNumber);
                    if (checkBalanceAccountIndex != -1 && accounts[checkBalanceAccountIndex] instanceof CurrentAccount) {
                        ((CurrentAccount) accounts[checkBalanceAccountIndex]).checkMinimumBalance();
                    } else {
                        System.out.println("Account not found or not a Current Account.");
                    }
                    break;
                
                case 8:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }




    static int findAccountIndex(Account[] accounts, int count, int accountNumber) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].accountNumber == accountNumber) {
                return i;
            }
        }
        return -1;
    }
}
