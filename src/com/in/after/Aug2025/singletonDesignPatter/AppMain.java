package com.in.after.Aug2025.singletonDesignPatter;

public class AppMain {
    public static void main(String[] args) {
    Singleton singleton=Singleton.getInstance();
    singleton.displayMessage();

    Singleton secondInstance=Singleton.getInstance();
    secondInstance.displayMessage();

        System.out.println("Check whether both object are of same ref or not :: "+(singleton==secondInstance));
    }
}

class Singleton{
    private static Singleton instance;
    private Singleton(){
        System.out.println("Object created for Singleton ...");
    }
    public static Singleton getInstance(){
        if(instance ==null){
            instance=new Singleton();
        }
        return instance;
    }

    public void displayMessage(){
        System.out.println("Display method executed...");
    }
}
