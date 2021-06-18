package com.rnl.prc.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ProducerConsumerThreads {

    final static  int MAX = 5;
    Queue<Integer> dataLis = new LinkedList<>();





    public  void producer(){

            while (dataLis.size() == MAX) {

                synchronized (this) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println("Exception while producing" + e.getMessage());
                    }
                }
            }
            dataLis.add((int) Math.random());
            notifyAll();

    }

    public  void consume(){

        while(dataLis.isEmpty()){
            try {
                synchronized (this) {
                    wait();
                }
            }
            catch(InterruptedException e){
                System.out.println("Exception while consuming"+e.getMessage());
            }
        }

        System.out.println("Consumed data "+dataLis.poll());
        notifyAll();
    }

    public static  void main(String[] args){

        ProducerConsumerThreads t = new ProducerConsumerThreads();
         Thread t1=  new Thread(new Runnable() {
             @Override
             public void run() {
                 t.producer();
             }
         });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                t.consume();
            }
        });

        t1.start();
        t2.start();




    }

}
