package com.rnl.prc;

public class StringPalindrome {

    public static void main(String[] args){
        String s = "ROHAN";
        //reverseString(s);
        // findFirstDigit(37234567);
       // pringFloydDiagram(6);
      //  printAreaOfCircle();
       // finsFactorialNumber();

        System.out.println("factorial os "+factorialRecursion(19));



    }

    static void reverseString(String in) {
        StringBuilder s = new StringBuilder();
        char[] n = in.toCharArray();
       for (int i = in.length()-1; i >= 0 ; i--) {

           s.append(n[i]);
       }
       System.out.println("result "+s.toString());
       int j = s.length();
       while ( j >= 0 ) {
            System.out.println(s.substring(j));
           j--;
       }
       System.out.println("sub "+s.substring(0));
    }

    static void revRecursive(char[] c) {
        if(c.length == 0){
            return;
        }

    }



    static void findLastDigitOfNumber( int number) {
        System.out.println("last digit of number is  = "+ (-1 * (number % 10)));

    }
    static void findFirstDigit( int number) {
        // covert to string first characater
        String s = ""+number;
        System.out.println("first digit string method "+s.charAt(0));
        System.out.println( "substring   " +s.substring(6));

        // without converting
        //keep dividing by ten
        while (number >= 10 ){
            number = number / 10;
        }
        System.out.println(" first digit is "+number);

    }


    static void swapTwoNumber(int a, int b) {

        int temp = a;
        a = b ;
        b = temp;

        System.out.println(" a : "+a+" :  b :"+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(" a : "+a+" :  b :"+b);




    }

    static void checkIfYearIsLeap( int year)
    {
       // The year is multiple of 400.
       // The year is multiple of 4 and not multiple of 100.

        boolean multipleOF400 = (year % 400 ) == 0 ? true : false;
        boolean multipleOf4 = ( year % 4) == 0 ? true : false;
        boolean multipleOf100 = ( year % 100 ) == 0 ? true : false;

      if ( multipleOf4) {
          System.out.println("true");
          return;
      }

      if (multipleOf100 )
      {
          System.out.println("false");
          return;
      }

      if (multipleOf4 )
      {
          System.out.println("true");
          return;
      }

      System.out.println("false");


    }


    static  void pringFloydDiagram( int n) {
        int val = 1;
        for ( int i =1 ; i <= n ; i++) {
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print(val + " ");
                val++;
            }
           System.out.println();

        }
    }


    static void printAreaOfCircle ( ) {
        double pi = Math.PI;
        double radius = 3;

        double area = pi * Math.pow(radius, 2);

        System.out.println(" area is   "+area);
    }


    static void finsFactorialNumber() {
        int a = 3;
        long ans =1;

        while( a > 0 ) {
            ans = ans * a;
            a--;
        }

        System.out.println("factorail is  "+ans);
    }


    static  long factorialRecursion( int a){
        if( a < 0){
            throw  new RuntimeException("Can't be negative");
        }

        if ( a == 0){
            return 1;
        }

        if ( a ==1 )
        {
            return  1;
        }
        return a*factorialRecursion(--a);
    }
}
