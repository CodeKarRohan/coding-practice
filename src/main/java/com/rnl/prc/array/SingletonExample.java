package com.rnl.prc.array;

import java.util.concurrent.SynchronousQueue;

public class SingletonExample {

    private  static SingletonExample instance;

    static {
       {
            synchronized(SingletonExample.class){
                if (instance == null )
                instance = new SingletonExample();
            }
        }
    }


    private SingletonExample() {

    }


    public static SingletonExample getInstance(){

        if (instance != null){

            synchronized (SingletonExample.class){
                if (instance == null){
                    instance = new SingletonExample();
                }
            }
        }
        return  instance;
    }
}
