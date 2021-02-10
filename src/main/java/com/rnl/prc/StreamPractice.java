package com.rnl.prc;

import java.util.ArrayList;
import java.util.List;

public class StreamPractice {

    static MathOperation addition = (int a, int b) -> a + b;

    static MathOperation substraction = (a, b) -> a -b;

    interface MathOperation {
       int operate(int a, int b);
    }

    public static void main (String[] args) {
        System.out.println("added : "+StreamPractice.addition.operate(3,6));
        System.out.println("Sub  : "+substraction.operate(3,2));
        StreamPractice prc = new StreamPractice();
        prc.test1("rohan");
    }

    GreetingService service1 = (message) ->
            System.out.println("first implementation :" + message);

    GreetingService service2 = (message) ->
            System.out.println("Print lenght :" +message.length());

    void test1(String message){
        service1.sayMessage(message);
        service2.sayMessage(message);
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}
