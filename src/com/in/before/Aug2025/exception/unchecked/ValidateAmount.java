package com.in.before.Aug2025.exception.unchecked;

public class ValidateAmount {
    public static void amountValidation(double amt){
        if(amt<0){
            throw new InvalidAmountException("Amount must be give more then 0");
        }else{
            System.out.println("Amount enter by use is valid");
        }
    }

    public static void main(String[] args) {
        ValidateAmount.amountValidation(-23);
        ValidateAmount.amountValidation(100);
    }
}
