package com.java.multithreading;

public class MultiThreading_LambdaExpression {

    public static void main(String[] args) {

        int cakeCount = 4;
        for (int i = 0; i <= cakeCount; i++) {

            Thread team1 = new Thread(() -> {
                System.out.println("Thread is started to run for Cake....");
                System.out.println("Mixing Ingredients for cake "+ Thread.currentThread().getId());
                System.out.println("Backing cake "+ Thread.currentThread().getId());
                System.out.println("Decorating cake "+ Thread.currentThread().getId());
            });
            Thread team2 = new Thread(() -> {
                System.out.println("Thread is started to run for Cake....");
                System.out.println("Mixing Ingredients for desert "+ Thread.currentThread().getId());
                System.out.println("Backing desert "+ Thread.currentThread().getId());
                System.out.println("Decorating desert "+ Thread.currentThread().getId());
            });
            team1.start(); // running in parallel - MultiThreading_Thread
            team2.start(); // running in parallel - MultiThreading_Thread
        }

    }

}
