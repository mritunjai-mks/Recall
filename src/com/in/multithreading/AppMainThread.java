package com.in.multithreading;

class AppMainRun extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Run Thread "+i);
        }
    }
}

public class AppMainThread{
    public static void main(String[] arg){
        System.out.println("Main Thread");
        System.out.println("Thread priority :"+Thread.currentThread());
        Thread thread=new Thread();
        AppMainRun t=new AppMainRun();
        t.start();
        thread.setPriority(7);
        for (int j=0;j<=5;j++){
            System.out.println("Normal thread :"+j);
        }
    }
}
