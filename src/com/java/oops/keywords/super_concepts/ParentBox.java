package com.java.oops.keywords.super_concepts;

public class ParentBox {

    double l;
    double w;
    double h;
    int weight;

    ParentBox() {           //No arg constructor
        System.out.println("parent class constructor");
        this.l = -1;
        this.w = -1;
        this.h = -1;
        this.weight = 10;
    }

    ParentBox(double l, double w, double h, int weight) {
        this.l = l;
        this.w = w;
        this.h = h;
        this.weight = weight;
    }

    ParentBox(ParentBox oldBox) {
        this.l = oldBox.l;
        this.w = oldBox.w;
        this.h = oldBox.h;
    }

}
