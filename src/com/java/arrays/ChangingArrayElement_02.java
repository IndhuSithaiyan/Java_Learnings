package com.java.arrays;

import java.util.Arrays;

public class ChangingArrayElement_02 {

    //Arrays are mutable in Java - Mutable means you can change the objects
    //Strings are immutable in Java
    //here num & arr variables are pointing to same object in memory
    public static void main(String[] args) {
        int[] num = {3,15,23,6,2};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

    public static void change(int[] arr){
        arr[0]=99;
        System.out.println(Arrays.toString(arr));
    }
}
