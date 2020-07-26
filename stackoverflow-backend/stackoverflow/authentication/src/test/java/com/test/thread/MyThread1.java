package com.test.thread;

public class MyThread1 extends Thread {

    Thread mainThread;

    public MyThread1(Thread mainThread) {
        this.mainThread = mainThread;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(" MyThread1 run successfully.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            if(mainThread.is())
        }
    }
}
