package com.rnl.prc.array;

import java.util.*;

public class CountPairWithGuvenSum {

    public static  void main(String[] args){
        /*
        int a[] = {1, 5, 7, -1};
        int sum = 6;
        findCountPair(a, sum);
        method2(a,sum);
*/

        int[] b =new int[] {1, 5, 7, -1, 5};

        int s = 6;

        findCountPair(b, s);
        method2(b,s);
        method3(b,s);


    }


    public static void findCountPair(int[] a, int sum){

        int count = 0;
        for (int i =0; i < a.length-1; i++){
            for (int j = i+1; j < a.length; j++){
                if (a[i]+a[j] == sum){

                    System.out.println("pairs "+a[i]+"  "+a[j]);
                    count++;
                }
            }
        }
        System.out.println("Number of pairs == "+count);
    }

    public static void method2(int[] a, int sum){
        Arrays.sort(a);
        int l =0;
        int count = 0;
         int r = a.length-1;
        while(l < r){
            if( a[l] + a[r] == sum){
                System.out.println("pairs "+a[l]+"  "+a[r]);
                count++;
                l++;
                r--;
            }
            else if (a[l] + a[r] > sum){

                r--;
            }
            else{
                l++;
            }

        }
        System.out.println("Number of pairs == "+count);
    }

    public static void method3(int[] a, int sum){


       // int[] b =new int[] {1, 5, 7, -1, 5};

        // int s = 6;

        HashMap<Integer, Integer> stg1 = new HashMap<>();

        for (int i =0; i < a.length; i++){
            if(!stg1.containsKey(a[i])){
                stg1.put(a[i], 0);
            }
            stg1.put(a[i], stg1.get(a[i])+1);
        }

        System.out.println(stg1);

        int twice_count =0;

        for(int i =0 ; i < a.length; i++){

            if(stg1.get(sum-a[i] ) != null){
                twice_count = twice_count + stg1.get(sum-a[i]);
            }

            if ((sum-a[i]) == a[i]){
                twice_count--;
            }
        }

        System.out.println("COUNTTT "+twice_count/2);

        /*
        Set<Integer> stg = new HashSet<Integer>();
        for ( int x: a) stg.add(x);

        for (int i = 0; i < a.length; i++){


            if (stg.contains(sum - a[i]) && sum - a[i] != a[i]){
                System.out.println(a[i]+" "+(sum-a[i]));
            }
        }

*/


    }
}
