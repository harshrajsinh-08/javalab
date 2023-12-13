import java.util.Scanner;

class Acc {
    int num;
    String name;
    // long phone;
    // String address;
    int balance;
    Scanner acc = new Scanner(System.in);

    public void setdetails() {
        System.out.println("Enter balance: ");
        balance = acc.nextInt();
        System.out.println("Enter num");
        num = acc.nextInt();
        System.out.println("Enter name");
        name = acc.next();
        // System.out.println("Enter phone ");
        // phone = acc.nextLong();
        // System.out.println("enter address");
        // acc.next();
        // address = acc.nextLine();
    }

    public void viewdetails() {
        System.out.println("Acc details: ");
        System.out.printf("Account num is : %d\n", num);
        System.out.printf("Name is : %s\n", name);
        // System.out.printf("Phone num: %d\n", phone);
        // System.out.printf("Address :%s\n", address);
        System.out.printf("balance is %d\n", balance);
    }

    public void withdraw() {
        System.out.println("Enter amount to withdraw");
        int wd = acc.nextInt();
        if (balance >= wd) {
            balance = balance - wd;
            System.out.printf("%d is withdrawn successfully", wd);
            System.out.printf("Updated balance is %d", balance);
        } else {
            System.out.println("Balance less than  the withdraw limit");
        }
    }

    public void deposit() {
        System.out.println("Enter amount to be deposited");
        int dep = acc.nextInt();
        balance = balance + dep;
        System.out.printf("New balance is %d", balance);
    }

    public void cheque(Acc a[]) {
        int ask;
        System.out.println("From which account do you want to transfer: ");
        int src = acc.nextInt();
        System.out.println("Whose acc do you want to deposit ");
        int acc_choice = acc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i].num == acc_choice) {
                System.out.println("ACCOUNT FOUND:\n");
                a[i].viewdetails();
            }
        }
        System.out.println("CONTINUE? 1-YES OR 2-NO?");
        ask = acc.nextInt();

        if (ask == 1) {
            System.out.println("how much money to be deposited: ");
            int acc_dp = acc.nextInt();
            int sourceIndex = -1, destIndex = -1;

            for (int i = 0; i < a.length; i++) {
                if (a[i].num == src) {
                    sourceIndex = i;
                }
                if (a[i].num == acc_choice) {
                    destIndex = i;
                }
                if (sourceIndex == destIndex) {
                    System.out.println("YOU CANT TRANSFER INTO YOUR OWN ACCOUNT");
                }
            }

            if (sourceIndex != -1 && destIndex != -1 && a[sourceIndex].balance >= acc_dp) {

                a[sourceIndex].balance -= acc_dp;
                a[destIndex].balance += acc_dp;
                System.out.println("Money transferred successfully");
            } else {
                System.out.println("Transfer failed. Either source account not found or insufficient balance.");
            }
        } else if (ask == 2) {
            cheque(a);
        }
    }

}

public class BANK {
    static void acc_num(Acc a[],int my_ac_num,int my_ac_ind){
        
        for (int i = 0; i < a.length; i++) {
            if (a[i].num == my_ac_num) {
                my_ac_ind = i;
            }
        }
    }

    public static void main(String[] args) {
        int my_ac_ind=-1, my_ac_num=1;
        Scanner sc = new Scanner(System.in);
        Acc a[] = new Acc[2];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Acc();
        }
        int accdetails[] = new int[2];
        System.out.println("Do you want to set details first or use random details: 1-set yourself , 2-use default");
        int set = sc.nextInt();
        if (set == 1) {
            for (int i = 0; i < a.length; i++) {
                System.out.printf("Enter details for Acc %d\n", i + 1);
                a[i].setdetails();
            }
        }

        int choice;

        for (int k = 0; k < a.length; k++) {
            do {
                System.out.println("enter your acc num: ");
                my_ac_num = sc.nextInt();
                for(int i=0;i<a.length;i++){
                    if(my_ac_num == a[i].num){
                        my_ac_ind= i;
                    }
                }

                System.out.printf(
                        "_______MENU________\n1 - Deposit\n2 - withdraw\n3 - cheque\n4 - view details\n0 - exit\n");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        a[my_ac_ind].deposit();
                        break;
                    case 2:
                        a[my_ac_ind].withdraw();
                        break;
                    case 3:
                        a[my_ac_ind].cheque(a);
                        break;
                    case 4:
                        a[my_ac_ind].viewdetails();
                        break;
                    case 0:
                        System.out.println("exiting.....");
                        break;
                    default:
                        System.out.println("Thank you for using me");
                        break;
                }
                accdetails[my_ac_ind] = 1;
            } while (choice != 0);

            // for (int j = 0; j < a.length; j++) {
            // if (accdetails[j] == 1) {
            // a[j].viewdetails();
            // } else {
            // System.out.println("Thank you for using me");
            // }
            // }
        }
    }
}
