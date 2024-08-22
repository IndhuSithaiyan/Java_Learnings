package com.java.arrays;

public class ColumnIsNotFixed_05 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5},
                {5,3},
                {7,34,4,8,1},
                {6,4,2}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
