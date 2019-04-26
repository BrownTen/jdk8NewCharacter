package com.wyt.jdk8;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }

//        for(Integer i: list){
//            System.out.println(i);
//        }

        // lambda
        list.forEach(i -> System.out.println(i));
        // method reference
        list.forEach(System.out::println);
    }
}
