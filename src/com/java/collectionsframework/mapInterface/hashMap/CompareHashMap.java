package com.java.collectionsframework.mapInterface.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "A");
        hashMap1.put(2, "B");
        hashMap1.put(3, "C");

        HashMap<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.put(2, "B");
        hashMap2.put(1, "A");
        hashMap2.put(3, "C");

        HashMap<Integer, String> hashMap3 = new HashMap<>();
        hashMap3.put(2, "B");
        hashMap3.put(1, "A");
        hashMap3.put(3, "C");
        hashMap3.put(3, "D");

        //1. on basis of Key-Value: use equals method
        System.out.println(hashMap1.equals(hashMap2));  //order doesn't matter
        System.out.println(hashMap1.equals(hashMap3));

        //2. compare hashmap for the same keys
        System.out.println(hashMap1.keySet());
        System.out.println(hashMap1.keySet().equals(hashMap2.keySet()));  //order doesn't matter
        System.out.println(hashMap1.keySet().equals(hashMap3.keySet()));  //if duplicate key is available it will ignore the key and replace the key with next value

        //3. find out the extra keys:
        HashMap<Integer, String> hashMap4 = new HashMap<>();
        hashMap4.put(1, "A");
        hashMap4.put(2, "B");
        hashMap4.put(3, "C");
        hashMap4.put(4, "D");
        //combine/union the keys from both the maps : using HashSet
        HashSet<Integer> combineKeys = new HashSet<>(hashMap1.keySet());
        combineKeys.addAll(hashMap4.keySet());  // add the keySet from map4
        combineKeys.removeAll(hashMap1.keySet());
        System.out.println(combineKeys);

        //4. compare the maps by values:
        HashMap<Integer, String> hashMap5 = new HashMap<>();
        hashMap5.put(1, "A");
        hashMap5.put(2, "B");
        hashMap5.put(3, "C");

        HashMap<Integer, String> hashMap6 = new HashMap<>();
        hashMap6.put(5, "B");
        hashMap6.put(4, "A");
        hashMap6.put(6, "C");

        HashMap<Integer, String> hashMap7 = new HashMap<>();
        hashMap7.put(2, "B");
        hashMap7.put(1, "A");
        hashMap7.put(3, "C");
        hashMap7.put(4, "C");

        System.out.println(hashMap6.values().equals(new HashSet<>(hashMap7.values())));
        System.out.println(new HashSet<>(hashMap7.values()));

        // 1. duplicates are allowed :using Arraylist
        System.out.println(new ArrayList<>(hashMap6.values()).equals(new ArrayList<>(hashMap5.values())));  //true
        System.out.println(new ArrayList<>(hashMap6.values()).equals(new ArrayList<>(hashMap7.values())));  //false - 'C' is not replaced with duplicate(previous value)

        // 2. duplicates are replaced :using HashSet
        System.out.println(new HashSet<>(hashMap6.values()).equals(new HashSet<>(hashMap5.values())));  //true
        System.out.println(new HashSet<>(hashMap6.values()).equals(new HashSet<>(hashMap7.values())));  //true - 'C' is replaced with duplicate(previous value)

    }
}
