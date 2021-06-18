package com.rnl.prc.string;

public class DuplicateCharacter {


    public  static  boolean checkDupWithBitVector(String s) {

        int checker = 0;

        for (char c : s.toCharArray() ){

            int val = (int) c - 'a';

            System.out.println(val);

            if ((checker & ( 1 << val)) > 0 ) return true; //check position

           // System.out.println(checker);

            checker |= ( 1 << val);

        }
        return  false;
    }
    public static boolean checkStringCharDuplicate(String s) {
        // without using any other data structure

        // Assumption ASCII CHAR STRING

        int[] hashCharTable = new int[128];

        for (char c: s.toCharArray()) {

           // System.out.println((int)c);
            if (hashCharTable[c] == 1) return true;
            hashCharTable[c] = 1;

        }
        return false;
    }


    public  static void main (String[] args) {

        String s  ="rohan";
        System.out.println("STRING HAS DUPLICATE CHAR " +checkStringCharDuplicate(s));
        System.out.println("STRING HAS DUPLICATE CHAR " + checkDupWithBitVector(s));

        //for (int i =0 ; i <128;i++)
        // System.out.println(i + "   :"+(char) i);

    }
}
