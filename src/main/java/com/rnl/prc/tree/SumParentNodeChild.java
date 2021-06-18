package com.rnl.prc.tree;

public class SumParentNodeChild {

    static class Node{
        int key;
        Node left;
        Node right;

        Node(int val){
            key = val;
        }
    }

    static Node root;

    public static int sumOfParentChild(int x, Node root){

        if ( root == null) return  0;

        if (( root.left != null && root.left.key == x)
                || (root.right != null && root.right.key == x)){
            return root.key + sumOfParentChild(x, root.left) + sumOfParentChild(x, root.right);
        }
        else
        {
             sumOfParentChild(x, root.left);
             sumOfParentChild(x, root.right);

        }
        return 0;
    }

    public static void main(String[] args){

        // binary tree formation
        Node root = new Node(4);         //     4
        root.left = new Node(2);         //     / \
        root.right = new Node(5);         //     2 5
        root.left.left = new Node(7);     //     / \ / \
        root.left.right = new Node(2); // 7 2 2 3
        root.right.left = new Node(2);
        root.right.right = new Node(3);

        int x = 2;

        System.out.println("sum is "+sumOfParentChild(x,root));
    }
}
