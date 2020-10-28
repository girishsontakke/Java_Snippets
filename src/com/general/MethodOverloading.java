package com.general;

class Casio{
    private int q = 5;
    int p = 6;
    public int add(int i, int j){
        return i + j;
    }
    public int add(int i, int j, int k){
        return i + j + k;
    }
    public double add(double i, double j){
        return i + j;
    }
    public double add(double i, int j){
        return i + j;
    }

}

public class MethodOverloading {
    public static void main(String[] args) {
        int i = 5;
        int j = 4;
        Casio casio = new Casio();
        System.out.println(casio.add(i, j));
    }
}
