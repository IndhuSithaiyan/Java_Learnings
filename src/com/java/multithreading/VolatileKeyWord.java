package com.java.multithreading;

public class VolatileKeyWord extends Thread{
    public volatile boolean flag= true;
    public void run(){
        while (flag){
            System.out.println("Running");
        }
    }
    public void shutdown(){
        flag= false;
        System.out.println("Shutdown after running");
    }
    public static void main(String[] args) throws InterruptedException {
        VolatileKeyWord thread = new VolatileKeyWord();
        thread.start();

//        thread.shutdown();
        Thread.sleep(5000);
        thread.shutdown();

    }
}

