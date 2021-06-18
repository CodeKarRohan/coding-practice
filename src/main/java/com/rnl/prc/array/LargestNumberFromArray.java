package com.rnl.prc.array;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberFromArray {

    public static void main(String[] args){
// 3, 30
// 330

        System.out.println("03".compareTo("3"));

    }

    public String largestNumber(int[] nums) {

        String[] strAr = new String[nums.length];

        for (int i =0; i <nums.length; i++){
            strAr[i] = ""+nums[i];
        }
        /**
        Comparator<String> t = (a,b)->
        {
            String order1 = a +b;
            String order2 = b +a;
            return order2.compareTo(order1);
        };

        Comparator<String> s = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a+b;
                String order2 = b+a;

                return order2.compareTo(order1);
            }
        };
        **/

        Arrays.sort(strAr, (a,b)->
        {
            String order1 = a +b;
            String order2 = b +a;
            return order2.compareTo(order1);
        });

        if (strAr[0].equals("0")){
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        for(String m : strAr){
            sb.append(m);
        }


        return sb.toString();

    }
}
