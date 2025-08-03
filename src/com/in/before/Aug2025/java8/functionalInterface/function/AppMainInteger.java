package com.in.before.Aug2025.java8.functionalInterface.function;

import java.util.function.Function;

//WAP with the help of function and give input as integer and return as square of that number.
public class AppMainInteger {
    public static void main(String[] arg){
        Function<Integer,Integer> function=i->i*i;
        System.out.println("Squer of number :: "+function.apply(7));
    }
}
