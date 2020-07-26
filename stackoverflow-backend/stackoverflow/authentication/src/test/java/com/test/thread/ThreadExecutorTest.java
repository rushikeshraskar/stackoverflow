package com.test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ThreadExecutorTest {

    public static void main(String[] args) {
        Runnable run = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(run);
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("NO OF PROCESSORS : " + processors);
        ExecutorService service = Executors.newFixedThreadPool(processors);
        IntStream.rangeClosed(0, 10).boxed().forEach((item) -> {
            service.execute(run);
        });
        System.out.println("next statement");
        service.shutdown();
    }
}
