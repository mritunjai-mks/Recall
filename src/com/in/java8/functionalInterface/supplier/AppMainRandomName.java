package com.in.java8.functionalInterface.supplier;

import java.util.function.Supplier;

public class AppMainRandomName {
    public static void main(String[] args) {
        Supplier<String> s=()->{
            String[] name={"Mritunjai","Kunal","Raj","Rohit","Ankit"};
            int x=(int)Math.random()*5;
            return name[x];
        };
        System.out.println("Random Name :: "+s.get());
    }
}
