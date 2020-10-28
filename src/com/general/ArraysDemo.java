package com.general;
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args){
        int[] numbers = new int[5];

        numbers[0]=5;
        System.out.println(Arrays.toString(numbers));

        int[] anotherNumbers = {1,5,3};
        System.out.println(anotherNumbers.length);
        Arrays.sort(anotherNumbers);
        System.out.println(Arrays.toString(anotherNumbers));
    }
}
