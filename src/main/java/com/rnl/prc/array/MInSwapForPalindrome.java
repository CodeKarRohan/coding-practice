package com.rnl.prc.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MInSwapForPalindrome {

    public static int minSwap(String s){

        char[] a = s.toCharArray();

        int n = a.length;

        int left = 0;
        int right =0;
        int count =0;

        for (int i =0; i < n/2; i++){

            left =i;
            right = n-i-1;

            while (left < right){

                if (a[left] == a[right]){
                    break;
                }
                else
                {
                    right --;
                }
            }

            if ( left == right){
                return  -1;
            }

            // check swap position for right character

            for(int j = right; j < n-left-1; j++){
                count++;
                char c = a[j+1];
                a[j+1] = a[j];
                a[j] =c;


            }

        }
return  count;
    }

    public static void main(String[] args){

        int A = 'A';
        int a = 'a';
        int z = 'z';
        System.out.println(A+"  "+a+" "+z);
        String s = "geeksfgeeks";
       int misSwap  =  minSwap(s);

       StringBuilder sb = new StringBuilder();
       sb.append(s);
       sb.reverse();
       String s1 = sb.toString();

       int min2 = minSwap(s1);
int finMinSwap  = (min2< misSwap)? min2 :misSwap;
       System.out.println("MIn swap required "+finMinSwap);

//TEST
        String s3 = "JournalDev";
        int start = 1;
        char end =  5;
        System.out.println(start+end);
        System.out.println(s3.substring(start, end));


        //TEST2
        String s11 = "abc";
        String s2 = "abc";
      //  System.out.println("s1 == s2 is:" + s11 == s2);
        System.out.println( s11 == s2);

        List<Integer> l = new ArrayList<>();
        l.add(100);
        l.add(9);
        l.add(11);
        System.out.println("sum is "+sumIterator(l));
        System.out.println("SUM ITERATOR IS "+sumIteratorWithStream(l));
    }

    public static int sumIterator(List<Integer> lis){
        Iterator<Integer> itr = lis.iterator();
        int sum =0;
        while(itr.hasNext()){

            int c = itr.next();
            if (c > 10){
                sum =sum +c;
            }
        }
        return  sum;
    }
    public static int sumIteratorWithStream(List<Integer> lis){

        Stream<Integer> stream = Stream.of(1,2,3,4);
        Stream<Integer> stream1 = Stream.of(new Integer[]{1,2,3,4});

        return lis.stream().filter(i-> i>10).mapToInt(i -> i).sum();
    }
}
