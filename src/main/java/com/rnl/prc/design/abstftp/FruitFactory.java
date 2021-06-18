package com.rnl.prc.design.abstftp;

public class FruitFactory {

    public Fruit getFruit(AbstractFruitFactory fp){
        return fp.getFruit();
    }
}
