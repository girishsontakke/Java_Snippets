package com.oop;

class BaseClass{
    public int add(int i, int j){
        return i * j;
    }
}

class DerivedClass extends BaseClass{
    public int subtract(int i, int j){
        return  i - j;
    }
}


public class Inheritance {
    public static void main(String[] args) {
        DerivedClass adv = new DerivedClass();
        System.out.println(adv.add(3, 5));
        System.out.println(adv.subtract(3,5));
    }
}
