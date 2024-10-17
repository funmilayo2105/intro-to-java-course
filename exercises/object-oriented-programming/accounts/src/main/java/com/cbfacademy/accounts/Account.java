package com.cbfacademy.accounts;

public class Account {
    private int accountNumber;
    private double balance;

    // Constructor that accepts account number and starting balance
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Returns the current balance
    public double getBalance() {
        return balance;
    }

    // Returns the account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Deposits funds to the account and returns the new balance
    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

    // Withdraws funds from the account and returns the requested amount or 0 if insufficient balance
    public double withdraw(double requested) {
        if (requested > 0 && balance >= requested) {
            balance -= requested;
            return requested;
        } else {
            return 0; // Insufficient balance
        }
    }
}
