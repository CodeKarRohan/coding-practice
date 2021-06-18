package com.rnl.prc.array;

public class LargestCommonSubSeq {


    public  static  void findLCS(char[] X, char[] Y, int m , int n){

        int L[][] = new int[m+1][n+1];

        for (int i =0; i <= m; i++){

            for (int j =0; j <= n; j++){

                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                }
                else if (X[i-1] ==  Y[j-1]){
                    L[i][j] = L[i-1][j-1] + 1;
                }
                else
                {
                   L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
                }
            }
            MatrixMul.printMat(L);
        }

        MatrixMul.printMat(L);
        System.out.println("MAX LCS LENGTH IS "+L[m][n]);
    }

    public static void main(String[] args){

        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int  m = s1.length();
        int n = s2.length();

        findLCS(s1.toCharArray(), s2.toCharArray(), m,n);


    }
}
