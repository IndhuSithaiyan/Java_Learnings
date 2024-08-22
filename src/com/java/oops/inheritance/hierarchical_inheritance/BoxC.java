package com.java.oops.inheritance.hierarchical_inheritance;

public class BoxC extends Box {

    String color;

    public BoxC(int side, String color) {
        super(side);
        this.color = color;
    }

    public static void main(String[] args) {
        BoxC box = new BoxC(5, "red");
        System.out.println("BoxC is ------>> " + "side- " + box.l + " color- " + box.color);
    }
}
