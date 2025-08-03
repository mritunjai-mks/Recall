package com.in.java8.imp.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
public class PrefixAppMain {
    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("Facaebook","Twitter","Google","YouTube","WhatsApp");
        String prefixJoin = listOfString.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(prefixJoin);
    }
}
