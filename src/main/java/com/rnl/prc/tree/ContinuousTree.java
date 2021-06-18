package com.rnl.prc.tree;

public class ContinuousTree {

    static class Node{
        int key;
        Node left;
        Node right;

        Node(int val){
            key = val;
        }
    }

    static Node root;

    public static boolean treeContinuous(Node root){

        // base case 1
        if (root == null) { return true;}

        // bse case for single node
        if ( root.left == null && root.right == null){ return true;}

        // base case for right only tree
        if ( root.left == null){
            return Math.abs(root.key - root.right.key) == 1 && treeContinuous(root.right);
        }

        // base case for left only tree.
        if ( root.right == null) {
            return Math.abs(root.key - root.left.key) == 1 && treeContinuous(root.left);

        }

        //check everything

        return ( (Math.abs(root.key -root.left.key) == 1) &&
                (Math.abs(root.key - root.right.key) == 1) &&
                (treeContinuous(root.left)) &&
                ( treeContinuous(root.right)));


    }

    public static void main(String[] args){
        Node root = new Node(3);
        root.left     = new Node(2);
        root.right     = new Node(4);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(5);
        if(treeContinuous(root))
            System.out.println( "Yes") ;
        else
            System.out.println( "No");
    }
}
