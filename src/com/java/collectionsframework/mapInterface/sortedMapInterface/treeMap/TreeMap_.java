package com.java.collectionsframework.mapInterface.sortedMapInterface.treeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_ {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(2100, "Tom");
        map.put(1000, "Naveen");
        map.put(8093, "Robby");
        map.put(11000, "Steve");
        map.put(600, "Tom");

        System.out.println(map);

        map.forEach((k,v) -> System.out.println("key = "+k+" value = "+v));

        System.out.println(map.lastKey());
        System.out.println(map.firstKey());

        Set<Integer> keysLessThan3K = map.headMap(3000).keySet();
        System.out.println(keysLessThan3K);

        Set<Integer> keysGraterThan3K = map.tailMap(3000).keySet();
        System.out.println(keysGraterThan3K);

        TreeMap<String, Integer> map3 = new TreeMap<>();
        map3.put("Tom", 300);
        map3.put("Steve", 350);
        map3.put("Naveen", 100);
        map3.put("Arun", 100);
        map3.put("Ram", 20);
        map3.put("RAJ", 3000);
        map3.put("Raj", 89);
        System.out.println(map3);
        map3.forEach((k,v) -> System.out.println("key = "+k+" value = "+v));

        TreeMap<Integer, String> map2 = new TreeMap<>(Comparator.reverseOrder());
        map2.put(300, "Tom");
        map2.put(900, "Naveen");
        map2.put(75, "Robby");
        map2.put(890, "Steve");
        map2.put(600, "Tom");

        System.out.println(map2);

    }
}
