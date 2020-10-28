package com.oop;

// Encapsulation -> binding data with methods

class Student{
    private int rollNo;
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args){
        Student student = new Student();
        student.setName("girish");
        String name = student.getName();
        System.out.println(name);
    }
}
