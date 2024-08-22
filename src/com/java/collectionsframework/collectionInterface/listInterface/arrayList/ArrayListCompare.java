package com.java.collectionsframework.collectionInterface.listInterface.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {
    public static void main(String[] args) {


        //1. Sort and then equals:
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
        ArrayList<String> l3 = new ArrayList<>(Arrays.asList("B", "A", "C", "D", "F"));

        Collections.sort(l1);
        Collections.sort(l2);
        Collections.sort(l3);

        System.out.println(l1.equals(l2)); //false
        System.out.println(l1.equals(l3)); //true

        // 2. Compare two list - find out the additional elements
        ArrayList<String> l4 = new ArrayList<>(Arrays.asList("B", "A", "C", "D", "F"));
        ArrayList<String> l5 = new ArrayList<>(Arrays.asList("B", "A", "C", "D", "E"));

//        l4.removeAll(l5);
//        System.out.println(l4); // F

//        l5.removeAll(l4);
//        System.out.println(l5); // E

        // 2. find out the common element
        ArrayList<String> lang1 = new ArrayList<>(Arrays.asList("Java", "Python", "C#", ".Net"));
        ArrayList<String> lang2 = new ArrayList<>(Arrays.asList("Java", "A", "C", "D", ".Net"));

        lang1.retainAll(lang2);
        System.out.println(lang1);

    }
}
