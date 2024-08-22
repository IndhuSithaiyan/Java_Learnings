package com.java.collectionsframework.collectionInterface.setInterface.hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSet_ {
    public static void main(String[] args) {
        duplicateValue();
        nullValue();
        unOrdered();

        System.out.println("--------------------------");

        // Create a HashSet from another collection using the HashSet(collection c) constructor
        Set<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(25);
        numbers.add(87);
        numbers.add(5);
        numbers.add(64);
        numbers.add(23);

        Set<String> newNumCollection = new HashSet(numbers);
        System.out.println(newNumCollection);

        // add all the elements from a collection to the HashSet using the addAll() method
        Set<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(7);
        evenNumbers.add(29);
        evenNumbers.add(79);

        numbers.addAll(evenNumbers);  // get the union
        System.out.println(numbers);

        // remove() - elements from the HashSet
        // removeAll() - remove all the elements that exist in a given collection from the HashSet
        // clear() - clear the HashSet completely by removing all the elements
        numbers.remove(87);
        System.out.println(numbers);

        numbers.removeAll(evenNumbers);
        System.out.println(numbers);

        numbers.clear();
        System.out.println(numbers);
    }

    public static void duplicateValue(){
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Element1");
        hashSet.add("Element1");
        hashSet.add("Element1");
        System.out.println(hashSet);
    }

    // set can contain only one null value
    public static void nullValue(){
        Set<String> hashSet = new HashSet<>();
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add("Element1");
        System.out.println(hashSet);
    }

    // HashSet is unOrdered collection
    public static void unOrdered(){
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Element1");
        hashSet.add("Element2");
        hashSet.add("Element3");
        hashSet.add("Element5");
        hashSet.add("Element4");
        hashSet.add("Element5");
        System.out.println(hashSet);
    }


}
