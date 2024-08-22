package com.java.arrays;

public class MaxArrays {

    public static void main(String[] args) {
        int[] arr = {1,4,8,9,42,6};

        System.out.println(max(arr));
        System.out.println(maxRange(arr,0,3));
    }

    static int maxRange (int[] arr, int start, int end){
        int maxArr = start;

        for (int i = 1; i <= end ; i++) {
            if (arr[i] > maxArr){
                maxArr = arr[i];
            }
        }
        return maxArr;
    }

    static int max (int[] arr){
        int maxArr = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > maxArr){
                maxArr = arr[i];
            }
        }
        return maxArr;
    }
}
