package com.rnl.prc.tree;



import java.util.LinkedList;
import java.util.Queue;

public class InsertInBinaryTree {

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

    public static void inorder(Node root){

        if (root ==  null){
            return;
        }

        inorder(root.left);
        System.out.print(root.key+" ");
        inorder(root.right);

    }

    public static Node insertNode(Node root, int val){

        if (root == null){
            return new Node(val);
        }

        if (root.left == null){
            root.left = new Node(val);
            return root;
        }

        if ( root.right == null){
            root.right = new Node(val);
            return root;
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        Node temp = null;

        while( ! q.isEmpty()){
            temp = q.peek();
            q.remove();

            if (temp.left == null){
                temp.left = new Node(val);
                break;
            }
            else
            {
                q.add(temp.left);
            }

            if (temp.right == null){
                temp.right = new Node(val);
                break;
            }
            else
            {
                q.add(temp.right);
            }
        }



        return root;
    }

    public static void replaceData(Node root, int oldVal, int newVal){

        if (null == root) { return;}

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        Node temp = null;

        while( !q.isEmpty()){
            temp = q.peek();
            q.remove();

            if (temp.key ==oldVal){
                temp.key = newVal;
                return;
            }

            if (temp.left != null){
                q.add(temp.left);
            }
            if (temp.right != null){
                q.add(temp.right);
            }
        }

    }
    // Driver code
    public static void main(String args[]) {
        root = new InsertInBinaryTree.Node(10);
        root.left = new InsertInBinaryTree.Node(11);
        root.left.left = new InsertInBinaryTree.Node(7);
        root.right = new InsertInBinaryTree.Node(9);
        root.right.left = new InsertInBinaryTree.Node(15);
        root.right.right = new InsertInBinaryTree.Node(8);

        System.out.println(
                "Inorder traversal before insertion:");
        inorder(root);
        System.out.println();

        replaceData(root, 10,10);
        inorder(root);
        System.out.println();

        insertNode(root, 40);
        inorder(root);
        System.out.println();

        insertNode(root, 50);
        inorder(root);
        System.out.println();





    }

}
