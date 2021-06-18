package com.rnl.prc.design.buiilder;

public class ComputerBDemo {

    public  static void main(String[] args){
        // demo computer Builder

        Computer c = new Computer.ComputerBuilder("100", "200GB")
                .setIsBluetoothEnabled(true)
                .setIsGraphicEnabled(true)
                .build();
        System.out.println(c);



    }
}
