package com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray_04 {
    public static void main(String[] args) {

        /*
                1 2 6
                4 7 2
                6 4 1

                3 rows & 3 columns
        */

        //one dimension array is defined with one [], like int[]
        //two dimension array is defined with 2 [][], like int[][]

        /*
                int[][] arr = new int[rows][columns];

                in heap memory, it will store like this..
                [
                [1,24,6] -> index- 0
                [5,3,8] -> index- 1
                [5,3,1] -> index- 2
                ]

        */

//        int[][] arr = new int[3][];        //int[rows][columns] - columns is not necessary to specify. it's not mandatory
//
//        int[][] arr2D = {
//                {1,2,4},    //0th index
//                {5,1,7},    //1th index
//                {8,3,1}    //2th index
//        };
//        // for example, if we call arr2D[2][1] = 8, or arr2D[2] = {8,3,1}

        //input
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);  //no of rows

        //input
        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scanner.nextInt();
            }
        }

        //output
        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        System.out.println("-----------------------");

        //output
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        
        //other way is 
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

    }

}
