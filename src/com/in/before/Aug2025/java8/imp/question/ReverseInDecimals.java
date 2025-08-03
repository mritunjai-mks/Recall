package com.in.before.Aug2025.java8.imp.question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 5. How do you sort the given list of decimals in reverse order?
public class ReverseInDecimals {
    public static void main(String[] args) {
        List<Double> listOfDouble = Arrays.asList(12.45, 21.23, 31.23, 31.34, 53.33, 45.34);
        listOfDouble.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
