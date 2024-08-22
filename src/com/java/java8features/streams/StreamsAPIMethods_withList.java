package com.java.java8features.streams;

import com.java.collectionsframework.collectionInterface.listInterface.arrayList.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAPIMethods_withList {

    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")))
                .collect(Collectors.toList());

        /**
         *   1. sort this list based on Name
         *   we have multiple ways
         *   a) by implementing comparator
         *   b) instead of creating a class and implementing the method
         *   c) instead of providing the anonymous implementation go with lambda expression
         *   d) streams API
         */

        // a) by implementing comparator
//        Collections.sort(studentList, new MyClass());
//        System.out.println(studentList);

        // b) instead of creating a class and implementing the method
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getRank() - o2.getRank();
            }
        });
//        System.out.println(studentList);

        // c) instead of providing the anonymous implementation go with lambda expression
        Collections.sort(studentList, (o1, o2) -> o1.getRank() - o2.getRank());
//        System.out.println(studentList);

        //  d) streams API
//        studentList.stream().sorted((o1, o2) -> o1.getRank() - o2.getRank()).forEach(System.out::println);

        // comparator - comparing method -> by using lambda expression
//        studentList.stream().sorted(Comparator.comparing(stu -> stu.getRank())).forEach(System.out::println);

        // comparing - by using method reference
        studentList.stream().sorted(Comparator.comparing(Student::getFirstName)).forEach(System.out::println);
        studentList.stream().sorted(Comparator.comparing(Student::getFirstName)).forEach(System.out::println);
        studentList.stream().map(Student::getFirstName).forEach(System.out::println);

        Map<String, Integer> map = new TreeMap<>();
        map.put(null, 1);
        map.put("indu", 1);
        System.out.println(map);

    }
}

class MyClass implements Comparator<Student>{

    // we can not specify this return type as string bez compare is returning int only in parent class (Comparator)
//    @Override
//    public String compare(Student o1, Student o2) {
//        return o1.getFirstName() - o2.getFirstName(); // ascending
//    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFirstName().compareTo(o2.getFirstName()); // ascending
    }

//    @Override
//    public int compare(Student o1, Student o2) {
//        return o1.getRank() - o2.getRank(); // ascending
//    }


}
