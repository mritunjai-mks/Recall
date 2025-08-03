package com.in.before.Aug2025.regular;

public class AppMainSingletonExample {
    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getInstance();
        singletonExample.checkMethod();
        SingletonExample singletonExample1=SingletonExample.getInstance();
        System.out.println("will check the status of both ref obj :: " +(singletonExample==singletonExample1));

    }
}
