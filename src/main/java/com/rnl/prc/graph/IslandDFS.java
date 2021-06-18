package com.rnl.prc.graph;

import java.util.LinkedList;
import java.util.Map;

public class IslandDFS {

    int ROW =0;
    int COL = 0;
    int[] adjRow = new int[]{-1,-1,-1,0,0,1,1,1};
    int[] adjCol = new int[]{-1,0,1,-1,1,-1,0,1};

    public  int IslandDFS(int[][] M){
        int level =1;
      //  Map<Integer, LinkedList<Integer>> data = new HashMap<Integer,LinkedList<Integer>>();

       // data.put();

         ROW = M.length;
         COL = M[0].length;

        System.out.println("ROW : "+ROW+" COL "+COL);

        int count = 0;

        boolean[][] visited = new boolean[ROW][COL];

        for (int i =0; i < ROW; i++){
            for (int j =0; j <COL; j++){
                if (M[i][j] ==1 && !visited[i][j]){
                    DFS(M,i,j,visited);
                    count++;
                }
            }
        }

        return count;

    }

    public  boolean isSafe(int[][] M, int row, int col, boolean[][] visited){

        return (row >=0 )&& ( row <ROW) &&
                (col >=0 )&& (col < COL)&&
                (M[row][col] == 1 &&
                !visited[row][col]);


    }

    public void DFS(int[][] M, int row, int col, boolean[][] visited){

        visited[row][col] = true;

        for(int k=0; k <8;k++){

            if (isSafe(M, row+adjRow[k], col+adjCol[k], visited)){
                DFS(M, row+adjRow[k], col+adjCol[k], visited);
            }
        }

    }

public static void main(String[] args){
        int M[][] = new int[][] {
             {1, 1, 0, 0, 0 },
            { 0, 1, 0, 0, 1 },
            { 1, 0, 0, 1, 1 },
            { 0, 0, 0, 0, 0 },
            { 1, 0, 1, 0, 1 } };
    IslandDFS I = new IslandDFS();
    System.out.println("Number of islands is: " + I.IslandDFS(M));
}

}
