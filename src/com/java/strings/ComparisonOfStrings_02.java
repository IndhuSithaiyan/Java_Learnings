package com.java.strings;

public class ComparisonOfStrings_02 {

    public static void main(String[] args) {

        //2 ways to do
        // == & equals method

        // ==  -> comparator - check if ref variables are pointing to same object

        String a = "indu";
        String b = "indu";
        //here a & b are pointing to same obj then the result will be true
        //here a & b are pointing to different obj then the result will be false

        System.out.println((a == b));   //true
        System.out.println((a.equals(b)));      //when you want to check values then use equals method

        String m = new String("indu");
        String n = new String("indu");      //creating these values outside the pool but in heap

        System.out.println((m == n));   //this will be 'false'
        System.out.println((m.equals(n)));

        //if you want to get the string index
        System.out.println(m.charAt(0));

    }
}
