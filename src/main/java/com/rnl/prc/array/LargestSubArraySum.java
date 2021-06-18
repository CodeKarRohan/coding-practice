package com.rnl.prc.array;

import java.util.Arrays;

public class LargestSubArraySum {


    public static  void main(String[] args){

        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        //findLrgSum(a);

        int[] x = {1,2};
        int[] y = {3,4};

        System.out.println(findMedianSortedArrays(x,y));



    }


    public static  void findLrgSum(int[] a){

        int max_so_far = Integer.MIN_VALUE;

        int max_interval = 0;
//  int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        for(int i =0; i < a.length; i++){

            max_interval = max_interval + a[i];

            if (max_so_far < max_interval){
                max_so_far = max_interval;
            }


            if (max_interval < 0){
                max_interval = 0;
            }
        }

System.out.println("MAX SUM "+max_so_far);

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] merged = new int [nums1.length+nums2.length];
int j =0;
        for (int i =0; i <nums1.length; i++) {merged[i] = nums1[i]; j++;}

        for (int i =0; i <nums2.length; i++) {merged[j] = nums2[i];j++;}


        ArrayCoding.printArray(merged);

        Arrays.sort(merged);

       // ArrayCoding.printArray(merged);
        int n = merged.length;


        if ( n % 2 != 0){

            return (double) merged[n/2];
        }
        else
        {
            return (double)(merged[(n - 1) / 2] + merged[n / 2]) / 2.0;
        }

    }
}
