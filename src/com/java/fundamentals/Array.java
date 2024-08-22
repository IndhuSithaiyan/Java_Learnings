package com.java.fundamentals;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
//        Array
        int [] numbers = {2,0,1,32,7};  //one way
        String [] name = {"indu","raj"};

//        int [] numbers = new  int[3];   //other way
//        numbers[0] = 1;
//        numbers[1] = 6;
//        numbers[2] = 2;

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        System.out.println(Arrays.toString(name));
    }
}
