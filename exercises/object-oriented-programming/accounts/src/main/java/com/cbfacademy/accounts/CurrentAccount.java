package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    // Constructor that accepts account number, balance, and overdraft limit
    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance); // Call the base class constructor
        this.overdraftLimit = overdraftLimit;
    }

    // Override the withdraw method to account for the overdraft limit
    @Override
    public double withdraw(double requested) {
        if (requested > 0 && getBalance() + overdraftLimit >= requested) {
            double amountToWithdraw = Math.min(getBalance(), requested);
            super.withdraw(amountToWithdraw);
            if (amountToWithdraw < requested) {
                overdraftLimit -= (requested - amountToWithdraw);
            }
            return requested;
        } else {
            return 0; // Insufficient funds and overdraft
        }
    }

    // Returns the current overdraft limit
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    // Sets the overdraft limit
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}

