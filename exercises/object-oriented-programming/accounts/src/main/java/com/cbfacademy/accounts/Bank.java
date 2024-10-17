package com.cbfacademy.accounts;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts; // List to hold accounts

    // Constructor to initialize the account list
    public Bank() {
        this.accounts = new ArrayList<>();
    }

    // Method to open a new account
    public void openAccount(String type, int accountNumber, double balance, double additionalParam) {
        Account account;
        if (type.equalsIgnoreCase("SavingsAccount")) {
            account = new SavingsAccount(accountNumber, balance, additionalParam); // additionalParam is interest rate
        } else if (type.equalsIgnoreCase("CurrentAccount")) {
            account = new CurrentAccount(accountNumber, balance, additionalParam); // additionalParam is overdraft limit
        } else {
            throw new IllegalArgumentException("Invalid account type.");
        }
        accounts.add(account);
        System.out.println("Account opened: " + accountNumber);
    }

    // Method to get a list of account numbers
    public List<Integer> getAccountNumbers() {
        List<Integer> accountNumbers = new ArrayList<>();
        for (Account account : accounts) {
            accountNumbers.add(account.getAccountNumber());
        }
        return accountNumbers;
    }

    // Method to get an account by account number
    public Account getAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null; // Return null if account not found
    }

    // Method to close an account by account number
    public void closeAccount(int accountNumber) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            accounts.remove(account);
            System.out.println("Account closed: " + accountNumber);
        } else {
            System.out.println("Account not found: " + accountNumber);
        }
    }

    // Method to display a report of all accounts
    public void displayAccounts() {
        System.out.println("Accounts Report:");
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
        }
    }

    // Method to apply interest to all savings accounts
    public void applyInterestToSavings() {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).applyInterest();
            }
        }
    }

    // Method to contact current account holders in overdraft
    public void contactOverdraftAccounts() {
        for (Account account : accounts) {
            if (account instanceof CurrentAccount) {
                if (account.getBalance() < 0) {
                    System.out.println("Contacting current account holder: " + account.getAccountNumber() + " - Overdraft detected.");
                }
            }
        }
    }
}
