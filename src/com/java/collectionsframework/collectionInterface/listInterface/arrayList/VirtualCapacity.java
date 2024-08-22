package com.java.collectionsframework.collectionInterface.listInterface.arrayList;

import java.util.ArrayList;

public class VirtualCapacity {

    public static void main(String[] args) {

        //virtualCapacity - arraylist is have 10 as virtualCapacity by default, we can check this via debugging
        //physicalCapacity - It is an elements count of an Arraylist

        ArrayList<Integer> number = new ArrayList<>();
        System.out.println(number.size()); //pc=0
        number.add(100);
        System.out.println(number.size()); //pc=1
        number.add(29);
        number.add(10);
        number.add(0);
        System.out.println(number.size()); //pc=4




    }
}
