package com.java.collectionsframework.mapInterface.hashMap;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingHashMapsDifferentWays {

    //Creating hashMap

    public static Map<String, Integer> marksMap;
    static {
        marksMap = new HashMap<>();
        marksMap.put("Raj", 200);
        marksMap.put("Indu", 200);
    }

    public static void main(String[] args) {

        //using Map & HashMap class
        Map<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        //static way : static hashMap
        System.out.println(CreatingHashMapsDifferentWays.marksMap.get("Raj"));
        System.out.println(CreatingHashMapsDifferentWays.marksMap);

        //immutable Map with only one single entry
        Map<String,Integer> map3 = Collections.singletonMap("Naveen", 200);
        System.out.println(map3.get("Naveen"));
//        map3.put("Babu", 230);  // UnsupportedOperationException - If you add more than one Map values

        //Java 8: creating 2D array of String using streams & collecting in the form Map
        Map<String, String> map4 = Stream.of(new String [][] {
                {"Tom", "A - Grade"},
                {"Jerry", "B - Grade"},
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

        System.out.println(map4.get("Tom"));
        map4.put("Cartoon", "A+");
        System.out.println(map4);

        //Using simpleEntry: Mutable Map
        Map<String, String> map5 = Stream.of(
                new AbstractMap.SimpleEntry<>("Naveen", "Tom"),
                new AbstractMap.SimpleEntry<>("Raj", "Tom")
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(map5.get("Raj"));
        map5.put("Jerry", "Cheese");
        System.out.println(map5.get("Jerry"));

        //Using simpleEntry: Immutable Map
        Map<String, String> map6 = Stream.of(
                new AbstractMap.SimpleImmutableEntry<>("Naveen", "Tom"),
                new AbstractMap.SimpleImmutableEntry<>("Raj", "Tom")
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(map6.get("Raj"));
        map6.put("Jerry", "Cheese");
        System.out.println(map6.get("Jerry"));


    }

}
