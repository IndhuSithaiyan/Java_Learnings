package com.java.collectionsframework.mapInterface.hashMap;

import java.util.*;

public class HashMap_ {
    public static void main(String[] args) {

        // no order - no indexing
        // stores values - Key - Values <K,V>
        // can store n number of null values but only one null key
        // hashMap is not thread safe- unsynchronized

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("one", 1);
        map1.put("two", 2);
        map1.put("three", 3);
        map1.put("four", 4);
        map1.put("five", 5);
        map1.put(null, 6);
        map1.put(null, 7);  //here null is duplicate so it is replacing the existing one

        System.out.println(map1);

        //check if HashMap is empty
        System.out.println(map1.isEmpty());

        //HashMap size()
        System.out.println(map1.size());

        //check if key is exist in HashMap
        System.out.println(map1.containsKey("five"));
        System.out.println(map1.containsKey("six"));

        //check if value is exist in HashMap
        System.out.println(map1.containsValue(null));

        //get value
        System.out.println(map1.get("one"));

        //remove keys from HashMap
        map1.remove("one");
        System.out.println(map1);

        //get only keys from the HashMap
        Set<String> setkeys =  map1.keySet();
        System.out.println(setkeys);

        //get only values from the HashMap
        Collection<Integer> setValue =  map1.values();
        System.out.println(setValue);

        //diffent ways to iterate hashMap
        //for each method
        for(Map.Entry<String, Integer> entry : map1.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("----------------");

        //iterator: over the keys: by using keySet()
        Iterator<String> it = map1.keySet().iterator();
        while (it.hasNext()){
            String key = it.next();
            int value = map1.get(key);
            System.out.println("key : "+key+", value : "+value);

        }

        //iterator: over the set(pair): by using entrySet()
        Set<Map.Entry<String, Integer>> entries = map1.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("key : " + entry.getKey()+ ", value : " +entry.getValue());
        }
        System.out.println("----------------");

        //hashMap using java 8 foreach
        map1.forEach((K, V) -> {
            System.out.println("key : "+K+", value : "+V);
        });

    }
}
