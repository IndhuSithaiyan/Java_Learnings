package com.java.java8features.streams.map_flatmap;

import com.java.java8features.streams.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMap {

    public static void main(String[] args) {

        List<Student> studentList = Stream.of(
                new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")))
                .collect(Collectors.toList());

        // List<Student> convert List<String>  -> Data Transformation
        // mapping: student -> getCity() one to one mapping
        List<String> map = studentList.stream().map(x -> x.getCity()).collect(Collectors.toList());
        System.out.println(map);

        // one to many mapping
        List<List<String>> flatmap = studentList.stream().map(x -> x.getContacts()).collect(Collectors.toList());
        System.out.println(flatmap);

        List<String> flat = studentList.stream().flatMap(x -> x.getContacts().stream()).collect(Collectors.toList());
        System.out.println(flat);

    }
}
