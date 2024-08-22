package com.java.collectionsframework.collectionInterface.listInterface.arrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingArrayListInAscDesc {

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(31,24,63,11,54,86,54);
//
//        // Collections util class provides the APIs called sort to sort() & reverse()
//        Collections.sort(list);  // asc order
//        System.out.println(list);
//
//        Collections.reverse(list);  // desc order
//        System.out.println(list);

        // how to sort custom objects
        List<Employee> employees = Arrays.asList(new Employee("Rani", 23, 12345, 9000), new Employee("Arun", 23, 12346, 15000), new Employee("Priya", 23, 12347, 7500));

//        Collections.sort(employees, new CustomSort());
//        System.out.println(employees);

        // sort by using anonymous implementation
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary() - o2.getSalary();  //to get Asc order
//                return o2.getSalary() - o1.getSalary();  //to get desc order
            }
        });
        System.out.println(employees);

        // sort by using lambda expression
        Collections.sort(employees, (o1, o2) -> o1.getSalary() - o2.getSalary());  //to get Asc order
        System.out.println(employees);
        Collections.sort(employees, (o1, o2) -> o2.getSalary() - o1.getSalary());  //to get dec order
        System.out.println(employees);


        // sort employee by their name
        Collections.sort(employees, (o1, o2) -> o1.getName().compareTo(o2.getName()));  //to get Asc order
        System.out.println(employees);
    }

}

//Anonymous class
class CustomSort implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
//        return o1.getSalary() - o2.getSalary();  //to get Asc order
        return o2.getSalary() - o1.getSalary();  //to get desc order
    }
}
