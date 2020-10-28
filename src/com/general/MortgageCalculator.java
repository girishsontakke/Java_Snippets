package com.general;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        long principal = (long)scanner.nextLong();

        System.out.print("Annual Interest Rate: ");
        double rate = (double)(scanner.nextDouble()/1200);

        System.out.print("Period (Years): ");
        int period = (int)(scanner.nextInt()*12);

        double powerFactor = (Math.pow((1+rate), period));
        double Mortgage = (double)(principal * (rate*powerFactor) / (powerFactor-1));

        System.out.println(currency.format(Mortgage));
    }
}

