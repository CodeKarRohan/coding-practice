package com.rnl.prc.tree;



import java.util.LinkedList;
import java.util.Queue;

public class DeletionBinaryTree {

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

        if (root ==  null){
            return;
        }

        inorder(root.left);
        System.out.print(root.key+" ");
        inorder(root.right);

    }

    //replace the value of given node with right most last node value
    public static void deleteNode(Node root, int val){

        // first need to find the last element and keynode


        if (null == root){
            return;
        }

        if ( root.left == null && root.right == null){
            if (root.key == val)
            {
                root = null;
                return;


            }
            return;
        }

        Queue<Node> q = new LinkedList<Node>();

        q.add(root);

        Node temp = null;
        Node keyNode = null;

        while (!q.isEmpty()) {

            temp = q.peek();
            q.remove();

            if (temp.key == val){
                keyNode = temp;
            }
            if (temp.left != null){
                q.add(temp.left);
            }
            if (temp.right != null){
                q.add(temp.right);
            }

        }

        System.out.println("right most node value "+ temp.key);

        if ( null == keyNode){
            System.out.println("Node not found");
            return;
        }else{

            int rightVal = temp.key; // right most node value
            traverseAndDelete(root, temp);
            keyNode.key =rightVal;

        }




    }

    public static void traverseAndDelete(Node root,
                                          Node delNode){
        Queue<Node> q = new LinkedList<Node>();

        q.add(root);

        Node temp = null;

        while(!q.isEmpty()){

            temp = q.peek();
            q.remove();


            if (temp == delNode ){
                temp = null;
                return;
            }

            if (temp.left != null){
                if(temp.left == delNode){
                    temp.left =null;
                    return;
                }

                q.add(temp.left);
            }

            if (temp.right != null){
                if (temp.right == delNode){
                    temp.right = null;
                    return;
                }
                q.add(temp.right);
            }


        }

    }


public static void main(String[] args){
    root = new Node(10);
    root.left = new Node(11);
    root.left.left = new Node(7);
    root.left.right = new Node(12);
    root.right = new Node(9);
    root.right.left = new Node(15);
    root.right.right = new Node(8);

    System.out.println("Inorder traversal " +
            "before deletion:");
    inorder(root);

    deleteNode(root, 12);

    System.out.println("After deleting node ");
    inorder(root);
}

}
