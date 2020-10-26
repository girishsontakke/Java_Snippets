package general;

// 1. Normal
// 2. Single abstract interface - functional interface - lambda expression
// 3. Marker interface


@FunctionalInterface
interface BaseInt{
    void show();
}

interface Demo{
    void abc();
    default void show(){
        System.out.println("in show method");
    }
}

class DemoImp implements Demo{
    public void abc(){
        System.out.println("in abc");
    }
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args){
        BaseInt obj = ()-> System.out.println("functional interface");
        obj.show();

        DemoImp obj1 = new DemoImp();
        obj1.show();
        obj1.abc();
    }
}
