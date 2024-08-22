package com.java.oops.inheritance.hierarchical_inheritance;

class BoxA extends Box {
    int weight;

    public BoxA(int side, int weight) {
//        super(); //default value will be print bez it refers to no-args constructor of a parent class
        super(side);
        this.weight = weight;
    }

    public static void main(String[] args) {

        BoxA box = new BoxA(5, 67);
        System.out.println("BoxA is ------>> " + "side- " + box.l + " weight- " + box.weight);
    }
}
