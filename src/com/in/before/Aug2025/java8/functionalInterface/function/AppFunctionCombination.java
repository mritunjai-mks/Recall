package com.in.before.Aug2025.java8.functionalInterface.function;

import java.util.function.Function;

public class AppFunctionCombination {
    public static void main(String[] args) {
        Function<String,String> f1=s->s.toUpperCase();
        Function<String,String> f2=s->s.substring(0,5);
        System.out.println("The output of f1 :: "+f1.apply("Mritunjai"));
        System.out.println("The output of f2 :: "+f2.apply("Mritunjai"));

        // Combining functions using andThen
        Function<String, String> andThenFunction = f1.andThen(f2);
        System.out.println("The output of andThen :: " + andThenFunction.apply("Mritunjai"));

        // Combining functions using compose
        Function<String, String> composeFunction = f1.compose(f2);
        System.out.println("The output of compose :: " + composeFunction.apply("Mritunjai"));
    }
}