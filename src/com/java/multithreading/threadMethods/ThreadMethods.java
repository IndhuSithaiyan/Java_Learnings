package com.java.multithreading.threadMethods;

public class ThreadMethods extends Thread{

    public void run(){
        System.out.println("A class run method is being executed by "+Thread.currentThread().getName());
        for (int i = 0; i <= 5; i++) {
            System.out.println("performing task "+ i + " by " + Thread.currentThread().getName());
            if (i == 2){
                Thread.yield();
            }
        }
    }
}

class MyRunnable{
    public static void main(String[] args) {
        ThreadMethods thread1 = new ThreadMethods();
        thread1.start();

        ThreadMethods thread2 = new ThreadMethods();
        thread2.start();

//        thread1.interrupt();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(thread1.isInterrupted());       // if the thread is sleep or waiting state then this will return true here it's false

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread - performing task "+ i + " by " + Thread.currentThread().getName());
        }
    }
}
