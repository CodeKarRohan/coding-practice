package com.rnl.prc.tree;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class SumOfLeftLeap {

    static class Node{
        int key;
        Node left;
        Node right;

        Node(int val){
            key = val;
        }
    }

    static Node root;

    public static int leftLeavesSum(Node root){
int res =0;
        if ( root == null) return 0;
        if ( root.left == null  && root.right == null){
            res = res + root.left.key;
        }else{

            res += leftLeavesSum(root.left);
        }


        res +=leftLeavesSum(root.right);

        return res;
    }
    public static void main(String[] args){


        SumOfLeftLeap tree = new SumOfLeftLeap();
        tree.root = new Node(20);
        tree.root.left = new Node(9);
        tree.root.right = new Node(49);
        tree.root.left.right = new Node(12);
        tree.root.left.left = new Node(5);
        tree.root.right.left = new Node(23);
        tree.root.right.right = new Node(52);
        tree.root.left.right.right = new Node(12);
        tree.root.right.right.left = new Node(50);

        /*
        System.out.println("The sum of leaves is " +
                leftLeavesSum(tree.root));
        */
        StringBuilder s = new StringBuilder();
        s.append("10|12");
        String[] s1= s.toString().split("\\|");

        for( String c : s1){
            System.out.print(c +" f ");
        }
        int n = s1.length-1;
        for(int i =0; i < s1.length/2; i++){
            if(!s1[i].equals(s1[n])){
                System.out.println("NOT PALINDROME");
                break;
            }
            n--;

        }
        System.out.println("PAPPAPAP");
    }
}
