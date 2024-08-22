package com.java.markerinterface;

import java.io.*;

public class Serializable_ {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee e = new Employee();
        e.setId(10);
        e.setName("Indu");

        // serialize
        FileOutputStream fileOutputStream = new FileOutputStream("/Desktop/employee.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(e);
        objectOutputStream.close();
        fileOutputStream.close();

        // Deserialize
        FileInputStream fileIn = new FileInputStream("/Desktop/employee.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        e = (Employee) in.readObject();
        System.out.println(e.getName());
        in.close();
        fileIn.close();
    }
}

class Employee implements Serializable {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}