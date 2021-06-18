package com.rnl.prc.string;

public class StringCompression {

    public static void main (String[] args) {

        String s ="aaabbbbbbbb";

        System.out.println("original string is :"+ s);
        System.out.println("compressed string is :"+compressTheString(s));
        System.out.println("compressed string is :"+compp(s));

    }

    public static String compressTheString(String s) {

        StringBuilder bi = new StringBuilder();

        for (int i =0; i < s.length(); i++) {
            char z = s.charAt(i);

            int count = 0;
            bi.append(z);
            while(i < s.length() && z == s.charAt(i) ){

                count++;
                i++;

            }
            i--;
            bi.append(count);
        }

        return bi.toString().length() < s.length()? bi.toString() : s;
    }


    public static String compp(String s) {

        int comppp =0;
        StringBuilder bi = new StringBuilder();
        for (int i= 0; i < s.length(); i++)
        {
            comppp++;

            if ( i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)) {

                bi.append(s.charAt(i));
                bi.append(comppp);
                comppp = 0;
            }

        }
        return bi.toString().length() < s.length() ? bi.toString() : s;
    }
}
