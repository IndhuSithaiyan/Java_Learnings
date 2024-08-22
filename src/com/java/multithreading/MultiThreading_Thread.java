package com.java.multithreading;


class Cake extends Thread {
    public void run(){
        System.out.println("Thread is running....");
        System.out.println("Mixing Ingredients for cake "+ Cake.currentThread().getId());
        System.out.println("Backing cake "+ Cake.currentThread().getId());
        System.out.println("Decorating cake "+ Cake.currentThread().getId());
    }
}

public class MultiThreading_Thread {

    public static void main(String[] args) {

        int cakeCount = 3;
        for (int i = 0; i <= cakeCount; i++) {
            Cake cake = new Cake();
//            cake.run(); // single thread
//            System.out.println(cake.getId());
//            System.out.println(cake.getName());
//            System.out.println(cake.getPriority());

            cake.start(); // running in parallel - MultiThreading_Thread
//            cake.start(); // IllegalThreadStateException
        }

    }

}
