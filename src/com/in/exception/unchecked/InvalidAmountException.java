package com.in.exception.unchecked;

public class InvalidAmountException extends  RuntimeException{
    InvalidAmountException(String message){
        super(message);
    }
}
