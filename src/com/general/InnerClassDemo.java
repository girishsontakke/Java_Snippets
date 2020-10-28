package com.general;

class Outer{
  String x = "variable in outerClass";

    public static void display(){
      System.out.println("Outer class");
  }

  class Inner{
      public void display(){
          System.out.println("Inner class");
      }
  }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer.Inner innerClassObj = new Outer().new Inner();
        innerClassObj.display();
    }
}
