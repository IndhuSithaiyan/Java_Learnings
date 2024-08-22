package com.java.oops.abstraction;

public abstract class Parent {

    int age;

//    static int age;  //here we can create static & final variable
//    final int age;

    public Parent (int age) {
        this.age = age;
    }

//    public abstract Parent(){         //can't create abstract constructor
//    }                                //bez we can't create the object for this abstract class since abstract class methods doesn't have any body

    abstract void career();
    abstract void lifePartner();

    // can we create abstract static methods? NOO, bez static methods can't be overridden.
    // Abstract methods are needs to be overridden.
    // but we can create static methods in abstract class

    static void hello(){
        System.out.println("hey, static you are from abstract class....");
    }

    public void helloworld(){
        System.out.println("hey, static you are from abstract class....");
    }
}
