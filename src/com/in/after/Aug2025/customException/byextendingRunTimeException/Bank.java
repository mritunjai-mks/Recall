package com.in.after.Aug2025.customException.byextendingRunTimeException;

public class Bank {
    public void deposite(double amount){
        if(amount<=0){
            throw new InValidAmountException("Deposit amount must be greater then 0");
        }else{
            System.out.println("Amount Deposit Successfully :: "+amount);
        }
    }

    public static void main(String[] args) {
        Bank bank =new Bank();
        bank.deposite(-100);
    }
}
