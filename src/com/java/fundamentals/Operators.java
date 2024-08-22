package com.java.fundamentals;

public class Operators {

    public static void main(String[] args) {
//        Arithmetic operator
        /*
        * B – Brackets
        * O – Order of powers or roots
        * D – Division
        * M – Multiplication
        * A – Addition
        * S – Subtraction
         * */
        System.out.println("10 + 2 = "+ (10 + 2));
        System.out.println("5 - 2 = " + (5 - 2));
        System.out.println("10 * 2 = "+(10 * 2));
        System.out.println("10 % 3 = "+(10 % 2));

        System.out.println("--------------------------------------");

        MathFunctions mathFunctions = new MathFunctions();
        mathFunctions.mathMethods();

        System.out.println("--------------------------------------");

        ComparisonOperations comparisonOperations = new ComparisonOperations();
        comparisonOperations.comparisonMethod();

        System.out.println("--------------------------------------");

        LogicalOperators logicalOperators = new LogicalOperators();
        logicalOperators.logicalMethod();

        System.out.println("--------------------------------------");

        TernaryOperators ternaryOperators = new TernaryOperators();
        ternaryOperators.ternaryMethod();
    }

    static class MathFunctions {
//        Math & functions
        public void mathMethods(){
            System.out.println(Math.abs(-12));
            System.out.println(Math.max(12,-12));
            System.out.println(Math.min(12,-12));
            System.out.println(Math.PI);

            System.out.println(Math.pow(5,2));
            System.out.println((int) Math.pow(5,2));
            System.out.println(Math.sqrt(45));
            System.out.println((int) Math.sqrt(45));
        }
    }

    static class ComparisonOperations {
        int alex = 28;
        int mariam = 22;

        public void comparisonMethod(){
            System.out.println(alex > mariam);
            System.out.println(alex >= mariam);
            System.out.println(alex < mariam);
            System.out.println(alex <= mariam);
            System.out.println(alex == mariam);
            System.out.println(alex != mariam);
        }
    }

    static class LogicalOperators{
        boolean isAdult = false;
        boolean isStudent = true;
        boolean isAlive = true;

        public void logicalMethod(){
            System.out.println(isAdult && isStudent);
            System.out.println(isAdult || isStudent);
            System.out.println(isAdult && isAlive);

        }
    }

    static class TernaryOperators{

        public void ternaryMethod(){
            int age = 18;
            String message = (age >= 18) ? "I am an adult" : "I am not an adult";
            System.out.println(message);
        }
    }

}
