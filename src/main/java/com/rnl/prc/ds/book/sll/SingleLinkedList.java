package com.rnl.prc.ds.book.sll;

import java.util.HashMap;
import java.util.HashSet;

public class SingleLinkedList<T> {

    public Node<T> head;

    public void add(T d) {
        Node n = new Node(d);
        if (this.head == null) {
            this.head = n;
            return;
        }
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }

    public static void printSpecific(Node n) {


        if (null == n) return;

        Node temp = n;

        while (temp != null) {
            System.out.print("[" + temp.data + "], ");
            temp = temp.next;
        }
        System.out.println();

    }


    public void printAll() {

        if (null == head) return;

        Node temp = head;

        while (temp != null) {
            System.out.print("[" + temp.data + "], ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static Node reverseLinkedList(Node in) {
        if (null == in) {
            return null;
        }
        Node temp = in;
        Node rev = null;

        while (temp != null) {
            Node<Integer> n = new Node(temp.data);
            n.next = rev;
            rev = n;
            temp = temp.next;
        }
        return rev;
    }


    public void removeDuplicateFromUnsorted() {

        HashSet<Integer> set = new HashSet<>();
        HashMap<String, Integer> sp = new HashMap<>();



        Node temp = head;
        Node prev = null;
        // [10], [20], [30], [20], [50], [60],
        while (temp != null) {

            if (set.add((int) temp.data)) {
                //not duplicate
                prev = temp;
            } else {
                //duplicate
                prev.next = temp.next;
            }

            temp = temp.next;
        }


    }

    public void removeDuplicateNoBuffer() {

        Node temp1 = head;
        Node temp2 = null;
        Node<Integer> prev = null;

        while (temp1 != null) {
            temp2 = temp1;
            while (temp2.next != null) {
                if (temp1.data == temp2.next.data) {
                    temp2.next = temp2.next.next;
                } else {
                    temp2 = temp2.next;

                }
            }
            temp1 = temp1.next;
        }

    }

    public  int recurse(Node t, int k) {

        if (t == null ) {
            return 0;
        }

        int ind = recurse(t.next, k) +1;

        if (ind == k){
            System.out.println("data is "+t.data);
        }

        return ind;

    }

    public  int printKthElmFromLast(int k) {
        Node temp = head;
        if (null == temp ) return 0;

        Node p1 = head;
        Node p2 = head;

        //p2 == p2+k
        // p1 -> head
        // till p2 reaches end p1 reaches K

        for(int i =0; i < k ;i++) {
            p2 = p2.next;
            if(p2 == null) return  0;
        }

        if (p2 == null ) return 0;


        while(p2 != null){
            p2 = p2.next;
            p1= p1.next;
        }

      return p1==null? 0: (int) p1.data;
    }

    public int printKthFromLast(int k) {

        Node temp = head;

        if (temp == null) {
            return 0;
        }

        int len = 0;

        while (temp != null) {
            len++;
            temp = temp.next;

        }

        System.out.println("Lnght is :" + len);

        if (len < k) {
            return 0;
        }
        //                                   k=2   k=1      k=1
        // [10], [20], [30], [20], [50], [60], [50], [60], L =8;
        temp = head;
        int ind = 0;

        while (temp != null && ind < len - k) {
            ind++;
            temp = temp.next;
        }


        return temp == null ? 0 : (int) temp.data;

    }

    public void removeDuplicate() {

        Node temp = head;

        if (null == temp) return;

        HashSet<Integer> dSet = new HashSet<>();

        Node prev = null;
        while (temp != null) {

            if (dSet.contains((int) temp.data)) {
                prev.next = temp.next;


            } else {
                dSet.add((int) temp.data);
                prev = temp;

            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        /**
         SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
         list.add(10);
         list.add(20);
         list.add(30);
         list.add(40);
         list.add(50);
         list.add(60);
         list.printAll();
         Node n = reverseLinkedList(list.head);
         printSpecific(n);
         */
        SingleLinkedList<Integer> list2 = new SingleLinkedList<Integer>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(20);
        list2.add(50);
        list2.add(60);
        list2.add(50);
        list2.add(60);
        list2.printAll();

        //  list2.removeDuplicateFromUnsorted();
        // list2.printAll();

        //   list2.removeDuplicate();
        // list2.printAll();
        //  list2.removeDuplicateNoBuffer();
        //  list2.printAll();

        System.out.println(list2.printKthFromLast(1));
        System.out.println(list2.printKthElmFromLast(1));
        list2.recurse(list2.head, 1);
        //list2.printSpecific(temp);


    }

}
