package com.rnl.prc.tree;

public class PlayWithTree {
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

    public static void inOrder(Node root){

        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.key+" ");
        inOrder(root.right);

    }

    public static void printLeftNodesOnly(Node root){

        if (root == null) return;

        if (root.left != null){
            System.out.print(root.left.key+" ");
        }
        printLeftNodesOnly(root.left);
        printLeftNodesOnly(root.right);
    }

    static int heightOfTree(Node root){
        if(root == null) return 0;
        else{

            int rh = heightOfTree(root.right);
            int lh =heightOfTree(root.left);
            if(rh > lh) return rh+1;
            else return lh+1;

        }
    }

    public static int findSumOfAllNodes(Node root){

          if (root == null){
              return 0;
          }
          return root.key+findSumOfAllNodes(root.left)+findSumOfAllNodes(root.right);

    }
static boolean val =true;

    public static int checkSumTree(Node root){

        if(root == null) return 0;
        else {
            checkSumTree(root.left);
            checkSumTree(root.right);
            int sum = checkSumTree(root.left) + checkSumTree(root.right);
            // System.out.println(sum);
            if (sum != 0 && sum != root.key) val = false;
        }
       return root.key;
    }


    public static int findSumLeftTree(Node root){
        if (root == null) return 0;
        else return root.key+findSumRightTree(root.left);
    }

    public static int findSumRightTree(Node root){
        if (root == null) return 0;
        else return root.key+findSumRightTree(root.right);
    }
    static void  printGivenLevel (Node root , int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.key + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }


    static int  sumOfUncoveredLeapLeft(Node root){

        if (root == null) return 0;

        if(root.left == null){
             return root.key+ sumOfUncoveredLeapLeft(root.right);
        }
        else{
           return  root.key+sumOfUncoveredLeapLeft(root.left);
        }
       // return root.key ;


    }static  int findSumOFConveredLEap(Node root){
        return sumOfUncoveredLeapLeft(root)+sumOfUncoveredLeapRight(root);
    }
    static int  sumOfUncoveredLeapRight(Node root){

        if (root == null) return 0;

        if(root.right == null){
            return root.key+ sumOfUncoveredLeapLeft(root.left);
        }
        else{
            return  root.key+sumOfUncoveredLeapLeft(root.right);
        }
        // return root.key ;


    }
    static Node parent = null;
    public static void findParent(Node root, Node child){
        if (root == null) return ;
        if (root.left != null && root.left == child){
            parent = root;
        }
        if(root.right != null && root.right == child){
            parent = root;
        }
        findParent(root.left, child);
        findParent(root.right, child);

    }


    public static boolean checkIfSibling(Node root, Node a, Node b){
        if (root == null) return false;

        return  ((root.left == a && root.right == b)
                || (root.left == b && root.right == a)
                || checkIfSibling(root.left,a,b)
                || checkIfSibling(root.right,a,b) );
    }
    static int lev =0;
    public static void findLevelOfANode(Node root, Node a, int level){

        if(root == null){
            return ;
        }
        if(root == a ){
            lev = level;
        }
        findLevelOfANode(root.left,a,level+1);
        findLevelOfANode(root.right,a,level+1);


    }

    public static void printONlyRight(Node root){
        if (root == null){
            return;
        }

        if(root.right != null){
            System.out.print(root.right.key+" ");
        }
        printONlyRight(root.right);
        printONlyRight(root.left);

    }

    public static int Samelevel(Node root){
        if (root == null) return 0;
        int lLv = 1+Samelevel(root.left);
        int rLv = 1+Samelevel(root.right);

        if(lLv == rLv){
            return 1;
        }
        else
        {
            return  0;
        }
    }
    public static void main(String[] args){

          root = new Node(10);


        root.left = new PlayWithTree.Node(11);
        root.left.left = new PlayWithTree.Node(7);
        root.left.right = new PlayWithTree.Node(1);
        root.right = new PlayWithTree.Node(9);
        root.right.left = new PlayWithTree.Node(15);
        root.right.right = new PlayWithTree.Node(8);
        inOrder(root);
        System.out.println();
        printLeftNodesOnly(root);
        System.out.println();
        printONlyRight(root);
        System.out.println("----------------");
        printGivenLevel(root,1);
     //   System.out.println("SUM OF ALL NODES IS "+findSumOfAllNodes(root));
      // System.out.println("CHECK SUM TREE no = "+checkSumTree(root));
     //  System.out.println("STAIC VALUE IS YES "+val);

 val = true;

        root = new Node(10);
        root.left = new PlayWithTree.Node(8);
        root.left.left = new PlayWithTree.Node(3);
        root.left.right = new PlayWithTree.Node(5);
        root.right = new PlayWithTree.Node(2);
        root.right.left = new PlayWithTree.Node(2);
     //   System.out.println("CHECK SUM TREE yes = "+checkSumTree(root));
    //    System.out.println("STAIC VALUE IS YES "+val);


     //   System.out.println("LEFT SUBTREE SUM = :"+findSumLeftTree(root));
     //   System.out.println("RIGHT SUBTREE SUM = :"+findSumRightTree(root));

        System.out.println("============================");
        System.out.println("PARENT  IS "+root.key+" ------  "+root.right.left.key);
        findParent(root, root);
        if(parent != null)
        System.out.println("APRENT IS "+parent.key);
        else
            System.out.println("APRENT IS NULL");

        findLevelOfANode(root,root,1);
        System.out.println("LEVEL IS "+lev);


        System.out.println("ALL NODES AT SAME LEVEL ="+Samelevel(root));

        /**
        root = new Node(9);
        root.left = new Node(4);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(7);


        root.right = new Node(17);
        root.right.right = new Node(22);
        root.right.right.left = new Node(20);
        System.out.println("SUM OF UNCOEVRED LETF SUBTREE :"+ sumOfUncoveredLeapLeft(root));
        System.out.println("SUM OF UNCOEVRED RIGHT  SUBTREE :"+ sumOfUncoveredLeapRight(root));


        System.out.println("SUM OF UNCOEVRED  :"+findSumOFConveredLEap(root));
 **/

    }
}
