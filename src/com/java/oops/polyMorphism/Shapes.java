package com.java.oops.polyMorphism;


// Polymorphism - Act of representing the same thing in multiple ways

public class Shapes {       //parent class
    int a = 10;
    public void area() {
        System.out.println("I am in Shapes...");
    }
}

class Circle extends Shapes {
    int a = 50;

    //this will run when the object of circle is created
    //hence it is overriding the parent method
    @Override  //this is called annotation
    public void area() {
        System.out.println("circle Shapes...");
        System.out.println("child variable: "+ a);
        System.out.println("parent variable: "+ super.a);
    }

    public void perimeter(){
        System.out.println("perimeter is, 2 * pi * r");
    }
}

class Triangle extends Shapes {
    public void area() {
        System.out.println("triangle Shapes...");
    }
}

class Square extends Shapes {
    public void area() {
        System.out.println("square Shapes...");
    }
}

class Main{
    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        square.area();

        System.out.println("-------------------------------------");

        Shapes shapes = new Circle();
        System.out.println(shapes.a);  //we can access only child variable. to access parent variable we can use super keyword in non-static method
        shapes.area();
//        shapes.perimeter();   //giving error
    }
}