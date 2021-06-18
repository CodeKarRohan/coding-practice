package com.rnl.prc.ds.book.sll;

public class Node<T> {

    Node next = null;
    T data;

    public Node (T data) {
        this.data = data;
        next = null;

    }

    /**
    public int hashCode() {

        return (int) this.data;
    }
**/


}
