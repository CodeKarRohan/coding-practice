package com.rnl.prc.design.abstftp;

public class Piece implements Fruit {


    String name = "Piece";
    @Override
    public void getDetails() {
        System.out.println("I am piece");
    }
}
