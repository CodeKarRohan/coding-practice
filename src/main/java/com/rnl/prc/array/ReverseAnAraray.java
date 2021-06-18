package com.rnl.prc.array;

public class ReverseAnAraray {



    public static void reverse(int[] a, int size){
        System.out.println(a[size]);
        if (size <= 0) {
            return;
        }
        else{
            size = size -1;
            reverse(a, size);
        }



    }

    public static void main(String[] args){
        int[] a = new int[]{1,2,3,4,5};
        reverse(a,a.length-1);

    }
}
