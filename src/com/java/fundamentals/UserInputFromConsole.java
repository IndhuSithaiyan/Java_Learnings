package com.java.fundamentals;

import java.time.LocalDate;
import java.util.Scanner;

public class UserInputFromConsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("your name : "+ scanner.nextLine());

        System.out.println("your age : ");
        int age = scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println();

        if (age<18){
            System.out.println("you were born in "+year+" and you are not an adult :(");
        }
        else {
            System.out.println("you were born in "+year+" and you are an adult :)");
        }
    }
}
