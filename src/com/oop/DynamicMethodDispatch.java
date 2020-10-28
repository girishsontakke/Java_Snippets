package com.oop;

class A{
    public void show(){
        System.out.println("In a");
    }
}

class B extends A{
    public void show(){
        System.out.println("In b");
    }
}

class C extends A{
    public void show(){
        System.out.println("In c");
    }
    public void say(){
        System.out.println("hello");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args){
        A obj = new B(); // A is Reference and B is implementation it is called runtime polymorphism
        obj.show();

        obj = new C();  // Dynamic method dispatch
        obj.show();
        // We Can not Call methods in class C (e.g:say()) by the object of Reference type A
    }
}
