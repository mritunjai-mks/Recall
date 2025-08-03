package com.in.before.Aug2025.java8.imp.question;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// 3.How do you find frequency of each character in a string using Java 8 streams?
public class FrequencyOfCharInString {
    public static void main(String[] arg) {
        String inputString = "Java is my primary code";
        Map<Character, Long> distinct = inputString.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(distinct);
    }
}
