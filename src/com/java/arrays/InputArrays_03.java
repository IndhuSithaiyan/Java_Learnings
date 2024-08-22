package com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InputArrays_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //arrays of primitives
        int[] num = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;

//        input using for loops
//        for (int i = 0; i < num.length; i++) {
//            num[i] = scanner.nextInt();
//        }
//
//        for (int j = 0; j < num.length; j++) {
//            System.out.print(num[j]+" ");
//        }

        //or
//        System.out.println(Arrays.toString(num));


//        for (int arr: num) {
//            arr = scanner.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[10]);      //indexbound exception

        //arrays of objects
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.next();
        }

        System.out.println(Arrays.toString(str));

        // Array modify
        str[1] = "induu";

        System.out.println(Arrays.toString(str));

    }
}
