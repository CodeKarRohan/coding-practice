package com.rnl.prc.array;

public class SortBubble {



    public static void bubb(int[] a){
        int n = a.length;
        for (int i =0; i < 3; i++){

            for (int j =0; j < n-i-1; j++){

                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        ArrayCoding.printArray(a);
    }
    public static  void main(String[] args){

        int[] a = new int[]{23,11,1,5,100,12,45};
        bubb(a);
    }
}
