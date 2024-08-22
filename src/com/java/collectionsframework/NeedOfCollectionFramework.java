package com.java.collectionsframework;

public class NeedOfCollectionFramework {

    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;
        int e = 10;
        int f = 10;
        int g = 10;
        int h = 10;

        // if you want to store 10000 numbers in integer variable then you have to define 10000 integers in variables It is bad practice
        // so you need to store the whole numbers in single variable via Arrays

        int[] num = new int[10000];

        //limitations of an Arrays
        // 1. Arrays are in fixed size
        // 2. Arrays can hold only homogeneous(same type of data) data elements
        // 3. ready made APIs support is not available in array

        // to overcome these Arrays limitations collections coming into the picture

        Students[] students = new Students[1];
        students[0] = new Students();
//        students[1] = new Books();  //can't add books obj this is diff type

        // Object class can accept all type of objects
        Object[] objects = new Object[1];
        objects[0] = new Students();
        objects[1] = new Books();
    }

}

class Students{

}


class Books{

}
