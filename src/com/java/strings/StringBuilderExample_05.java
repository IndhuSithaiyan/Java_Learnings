package com.java.strings;

public class StringBuilderExample_05 {

    public static void main(String[] args) {

        String series = "";

//        for (int i = 0; i < 26; i++) {
//            System.out.println((char) ('a'+i));
//        }

        //here series obj is created every time during looping in string pool (in heap memory)
        //when first obj 'a' second obj 'ab', third obj 'abc'.....so on.. final obj 'abcdefghijklmnopqrstuvwxyz'

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+i);
            series = series + ch;  // series += ch
        }
        System.out.println("series :" + series);


        StringBuilder stringBuilder = new StringBuilder();
        //instead of creating new objects again and again, It is changing only the original obj which is created here.
        // this is not immutable it is mutable just like arrays
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+i);
            stringBuilder.append(ch);
        }
        System.out.println(stringBuilder);


        stringBuilder.reverse();
        System.out.println(stringBuilder);

        stringBuilder.deleteCharAt(0);
        System.out.println(stringBuilder);

    }
}
