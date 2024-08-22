package com.java.collectionsframework.collectionInterface.listInterface.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorOverLinkedList {

    public static void main(String[] args) {

        LinkedList<String> name = new LinkedList<>();
        name.add("Raj");
        name.add("gopi");
        name.add("Indu");
        name.add("ilaki");
        name.add("ram");
        name.add("seeta");

        //iterator
        Iterator<String> iterator = name.iterator();
        while (iterator.hasNext()){
            String s = (String) iterator.next();
            System.out.println(s);
        }

        //forEach - lambda function
        name.forEach((employee) -> System.out.println(employee));

        //forEach
        for (String empName: name) {
            System.out.println(empName);
        }
    }
}
