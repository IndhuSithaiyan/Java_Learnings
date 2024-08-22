package com.java.markerinterface;

public class Clonable_ {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department("Maths");
        Student student = new Student(1, "Ram", department);
        Student student1 = (Student) student.clone();
        department.dept = "Physics";

        student.display();
        student1.display();
    }
}

class Department{
    String dept;

    public Department(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dept='" + dept + '\'' +
                '}';
    }
}

class Student implements Cloneable{
    int id;
    String studentName;
    Department department;

    public Student(int id, String studentName, Department department) {
        this.id = id;
        this.studentName = studentName;
        this.department = department;
    }

    void display(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+studentName);
        System.out.println("Department : "+department);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}