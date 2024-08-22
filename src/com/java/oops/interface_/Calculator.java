package com.java.oops.interface_;

public interface Calculator {

    int NUMBER = 10;  // declared variables are final & static by default
    public void addition();     // declare methods that abstract by default
    public void subtraction();
    public void multiplication();
    public void division();

//    public void helloworld(){     // Interface abstract methods cannot have body
//        System.out.println("hey, static you are from abstract class....");
//    }
}
