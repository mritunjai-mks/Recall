package com.in.before.Aug2025.java8.imp.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//	2. How do you remove duplicate elements from a list using Java 8 streams ?
public class RemoveDuplicate {
    public static void main(String[] arg){
        List<String> listOfString= Arrays.asList("Java","Python","C#","Kotlin","Java","DotNet");
        listOfString=listOfString.stream().distinct().collect(Collectors.toList());
        System.out.println(listOfString);
    }
}
