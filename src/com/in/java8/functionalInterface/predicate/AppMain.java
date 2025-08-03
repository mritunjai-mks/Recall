package com.in.java8.functionalInterface.predicate;

import java.util.function.Predicate;

public class AppMain {
    public static void main(String[] arg){
        int [] a={0,5,10,15,20,25,30,35,40,45,50};
        Predicate<Integer> p1=i->i>10;
        Predicate<Integer> p2=i->i%2==0;
        System.out.println("The nummber greater then 10 :: " );
        m1(p1,a);
        System.out.println("The even number :: ");
        m1(p2,a);
        System.out.println("The number is not greater then 10 :: ");
        m1(p1.negate(),a);
        System.out.println("The number is greater then 10 :: ");
        m1(p1.and(p2),a);
        System.out.println("THe number is greater than 10 or even :: ");
        m1(p1.or(p2),a);


    }

    public static void m1(Predicate<Integer> p, int[] a){
        for(int x1:a){
            if(p.test(x1)){
                System.out.print(x1+", ");
            }
        }
        System.out.println("\n");
    }
}
