package com.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    private int rollNo;
    private int marks;
    private String name;
    Student(int rollNo, int marks, String name){
        this.rollNo = rollNo;
        this.marks = marks;
        this.name  = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return this.marks>o.marks ? 1 : -1;
    }
}
public class CollectionDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(21, 94, "stud1"));
        students.add(new Student(22, 88, "stud3"));
        students.add(new Student(23, 99, "stud4"));

        Collections.sort(students);
        for(Student s: students){
            System.out.println(s);
        }
    }
}
