package com.rnl.prc.array;

public class Atoi {


    public static int basicAtoi(String s){
        // no validation no corner cases
        int res  = 0;


        for (int c : s.toCharArray()){

            res = res * 10 + c -'0';
        }

        return res;
    }


    // first character can be - , +, if not positive
    public static int atoiWithSigns(String s){

        if (s.length() <= 0){
            return 0;
        }


        int sign = 1;
        int i =0;
        if (s.charAt(0) == '-'){

            sign = -1;
            i =1;
        }
        else if ( s.charAt(0) == '+'){
            i =  1;
        }



        int res = 0;

        for (int k =i; k < s.length(); k++){

            res = res * 10 +s.charAt(k) - '0';

        }

        return  res * sign;


    }

    public static void main(String[] args){

        /**
        System.out.println("BASIC ATOI "+ atoiWithAllValidations("234"));

        System.out.println(" SIgn ATOI "+atoiWithAllValidations("-3456"));
       System.out.println(" SIgn ATOI "+atoiWithAllValidations("+456"));
       System.out.println(" SIgn ATOI "+atoiWithAllValidations(" - 21474836474 "));

       **/

        System.out.println(reverseNumber(3456));
    }

    public  static  int atoiWithAllValidations (String s){

        if (s == null || s.length() <= 0){return  0;}

     // s = s.trim();

       s = s.replaceAll(" ","");
        System.out.println("AFTER TRIM:"+s);

        int sign = 1;
        int ind = 0;

        if ( s.charAt(0) == '-'){
            sign = -1;
            ind = 1;
        }
        else if ( s.charAt(0) == '+'){
            sign = 1;
            ind = 1;
        }
        int res = 0;
        for (int i = ind; i < s.length(); i++){
            if (!Character.isDigit(s.charAt(i))){
                return  -1;
            }

            if ( res > Integer.MAX_VALUE / 10 ||
                    (res == Integer.MAX_VALUE/10 && s.charAt(i) - '0' >7)) {

                if (sign == 1) {

                    return Integer.MAX_VALUE;
                } else {
                    return sign * Integer.MAX_VALUE;
                }
            }
                res = res * 10 + Character.getNumericValue(s.charAt(i));

            }
        return  res * sign;

    }

    public  static  int reverseNumber(int n){
        if (n <= 9){
            return n;
        }


        int sum =0;
        while (n > 0){

            int rem = n % 10;
            n = n /10;

            sum = sum * 10+ rem ;
        }

        return sum;

    }
}
