package com.rnl.prc.tree;

public class MirrorTree {

    static class Node{
        int key;
        Node left;
        Node right;
        Node(int val) {
            key = val;

        }
    }

    static Node root;

    public static void inOrder(Node root){

        if (root ==  null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.key+" ");
        inOrder(root.right);
    }

    void mirror()
    {
        root = mirror(root);
    }

    Node mirror(Node node){

        if (node == null){
            return node;
        }

        Node left = mirror(node.left);
        Node right = mirror(node.right);

        node.left = right;
        node.right = left;
        return  node;
    }

    public static void main(String[] args){
        MirrorTree tree = new MirrorTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        /* print inorder traversal of the input tree */
        System.out.println("Inorder traversal of input tree is :");
        inOrder(root);
        System.out.println("");

        System.out.println("Inorder tmirror :");
        tree.mirror();
        inOrder(root);
    }
}
