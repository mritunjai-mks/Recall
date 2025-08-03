package com.in.regular;

public class AppMainSingletonExample {
    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getInstance();
        singletonExample.checkMethod();
        SingletonExample singletonExample1=SingletonExample.getInstance();
        System.out.println("will check the status of both ref obj :: " +(singletonExample==singletonExample1));

    }
}
