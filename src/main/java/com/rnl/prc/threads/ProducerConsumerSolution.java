package com.rnl.prc.threads;

import com.rnl.prc.tree.ContinuousTree;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerSolution {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        int size = 7;

        Thread producer = new Thread(new Producer(q, size), "PRODUCRER");
        Thread consumer = new Thread(new Consumer(q, size), "CONSUMER");

  producer.start();
  consumer.start();
    }
}

class Producer implements Runnable {

    Queue<Integer> sharedQue;
    int qSize;

    public Producer(Queue<Integer> q, int size) {
        sharedQue = q;
        qSize = size;
    }

    public void run() {

        while(true) {
            for (int i = 1; i <= qSize; i++) {
                System.out.println("Produced : " + i);

                try {
                    produce(i);
                } catch (InterruptedException e) {
                    System.out.println("Exception while producing: " + e.getMessage());
                }

            }
        }

    }


    public void produce(int i) throws InterruptedException {

        while (sharedQue.size() == qSize) {
            synchronized (sharedQue) {
                System.out.println("Queue is full " +
                        Thread.currentThread().getName() + " is waiting " + sharedQue.size());
                sharedQue.wait();

            }
        }

        synchronized (sharedQue) {
            sharedQue.add(i);
            sharedQue.notifyAll();
        }

    }

}


class Consumer implements Runnable {
    Queue<Integer> sharedQue;
    int qSize;

    public Consumer(Queue<Integer> q, int size) {
        sharedQue = q;
        qSize = size;
    }

    public void run() {

        while (true) {
            try {
                System.out.println("Consumed " + consume());
                Thread.sleep(50);
            }catch(InterruptedException e){
                System.out.println("Exception while consuming: " + e.getMessage());
            }
        }

    }

    public int consume() throws InterruptedException {

        while (sharedQue.isEmpty()) {
            synchronized (sharedQue) {
                System.out.println("Queue is empty : " + Thread.currentThread().getName() + "" +
                        " is waiting: size is " + sharedQue.size());
                sharedQue.wait();
            }
        }
        synchronized (sharedQue) {
            sharedQue.notifyAll();
            return sharedQue.poll();
        }
    }
}

