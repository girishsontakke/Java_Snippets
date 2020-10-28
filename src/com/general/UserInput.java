package com.general;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.println("Profession: ");
        String profession = scanner.nextLine();

        System.out.println("your Name is "  + name);
        System.out.println("your Age is "+age);
        System.out.println("Profession is"+profession);

    }
}

