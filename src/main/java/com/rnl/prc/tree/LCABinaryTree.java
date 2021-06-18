package com.rnl.prc.tree;

import java.util.List;

public class LCABinaryTree {


    static class Node{
        int key;
        Node left;
        Node right;

        public Node(int data){
            key = data;
        }
    }

    static Node root;

public static Node findLCA(Node node, int a, int b){

    if (node == null) return null;


    if (node.key > a && node.key > b){
        return  findLCA(node.left, a, b);
    }

    if (node.key < a && node.key < b){
        return findLCA(node.right,a,b);
    }

    return node;
}


static boolean findPath(Node root, int p2, List<Node> path)
{
    if( root == null) return false;

    path.add(root);

    if(root.key == p2){
        return true;
    }

    if (root.left!=null && findPath(root.left, p2, path)){
        return true;
    }

    if (root.right != null && findPath(root.right, p2, path)){
        return true;
    }

    path.remove(path.size()-1);
    return false;
}

    static Node lca(Node root, int n1, int n2)
    {
        while (root != null)
        {
            // If both n1 and n2 are smaller
            // than root, then LCA lies in left
            if (root.key > n1 &&
                    root.key > n2)
                root = root.left;

                // If both n1 and n2 are greater
                // than root, then LCA lies in right
            else if (root.key < n1 &&
                    root.key < n2)
                root = root.right;

            else break;
        }
        return root;
    }

    static Node lca1(Node node, int n1, int n2)
    {
        if (node == null)
            return null;

        // If both n1 and n2 are smaller than root, then LCA lies in left
        if (node.key > n1 && node.key > n2)
            return lca(node.left, n1, n2);

        // If both n1 and n2 are greater than root, then LCA lies in right
        if (node.key < n1 && node.key < n2)
            return lca(node.right, n1, n2);

        return node;
    }

    public static void main(String[] args){
        LCABinaryTree tree = new LCABinaryTree();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);

        int n1 = 10, n2 = 14;
       // int n1 = 10, n2 = 14;
        Node t = findLCA(tree.root, n1, n2);
        Node t1 = lca(tree.root, n1, n2);
        Node t2 = lca1(tree.root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.key);
        System.out.println("LCA of LCS " + n1 + " and " + n2 + " is " + t1.key);
        System.out.println("LCA of dsdsdsd " + n1 + " and " + n2 + " is " + t2.key);
    }
}
