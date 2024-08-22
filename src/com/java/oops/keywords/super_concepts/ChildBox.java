package com.java.oops.keywords.super_concepts;

public class ChildBox extends ParentBox {

    int weight;

    public ChildBox(double l, double w, double h, int parent_weight, int child_weight) {
        super(l, w, h, parent_weight);
        this.weight = child_weight;
        System.out.println("parent weight : "+ super.weight);
        System.out.println("child weight : "+ this.weight);
    }

    public ChildBox(ParentBox oldBox, int weight) {
        super(oldBox);
        this.weight = weight;
    }
}
