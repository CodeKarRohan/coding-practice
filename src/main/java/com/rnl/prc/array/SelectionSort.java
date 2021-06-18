package com.rnl.prc.array;

public class SelectionSort {

    public static  void main(String[] args){
        int a[] ={64 ,25,  12,  22 , 11};
        ArrayCoding.printArray(sort(a));

    }

    public  static int[] sort(int[] a){

        for (int i = 0; i< a.length -1 ; i++) {

            int min_ind = i;

            for (int j = i + 1; j < a.length; j++) {

                if (a[j] < a[min_ind])
                    min_ind = j;
            }

            int temp = a[i];
            a[i] = a[min_ind];
            a[min_ind] = temp;

        }
        return  a;


    }
}
