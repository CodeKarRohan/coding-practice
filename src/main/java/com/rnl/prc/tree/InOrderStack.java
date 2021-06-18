package com.rnl.prc.tree;

import com.rnl.prc.ds.stack.StackImpl;

import java.util.Stack;

public class InOrderStack {

    static class Node{
        int key;
        Node left;
        Node right;

        Node(int val){
            key = val;
        }

    }

    static Node root;

    public static void inorder(Node root){
        if (null == root) return;

        Stack<Node> s = new Stack<Node>();

        Node curr = root;

        while(curr != null || s.size() > 0){


            while(curr != null){
                s.push(curr);
                curr = curr.left;
            }

            curr = s.pop();

            System.out.print(curr.key+" ");

            curr =curr.right;

        }

        System.out.println();
    }

    public  static int sumOfAllNodes(Node root)
    {
        if ( root == null) return 0;


       return root.key + sumOfAllNodes(root.left) + sumOfAllNodes(root.right);

    }
    public static void main(String[] args){
/* creating a binary tree and entering
        the nodes */
        InOrderStack tree = new InOrderStack();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        inorder(tree.root);

        System.out.println("sum of "+ sumOfAllNodes(tree.root));
    }
}
