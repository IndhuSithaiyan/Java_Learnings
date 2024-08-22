package com.java.multithreading;

class CakeCounter{

    int count = 0;

    // both threads are accessing this method same time then we will get an issue
    // only one thread can work with this method if you mentioned it as synchronized
    // when you don't make your method as synchronized then that method or class is not a thread safe, which means multiple thread can access the same method at same time
    public synchronized void increment(){
        count++;    // count = count + 1;
    }
}

class Team implements Runnable{

    CakeCounter cakeCounter;

    Team(CakeCounter cakeCounter){
        this.cakeCounter = cakeCounter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            cakeCounter.increment();
        }
    }
}

public class MultiThreading_Syncronized {

    public static void main(String[] args) {
        CakeCounter cakeCounter = new CakeCounter();
        Thread team1 = new Thread(new Team(cakeCounter));   // here we are passing same variable(shared variable), 2 teams are going to do the same work, that's why here we are using syncronizing
        Thread team2 = new Thread(new Team(cakeCounter));

        team1.start();
        team2.start();

        team1.setName("thread");
        team2.setName("thread");

        team1.getName();
        team2.getName();

        try {
            team1.join();
            team2.join();       // we are asking our thread to wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(cakeCounter.count);

    }
}
