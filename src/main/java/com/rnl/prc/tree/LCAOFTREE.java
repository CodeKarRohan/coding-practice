package com.rnl.prc.tree;

import java.util.ArrayList;
import java.util.List;

public class LCAOFTREE {

    static class Node{
        int key;
        Node left;
        Node right;

        public Node(int data){
            key = data;
        }
    }


    public  static int findLCA(int n1, int n2){
        //paths of both n1 and n2
        List<Node> n1Path = new ArrayList<>();
        List<Node> n2Path = new ArrayList<>();

        boolean path1 = findPath(root,n1, n1Path);
        boolean path2 = findPath(root, n2, n2Path);

        if(!path1 || !path2){
            System.out.println("NO common path ");
            return -1;
        }
        int i =0;
        for (i =0 ; i <n1Path.size() && i<n2Path.size(); i++){

            if (n1Path.get(i).key != n2Path.get(i).key){
                break;
            }
        }

        return n1Path.get(i-1).key;
    }


    public static boolean findPath(Node root, int n, List<Node> path)
    {
        if (root == null) return false;

        path.add(root);

        if(root.key == n){
            return true; //imp condition
        }

        if(root.left != null && findPath(root.left, n, path))
        {
            return true;
        }

        if (root.right != null && findPath(root.right, n ,path)){
            return true;
        }

        path.remove(path.size()-1); //remove root node added
        return false;
    }

    static Node root;

    public static void main(String[] args){
        LCAOFTREE tree = new LCAOFTREE();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("LCA(4, 5): " + tree.findLCA(4,5));
        System.out.println("LCA(4, 6): " + tree.findLCA(4,6));
        System.out.println("LCA(3, 4): " + tree.findLCA(3,4));
        System.out.println("LCA(2, 4): " + tree.findLCA(2,4));
    }
}
