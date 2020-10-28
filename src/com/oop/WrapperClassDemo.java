package oop;

public class WrapperClassDemo {
    public static void main(String[] args){
        int p = 5;  // primitive datatype
        Integer a = new Integer(5); // wrapper class

        Integer b = new Integer(p); // Boxing or Wrapping
        int j = b.intValue(); // Unboxing or Unwrapping

        Integer value = 6; // auto-Boxing or auto-Wrapping
        int k = value; // auto-Unboxing or auto-UnWrapping

    }
}
