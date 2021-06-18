package com.rnl.prc.array;

public class MaxSumPatMatrix {

    public static  int MAX_SUM = Integer.MIN_VALUE;
    public static  void main(String[] args){
        int mat[][] =
              { { 10, 10, 2, 0, 20, 4 },
                { 1, 0, 0, 30, 2, 5 },
                { 0, 10, 4, 0, 2, 0 },
                { 1, 0, 2, 20, 0, 4 }
        };


        //down
        //digonal left
        // diagonal right

        for(int i=0;i<mat[0].length;i++)
            findSumPath(mat, 0,i, mat.length-1, mat[0].length-1, 0);
        System.out.println("SUM IS "+MAX_SUM);
    }

    public static void findSumPath(int[][] M, int m , int n, int ROW,
                                   int COL, int sum){

        //VAlid condition
        if ( m < 0 || m > ROW || n < 0 || n > COL){
            return;
        }
        else
        {
            sum = sum + M[m][n];
        }

        if (m == ROW) // rached last row
        {
            if (sum > MAX_SUM)
            {
                MAX_SUM = sum;
            }
        }
// DOWN
        findSumPath(M, m+1, n, ROW, COL, sum);

        // Diagonal left
        findSumPath(M, m+1, n-1, ROW, COL, sum);

        // Digonal right
        findSumPath(M, m+1, n+1, ROW, COL, sum);
    }
}
