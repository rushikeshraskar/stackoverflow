package com.thread.ass1;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;

class MyObj4001 {
    public String getMsg() {
        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "MyMsg";
    }

    <U> void disp(List<U> u){
        u.size();
//        "".length()
    }

}

class Thread1 extends Thread{

    @Override
    public synchronized void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class App2 {
    public static void main(String[] args) {
//        MyObj4001 obj = new MyObj4001();
//        CompletableFuture<String> completableFuture = CompletableFuture.completedFuture(obj.getMsg());
//        System.out.println(completableFuture.isDone());
//        System.out.println(completableFuture.getNow(null));
        AtomicInteger at;
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        t1.start();
        t2.start();

    }
}
