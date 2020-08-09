package com.test.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest1 {

    public static void main(String args[]){
        List<Integer> list1 = IntStream.range(0,10).boxed().collect(Collectors.toList());
//        System.out.println(
                list1.stream().filter(i->{
            System.out.println("item "+i);
            if(i%2==0){
                return true;
            }else{
                return false;
            }
        }).forEach(System.out::println);
//    );
        Stream<Integer> stream1 = list1.stream();
        stream1.forEach(System.out::println);
        stream1.forEach(System.out::println);
    }
}
