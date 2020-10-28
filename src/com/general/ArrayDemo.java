package com.general;

public class ArrayDemo {
    public static void main(String[] args){
        int[] nums;
        nums = new int[]{1,2,3,4};
        int[][] arr = {{1,34,5,6}, {1,3,6}};
        for (int[] num : arr) {
            System.out.println(num[0]);
        }
        System.out.println(arr.length);
    }
}
