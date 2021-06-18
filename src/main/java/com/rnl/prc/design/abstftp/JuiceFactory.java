package com.rnl.prc.design.abstftp;

public class JuiceFactory extends AbstractFruitFactory {
    @Override
    Fruit getFruit() {
        return new Juice();
    }
}
