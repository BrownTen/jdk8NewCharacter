package com.wyt.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test3 {
    public static void main(String[] args) {
//        TheInterface i1 = () -> {};
//        Arrays.stream(i1.getClass().getInterfaces()).forEach(inter -> System.out.println(inter));
//
//        TheInterface2 i2 = () -> {};
//        System.out.println(i2.getClass().getInterfaces()[0]);
//
//        new Thread(() -> System.out.println("hello world")).start();

        List<String> list = Arrays.asList("hello","world","hello wrold");
//        list.forEach(str -> System.out.println(str.toUpperCase()));
        List<String> list2 = new ArrayList<>(); //diamond语法(类型推断)

//        list.forEach(str -> list2.add(str.toUpperCase()));
        list2.forEach(str -> System.out.println(str));

//        list.stream().map(str -> str.toUpperCase()).forEach(str -> System.out.println(str));
//        list.stream().map(String::toUpperCase).forEach(System.out::println);

        Function<String, String> function = String::toUpperCase;
        System.out.println(function.getClass());
        System.out.println(function.getClass().getInterfaces()[0]);

        Function<List<String>, ArrayList<String>> function1 = ArrayList::new;
        System.out.println(function1.getClass());
    }
}


@FunctionalInterface
interface TheInterface{
    void myMethod();
}

@FunctionalInterface
interface TheInterface2{
    void myMethod2();
}