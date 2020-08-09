package com.test.constantpool;

public class Test1 {

    public static void main(String args[])
    {
        String str1="abc";
        String str2 = new String("abc").intern();
        String str3 ="abc";
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str2));
        System.out.println("======================================");
        test2();
    }

    private static void test2() {
        Integer int1=123;
        Integer int2 = new Integer(123);
        Integer int3 = 123;
        System.out.println(int1==int2);
        System.out.println(int1==int3);
        System.out.println(int1.equals(int2));
    }
}
