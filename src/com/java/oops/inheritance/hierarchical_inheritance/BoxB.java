package com.java.oops.inheritance.hierarchical_inheritance;

class BoxB extends Box {
    int price;

    public BoxB(int side, int price) {
        super(side);
        this.price = price;
    }

    public static void main(String[] args) {

        BoxB box = new BoxB(5, 700);
        System.out.println("BoxB is ------>> " + "side- " + box.l + " price- " + box.price);
    }

}
