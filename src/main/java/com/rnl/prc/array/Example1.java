package com.rnl.prc.array;


import java.util.ArrayList;

class Animal {
    public void sound() {
        System.out.println("Some sound");
    }

    public  void some() {
        System.out.println("Some trrt");
    }
}

class Lion extends Animal {
    public void sound() {
        System.out.println("Roar");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("meow");
    }
}

public class Example1
{
    public static void main(String[] args)
    {
        //Parent class reference is pointing to a parent object
        Animal animal = new Animal();
        animal.sound(); //Some sound

        //Parent class reference is pointing to a child object
        Animal animal1 = new Lion();
        animal1.some(); //Roar



   String Animal = "rohan";
   System.out.println(Animal);






    }
}