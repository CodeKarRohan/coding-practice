package com.rnl.prc.ds.book.sll;

import javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlatenList {
    class Node
    {
        int data;
        Node next;
        Node bottom;

        Node(int d)
        {
            data = d;
            next = null;
            bottom = null;
        }
    }

    Node flatten(Node root)
    {
        // Your code here
        if(root == null){
            return root;
        }



        Node temp = root;

List<Integer> lis = new ArrayList<>();

        while(temp != null){


           Node bottom = temp.bottom;

           while(bottom != null){
               lis.add(bottom.data);
               bottom = bottom.next;
           }

           lis.add(temp.data);
           temp = temp.next;
        }

        Collections.sort(lis);

        Node prev = null;
        boolean root1 = true;
        Node n = new Node(lis.get(0));
        prev = n;

        for (Integer l : lis){

            if(root1){
                root1 = false;
            }
            else{

                Node ns = new Node(l);
                prev.next = ns;
                prev = ns;
            }

        }
        prev.next = null;

        return n;
    }
}
