package com.java.fundamentals;

public class WrapperClass {

    public static void main(String[] args) {
        int num =4;
//        Integer num1 = new Integer(num);  // boxing - taking primitive values and storing into Integer wrapper class object
        Integer num1 = num;  // auto-boxing - primitive variables are wrapping it into integer object

//        int num2 = num1.intValue();  //unboxing -
        int num2 = num1;  //auto-unboxing - object content is storing into primitive type of data
        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str);  // converting string to int

        System.out.println(num3*3);
    }
}
