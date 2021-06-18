package com.rnl.prc.threads;


import java.awt.print.Pageable;

class Parent {
    public  void print(){
        System.out.println("Print in parent");
    }

    protected   void doParent(){
        System.out.println("Parent in private");
    }
/*
    public  static void doSome(){
        System.out.println("Parent static method");
    }
*/
}

class Child extends  Parent {
    public  void print(){
        System.out.println("Print in child");
    }

    public  void print12(){
        System.out.println("only childmethod");
    }



    public   void doSome(){
        System.out.println("Child static method");
    }


}
public class OverridingTests {

    public static void main(String[] args){

    Parent p =new Child();

    Child c = (Child) p;

    c.print12();
   // p.print12();


        int i = 0;
        System.out.println(" i value is "+i);






        // should be present in parent and oveririden in child


    }
}
