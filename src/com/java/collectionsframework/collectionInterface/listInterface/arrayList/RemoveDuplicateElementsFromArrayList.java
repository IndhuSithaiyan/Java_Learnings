package com.java.collectionsframework.collectionInterface.listInterface.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,4,1,4,3,5,6,6,7,7,8,8,9,9,2));

        // LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(numbers);
        ArrayList<Integer> arrayListWithoutDuplicateElements = new ArrayList<>(linkedHashSet);
        System.out.println(arrayListWithoutDuplicateElements);

        //Java-8 feature - Streams
        List<Integer> uniqueList = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);
    }
}
