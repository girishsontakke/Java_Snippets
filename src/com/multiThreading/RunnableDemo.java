package com.multiThreading;


class SayHi implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Hi");
            try{
                Thread.sleep(500);
            }catch (Exception e){}
        }

    }
}

class SayHello implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        SayHi obj1 = new SayHi();
        SayHello obj2 = new SayHello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {
            Thread.sleep(10);
        }catch (Exception e){}
        t2.start();

    }
}
