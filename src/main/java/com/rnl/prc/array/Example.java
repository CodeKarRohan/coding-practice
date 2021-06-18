package com.rnl.prc.array;


class Example4{

    public void doSomething(){
        System.out.println("in parent doSomething");
    }

}
public class Example extends Example4{

    public void doSomething(){
        System.out.println("in chill  doSomething");
    }

    public void doSomething1(){
        System.out.println("in chld 11  doSomething1");
    }

    public static void main(String[] args){
        Example4 s1 = new Example();
        s1.doSomething();

    }
}
