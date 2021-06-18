package com.rnl.prc.dp;

import org.omg.CORBA.INTERNAL;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class RodCutting {


    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        int[] profit = new int[] {1,5,8,9,10,17,17,8};
        int m = findMaxProfit(profit, 4);

        System.out.println("MAX PROFT IS "+m);
        int n = findRod(profit, 4);
        System.out.println("max profit is "+n);




     //   System.exit(0);

        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafe = (Unsafe) f.get(null);
        unsafe.putAddress(0, 0);


    }

    public  static  int findRod(int[] price, int n){

        int[] val = new int[n+1];

        val[0] = 0;

        int MAX_VAL = Integer.MIN_VALUE;

        for (int i = 1; i <= n ; i++){

            for(int j =0; j <i ; j++){

                MAX_VAL = Math.max(MAX_VAL, price[j]+val[i-j-1]);
            }
            val[i] = MAX_VAL;
        }

        return  val[n];
    }


    public static int findMaxProfit(int[] profit, int n){

        if ( n <=0) return 0;

        int MAX_VAL = Integer.MIN_VALUE;
     //   System.out.println("---------"+n+"---------");
        for (int i =0; i < n; i++){

          //  System.out.println(n+" "+i);
            MAX_VAL = Math.max(MAX_VAL, profit[i]+findMaxProfit(profit,n-i-1 ));
           // System.out.println();
        }

       // System.out.println();
        return  MAX_VAL;
    }
}
