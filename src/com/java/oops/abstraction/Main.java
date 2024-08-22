package com.java.oops.abstraction;

public class Main {

    public static void main(String[] args) {

        Son son = new Son(28);
        son.career();

        Daughter daughter = new Daughter(25);
        daughter.career();

//        Parent parent= new Parent(32);  //can't create objects for abstract classes

        // Run time polymorphism
        Parent parent1= new Son(32);  //object is having overridden method so we can call those method
        son.career();
        son.helloworld();

        Parent.hello();

    }
}
