package com.test.thread;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class MainClass {

    public void m1(){

    }

     void m1( int a){

    }

    public static void main(String args[]) throws InterruptedException, InvocationTargetException, IllegalAccessException {
        /*
        myThread1.join();
        myThread1.interrupt();
        myThread1.checkAccess();
        myThread1.wait();
        myThread1.notify();
        myThread1.notifyAll();
        myThread1.yield();
        */
        Thread mainThread = new Thread(new MyThread2());
        mainThread.start();
        MyThread1 monitorThread = new MyThread1(mainThread);
        monitorThread.start();

        MainClass mainClass = new MainClass();
        Class mainCls = mainClass.getClass();
        Method method[] = mainCls.getDeclaredMethods();
        method[0].invoke(mainClass);
        Field[] fields = mainCls.getFields();
        Class cl = fields[0].getType();
        fields[0].getInt(mainClass);
//        B b1 =  new B();
//        b1.run1();
    }
}
