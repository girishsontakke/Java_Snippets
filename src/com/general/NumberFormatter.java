package com.general;

import java.text.NumberFormat;

public class NumberFormatter {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234523.13420);
        System.out.println(result);

        NumberFormat percentage = NumberFormat.getPercentInstance();
        String per = percentage.format(.93);
        System.out.println(per);

    }
}
