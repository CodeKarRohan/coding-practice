package com.rnl.prc.ds.book.sll;

import org.omg.CORBA.INTERNAL;

import java.util.*;

public class TripletSum {

    public static boolean findTriplets(int arr[] , int n) {
        //add code here.

        Map<String, Integer> map = new HashMap<String,Integer>();


        List<Integer> lis = new ArrayList<Integer>();
        HashSet<Integer> s= new HashSet<>();

        for (int p = 0; p < n; p++)
            s.add(arr[p]);

            for (int i = 0; i < n; i++) {

                for (int j = i; j < n; j++) {

                    if (i != j) {

                        int x = arr[i] + arr[j];
                        x *= -1;
                        if(s.contains(x)){
                            System.out.println("ATCHCHC "+ i+" "+j+" sum "+ x);
                        }
                        System.out.println(i+" "+j+" sum "+ x);

                    }
                }
            }

            return false;

    }
    public static void main(String[] args){
        int[] a = new int[] {0, -1, 2, -3, 1};

        int[] b = new int [] {7 , 4,  -16,  43,  4,  7,  -36, 18};

        findTriplets(b, b.length);
    }

    public static boolean findTriplets1(int arr[] , int n) {
        //add code here.

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i =0; i<n; i++){

            for(int j = i ; j<n;j++){
                if(i != j){

                    map.put(i+"|"+j, -1*(arr[i]+arr[j]));
                }

            }
        }

        for (int k =0; k < n;k++){



        }
        return false;
    }
}
