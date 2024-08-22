package com.java.multithreading;


class CakeBaking implements Runnable {
    public void run(){
        System.out.println("Thread is started to run for Cake....");
        System.out.println("Mixing Ingredients for cake "+ Thread.currentThread().getId());
        System.out.println("Backing cake "+ Thread.currentThread().getId());
        System.out.println("Decorating cake "+ Thread.currentThread().getId());
    }
}

class DesertBaking implements Runnable {
    public void run(){
        System.out.println("Thread is started to run for Cake....");
        System.out.println("Mixing Ingredients for desert "+ Thread.currentThread().getId());
        System.out.println("Backing desert "+ Thread.currentThread().getId());
        System.out.println("Decorating desert "+ Thread.currentThread().getId());
    }
}

public class MultiThreading_Runnable {

    public static void main(String[] args) {

        int cakeCount = 4;
        for (int i = 0; i <= cakeCount; i++) {
            Runnable cake = new CakeBaking();
            Runnable desert = new DesertBaking();

            Thread team1 = new Thread(cake);
            Thread team2 = new Thread(desert);
            team1.start(); // running in parallel - MultiThreading_Thread
            team2.start(); // running in parallel - MultiThreading_Thread

        }

    }

}
