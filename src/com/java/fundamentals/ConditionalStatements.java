package com.java.fundamentals;

import java.util.Locale;

public class ConditionalStatements {

    public static void main(String[] args) {
//        if else - statement
        int age = 17;
        if (age >= 18){
            System.out.println("I am an adult");
        } else if (age >= 16 && age < 18){
            System.out.println("I am almost an adult");
        } else {
            System.out.println("I am not an adult");
        }

        System.out.println("------------------------------------------------");

//        switch statement
        String gender = "MALE";
        switch (gender.toUpperCase(Locale.ROOT)){
            case "FEMALE":
                System.out.println("I am a FEMALE");
                break;
            case "MALE":
                System.out.println("I am a MALE");
                break;
            case "PREFER NOT SAY":
                System.out.println("prefer not say");
                break;
            default:
                System.out.println("Unknown gender");
        }

        System.out.println("------------------------------------------------");

        //for loops
        int[] numbers = {2,1,4,6,7,3,4,75};
        for (int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println("enhanced for loop");

        for (int number: numbers) {
            System.out.println(number);
        }

        System.out.println("Bonus Tip: ");
//        numbers.for --> foreach   numbers.fori ---> for loop increment   numbers.forr ---> for loop reverse
        for (int i = 0; i < numbers.length; i++) {

        }
        for (int i = numbers.length - 1; i >= 0; i--) {

        }
        for (int number : numbers) {

        }

        //while - do while
        int count = 1;

        while(count<=20){
            System.out.println(count);
            count++;
        }

        do {
            System.out.println(count);
            count++;
        }
        while(count<=20);

    }
}
