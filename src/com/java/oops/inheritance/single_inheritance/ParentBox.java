package com.java.oops.inheritance.single_inheritance;

public class ParentBox {

    //    private double l;
    double l;
    double w;
    double h;

    ParentBox() {           //No arg constructor
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    ParentBox(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

//    ParentBox(double lside, double rside) {
//        this.l = lside;
//        this.w = lside;
//        this.h = lside;
//        this.l = rside;
//        this.w = rside;
//        this.h = rside;
//    }

    ParentBox(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    ParentBox(ParentBox oldBox) {
        this.l = oldBox.l;
        this.w = oldBox.w;
        this.h = oldBox.h;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
