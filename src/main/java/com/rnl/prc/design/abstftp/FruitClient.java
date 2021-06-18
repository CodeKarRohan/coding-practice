package com.rnl.prc.design.abstftp;

public class FruitClient {

    public  static  void main(String[] args){
        FruitFactory fp = new FruitFactory();

        Fruit j = fp.getFruit(new JuiceFactory());
        j.getDetails();

        j = fp.getFruit(new PieceFactory());
        j.getDetails();
    }






}
