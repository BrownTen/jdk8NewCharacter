package com.wyt.jdk8;

import java.util.Arrays;

@FunctionalInterface
interface MyInterface {
    void test();
    String toString();
}

public class Test2 {
    public void myTest(MyInterface myInterface){
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    };
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.myTest(() -> System.out.println("mytest"));

        System.out.println("--------------------------");

        MyInterface myInterface = () -> {
            System.out.println("hello");
        };
        System.out.println(myInterface.getClass());
        System.out.println(myInterface.getClass().getSuperclass());
        Arrays.stream(myInterface.getClass().getInterfaces()).forEach(inter -> System.out.println(inter));
    }
}
