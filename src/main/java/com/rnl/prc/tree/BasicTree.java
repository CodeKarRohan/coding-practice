package com.rnl.prc.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BasicTree {

    static class Node {
        int key;
        Node left, right;

        // constructor
        Node(int key)
        {
            this.key = key;
            left = null;
            right = null;
        }
    }
    static Node root;
    static Node temp = root;

    // Driver code
    public static void main(String args[])
    {
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.println(
                "Inorder traversal before insertion:");
        inorder(root);


        System.out.println();
         System.out.println(" Level order ");
        levelOrder(root);

        System.out.println();
        System.out.println(" pre order ");
        preOrder(root);


        System.out.println();

        System.out.println(" post order ");
        postOrder(root);


    }


    public static void inorder(Node root){

        if (root ==  null){
            return;
        }

        inorder(root.left);
        System.out.print(root.key+" ");
        inorder(root.right);

    }

    public static void preOrder(Node root){

        if (null == root) return;
        System.out.print(root.key+" ");
        preOrder(root.left);
        preOrder(root.right);
    }


    public static void postOrder(Node root){

        if (null == root) return;

        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.key+" ");
    }




    public static  void levelOrder(Node root){

        if (root == null){
            return;
        }

        Queue<Node> q = new LinkedList<Node>();

        q.add(root);
        Node temp =  null;

        while(! q.isEmpty()){
            temp = q.peek();
            q.remove();

            if (temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
            System.out.print(temp.key+" ");
        }
    }


}
