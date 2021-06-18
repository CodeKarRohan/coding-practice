package com.rnl.prc.tree;

import com.rnl.prc.recursion.ThreadExample;

import java.util.HashMap;

public class ThreadHashMap implements Runnable {

    HashMap<String, String> map1 = new HashMap<>();
    public void run(){


        addToMap();
        getFromMap();
        doSomething();
        getFromMap();


        System.out.println();
    }

    public void doSomething(){
        for(int i =0;i<1000000;i++){
            map1.put("STR"+i, ""+i);
        }
    }
    public void addToMap(){

        for(int i =0;i<100000;i++){
            map1.put("STR"+i, ""+i);
        }
    }

    public void getFromMap(){
/**
        try{
          //  System.out.println("sleeeping");
            //Thread.sleep(5000);
        } catch(InterruptedException e){

        }
 **/
for ( String k : map1.keySet()){
    System.out.print(map1.get(k));
}

    }
    public static void main(String[] args){

        Thread T1 = new Thread(new ThreadHashMap());
        Thread T2 = new Thread(new ThreadHashMap());
        Thread T3 = new Thread(new ThreadHashMap());

        T1.start();
        T2.start();
        T3.start();
    }
}
