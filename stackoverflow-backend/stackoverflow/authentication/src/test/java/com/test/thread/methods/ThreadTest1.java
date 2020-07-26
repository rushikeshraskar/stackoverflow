package com.test.thread.methods;

import com.test.thread.InstanceCheck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;




 public class ThreadTest1 extends Thread {

    public static void main(String[] args) {
//        InstanceCheck
        ThreadTest1 t1 = new ThreadTest1();
        ThreadTest1 t2 = new ThreadTest1();
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        try {
            //t1.join(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        t2.start();

        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,5,10,232));
    }

    @Override
    public void run() {
        IntStream.range(0, 6).boxed().forEach(no -> {
            try {
                sleep(500);
                if (getName().equals(("Thread-0"))) {
                    System.out.println("Found a match");
                    Thread.yield();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + " " + no);
        });
    }

}
