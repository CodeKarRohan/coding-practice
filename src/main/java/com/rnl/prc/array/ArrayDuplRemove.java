package com.rnl.prc.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayDuplRemove {


    public static void removeDuplicate(List<Integer> lis){

        int k =0;

        int n = lis.size();
        //1,1,2,3,3,3,4,5
        for (int i = 1; i<n; i++){
            if (lis.get(k) != lis.get(i)){
                k++;
              //  lis.add(k, lis.get(i));
                lis.set(k,lis.get(i));
            }

        }
        lis.subList(k+1,lis.size()).clear();



        System.out.println(lis);

    }
    public static void main(String[] args){
        List<Integer> lis = new ArrayList<Integer>();
        lis.add(1);
        lis.add(1);
        lis.add(2);
        lis.add(3);
        lis.add(3);lis.add(3);
        lis.add(4);
        lis.add(5);
        System.out.println(lis);
       // lis.add(2,2222);
        //System.out.println(lis);
        removeDuplicate(lis);


    }
}
