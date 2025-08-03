package com.in.before.Aug2025.regular;

public class AppMain {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.setBalance(5000);
        bankAccount.deposit(5500);
        bankAccount.withdraw(500);
        System.out.println("The available balance :: "+bankAccount.getBalance());
    }
}
