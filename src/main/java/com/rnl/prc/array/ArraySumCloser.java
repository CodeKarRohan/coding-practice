package com.rnl.prc.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySumCloser {

    public static void main(String[] agrs){
        int[] a = {10, 22, 28, 29, 30, 40};

        int b[] = {1, 3, 4, 7, 10};
        int x = 15;

        int sum = 54;
        findPair(a, sum);
        findPair(b,x);
        pairSum2(a,sum);
        pairSum2(b, x);
    }

    public  static void findPair(int[] a, int sum){

        int tempSum = a[0]+a[1];
        int x = a[0];
        int y = a[1];
// {10, 22, 28, 29, 30, 40}; 54
        for (int i = 0; i < a.length-1; i++){
            for (int j = i+1; j < a.length; j++) {


                    if (Math.abs(sum - (a[i]+a[j])) < Math.abs(sum - tempSum) ){
                        tempSum = a[i] + a[j];
                        x = a[i];
                        y = a[j];
                    }

            }
        }

        System.out.println("Pairs ("+x+", "+y+")");
    }


    public static void pairSum2(int[] a, int sum){

        Arrays.sort(a);

        int l = 0;
        int r = a.length-1;
        int x=l, y =r;

        int diff = Integer.MAX_VALUE;

        while( l < r){
            if (Math.abs(sum - (a[l]+a[r])) < diff)
            {
                diff = Math.abs(sum - (a[l]+a[r]));
                x = l;
                y = r;
            }
            else{
                if ((a[l]+a[r]) > sum ){
                    r--;
                }
                else
                {
                    l++;
                }
            }

        }

        System.out.println(x+" "+y+" Pairs ("+a[x]+", "+a[y]+")");

    }
}
