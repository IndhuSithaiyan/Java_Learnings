package com.java.arrays;

public class ArrayIntro_01 {

    public static void main(String[] args) {

        //syntax to create an array
//        datatype[] var_name = new dataType[size]
//        int[] num = new int[5];

//        or directly
//        int[] num = {1,2,3,45};

        int[] num;   //declaration of array. num is getting defined in the stack
        num = new int[5];   //initialization actually here object is being created in the heap memory

        System.out.println(num[1]);

        String[] name = new String[3];
        System.out.println(name[1]);

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car: cars) {
            System.out.println(car);
        }
    }
}
