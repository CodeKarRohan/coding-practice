package com.rnl.prc.graph;

import java.util.Collection;
import java.util.Collections;

class test{
    int id = 1;
    String name = "x";

    @Override
    public String toString() {
        return "test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class TestSomething {

    public static  void main(String[] args){
        printSomethins(new test());
        //Collections.sort();


        // The comment below is not a typo.
        // \u000d System.out.println("Hello World! rrrrr");

    }

    public static void printSomethins(Object o){
        System.out.println(o);
    }
}
