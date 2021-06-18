package com.rnl.prc.recursion;

public class ThreadExample extends Thread {

   public void run(){

       for (int i =0; i < 10 ; i++){
           System.out.println("Thread "+ currentThread().getName()+" "+i);
           printSomething(i);
       }
   }

   public void printSomething(int i){
       System.out.println("Thread print "+ currentThread().getName()+" "+i+"XX");
   }



 public  static void main (String[] args){
    ThreadExample exp = new ThreadExample();
     ThreadExample exp2 = new ThreadExample();
    exp.start();
     exp2.start();


 }
}