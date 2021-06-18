package com.rnl.prc.array;

public class MatrixMul {


    public static void main(String[] args){

        int[][] a = new int[][]{{1,2},{3,4},{5,6}};

        int[][] b = new int[][]{{1,2},{3,4}};
        mul(a,b);
       // printMat(a);
      //  printMat(b);


    }

    public static void printMat(int[][] a){

        for (int r = 0; r < a.length ; r++){
            System.out.print("| ");
            for(int c =0; c < a[0].length; c++) {
                System.out.print(a[r][c]+" ");
            }

            System.out.print("| ");
            System.out.println();
        }
        System.out.println("------------------");
    }

    public  static  void mul(int[][] a, int[][] b){

      //  System.out.println(a[0].length); // col
       //  System.out.println(a.length);   // row
        int[][] sum = new int[a.length][a[0].length];

        for(int i =0; i < a.length; i++){

            for(int  j =0; j <a[0].length ; j++){


                sum[i][j] = 0;

                for (int k =0; k < b[0].length; k++){

                    sum[i][j] += a[i][k]*b[k][j];
                }

            }
        }
        printMat(sum);
    }
}
