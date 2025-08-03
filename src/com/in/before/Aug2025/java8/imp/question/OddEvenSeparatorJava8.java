package com.in.before.Aug2025.java8.imp.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenSeparatorJava8 {
    public static void main(String[] arg) {
        List<Integer> numbers = Arrays.asList(10, 11, 20, 12, 14, 15, 15, 10);

        List<Integer> evenNumber = numbers.stream().filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Even number :: " + evenNumber);
        System.out.println("Odd Number ::" + oddNumbers);

    }
}
