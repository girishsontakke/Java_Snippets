package com.multiThreading;


public class ShortHand {
    public static void main(String[] args) throws Exception{
        Thread t1 = new Thread(()->{
            for(int i=0; i<5; i++){
                System.out.println("Hi " + Thread.currentThread().getPriority());
                try{
                    Thread.sleep(500);
                }catch (Exception e){}
            }
        }, "Hi thread");
        Thread t2 = new Thread(()->{
            for(int i=0; i<5; i++){
                System.out.println("Hello");
                try{
                    Thread.sleep(500);
                }catch (Exception e){}
            }
        }, "Hello thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        try {
            Thread.sleep(10);
        }catch (Exception e){}
        t2.start();

        t1.join();
        t2.join();
        System.out.println("bye");

    }
}