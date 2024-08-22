package com.java.oops.interface_;

public class AdvancedCalculator implements Calculator, ScientificCalculator{

    public static void main(String[] args) {
        System.out.println(Calculator.NUMBER);
        System.out.println(ScientificCalculator.NUMBER);   // we can call the variables from interface

        Calculator calculator = new AdvancedCalculator();

        ScientificCalculator scientificCalculator = new AdvancedCalculator();  // Dynamic binding
        scientificCalculator.addition();

        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
//        System.out.println(advancedCalculator.NUMBER);  //cannot access the variable like this
    }

    @Override
    public void addition() {
        System.out.println("I am addition");
    }

    @Override
    public void subtraction() {
        System.out.println("I am subtraction");
    }

    @Override
    public void multiplication() {
        System.out.println("I am multiplication");
    }

    @Override
    public void division() {
        System.out.println("I am division");
    }

    @Override
    public void cos() {

    }

    @Override
    public void sin() {

    }

    public void modulus() {
        System.out.println("I am division");
    }

}
