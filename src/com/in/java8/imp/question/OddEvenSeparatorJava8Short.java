package com.in.java8.imp.question;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEvenSeparatorJava8Short {
    public static void main(String[] arg) {
        List<Integer> integerList = Arrays.asList(10, 11, 13, 2, 4, 43, 53, 33, 23, 24, 56);

        Map<Boolean, List<Integer>> partitioned = integerList.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Even number ::" + partitioned.get(true));
        System.out.println("Even number ::" + partitioned.get(false));
    }
}
