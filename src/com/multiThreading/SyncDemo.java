package com.multiThreading;

class Counter{
    public int count = 0;

    public synchronized void increment(){
        count = count + 1;
    }
}

public class SyncDemo {
    public static void main(String[] args) throws Exception{
        Counter counter = new Counter();
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=0; i<1000; i++){
                    counter.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=0; i<1000; i++){
                    counter.increment();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.count);
    }
}
