package com.rnl.prc.array;

public class NumerPalindrome {

    public static int reverse(int n){

        // 1234
        // 4321

        int revSum = 0;
        int div =0;
        while (n > 0){
            revSum = revSum*10 + n % 10;
            n = n / 10;

        }

      //  System.out.print("rsss "+revSum);
        return  revSum;
    }


    public  static void main(String[] args) {

        int n = 1100112;


        System.out.print("rsss ::"+checkForPalindrome(n));




    }

    public  static  boolean checkForPalindrome(int n){

        if ( n %10 == 0) {
            return false;
        }

        return reverse(n) == n;
    }
}
