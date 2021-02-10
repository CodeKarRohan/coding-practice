package com.rnl.prc.ds.sll;

public class SingleLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }


    public  void addAtFront(int data) {
        Node n = new Node(data);
        if (null == head) {
            head = n;
            return;
        }

        n.next = head;
        head = n;

    }

    public  void addAtEnd(int data) {

        Node n = new Node(data);
        Node temp = head;
        if(head == null){
            head = n;
            return;
        }

        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;

    }

    public void insertAfter(Node prev_node, int new_data) {

        if(prev_node == null){
            return;
        }
        Node n = new Node(new_data);
        n.next = prev_node.next;
        prev_node.next = n;

    }

    // Array type index
    // 0,1,2,3,4
    public  void addAtGivenIndex(int data, int index) {
       if( index < 0 ){
           return;
       }
       if(head == null){
           return;
       }

       Node temp = head;
       Node n = new Node(data);

       if ( index == 0) {
           n.next = head;
           head = n;
           return;
       }

       while(index > 1 && temp != null){
           index--;
           temp = temp.next;


       }

       if(temp != null) {
           n.next = temp.next;
           temp.next = n;
       }

    }

    public void printData()
    {
        if ( head == null) {
            return;
        }

        Node temp = head;

        while(temp != null){
            System.out.print("[ "+temp.data+"  ], ");
            temp = temp.next;
        }

        System.out.println();
    }

    public  void deleteANodeAtIndex(int index) {
        if( index < 0) return;

        if (index == 0 ) head = head.next;

        Node temp = head;
        Node prev = temp;
        while( temp != null && index >= 1) {
            prev = temp;
            temp = temp.next;
            index--;
        }
        if (temp ==  null) return;

        prev.next = temp.next;



    }

    public void deleteANodeWithData(int data){
        if(head == null){
            return;
        }

        Node temp = head;

        if(temp.data == data){
            head = head.next;

            return;
        }
        Node prev = temp;
        while(temp != null){
            if (temp.data == data) {
                // delete the node

                prev.next = temp.next;
                return;

            }
            prev = temp;
            temp = temp.next;

        }

    }

    public int findLength(){
        int length = 0;
        if (head ==null) return  length;
         Node temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }

        return  length;
    }


    public int findLengthRec(Node temp) {
        if(temp == null) return 0;

       return 1 + findLengthRec(temp.next);
    }

    public static void main(String[] args){
        SingleLinkedList list = new SingleLinkedList();
        list.addAtFront(3);
        list.addAtFront(31);
        list.addAtFront(32);
        list.addAtFront(13);
        list.addAtEnd(100);
        list.addAtEnd(120);
      //  list.printData();
        list.addAtGivenIndex(11111, 0);
       // list.printData();
        list.addAtGivenIndex(1345, 9);
        list.printData();

        list.deleteANodeWithData(1200);

      //  list.printData();

      //  list.deleteANodeAtIndex(7);

       // list.printData();

    //    System.out.println("Length is "+list.findLength());
   //     System.out.println("lllll  "+list.findLengthRec(list.head));
        list.swapTwoNodes(11111, 32);
        list.printData();

    }


    public void swapTwoNodes(int x, int y) {
        if(  x == y ) return;

        if(head == null) return;
        boolean firstdata = false;
        if( x == head.data)
        {
            firstdata = true;
        }


        Node temp = head;
        Node xNodePrev = head;
        Node yNodePrev = head;
        Node xNode = head;
        Node yNode = head;
        Node prev = head;
        while(temp != null) {
            if (temp.data == x){
                xNodePrev = prev;
                xNode = temp;
            }
            if( temp.data == y){
                yNodePrev = prev;
                yNode = temp;
            }

            prev = temp;
            temp = temp.next;
        }



if ( xNode == null || yNode == null) return;

        if (firstdata) {

        Node temp3= yNode.next;
          head = yNode;
         yNode.next = xNode.next;
          yNodePrev.next= xNode;
          xNode.next = temp3;
        }

        else {
            Node temp2 = yNode.next;
            xNodePrev.next = yNode;
            yNode.next = xNode.next;
            yNodePrev.next = xNode;
            xNode.next = temp2;
        }

    }

public void reverseLinkedList() {



}

    public  void swapPairWise()
    {

        // 1,2,3,4,5,6,7,8
        // 2,1,4,3,6,5,8,7
    }
}
