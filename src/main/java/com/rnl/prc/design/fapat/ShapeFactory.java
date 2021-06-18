package com.rnl.prc.design.fapat;

public class ShapeFactory {

    public Shape getShape(String type){

        switch (type.toUpperCase()){
            case "CIRCLE": return new Circle();
            case "SQUARE": return  new Square();
            default: return null;
        }
    }
}
