package com.rnl.prc.ds.book.sll;

import java.math.BigInteger;
import java.util.Stack;

public class SumLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list

        Node temp1 = first;
        Node temp2 = second;

        BigInteger sum1 = new BigInteger("0");
        BigInteger sum2 = new BigInteger("0");

        while(temp1 != null){
            sum1 = sum1.multiply(new BigInteger("10"));
            sum1.add(new BigInteger(""+temp1.data));
            temp1 = temp1.next;
        }

        while(temp2 != null){
            sum2 = sum2.multiply(new BigInteger("10"));
            sum2.add(new BigInteger(""+temp1.data));
            temp2 = temp2.next;
        }

        BigInteger sum = sum1.add(sum2);
        String sumS = ""+sum;
        char[] c = sumS.toCharArray();

        Node t = new Node (Integer.parseInt(""+c[0]));
        Node ret = t;

        for(int i =1; i< c.length; i++){
            Node n = new Node(Integer.parseInt(""+c[i]));
            t.next = n;
            t = n;
        }

        return ret;
    }

    static Node addTwoLists1(Node first, Node second){
        // code here
        // return head of sum list

        Node temp1 = first;
        Node temp2 = second;

        if(temp1 == null && temp2 == null){
            return null;
        }
        if (temp1 == null){
            return second;
        }

        if(temp2 == null){
            return first;
        }
        java.math.BigInteger sum1 = new java.math.BigInteger("0");
        java.math.BigInteger sum2 = new java.math.BigInteger("0");

        while(temp1 != null){
            sum1 = sum1.multiply(new java.math.BigInteger("10"));
            sum1 = sum1.add(new java.math.BigInteger(""+temp1.data));
            // System.out.println("SUM1 "+sum1);
            temp1 = temp1.next;
        }


        while(temp2 != null){
            sum2 = sum2.multiply(new java.math.BigInteger("10"));
            sum2 = sum2.add(new java.math.BigInteger(""+temp2.data));
            temp2 = temp2.next;
        }

        java.math.BigInteger sum = sum1.add(sum2);
        //  System.out.println(sum);
        String sumS = ""+sum;
        char[] c = sumS.toCharArray();

        Node t = new Node (Integer.parseInt(""+c[0]));
        Node ret = t;

        for(int i =1; i< c.length; i++){
            Node n = new Node(Integer.parseInt(""+c[i]));
            t.next = n;
            t = n;
        }

        return ret;

    }

    static Node addTwoLists2(Node first, Node second){
        Stack<Integer> s1= new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();

        Node temp1 = first;
        Node temp2 = second;

        while(temp1 != null){
            s1.push(temp1.data);
            temp1= temp1.next;
        }

        while(temp2 != null){
            s2.push(temp2.data);
            temp2 = temp2.next;
        }

        int carry =0;
        while(true){
            int d1 =0 , d2 = 0;
            if(!s1.isEmpty()){
                d1 = s1.pop();
            }
            if (!s2.isEmpty()){
                d2 = s2.pop();
            }
            int sum1 = d1 + d2 + carry;
            carry = sum1 % 10;
            sum1 = sum1 /10;

            s3.push(sum1);

            if (s1.isEmpty() && s2.isEmpty()){
                break;
            }

        }

        Node n = new Node(s3.pop());
        Node res = n;
        while(!s3.isEmpty()){
            Node n1 = new Node(s3.pop());
            n.next = n1;
            n1 = n;
        }
        return  res;
    }

}
