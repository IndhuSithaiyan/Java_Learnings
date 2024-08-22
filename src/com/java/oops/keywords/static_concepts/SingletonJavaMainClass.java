package com.java.oops.keywords.static_concepts;

public class SingletonJavaMainClass {
    public static void main(String[] args) {
        SingletonJavaClass obj1 = SingletonJavaClass.getInstance();
        System.out.println(obj1);
        SingletonJavaClass obj2 = SingletonJavaClass.getInstance();
        System.out.println(obj2);
//        SingletonJavaClass obj3 = SingletonJavaClass.getInstance();

    }
}
