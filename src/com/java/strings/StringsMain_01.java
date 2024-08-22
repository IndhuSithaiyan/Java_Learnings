package com.java.strings;

public class StringsMain_01 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6};
        int a = 10;
        String name1 = "indhu";     //collection of character is called String
        String name2 = "indhu";  //here name1 & name2 both are pointing to same obj in memory(in string pool)
//

        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());

        name1 = "cool"; //this object is created newly in memory.

        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
    }
}
