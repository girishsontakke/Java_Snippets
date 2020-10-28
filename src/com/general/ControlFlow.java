package com.general;

import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        if(temperature > 20 && temperature <= 30){
            System.out.println("Beautiful day ");
        }
        else if (temperature > 30) System.out.println("It's Hot Day Drink Water");
        else System.out.println("Cold day");
    }
}
