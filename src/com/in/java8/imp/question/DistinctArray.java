package com.in.java8.imp.question;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DistinctArray {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 2, 1};
        int[] b = new int[]{2, 4, 5, 6, 8, 4};
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(c));
    }
}
