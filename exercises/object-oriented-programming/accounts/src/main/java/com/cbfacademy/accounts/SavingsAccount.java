package com.cbfacademy.accounts;


    public class SavingsAccount extends Account {
        private double interestRate;
    
        // Constructor that accepts account number, balance, and interest rate
        public SavingsAccount(int accountNumber, double balance, double interestRate) {
            super(accountNumber, balance); // Call the base class constructor
            this.interestRate = interestRate;
        }
    
        // Applies interest to the balance
        public void applyInterest() {
            double interest = getBalance() * (interestRate / 100);
            deposit(interest); // Apply interest as a deposit
        }
    
        // Returns the current interest rate
        public double getInterestRate() {
            return interestRate;
        }
    
        // Sets the interest rate
        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }
    }
    

