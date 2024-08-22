package com.java.multithreading.executorservice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class MultiThreading_ExecutorService {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(new Employee(1,"ram", 50000, 500,30),
                new Employee(2,"indu", 25000, 250,25),
                new Employee(3,"raj", 60000, 600,45),
                new Employee(4,"hari", 45000, 450,60),
                new Employee(5,"John", 70000, 700,20));

        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < list.size(); i++) {
            Runnable runnableObj = new SalaryCalculation(list.get(i));
            service.submit(runnableObj);    // needs to pass Runnable object
        }
        service.shutdown();     // to stop those waiting thread
    }

}

class SalaryCalculation implements Runnable{

    private Employee employee;

    SalaryCalculation(Employee employee){
        this.employee = employee;
    }

    @Override
    public void run() {
        salaryCalculation();
    }

    public void salaryCalculation(){
        int totalSal = employee.getBasicSalaryPerDay() * employee.getNoOfWorkingDays();
        employee.setSalary(totalSal);
        System.out.println(employee.getName() +" : " +employee.getSalary());
    }
}