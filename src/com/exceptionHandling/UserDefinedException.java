package com.exceptionHandling;

public class UserDefinedException {
    public static void main(String[] args) {
        int i=1, j=9;
        try{
            int k = i/j;
            if(k==0){
                throw new CustomException("this is custom exception");
            }

        }catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }
}

class CustomException extends Exception{
    public CustomException(String s) {
        super(s);
    }
}
