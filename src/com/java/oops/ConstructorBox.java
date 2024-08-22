package com.java.oops;

public class ConstructorBox {

    double l;
    double w;
    double h;

    ConstructorBox() {           //No arg constructor
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    ConstructorBox(double side) {
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

    ConstructorBox(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    ConstructorBox(ConstructorBox oldBox) {
        this.l = oldBox.l;
        this.w = oldBox.w;
        this.h = oldBox.h;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
