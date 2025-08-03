package com.in.java8.imp.question;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//4. How do you find frequency of each element in an array or a list?
public class FreqOfWord {
    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Note Book");
        Map<String, Long> stationCount = listOfString.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stationCount);
    }
}
