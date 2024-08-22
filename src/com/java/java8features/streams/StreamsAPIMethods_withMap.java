package com.java.java8features.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAPIMethods_withMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("five", 5);
        map.put("six", 6);
        map.put("eight", 8);

        // covert map to list
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // providing anonymous Implementation
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());  //ascending sorting
            }
        });

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey()+ " : " +entry.getValue());
        }
        System.out.println("-----------------------------------");

        // using streams
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("-----------------------------------");

        // if you want to print compare by value
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        Map<Student, Integer> studentList = new HashMap<>();
        studentList.put(new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")), 10);
        studentList.put(new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")), 40);
        studentList.put(new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")), 20);
        studentList.put(new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")), 30);
        studentList.put(new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")), 60);

//        List<Map.Entry<Student, Integer>> stuList = new ArrayList<Student>(map.entrySet());
//        Collections.sort(stuList, new Comparator<Map.Entry<Student, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Student, Integer> o1, Map.Entry<Student, Integer> o2) {
//                return o1.getKey().compareTo(o2.getKey());  //ascending sorting
//            }
//        });


        studentList.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

        System.out.println("---------------------------------------");

        // sorting by firstName
        studentList.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getFirstName))).forEach(System.out::println);

        System.out.println("---------------------------------------");

        //reverse
        studentList.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getFirstName).reversed())).forEach(System.out::println);

    }

}
