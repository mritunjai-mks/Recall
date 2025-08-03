package com.in.before.Aug2025.java8.imp.question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(12, 23, 34, 45, 56, 57, 8, 4, 34, 73, 3);
        int maxNumber = listOfInteger.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Maximum number :: " + maxNumber);
        int minNumber = listOfInteger.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Minimum number ::" + minNumber);
    }
}
