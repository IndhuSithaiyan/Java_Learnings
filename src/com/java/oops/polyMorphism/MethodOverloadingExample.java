package com.java.oops.polyMorphism;

public class MethodOverloadingExample {

    double sum(int a, double b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        MethodOverloadingExample methodOverloadingExample = new MethodOverloadingExample();
        System.out.println(methodOverloadingExample.sum(2,5));
        System.out.println(methodOverloadingExample.sum(2,5.0));
        System.out.println(methodOverloadingExample.sum(2,5,7));

        methodOverloadingExample.sum(2,5.0);
        methodOverloadingExample.sum(2,5,7);
//        methodOverloadingExample.sum(2);  // giving error while compile time
    }
}


