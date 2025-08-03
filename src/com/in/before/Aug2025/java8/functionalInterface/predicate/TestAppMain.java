package com.in.before.Aug2025.java8.functionalInterface.predicate;

import java.util.function.Predicate;

//WAP to print the name which Start with 'K'
public class TestAppMain {
    public static void main(String[] arg){
        String name[]={"Kajal","Priya","Kiriti","Rishika","Sukiriti","kiran"};

        Predicate<String> startWithK=s->s.toLowerCase().charAt(0)=='k';
        System.out.println("The name start with K :: ");
        for(String result:name){
            if(startWithK.test(result)){
                System.out.print(result+ ", ");
            }
        }


    }
}
