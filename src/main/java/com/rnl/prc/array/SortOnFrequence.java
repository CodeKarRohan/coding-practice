package com.rnl.prc.array;

import java.lang.reflect.Array;
import java.util.*;

public class SortOnFrequence {

 static class DupS{
     int key;
     int fr;
     DupS(int key, int freq){
         this.key = key;
         this.fr = freq;
     }

     public String toString(){
         return key+"|"+fr;
     }

 }


    public static void sortBasedOnFreq(int[] a){
       // Arrays.sort(a);

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i =0; i < a.length;i++){

            if (freq.containsKey(a[i])){
                freq.put(a[i], freq.get(a[i])+1);
            }
            else
            {
                freq.put(a[i], 1);
            }

        }

        List<DupS> dupLis = new ArrayList<DupS>();
        for (int key : freq.keySet()){

            DupS d = new DupS(key, freq.get(key));
            dupLis.add(d);
        }

        System.out.println(dupLis);
        Collections.sort(dupLis, (x,y)->{return  y.fr -x.fr; });

       System.out.println(dupLis);

       for (DupS d : dupLis){
           for(int i =0; i < d.fr; i++){
               System.out.print(d.key+" ");
           }
       }
    }
    public static void main(String[] args){
        int[] a = new int[]{7,7,7,7,5,5,6,4,4};

        int[] b = new int []{5 ,5 ,4, 6, 4};

        int[] c = new int [] {9 ,9 ,9, 2, 5};
        sortBasedOnFreq(c);

    }
}
