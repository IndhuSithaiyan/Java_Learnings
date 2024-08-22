package com.java.collectionsframework.collectionInterface.setInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_ {

    public static void main(String[] args) {

        Integer[] arr = {1,2,3,12,1,1,2,3,10,23,41,31,3,123,21,32,16};
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println("linkedHashSet : "+linkedHashSet);       // insertion order & unique elements

        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(arr));
        System.out.println("hashSet : "+hashSet);       // unordered & unique elements

        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(arr));
        System.out.println("treeSet : "+treeSet);       // Ascending order & unique elements
        // treeSet is comes from SortedSet & NavigableSet
    }
}
