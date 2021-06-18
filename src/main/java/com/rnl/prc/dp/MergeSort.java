package com.rnl.prc.dp;

import com.rnl.prc.array.ArrayCoding;

public class MergeSort {

    public static  void main(String[] args){
int[] a = new int[]{10,1,23,45,11,28,100,45,3};
sort(a,0, a.length-1);

        ArrayCoding.printArray(a);
    }

    public static void sort(int[] a, int l, int r){

        if(l < r){
            int m = l +(r-l)/2;
            System.out.println("left "+l+" mid "+m+" right "+r);

            sort (a, l,m );
            sort(a, m+1, r);
            merge(a,l,m,r);
        }


    }

    public static void merge(int[] a, int l , int m, int r){

       // System.out.println("left "+l+" mid "+m+" right "+r);
        // find length of oth arrays
        int n1 = m-l+1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i =0; i < n1; i++){
            L[i] = a[l+i];
        }

        for (int j=0; j < n2; j++){
            R[j] = a[m+1+j];
        }

        int k =l;
        int i =0, j =0;
        while (i< n1 && j <n2){

            if (L[i] < R[j]){
                a[k] = L[i];
                i++;
                k++;
            }else{

                a[k] = R[j];
                j++;
                k++;
            }
        }

        if (i < n1){

            a[k] = L[i];
            i++;
            k++;

        }

        if (j < n2){

            a[k] = R[j];
            j++;
            k++;

        }
    }



}
