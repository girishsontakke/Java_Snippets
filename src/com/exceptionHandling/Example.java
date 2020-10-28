package com.exceptionHandling;

import java.util.Scanner;

public class Example {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int i = sc.nextInt();
        int j = sc.nextInt();
        try{
            int arr[] = new int[5];
            arr[5] = 2;
            int result = i/j;
            System.out.println(result);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Error");
        } finally {
            System.out.println("Completed");
        }
    }
}
