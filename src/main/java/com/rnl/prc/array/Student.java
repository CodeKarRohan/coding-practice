package com.rnl.prc.array;

public class Student {
     private String name;
     private int age;
     private int grade;

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public int getGrade() {
        return grade;
    }

    public Student setGrade(int grade) {
        this.grade = grade;
        return this;
    }

}



class StudentBuilderDemo{

    public  static void main(String[] args){
        Student s = new Student();
        s.setName("Student1").setAge(18).setGrade(12);
    }
}