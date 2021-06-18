package com.rnl.prc.array;

import java.util.*;

public class MulDupliacte {

    public static void main(String[] args){
        int[] a = {1,3,4,5,1,3,4};


        ArrayCoding.printArray(a);

        System.out.println(findDuplicate(a));
        removeDuplicate(a);

    }

    public  static Set<Integer> findDuplicate(int[] a){

        Set<Integer> dup = new HashSet<>();

        Set<Integer> d = new HashSet<>();

        for (int x : a){

            if(!d.add(x)){
                dup.add(x);
            }
        }

        return dup;

    }

    public  static void removeDuplicate(int[] a){

        Set<Integer> d = new HashSet<>();
        //substituremehotd

        /**
        for (int i =0; i<a.length; i++){

            if(!d.add(a[i])){
                 a[i]=0;
            }
        }

        ArrayCoding.printArray(a);
        **/
/**
        int dupC = 0;
        // Find num of duplicate
        for(int i= 0; i <a.length; i++){

            if(!d.add(a[i])){
                dupC++;
            }
        }

        d.clear();
        int[] b = new int[a.length-dupC];
        int j =0;
        for(int i= 0; i <a.length; i++){

            if(d.add(a[i])){
                b[j] = a[i];
                j++;
            }
        }

        ArrayCoding.printArray(b);


        **/

        LinkedList<Integer> lis = new LinkedList<>();

        for (int i = 0; i <a.length; i++){
            if (!lis.contains(a[i])){
                lis.add(a[i]);
            }
        }

        Arrays.stream(lis.toArray()).map(x -> x+" , ").forEach(System.out::print);


    }
}
