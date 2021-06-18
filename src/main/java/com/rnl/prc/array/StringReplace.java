package com.rnl.prc.array;

public class StringReplace {


    public static String StrReplace(String s1, String s2) {

       s1 =  s1.replaceAll(s2,"X").replaceAll("X+", "X");
      // s1 = s1.replaceAll("X+", "X");

        
        return s1;
    }

    public static String StrRepl(String s1, String s2){

return null;

    }




    public static void main(String[] args){

        String s1 = "abababcdefababcdab";
        String s2 = "ab";

        System.out.println("REPLAED : "+StrReplace(s1,s2));
    }
}
