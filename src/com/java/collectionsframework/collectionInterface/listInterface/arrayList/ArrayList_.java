package com.java.collectionsframework.collectionInterface.listInterface.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_ {

    public static void main(String[] args) {

        // create ArrayList using the ArrayList() constructor
        // add new elements to an ArrayList using add() method
        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape");

        System.out.println(fruits);


        // create ArrayList from another collection using the ArrayList(Collection c) constructor
        List<String> newVegsCollection = new ArrayList<>(fruits);
        newVegsCollection.add("Onion");
        newVegsCollection.add("Tomato");
        System.out.println(newVegsCollection);

        // add all elements from an existing collection to the new ArrayList using addAll() methods
        System.out.println(fruits.addAll(newVegsCollection));
        System.out.println(fruits);


        // Accessing elements at a particular index from ArrayList
        System.out.println(fruits.get(2));

        // check if ArrayList is empty
        System.out.println(fruits.isEmpty());

        // find the size of the ArrayList
        System.out.println(fruits.size());

        // Modify the elements at a particular index
        fruits.set(2,"pineapple");
        System.out.println(fruits);

        //
        fruits.indexOf("Tomato");
        System.out.println(fruits.indexOf("Tomato")>0);

        // remove elements form ArrayList
        fruits.remove(0);
        System.out.println(fruits);

        fruits.remove("apple");
        System.out.println(fruits);

//        fruits.removeAll(newVegsCollection);
//        System.out.println(fruits);

        fruits.clear(); // to clear all the elements from the arraylist
        System.out.println(fruits);


        // given a list, remove only even number and print only odd numbers
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,5,6,7,8,9,9,354,2,43,67));
        list.removeIf(num -> num%2 != 0);
        System.out.println(list);

    }

}
