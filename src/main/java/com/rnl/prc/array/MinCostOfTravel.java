package com.rnl.prc.array;

public class MinCostOfTravel {

    public static int minCost(int[][] cost, int m, int n){
        int[][]  L = new int[m+1][n+1];
        L[0][0] = cost[0][0];
        int i , j;
        for (i = 1; i <= m; i++){
            L[i][0] = L[i-1][0]+cost[i][0];
        }
        for (j =1; j <= n ; j++){
            L[0][j] = L[0][j-1] + cost[0][j];
        }

        for (i = 1; i<= m; i++){
            for (j =1; j <= n ; j++){
                L[i][j] = min (L[i-1][j-1], L[i-1][j], L[i][j-1]) + cost[i][j];
            }
        }

        MatrixMul.printMat(L);
        return L[m][n];
    }

    private static int minCost1(int cost[][], int m, int n)
    {
        int i, j;
        int tc[][]=new int[m+1][n+1];

        String s ="1234";

        int s1= Integer.parseInt(s);


        MatrixMul.printMat(tc);
        tc[0][0] = cost[0][0];

        /* Initialize first column of total cost(tc) array */
        for (i = 1; i <= m; i++)
            tc[i][0] = tc[i-1][0] + cost[i][0];

        /* Initialize first row of tc array */
        for (j = 1; j <= n; j++)
            tc[0][j] = tc[0][j-1] + cost[0][j];

        /* Construct rest of the tc array */
        for (i = 1; i <= m; i++)
            for (j = 1; j <= n; j++)
                tc[i][j] = min(tc[i-1][j-1],
                        tc[i-1][j],
                        tc[i][j-1]) + cost[i][j];

        return tc[m][n];
    }

    public static int min(int x, int y, int z){

        if (x < y)
            return (x < z)? x : z;
        else
            return (y < z)? y : z;
    }

    public static void main(String[] args){
        int cost[][]= {{1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}};
        MatrixMul.printMat(cost);
        System.out.println("FIRST " +minCost(cost,2,2));

        System.out.println("SECOND :"+ minCost1(cost,2,2));
    }

    /**
     *  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     *
     *
     *         String s1 = "";
     *         while(l1 != null){
     *
     *             s1 = s1+l1.val;
     *             l1 = l1.next;
     *         }
     *
     *          String s2 = "";
     *         while(l2 != null){
     *
     *             s2 = s2+l2.val;
     *             l2=l2.next;
     *         }
     *
     *          int num1= Integer.parseInt(s1);
     *         int num2= Integer.parseInt(s2);
     *
     *         int num4 = num1+num2;
     *         String num3 = ""+num4;
     *
     *           ListNode l3 = new ListNode(Integer.parseInt(""+num3.charAt(num3.length()-1)));
     *            l3.next = null;
     *               ListNode l4 = l3;
     *
     *         for(int i = num3.length()-2; i >=0; i--){
     *
     *            ListNode temp =new ListNode(Integer.parseInt(""+num3.charAt(i)), null);
     *             l4.next = temp;
     *             l4 =temp;
     *
     *         }
     *
     *
     *         return l3;
     *
     *
     *     }
     */

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    /**
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            String num3= "" ;
            int rem =0;
            while(true){



                int n1=0; int n2=0;
                int sum =0;

                if (l1 != null) n1= l1.val;

                if (l2 != null ) n2 = l2.val;

                sum = n1+n2+rem;

                rem = 0;
                if (sum == 10){
                    sum = 0;
                    rem =  1;
                }

                if ( sum > 10){


                    rem = 1;
                    sum = sum % 10;

                }

                num3 = num3+sum;

                if ( l1 != null)
                    l1 = l1.next;

                if ( l2 != null)
                    l2 = l2.next;

                if (l1 == null && l2 == null){
                    if (rem != 0){
                        num3=num3+rem;
                    }
                    break;
                }

            }

            ListNode l3 = new ListNode(Integer.parseInt(""+num3.charAt(0)));
            l3.next = null;
            ListNode l4 = l3;

            for(int i = 1; i <num3.length(); i++){

                ListNode temp =new ListNode(Integer.parseInt(""+num3.charAt(i)), null);
                l4.next = temp;
                l4 =temp;

            }


            return l3;


        }
    }
    **/
}
