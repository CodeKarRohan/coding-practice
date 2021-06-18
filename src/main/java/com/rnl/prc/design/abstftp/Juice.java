package com.rnl.prc.design.abstftp;

public class Juice implements Fruit {


    String name = "Juice";
    @Override
    public void getDetails() {
        System.out.println("I am juice");
    }
}
