package general;

class BaseClass{
    public void say(){
        System.out.println("In base class");
    }
}

interface BaseInterface{
    public void greet();
}
public class AnonymousClass {
    public static void main(String[] args) {
        BaseClass obj = new BaseClass(){
            public void say(){
                System.out.println("In AnonymousClass");
            }
        };
        obj.say();

        BaseInterface obj1 = new BaseInterface() {
            @Override
            public void greet() {
                System.out.println("overridden greed method");
            }
        };
        obj1.greet();
    }
}
