package com.java.oops.inheritance.single_inheritance;

public class ParentBoxMain {

    public static void main(String[] args) {

        ParentBox threeParamConstBox = new ParentBox(3,2,1);
        System.out.println(threeParamConstBox.h + " " + threeParamConstBox.l + " " + threeParamConstBox.w);

        ParentBox box = new ParentBox(threeParamConstBox);
        System.out.println(box.h + " " + box.l + " " + box.w);

        ChildBox box1 = new ChildBox(90);
        System.out.println(box1.h + " " + box1.l + " " + box1.w + " " + box1.weight);

        ChildBox box2 = new ChildBox(4,2,7,90);
        System.out.println(box2.h + " " + box2.l + " " + box2.w + " " + box2.weight);

    }
}
