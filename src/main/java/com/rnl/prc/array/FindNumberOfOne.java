package com.rnl.prc.array;

public class FindNumberOfOne {

    static int R = 4, C = 4;
    // Function that returns index of row
    // with maximum number of 1s.
    static int rowWithMax1s(int mat[][])
    {
        // Initialize first row as row with max 1s
        int j,max_row_index = 0;
        j = C - 1;

        for (int i = 0; i < R; i++) {
            // Move left until a 0 is found
            while (j >= 0 && mat[i][j] == 1) {
                j = j - 1; // Update the index of leftmost 1
                // seen so far
                max_row_index = i; // Update max_row_index
            }
        }
        if(max_row_index==0&&mat[0][C-1]==0)
            return -1;
        return max_row_index;
    }
    // Driver Code
    public static void main(String[] args)
    {
        int mat[][] =
                { { 0, 1, 1, 1 },
                { 0, 1, 1, 1 },
                { 0, 0, 1, 1 },
                { 1, 1, 1, 1 } };
        System.out.println("Index of row with maximum 1s is "+ rowWithMax1s(mat));


        int a[][] ={{1,3,1},
        {1,5,1},
        {4,2,1}};
        int res = minPathSum(a);

        System.out.println("MINMIM IS "+res);
    }


    public static int minPathSum(int[][] grid) {

        int res = 0;

        res = minPath(grid, 2, 2, grid.length-1, grid[0].length-1);
        return res;

    }


    public static int minPath(int[][] g , int i , int j, int row ,int col){
//System.out.println(i+"  "+j+ " "+row+" "+col);

        if (i < 0 || j < 0)
            return Integer.MAX_VALUE;

        else if (i == 0 && j == 0)
            return g[i][j];

       int uPath = minPath(g,i-1, j, row, col );
        int sPath = minPath(g,i, j-1, row, col );
        return g[i][j]+Math.min(uPath,sPath);

    }
}
