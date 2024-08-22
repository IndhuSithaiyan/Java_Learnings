package com.java.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists_06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(3);
        list.add(21);
        list.add(4);
        list.add(6);
        list.add(43);
        list.add(8);
        list.add(990);
        System.out.println(list);
        list.set(1,789);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        //input
        for (int j = 0; j < 5; j++) {
            list.add(in.nextInt());
        }

        //iterate the elements
        //to get an element from the list
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); //pass index here, variable[index] will not work in arraylist
        }

        System.out.println(list);
    }
}
