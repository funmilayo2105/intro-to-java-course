package com.cbfacademy;

import com.cbfacademy.accounts.Bank;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");



        class App {
    public static void main(String[] args) {
        // Create a Bank instance
        Bank bank = new Bank();
        
        // Open a few accounts
        bank.openAccount("SavingsAccount", 1001, 5000.0, 0.05); // 5% interest rate
        bank.openAccount("CurrentAccount", 1002, -150.0, 500.0); // Overdraft limit of 500
        bank.openAccount("SavingsAccount", 1003, 3000.0, 0.03); // 3% interest rate

        // Display all accounts
        bank.displayAccounts();

        // Apply interest to savings accounts
        bank.applyInterestToSavings();

        // Display all accounts again to see updated balances
        bank.displayAccounts();

        // Contact overdraft account holders
        bank.contactOverdraftAccounts();

        // Close an account
        bank.closeAccount(1002); // Close current account
        bank.displayAccounts(); // Display remaining accounts
    }

    public static String concatenate(String word1, String word2, String word3) {
        return word1 + word2 + word3;
    }

    public static Boolean areEqual(String word1, String word2) {
        return word1.equals(word2);
    }

    public static String format(String item, int quantity, double price) {
        return String.format("Item: %s. Price: £%.2f. Quantity: %d.", item, price, quantity);
    }
}

    }
}
