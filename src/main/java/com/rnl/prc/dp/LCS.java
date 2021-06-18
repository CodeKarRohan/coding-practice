package com.rnl.prc.dp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LCS {

    public static void findLcs(String s1, String s2){

        char[] A = s1.toCharArray();
        char[] B = s2.toCharArray();

        int[][] dp = new int[A.length+1][B.length+1];

        for(int i =0; i <= B.length; i++){
            dp[0][i]  = 0;
        }
        for (int i =0; i <= A.length; i++){
            dp[i][0] =0;
        }

        for(int i =1 ; i <= A.length; i++){
            for(int j =1; j<= B.length; j++){

                if(A[i-1] == B[j-1]){
                    dp[i][j] = 1 +dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        System.out.println("LONGEST SEQ IS "+dp[A.length][B.length]);
    }


    public static  void main(String[] args){

        String s1 = "stone";
        String s2 = "longest";
        findLcs(s1,s2);

        String s3 = "xzzxzxzxxa";
        String s4 = "abcd";
        findLcs(s3,s4);
        fun1(5);
        fun(4);
    }


    static void fun1(int n)
    {
        int i = 0;
        if (n > 1)
            fun1(n - 1);
        for (i = 0; i < n; i++)
            System.out.print(" * ");
        System.out.println();
    }
    static void fun(int x)
    {

        if(x > 0)
        {
            fun(--x);
            System.out.print(x + " ");
            fun(--x);
            System.out.print(x + " ");
        }
    }

    class Solution
    {
        //Function to return Breadth First Traversal of given graph.
        public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj)
        {
            // Code here
            ArrayList<Integer> res = new  ArrayList<Integer>();
            boolean[] visited= new boolean[V];

            int v1 = 0;

            Queue<Integer> q = new LinkedList();
            q.add(v1);


            while(!q.isEmpty()){
                int d = q.poll();
                visited[d] = true;
               // System.out.println(d);
                res.add(d);
                Iterator<Integer> itr = adj.get(d).iterator();

                while(itr.hasNext()){
                    if (!visited[itr.next()]){
                        q.add(itr.next());
                    }
                }
            }

            return res;
        }
    }


}
