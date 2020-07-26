package com.test.thread;

class A {
    static {
        System.out.println(" static A");
    }

    {
        System.out.println(" IIB A");
    }

    public A() {
        System.out.println(" Constructor A");
    }
}

class B extends A {

    static {
        System.out.println(" static B");
    }

    {
        System.out.println(" IIB B");
    }

    public B() {
        super();
        System.out.println(" Constructor B");
    }
}

public class InstanceCheck {

    static {
        System.out.println(" static InstanceCheck");
    }

    {
        System.out.println(" IIB InstanceCheck");
    }

    public InstanceCheck() {
        System.out.println(" Constructor InstanceCheck");
    }

    public static void main(String args[]){
//        new InstanceCheck();

        System.out.println("hello");
        B b = new B();
        A a = new A();
    }

}
