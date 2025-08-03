package com.in.java8.functionalInterface.additionOfTwoNumber;

public class AppMain {
    public static void main(String[] arg){
        Service service=(a,b)->(a + b);
        System.out.print("Addition of two number "+service.additionOfNumber(10,12));
    }
}
