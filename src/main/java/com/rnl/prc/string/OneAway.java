package com.rnl.prc.string;

public class OneAway {

    public static void main(String[] args) {

       // boolean oneEditReplace = checkOneEditReplace("TACO", "PACO");
       // boolean oneinsert = oneEditInsert("pales","pale");

       // System.out.println("ONE EDIT REPLACE == :"+oneEditReplace);
      //  System.out.println("ONE insert edit  == :"+oneinsert);

        String s2= "pale";
        String s1 = "ple";
       // s1= "pale";
       // s2 = "bae";

        boolean checkFlag = checkIfStringOnAway(s1, s2);

        System.out.println(" one away "+checkFlag);
    }


    public  static boolean checkIfStringOnAway( String s1, String s2) {

        if (s2.equals(s1)) {
            return false;
        }

        boolean oneEditReplace = false;
        boolean oneInsert = false;

        if (s2.length() == s1.length()) {
            oneEditReplace = checkOneEditReplace(s1, s2);

        }
        else if (s1.length() > s2.length()) {
            oneInsert = oneEditInsert(s1, s2);
        }
        else if (s1.length() < s2.length()) {
            oneInsert = oneEditInsert(s2, s1);
        }
        else
        {
            return false;
        }

        return oneEditReplace || oneInsert;

    }

    // check two string if they differ by one character only
    public  static boolean checkOneEditReplace(String s1, String s2) {

        boolean oneEditReplace = false;

        if (s1.length() != s2.length()) return  false;

        for (int i =0; i <s1.length() ; i++){

            if (s1.charAt(i) != s2.charAt(i)) {

                if (oneEditReplace == true) {
                    return false;
                }
                oneEditReplace = true;

            }
        }
        return  true;

    }


    // s1.length > s2.length
    // if we add one char from s1 to s2 they will become equal
    // only one char edit
    public  static  boolean oneEditInsert(String s1, String s2){

        for (int i = 0; i < s1.length(); i++ ) {

            if (s2.contains(""+s1.charAt(i))) {

            }
            else
            {
                for ( int j =0 ; j <= s2.length(); j++){

                    String first = s2.substring(0,j)+""+s1.charAt(i)+s2.substring(j);
                    System.out.println(first);


                    if (first.equals(s1)) {
                        return true;
                    }


                }
            }

        }
        return false;
    }
}
