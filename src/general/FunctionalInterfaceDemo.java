package general;

// 1. Normal
// 2. Single abstract interface - functional interface - lambda expression
// 3. Marker interface


@FunctionalInterface
interface BaseInt{
    void show();
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args){
        BaseInt obj = ()-> System.out.println("functional interface");
        obj.show();
    }
}
