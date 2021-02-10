package com.rnl.prc;

import java.lang.reflect.Array;

public class ArrayFunctions {

    public static void main (String[] args) {

        int[] a = {100,32,43,11,22,45};
        int[] b = {-1,0,-2,-5,-6,-8};
        int[] c= {1,2};
     //  largestNumberInarray(b);

        rotateArrayLeft(a,3);
    }

    static void largestNumberInarray(int[] a){
        int n = Integer.MIN_VALUE;

        for ( int i :a){
            if ( i > n) {
                n = i;
            }
        }

        System.out.println("Largest number in array is "+n);
    }


    static void rotateArrayRight(int[] a, int index) {
        int[] b  = new int[a.length];
        for (int i =0; i < a.length; i++){
            b[(i+index)%a.length] = a[i];
        }

        for ( int j : b){
            System.out.print(j+"  ");
        }

    }


    static void rotateArrayLeft(int[] a, int index) {
        int[] b  = new int[a.length];


        for (int i =0; i < a.length; i++){
            b[(i-index+a.length)%a.length] = a[i];
        }

        for ( int j : b){
            System.out.print(j+"  ");
        }

    }

    static void findElm(int[] a, int elm) {

    }
}
