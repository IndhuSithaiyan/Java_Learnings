package com.java.oops.encapsulation;

public class ObjectClassExplanation {

    int num;
    float gpa;

    public ObjectClassExplanation(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    // toString is basically gives the string representation
    @Override
    public String toString() {
        return super.toString();
    }

    // finalize method in java is called by the garbage collector before an object is garbage collected
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    //we will go in details of how to create it in hashmap lecture
    //it gives an number representation of an object. this is not an address it gives a random unique numbers
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectClassExplanation obj1 = new ObjectClassExplanation(12, 49.52f);
        ObjectClassExplanation obj2 = new ObjectClassExplanation(12, 49.52f);

//        obj1 = obj2;
//        System.out.println(obj1.hashCode());
//        System.out.println(obj2.hashCode());

        if (obj1 == obj2)       //'==' - checking whether the both objs are pointing to same thing
            System.out.println("obj1 is == to obj2");
        else
            System.out.println("not ==");


        if (obj1.equals(obj2))      //'equals' -method is checking whether the objs are same content
            System.out.println("obj1 is equals to obj2");
        else
            System.out.println("not equals");


        System.out.println(obj1 instanceof Object);     //instanceof - returns true or false
        System.out.println(obj1 instanceof ObjectClassExplanation);

        System.out.println(obj1.getClass());
        System.out.println(obj1.getClass().getName());
    }
}
