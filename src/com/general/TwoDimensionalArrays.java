package com.general;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] numbers = new int[5][5];
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));
        System.out.println(numbers[2].length);
    }
}
