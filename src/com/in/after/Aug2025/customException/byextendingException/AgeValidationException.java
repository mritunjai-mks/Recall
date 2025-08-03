package com.in.after.Aug2025.customException.byextendingException;

//Check Exception extends Exception
public class AgeValidationException extends Exception {
    public AgeValidationException(String message){
        super(message);
    }
}
