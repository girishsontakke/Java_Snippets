package com.oop;

interface Writer{
    void write();
}

class Pen implements Writer{
    public void write(){
        System.out.println("I am Pen");
    }

}
class Pencil implements Writer{
    public void write(){
        System.out.println("I am Pencil");
    }

}
class Kit{
    public void doSomething(Writer w){
        w.write();
    }

}
public class InterFacesDemo {

    public static void main(String[] args) {
        Writer writer1 = new Pen();
        Writer writer2 = new Pencil();
        Kit kit = new Kit();
        kit.doSomething(writer1);
        kit.doSomething(writer2);
    }
}
