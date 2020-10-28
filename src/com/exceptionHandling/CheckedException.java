package com.exceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckedException {
    public static void main(String[] args) throws Exception{
        BufferedReader br = null;
        int n = 0;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());
        }catch (Exception e){
            System.out.println(e);
        }finally {
            br.close();
        }
        System.out.println(n);
    }
}
