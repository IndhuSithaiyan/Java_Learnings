package com.java.multithreading;

public class ThreadNaming {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Main thread is being executed by " + thread.getName());
        thread.setName("My Name-main");
        System.out.println("Main thread is being executed by " + thread.getName());

//        Thread1 t1 = new Thread1("ThreadName-Thread1");
//        t1.start();

        Thread1 t1 = new Thread1();  //If i don't give any name then default name will get print -> Thread-0
        t1.start();

        Thread2 t2 = new Thread2();
        Thread t = new Thread(t2, "ThreadName-Runnable");
        t.start();
    }
}

class Thread1 extends Thread{
    public Thread1(){
        super();
    }
    public Thread1(String name){
        super(name);
    }
    public void run(){
        System.out.println("ThreadName is comes from Thread1 " + Thread1.currentThread().getName());
    }
}

class Thread2 implements Runnable{
    public void run(){
        System.out.println("ThreadName is comes from Thread2 class " + Thread.currentThread().getName());
    }
}


