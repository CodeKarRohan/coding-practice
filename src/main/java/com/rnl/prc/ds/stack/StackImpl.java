package com.rnl.prc.ds.stack;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class StackImpl {

    private static  final int MAX_SIZE = 100;
    int[] stack = new int [MAX_SIZE];
    int currentIndex = 0 ;

    public boolean push(int item){

        if (currentIndex >= MAX_SIZE )
        {
          //  currentIndex = currentIndex -1;
            return false;
        }
        stack[currentIndex] = item;
        currentIndex++;
        return true;
    }

    public Integer pop(){

        if (currentIndex <= 0){
            return  null;
        }
        currentIndex =currentIndex -1;
        int x = stack[currentIndex];
System.out.println("POPPEDD "+x);
        return x;


    }

    public Integer peek(){


        int x = stack[currentIndex-1];
        System.out.println("peek  "+x);
        return x;


    }

    public boolean isEmpty()
    {

        return currentIndex <= 0 ;

    }

    public void printAll(){

        for (int i = 0 ; i < currentIndex; i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }

    public  static void main(String[] args){
        StackImpl custImpl = new StackImpl();
        custImpl.push(10); //0
        custImpl.push(20); // 1
        custImpl.push(30);
       System.out.println(" empty check "+ custImpl.isEmpty());
        custImpl.printAll();
        custImpl.peek();
        custImpl.peek();
        custImpl.pop();
        System.out.println(" empty check "+ custImpl.isEmpty());
        custImpl.pop();
        custImpl.pop();
        custImpl.pop();
        System.out.println(" empty check "+ custImpl.isEmpty());
        custImpl.printAll();


    }


}
