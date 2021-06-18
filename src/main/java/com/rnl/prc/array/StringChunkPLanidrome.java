package com.rnl.prc.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class StringChunkPLanidrome {

    public static  void main(String[] args){

        String s = "geeksforgeeks";
        findChunk(s);
    }

    public  static void findChunk(String g){

        char[] c = g.toCharArray();

        int start =0;
        int end  = g.length()-1;

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        while (end >= start){

            s1.append(""+c[start]);
            s2.append(""+c[end]);
            start++;
            end--;

            String e = s2.toString();

            StringBuilder e1 = new StringBuilder(e);
            e = e1.reverse().toString();

           // System.out.println(s1.toString()+ "   "+e);
            if (s1.toString().equals(e)){
                System.out.println(s1.toString()+" ---- "+ e);
                s1.setLength(0);
                s2.setLength(0);
            }


        }

        System.out.println(s1.toString()+s2.toString());
    }

    public  void testSomething(int[] a, int k){

        PriorityQueue<Integer> q = new PriorityQueue<>();


        for(int i =0; i < k ; i++){
            q.add(a[i]);
        }

        for(int i =k; i < a.length; i++){

            if (a[i] < q.peek()){
                continue;
            }
            else{

                q.poll();
                q.add(a[i]);
            }
        }
        List<Integer> res = new ArrayList<>();
        while(!q.isEmpty()){
            res.add(q.poll());
        }

        Collections.reverse(res);
       // return res;


    }
}
