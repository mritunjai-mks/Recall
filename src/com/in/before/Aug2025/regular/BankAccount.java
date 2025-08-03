package com.in.before.Aug2025.regular;

public class BankAccount {
    private double balance;  // Sensitive data, hidden

    // Only way to interact: use public methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    //so here setBalance work as deposite only difference is that in this we can pass negative number
    public void setBalance(double balance){
        this.balance=balance;

    }
}
