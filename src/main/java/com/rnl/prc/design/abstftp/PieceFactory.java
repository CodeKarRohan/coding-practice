package com.rnl.prc.design.abstftp;

public class PieceFactory extends AbstractFruitFactory {
    @Override
    Fruit getFruit() {
        return  new Piece();
    }
}
