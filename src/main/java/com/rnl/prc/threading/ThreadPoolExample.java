package com.rnl.prc.threading;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExample implements Callable<String> {

    String name ;
    @Override
    public String call() throws Exception {
        System.out.println("Printintg thread "+
                Thread.currentThread().getName()+" " +this.name);

        waitPeriod();
        return "task is done";
    }

    public  void waitPeriod(){

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){

        }

        System.out.println("waking form sleep");
    }



    public  static void main(String[] args){


        Future<String> future;

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
         for(int i =0; i <10; i++){
             ThreadPoolExample t = new ThreadPoolExample();
             t.name = "rohan "+i+" name";
             executor.submit(t);
         }


         executor.shutdown();

    }
}
