package com.java.arrays;

import java.util.Arrays;

        /**
         *  swap the array values
         */

public class SwapArrays {

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            //swap
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,8,9,42,6};
        swap(arr,0,5);
        System.out.println(Arrays.toString(arr));

        swap(arr,0,1);
        System.out.println(Arrays.toString(arr));

        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
