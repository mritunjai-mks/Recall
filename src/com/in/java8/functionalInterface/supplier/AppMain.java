package com.in.java8.functionalInterface.supplier;

import java.util.function.Supplier;

public class AppMain {
    public static void main(String[] args) {
        Supplier<String> s=()->{
            String otp="";
        for(int i=0;i<6;i++){
            otp+=(int)(Math.random()*9);
        }
        return otp;
        };
        System.out.println("Final output 1 :: "+s.get());
        System.out.println("Final output 2 :: "+s.get());
        System.out.println("Final output 3 :: "+s.get());
        System.out.println("Final output 4 :: "+s.get());

    }
}
