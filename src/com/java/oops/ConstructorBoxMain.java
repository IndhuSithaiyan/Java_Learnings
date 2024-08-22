package com.java.oops;

public class ConstructorBoxMain {

    public static void main(String[] args) {
        ConstructorBox defaultConstBox = new ConstructorBox();
        System.out.println(defaultConstBox.h + " " + defaultConstBox.l + " " + defaultConstBox.w);

        ConstructorBox singleParamConstBox = new ConstructorBox(1.2);
        System.out.println(singleParamConstBox.h + " " + singleParamConstBox.l + " " + singleParamConstBox.w);

//        ParentBox twoParamConstBox = new ParentBox(1.2, 2.1);
//        System.out.println(twoParamConstBox.h + " " + twoParamConstBox.l + " " + twoParamConstBox.w);

        ConstructorBox threeParamConstBox = new ConstructorBox(3,2,1);
        System.out.println(threeParamConstBox.h + " " + threeParamConstBox.l + " " + threeParamConstBox.w);

        ConstructorBox box = new ConstructorBox(threeParamConstBox);
        System.out.println(box.h + " " + box.l + " " + box.w);
    }
}
