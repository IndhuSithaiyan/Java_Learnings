package com.java.collectionsframework.collectionInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collection_example {

    public static void main(String[] args) {
        Collection<String> fruitCollection = new ArrayList<>();
        fruitCollection.add("Banana");
        fruitCollection.add("Pomegranate");
        fruitCollection.add("Strawberry");
        fruitCollection.add("Apple");

        System.out.println(fruitCollection);

        System.out.println("contains: "+fruitCollection.contains("Apple"));

        System.out.println("isEmpty: "+fruitCollection.isEmpty());

        System.out.println(fruitCollection.remove("apple"));
        System.out.println(fruitCollection);
        System.out.println(fruitCollection.remove("Apple"));

//        fruitCollection.clear();
//        System.out.println(fruitCollection);

        System.out.println("------------------------------------------");

        fruitCollection.forEach((fruits) -> System.out.println(fruits));

        //forEach
//        for (String elements: fruitCollection) {
//            System.out.println(elements);
//        }

        List<Object> objectList = new ArrayList<Object>();
        objectList.add("spring");
        objectList.add(2.7);
        objectList.add(true);
        objectList.add(5);
        objectList.add(new int[2]);

        System.out.println(objectList);

    }
}
