package com.java.oops.interface_;

public interface ScientificCalculator extends Calculator{

    int NUMBER = 5;  // declared variables are final & static by default

    // If we create same abstract methods in both interface, when we implements these interfaces in class it will just give override methods
    // because we don't have any body in interface we should implement the body in class only
    // here we can implement the method
//    public void addition();
//    public void subtraction();
//    public void multiplication();
//    public void division();

    public void cos();
    public void sin();
}
