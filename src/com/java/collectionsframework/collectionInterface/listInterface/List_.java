package com.java.collectionsframework.collectionInterface.listInterface;

import java.util.ArrayList;
import java.util.List;

public class List_ {

    public static void main(String[] args) {
        // List allow you to add duplicate elements
        List<String> list = new ArrayList<>();
        list.add("elements");
        list.add("elements");
        list.add("element1");
        System.out.println(list);

        // List allow you to add 'null' elements
        list.add(null);
        System.out.println(list);

        //insertion order
        list.add("element1");
        list.add("element2");
        list.add("element4");
        list.add("element5");
        list.add("element3");
        System.out.println(list);

        //access elements from the list
        System.out.println(list.get(0));
        System.out.println(list.get(3));
    }
}
