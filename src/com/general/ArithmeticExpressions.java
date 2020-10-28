package com.general;

public class ArithmeticExpressions {
    public static void main(String[] args) {
        int marks = 10;
        int totalMarks = 20;
        System.out.println((double)marks/totalMarks);

        int x = 1;
        int y = x++;
        int z = ++x;
        System.out.println(y);
        System.out.println(z);
    }

}
