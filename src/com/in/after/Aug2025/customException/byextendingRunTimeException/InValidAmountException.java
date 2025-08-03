package com.in.after.Aug2025.customException.byextendingRunTimeException;

//Unchecked Exception
public class InValidAmountException extends RuntimeException{
    public InValidAmountException(String message){
        super(message);
    }
}
