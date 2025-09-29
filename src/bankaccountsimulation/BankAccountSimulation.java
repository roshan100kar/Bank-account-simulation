package bankaccountsimulation;

import java.util.Scanner;

public class BankAccountSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Holder Name");
        String name = sc.nextLine();
        System.out.println("Enter initial balance: ₹ ");
        double initialBalance = sc.nextDouble();
        Account account = new Account(name, initialBalance);

        int choice;
        do{
            System.out.println("##### Bank Menu #####");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit ₹ ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double wd = sc.nextDouble();
                    account.withdraw(wd);
                    break;

                case 3:
                    System.out.println("Current Balance: ₹" + account.getBalance());
                    break;

                case 4:
                    account.printTransactionHistory();
                    break;

                case 5:
                    System.out.println("Thank you for banking with us!");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);
        sc.close();
    }
}
