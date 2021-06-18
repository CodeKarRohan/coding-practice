package com.rnl.prc.array;


interface a {

    int add();

    static int sum(int a, int b){

        return a+b;
    }
}

interface  b {
    int add();
    static  int sum(int a, int b){

        return a*b;
    }
}

public class Example2  implements  a, b{
    public int add(){
        return 1;
    }



    public  static void main(String[] args){

        Example2 f = new Example2();

        a ax = new Example2();
        ax.add();

        b ay = new Example2();
        ay.add();
        a.sum(3,4);

    }
}
