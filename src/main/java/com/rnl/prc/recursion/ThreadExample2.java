package com.rnl.prc.recursion;

public class ThreadExample2 implements Runnable {

    public void run(){

        for (int i =0; i < 10 ; i++){
            System.out.println("Thread "+" "+i);
            printSomething(i);
        }
    }
    public void printSomething(int i){
        System.out.println("Thread print "+" "+i+"XX");
    }

    public static void main(String[] args){
        ThreadExample2 exp = new ThreadExample2();
        ThreadExample2 exp1 = new ThreadExample2();
        Thread th = new Thread(exp);
        Thread th1 = new Thread(exp1);
        th.start();
        th1.start();
        while(th.isAlive()) {
            System.out.println("Waiting. eeeee..");
        }

        while(th1.isAlive()) {
            System.out.println("Waiting. dddd..");
        }
    }
}
