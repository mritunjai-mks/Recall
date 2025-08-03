package com.in.before.Aug2025.regular;

public class SingletonExample {
    private static SingletonExample singletonExample;

    private SingletonExample() {
        System.out.println("Inside the constructor");
    }

    public static SingletonExample getInstance() {
        if (singletonExample == null) {
            return new SingletonExample();
        }
        return singletonExample;
    }

    public void checkMethod() {
        System.out.println("Singleton method access :) ");
    }
}
