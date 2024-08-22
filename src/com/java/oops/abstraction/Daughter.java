package com.java.oops.abstraction;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am doctor.");
    }

    @Override
    void lifePartner() {
        System.out.println("I want to marry a doctor.");
    }
}
