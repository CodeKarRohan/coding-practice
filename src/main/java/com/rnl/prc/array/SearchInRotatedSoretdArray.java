package com.rnl.prc.array;

public class SearchInRotatedSoretdArray {


    public static void main(String[] args){

        int a[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int x = 10;
        search(a, x);

    }


    public static void search(int[] a, int x){



        int pivotPoint = findPivot(a);
        System.out.println("Pivot point is "+pivotPoint);

        int l = 0, r =0;

        if (x == a[pivotPoint]){
            System.out.println("FOUND ELEMENT AT "+pivotPoint);
            return;
        }

       // int a[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
       // int x = 2;

        if ( pivotPoint == -1){
            l = 0;
            r = a.length;
        }

        if ( x < a[pivotPoint] && x < a[0]){
            l = pivotPoint;
            r =a.length;
        }
        else {
            l =0;
            r =pivotPoint;
        }


        int mid = (l+r)/2;

        while( l <= r){
            System.out.println(l+ " "+ r+" "+mid);
            mid = (l+r)/2;
            if ( a[mid] == x){
                System.out.println("FOUND ELEMENT AT "+mid);
                return;
            }
            else if (x > a[mid]){
                l = mid +1;
            }
            else if ( x < a[mid]){
                r = mid - 1;
            }
        }

        System.out.println(" ELEMENT NOT FOUND");


    }



    public static int findPivot(int[] a){

        for (int i = 0 ;i < a.length-1; i++){

            if(a[i+1] < a[i]){
                return i;

            }

        }
        return -1;
    }
}
