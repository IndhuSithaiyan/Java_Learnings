package com.java.fundamentals;

import java.time.LocalDate;

public class ReferenceDataTypes {

    public static void main(String[] args) {
//        Non primitive data types or reference types
        String name = new String("Induuu");     //no need to import java.lang classes
        System.out.println(name);
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getMonth());


//        different bt primitive & reference type
        /*
        * reference type is always starts with UPPERCASE
        * example, If you give dot after reference type var name you will get many attributes or buildin behaviors (methods).
        * */

//        example
        int a = 10;
        int b = a;
        a =123;

        System.out.println("a = "+a+" "+"b = "+b);      //b takes copy of a value bez we have 2 diff variables

//        ---------------------------------------

        Person person1 = new Person("alex");
        Person person2 = person1;
        System.out.println("before changing name: person1--> "+ person1.name + " person2--> " + person2.name);

        person1.name = "alexdender";
        System.out.println("after changing name: person1--> "+ person1.name + " person2--> " + person2.name);   //this won't copy person2 value bez it's referring the same object

    }

    static class Person {
        String name = "alex";

        public Person(String name) {
            this.name = name;
        }
    }
}
