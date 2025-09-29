package bankaccountsimulation;

import java.util.ArrayList;

public class Account {
    private String accountHolder;
    private double balance;
    private ArrayList<String> transcations;

    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transcations = new ArrayList<>();
        transcations.add("Account created with balance: ₹ " + initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            transcations.add("Deposited: ₹ " + amount + " New Balance: ₹" + balance);
            System.out.println("Successfully deposited ₹ " + amount);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive");
        } else if(amount > balance) {
            System.out.println("Insufficient funds current balance: ₹" + balance);
        } else {
            balance = balance - amount;
            transcations.add("Withdraw: ₹ " + amount + " New Balance ₹ " + balance );
            System.out.println("Successfully withdraw ₹ " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactionHistory() {
        System.out.println("Transcation history");
        for (String t : transcations) {
            System.out.println(" - " + t);
        }
    }
}
