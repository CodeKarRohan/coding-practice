package com.rnl.prc.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student1 {

    int id;
    String name;
    double marks;

    public Student1(int id, String name, double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

}
public class StreamExample {


    public static  void main(String[] args){

        List<Student1> stList = new ArrayList<>();



        Student1 s1 = new Student1(1,"Rohan", 400);
        Student1 s2 = new Student1(1,"Adeep", 300);

        stList.add(s1);
        stList.add(s2);
        Comparator<Student1> cmp =(a,b)->{
            return (int) ((int) a.marks-b.marks);
        };
        System.out.println("name is "+ stList.stream().max(cmp).get().name);

    }



}
