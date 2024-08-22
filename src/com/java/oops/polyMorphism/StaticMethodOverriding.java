package com.java.oops.polyMorphism;

            /**
             * Overriding depends on objects, static stuffs does not depends on objects
             * hence we cannot override static methods
             *
             * static methods can be inherits but cannot be overridden
             */
class A{
    public static void box(){
        System.out.println("Hi, A class- box method- static method");
    }

    public void boxColor(){
        System.out.println("Hi, A class- boxColor method- non-static method");
    }
}

class B extends A{
    //    @Override     //cannot override the static method
//    public static void box(){
//        System.out.println("Hi, B class- box method- static method");
//    }

    @Override
    public void boxColor(){
        System.out.println("Hi, B class- boxColor method- non-static method");
    }
}

public class StaticMethodOverriding {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

//        System.out.println("calling the static method by using object");
//        obj1.box();
//        obj2.box();
//        System.out.println("------------------------------------------------");
//        System.out.println("calling the static method by using class name");
//        A.box();
//        B.box();
//        System.out.println("------------------------------------------------");
//        System.out.println("calling the non-static method by using object");
//        obj1.boxColor();    //overridden method
//        obj2.boxColor();

        A obj3 = new B();   //IF any method has been overridden then that can be executed
                            // here static method cannot be override so the result will be A class method
        obj3.boxColor();   //non-static method
        obj3.box();    //static method

    }
}
