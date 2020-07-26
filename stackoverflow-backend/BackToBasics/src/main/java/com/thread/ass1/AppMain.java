package com.thread.ass1;

import static java.lang.Thread.sleep;

public class AppMain {

    public static void main(String args[]) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        Thread.sleep(10000);
        t1.setFlag(false);
    }
}

class MyThread extends Thread{
    public boolean flag = true;

    void setFlag(boolean flag){
        this.flag = flag;
    }
    public void run() {
        while(flag){
            try {
                System.out.println("\n Running...");
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}