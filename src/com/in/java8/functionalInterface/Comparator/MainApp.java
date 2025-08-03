package com.in.java8.functionalInterface.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class MainApp {
    public static void main(String[] arg) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(13);
        arrayList.add(5);
        arrayList.add(34);
        arrayList.add(80);
        arrayList.add(2);
        arrayList.add(10);
        Collections.sort(arrayList, new AppMain());
        System.out.println("Array List inserted in some order " + arrayList);
    }
}
