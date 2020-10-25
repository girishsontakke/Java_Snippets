package oop;
abstract class Human{
    public abstract void eat();

    public void sleep(){
        System.out.println("I am sleeping");
    }
}

class Man extends Human{  // Concrete class
    public void eat(){
        System.out.println("I am eating");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Human human = new Man();
        human.sleep();
        human.eat();

    }
}
