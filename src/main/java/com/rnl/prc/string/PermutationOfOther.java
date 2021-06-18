package com.rnl.prc.string;

import java.util.Arrays;


public class PermutationOfOther {
    public static void main(String[] args) {

        String s = "AABAC";
        String t = "BAACA";

        System.out.println("PERMU  :"+checkIfStringPermutation(s,t));

        int[] c = charCount(s);
        int[] c1 = charCount(t);

        System.out.println("PERMU  :"+checkIfTwoBitsetMatch(c,c1));
      //  printBitSet(c);


    }

public static  boolean checkIfTwoBitsetMatch(int[] c, int[] d){

        for (int i =0; i< 128; i++) {

            if(c[i] != d[i]) return false;

        }
        return true;
}
        public static boolean checkIfStringPermutation(String s, String t) {

        // Sort the string and check
        char[] cont1 = s.toCharArray();
        Arrays.sort(cont1);
        s = new String(cont1);


        cont1 = t.toCharArray();
        Arrays.sort(cont1);
        t = new String(cont1);

        return  s.equals(t);

    }

    public static int[] charCount(String s) {

        s =s .toLowerCase();
        int[] bitSet = new int[128];

        for (char c : s.toCharArray()) {
            bitSet[c-'a']++;

        }
        return bitSet;
    }


    public static  void printBitSet(int[] bitVector) {

        for (int i :bitVector)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }


}
