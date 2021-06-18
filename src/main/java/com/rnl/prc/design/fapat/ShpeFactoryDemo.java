package com.rnl.prc.design.fapat;

public class ShpeFactoryDemo {
    public  static  void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        String type = "Square";


        shapeFactory.getShape(type).drawMyShape();
    }



}
