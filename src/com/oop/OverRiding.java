package com.oop;

class Base{
    public void show(){
        System.out.println("In BaseClass");
    }
}

class Sub extends Base{
    @Override
    public void show(){
        super.show();
        System.out.println("In SubClass");
    }
}

public class OverRiding {
    public static void main(String[] args){
        Sub sub = new Sub();
        sub.show();
    }
}
