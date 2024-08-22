package com.java.collectionsframework.collectionInterface.setInterface.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorOverHashSet {

    public static void main(String[] args) {

        Set<String> name = new HashSet<>();
        name.add("Raj");
        name.add("Gopi");
        name.add("Indu");
        name.add("Balu");
        name.add("Kirsh");
        name.add("Renu");

        //enhance for loop
        for (String empName : name) {
            System.out.println(empName);
        }

        //basic loop with iterator
        for (Iterator<String> iterator = name.iterator();iterator.hasNext();){
            String s = (String) iterator.next();
            System.out.println(s);
        }

        //while loop with iterator
        Iterator<String> iterator = name.iterator();
        while (iterator.hasNext()){
            String s = (String) iterator.next();
            System.out.println(s);
        }

        //JDK 8 forEach method with lambda
        name.forEach((employee) -> System.out.println(employee));

        //JDK 8 streaming + forEach() + lambda exp
        name.stream().filter(empName -> !"Indu".equals(empName)).forEach(empName -> System.out.println(empName));
    }
}
