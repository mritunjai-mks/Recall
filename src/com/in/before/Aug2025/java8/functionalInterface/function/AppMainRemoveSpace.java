package com.in.before.Aug2025.java8.functionalInterface.function;

import java.util.function.Function;

//WAP to remove space from String
public class AppMainRemoveSpace {
    public static void main(String[] args) {
        Function<String,String> result=s->s.replaceAll(" ","");
        System.out.println("The final output :: "+result.apply("Mritunjai Kumar Sharma"));
    }
}
