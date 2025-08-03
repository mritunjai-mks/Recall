package com.in.before.Aug2025.java8.functionalInterface.function;

import java.util.function.Function;

public class AppMain {
    public static void main(String[] arg){
        Function<String,Integer> f=s->s.length();
        System.out.println("The lenght of the string :: "+f.apply("Mritunjai"));
    }
}
