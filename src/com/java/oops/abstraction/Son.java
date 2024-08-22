package com.java.oops.abstraction;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am a Police.");
    }

    @Override
    void lifePartner() {
        System.out.println("I'd like to marry a Police women.");
    }

    void studies(){
        System.out.println("I have done BSC - Maths.");
    }
}
