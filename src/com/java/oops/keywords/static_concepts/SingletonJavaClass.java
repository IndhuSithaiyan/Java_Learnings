package com.java.oops.keywords.static_concepts;

public class SingletonJavaClass {

    //only one object (an instance of the class) at a times

    private SingletonJavaClass() {          //constructor

    }

    private static SingletonJavaClass instance;

    public static SingletonJavaClass getInstance() {
        //check whether 1 obj only is created or not
        if (instance == null){
            instance = new SingletonJavaClass();
            System.out.println(instance.hashCode());
        }
        return instance;
    }
}
