package com.rnl.prc.string;

public class StringReplace {

    public static void main (String[] args) {
        String s = "Mr John Smith";
        int trueLength = 13;
       // replaceInPlace(s, trueLength);
        replaceInPlace(s);
        /**
        s=s.trim();
        s=s.replaceAll(" ", "%20");
        System.out.println(s);
         ***/

    }

    // can't ue string directly , since new copy will be created
    // and it will not be in place.
    public  static  void replaceInPlace(String s) {

        // "rohan Latkar include";
        int spaceCnt = 0;
        char[] c = s.toCharArray();

        for (char c1: c) {
            if ( c1 == ' '){
                spaceCnt++;
            }
        }
        int length = s.length() + spaceCnt * 2;

        // the length includes new char required after space
        char[] c2 = new char[length];

        int j =0;
        for (int i =0; i < c.length ; i ++) {
            if( c[i] == ' ') {
                c2[j] = '%';
                c2[j+1] = '2';
                c2[j+2] = '0';
                 j = j +3;
            }
            else
            {
                c2[j] = c[i];
                j++;
            }
        }


       // for (char c1: c)
       System.out.print(c2);



    }
}
