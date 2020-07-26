package com.test.thread;

public class FinallyTest {

    int temp(){
        try{
            return 10;
        }catch(Exception e){

        }finally {
            System.out.println("inside finally");
            return 5;
        }
    }

    public static void main(String args[]){
        System.out.println(new FinallyTest().temp());
    }
}
