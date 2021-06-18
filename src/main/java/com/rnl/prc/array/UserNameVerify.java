package com.rnl.prc.array;

import javafx.collections.transformation.SortedList;

import java.math.BigInteger;
import java.util.*;

/**
 * 4
 * abc aab abc aba      Verified Verified abc1 Verified
 * 5
 * abc abc aab aab abc Verified abc1 Verified aab1 abc2
 */
public class UserNameVerify {


    public static String[] verifyUserName(String[] inp){
        if (inp == null || inp.length == 0){
            return null;
        }


        if (inp.length == 1){return inp;}

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] s = new String[inp.length];
        int i =0;
        for(String l : inp){

            if (map.containsKey(l)){
                s[i] = l+map.get(l);
                map.put(l,map.get(l)+1);

            }else{
                map.put(l,1);
                s[i] = "Verified";

            }
            i++;

        }

        return s;
    }
    public static void main(String[] args){
        String[] s = new String[] {"abc","aab","abc","aba","abc","def","abc"};

        for(String s1: verifyUserName(s)){
            System.out.print(s1+" ");
        }

    }
}

class GfG
{
    int minEle;
    Stack<Integer> s = new Stack<Integer>();
    SortedSet<Integer> ts
            = new TreeSet<Integer>();

    /*returns min element from stack*/
    int getMin()
    {
        if(ts.isEmpty()){return 0;}

        return ts.first();


    }

    /*returns poped element from stack*/
    int pop()
    {

        int x =-1;
        try{
            x= s.pop();
            ts.remove(x);
        }catch(Exception e){
               ts.clear();
        }

        return x;
    }

    /*push element x into the stack*/
    void push(int x)
    {
        // Your code here
        ts.add(x);
        s.push(x);
    }
}

class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
        // Your code here
        s1.push(x);
    }


    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
        // Your code here
        if(s1.isEmpty() && s2.isEmpty()){
            return -1;
        }
        if(s1.isEmpty()){
            return -1;
        }

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        int x = s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return x;
    }
}


class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
       // BigInteger bg = 9_223_372_036_854_775_807;
        BigInteger bg2=new BigInteger(s1);
        BigInteger bg3=new BigInteger(s2);

        BigInteger bg4 = bg2.multiply(bg3);

        return ""+bg4;


        // return ""+ Integer.parseInt(s1) * Integer.parseInt(s2);
      //  BigInteger bg1= BigInteger.valueOf(Long.parseLong(s1) * Long.parseLong(s2));


    }
}
