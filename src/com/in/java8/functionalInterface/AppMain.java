package com.in.java8.functionalInterface;

public class AppMain {
    public static void main(String[] arg){
        Demo d= (String s) -> System.out.println("length of the String :: "+s.length());
        d.lenghtOfString("Mritunaji");

    }
}
