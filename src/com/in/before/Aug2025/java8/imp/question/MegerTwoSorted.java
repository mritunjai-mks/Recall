package com.in.before.Aug2025.java8.imp.question;

import java.util.Arrays;
import java.util.stream.IntStream;

//How do you merge two unsorted arrays into single sorted array using Java 8 streams?
public class MegerTwoSorted {
    public static void main(String[] args) {

        int[] a=new int[]{23,4,2,1,35,35};
        int[] b=new int[]{1,2,4,5,7,8};
        int[] c= IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));

    }
}
