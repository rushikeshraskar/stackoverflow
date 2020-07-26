package com.test.thread;

import java.util.Random;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        while (true) {
            Random random = new Random();
            int rand = random.nextInt(10);
            System.out.println("MyThread2 run method invoked. : " + rand);
            if(rand==5){
                System.out.println("main thread will be interrupted.");

            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException  e) {
                e.printStackTrace();
            }
        }
    }
}
