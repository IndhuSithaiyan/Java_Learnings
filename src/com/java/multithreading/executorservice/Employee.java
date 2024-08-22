package com.java.multithreading.executorservice;

public class Employee {
    private int id;
    private String name;
    private int Salary;
    private int basicSalaryPerDay;
    private int noOfWorkingDays;

    public Employee(int id, String name, int salary, int basicSalaryPerDay, int noOfWorkingDays) {
        this.id = id;
        this.name = name;
        Salary = salary;
        this.basicSalaryPerDay = basicSalaryPerDay;
        this.noOfWorkingDays = noOfWorkingDays;
    }

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

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getBasicSalaryPerDay() {
        return basicSalaryPerDay;
    }

    public void setBasicSalaryPerDay(int basicSalaryPerDay) {
        this.basicSalaryPerDay = basicSalaryPerDay;
    }

    public int getNoOfWorkingDays() {
        return noOfWorkingDays;
    }

    public void setNoOfWorkingDays(int noOfWorkingDays) {
        this.noOfWorkingDays = noOfWorkingDays;
    }
}
