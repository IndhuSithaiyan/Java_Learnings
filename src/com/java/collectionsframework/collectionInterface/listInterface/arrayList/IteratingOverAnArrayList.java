package com.java.collectionsframework.collectionInterface.listInterface.arrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratingOverAnArrayList {

    public static void main(String[] args) {

        List<String> programmingLan = Arrays.asList("Java", "Python", "JavaScript", "PHP", "C#", ".net");

        // for loop
        for (int i = 0; i < programmingLan.size(); i++) {
            System.out.println(programmingLan.get(i));
        }

        // forEach
        for (String language : programmingLan) {
            System.out.println(language);
        }

        // basic loop with iterator
        for (Iterator iterator = programmingLan.iterator(); iterator.hasNext();){
            String course = (String) iterator.next();
            System.out.println(course);
        }

        // Iterator with while loop
        Iterator<String> iterator = programmingLan.iterator();
        while (iterator.hasNext()){
            String course = (String) iterator.next();
            System.out.println(course);
        }

        // Java 8 streams with lambda example
        programmingLan.stream().forEach(course -> System.out.println(course));

        // Java 8 Lambda example
        programmingLan.forEach((course) -> System.out.println(course));


        String[] geeks = {"Rahul", "Utkarsh",
                "Shubham", "Neelam"};


        List<String> names = Collections.nCopies(5, "indu");
        System.out.println(names);
        try{
            names.set(0, "world");
        } catch (UnsupportedOperationException e){
            System.out.println("Colleciton N copies returns a Immutable list we cannot modify...");
        }
    }
}
