package com.java.oops.inheritance.single_inheritance;

public class ChildBox extends ParentBox{

    int weight;

    public ChildBox(int weight) {
        this.weight = weight;
    }

    public ChildBox(double l, double w, double h, int weight) {
        super(l, w, h);     // what is this? call the parent class constructor
//        used to initialize values present in parent class
//        All those sub class includes like the members of it's super class it will be allow you to access that are private
        this.weight = weight;
    }
}
