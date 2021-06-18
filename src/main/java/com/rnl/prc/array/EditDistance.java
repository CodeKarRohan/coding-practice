package com.rnl.prc.array;

public class EditDistance {


    public  static  void findMinOpr(String X, String Y, int m , int n){

        int[][] L = new int[m+1][n+1];

        for(int i =0; i <= m ; i++){

            for (int j =0; j<= n ; j++){

                if ( i == 0){
                    L[i][j] = j;
                 }
                else if (j == 0){
                    L[i][j]  = i;
                }
                else if (X.charAt(i-1) == Y.charAt(j-1)){
                    L[i][j] = L[i-1][j-1];
                }
                else
                {
                    L[i][j] = 1 +findMin(
                            L[i][j-1],
                            L[i-1][j],
                            L[i-1][j-1]
                    );
                }
            }
        }
        MatrixMul.printMat(L);
    }

    public static int findMin(int x, int y, int z){

        if ( x <= y && x <= z) return  x;

        if (y <= x && y <= z) return y;

        if (z <= x && z <= y) return  z;

        return 0;

    }
    public  static void main(String[] args){
        String str1 = "sunday";
        String str2 = "saturday";
        findMinOpr(str1, str2, str1.length(), str2.length());
    }
}
