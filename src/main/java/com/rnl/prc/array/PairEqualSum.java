package com.rnl.prc.array;

import java.util.*;

class pairs{
    int x;
    int y;

    public pairs(int c, int d){
        this.x = c;
        this.y = d;
    }

    public String toString(){

        return "("+x+","+y+")";
    }

    public  int hashCode(){
        return x+y;
    }

    public boolean equals(Object o){

        if ( ! (o instanceof pairs)){
            return false;

        }
        pairs p = (pairs) o;


        if (this.x == p.y && this.y == p.x){
            return true;
        }else
        {
            return false;
        }

    }
}
public class PairEqualSum {


    public static void main(String[] args){

        int[] a = {1,4,2,5,6,6};

        int sum = 7;

        System.out.println(findPairBruteForce(a, sum));
        System.out.println(findPairWithoutBF(a, sum));

        withPointer(a, sum);
    }

    public static List<pairs> findPairBruteForce(int[] a, int sum){
        List<pairs> pa = new ArrayList<>();


        for (int i = 0; i < a.length - 1; i++){

            for (int j = i+1; j < a.length; j++ ){
                if (a[i]+a[j] == sum){
                    pairs p = new pairs(a[i], a[j]);
                    pa.add(p);
                }
            }
        }


        return  pa;
    }

    // without brute force method
    public static LinkedHashSet<pairs> findPairWithoutBF(int[] a, int sum) {

        LinkedHashSet<pairs> pa = new LinkedHashSet<>();
        Set<Integer> s = new HashSet<>();

        for (int i : a){
            s.add(i);
        }

        for (int i :a){

            if (s.contains(sum-i)){
                pairs p = new pairs(i, sum-i);
                pa.add(p);
            }
        }

        return pa;
    }

    public static void withPointer(int[] a, int sum){

        Arrays.sort(a);
        ArrayCoding.printArray(a);

        int left =0;
        int right = a.length-1;

        while(left < right){
            int curSum = a[left]+a[right];
            if( curSum == sum){
                System.out.println("("+a[left]+" , "+a[right]+")");

                left = left+1;
                right = right -1;
            }
            else if (curSum > sum){
                right = right -1;
            }
            else
            {
                left = left +1;
            }
        }
    }
}
