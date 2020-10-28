package com.general;

class Calc{
    private int num1;
    int num2;
    int result;

    // constructor
    public  Calc(){
        this.num1 = 5;
        this.num2 = 5;
    }
    // constructor overloading
    public Calc(int a){
        this.num1 = a;
        this.num2 = a;
    }

    public Calc(int a, int b){
        this.num1 = a;
        this.num2 = b;
    }

    // method
    public void perform(){
        this.result = this.num1 + this.num2;
    }
}

public class Oop {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.perform();
        Calc obj1 = new Calc(3);
        obj1.perform();
        System.out.println(obj1.result);
        System.out.println(obj.result);
    }
}
