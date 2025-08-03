package com.in.before.Aug2025.multithreading;

class AppTestI implements Runnable {
    @Override
    public void run() {
        for (int j = 0; j <= 5; j++) {
            System.out.println(" AppTestI : : " + j);
        }
    }
}

public class AppMainRunnableI {
    public static void main(String[] arg) {
        System.out.println("Main Class Execution : :");
        AppTestI appTestI = new AppTestI();
        Thread thread = new Thread(appTestI);
        thread.start();
        for (int j = 0; j <= 5; j++) {
            System.out.println(" start method : : " + j);
        }
    }
}

