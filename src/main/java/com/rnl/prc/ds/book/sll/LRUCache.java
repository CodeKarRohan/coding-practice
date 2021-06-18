package com.rnl.prc.ds.book.sll;

import java.util.*;

public class LRUCache
{
    //Constructor for initializing the cache capacity with the given value.
    private static  int MAX_CAP ;
    private int capused =0;
    private Map<Integer, Integer> lru = new HashMap<>();
    private Integer lrUsed = -1;
    Queue<Integer> q = new LinkedList();

    public LRUCache(int cap)
    {
        //code here
        MAX_CAP = cap;
    }

    //Function to return value corresponding to the key.
    public  int get(int key)
    {

        if (lru.containsKey(key)){

            if(q.contains(key)){
                q.remove(key);
            }
            q.add(key);
            return lru.get(key);
        }
        else
        {
            return -1;
        }
        // your code here
    }

    //Function for storing key-value pair.
    public  void set(int key, int value)
    {

        if (lru.containsKey(key)){
            lru.put(key,value);
            if(q.contains(key)){
                q.remove(key);
                q.add(key);
            }
        }
        else{
            // your code here
            if (lru.size() == MAX_CAP){

                lru.remove(q.peek());
                q.remove();

            }
            lru.put(key, value);
            q.add(key);
        }

    }

    public static void main(String[] args){
        /**
        Queue<Integer> q = new LinkedList();
        q.add(1);
        q.add(2);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println(q.remove());
**/
        LRUCache lru = new LRUCache(2);
        lru.set(1,2);
        lru.set(2,3);
        lru.set(1,5);
        lru.set(4,5);
        lru.set(6,7);
        System.out.println("GET  "+lru.get(4));
        lru.set(1,2);
        System.out.println("GET  "+lru.get(3));

        int[] A = new int[]{1,2,1,3,4,2,3};

      System.out.println(countDistinct(A, 7,4));
      System.out.println(countDistinct2(A, 7,4));

        int[] B = new int[] {4,1,1};

      //  System.out.println(countDistinct(B, 3,2));
     //   System.out.println(countDistinct1(B, 3,2));
        int[] C = new int[] {45 ,20, 41 ,30, 32 ,18 ,98,
                72 ,82, 76, 10, 28 ,68 ,57 ,98, 54};
        System.out.println(countDistinct(C, 16,10));
        System.out.println(countDistinct2(C, 16,10));

        int[] c = new int[] {1,1,1,1,1,1,1,1,1,1};

        System.out.println(countDistinct(c, 10,5));
        System.out.println(countDistinct2(c, 10,5));
/**
        14 5
        78 16 94 36 87 93 50 22 63 28 91 60 64 27
 **/




    }

    static ArrayList<Integer>  countDistinct(int A[], int n, int k)
    {
        // code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(n <k || k <=0 || A.length <= 0){
            return res;
        }

        HashSet<Integer> s= new HashSet<>();
        for(int i =0; i <= n-k;i++){
            int count =0;
            for(int j=i; j < i+k; j++){
                if(s.add(A[j])){
                    count++;
                }
            }
            res.add(s.size());
            s.clear();
        }


        return res;

    }

    static ArrayList<Integer>  countDistinct1(int A[], int n, int k)
    {
        // code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(n <k || k <=0 || A.length <= 0){
            return res;
        }


        HashSet<Integer> s= new HashSet<>();
        int cnt =0;
        for(int i =0; i<k;i++){
            if(s.add(A[i])){
                cnt++;
            }
        }
        res.add(cnt);

        for(int i =k; i < n;i++){

            if(s.size() == k)
            {
                s.remove(A[i-k]);
                s.add(A[i]);
            }


            if (s.size() < k){
                s.add(A[i]);
            }


          // System.out.println(A[i+k-1]+" "+s.add(A[i+k-1]));
            res.add(s.size());

        }


        if(res.get(res.size()-1) == k){
            res.set(res.size()-1, k-1);
        }


        return res;

    }


    static ArrayList<Integer>  countDistinct2(int A[], int n, int k){
        // code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        ArrayList<Integer> c = new ArrayList<Integer>();
        if(n <k || k <=0 || A.length <= 0){
            return res;
        }


        HashSet<Integer> s= new HashSet<>();

        for(int i =0; i<k;i++){
            c.add(A[i]);
        }
        s.addAll(c);
        res.add(s.size());
        s.clear();

        for(int i = k ; i < n; i++){
            c.remove(0);
            c.add(A[i]);
            s.addAll(c);
            res.add(s.size());
            s.clear();

        }

        return res;
    }


}