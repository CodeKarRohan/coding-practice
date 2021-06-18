package com.rnl.prc.array;

public class Fibonacci {


    public static int fibo(int n, int[] mem){

        if ( n == 0){
            System.out.print("here0||");
             mem[n] = 1 ;
            return 1;
        }
        else if (n == 1){
            System.out.print("here1||");
            mem[n] = 1;
            return 1;
        }
        else
        {
            mem[n] = mem[n-1] + mem[n-2];
            if (mem[n] != 0){
                return mem[n];
            }
            else
            {
                System.out.print("herez||");
                return fibo(n-1, mem) + fibo(n-2, mem);
            }



        }

    }

    public static void main(String[] args) {

        int[] m = new int[21];
        int n = fibo(20, m);

        System.out.println(n);

        int N = 10;
        int fib1 =1;
        int fib2 =1;

        System.out.print(fib1+" "+fib2);
        int fib = fib1+fib2;

        while (fib <= N) {

            System.out.print(" "+fib+" ");
            fib1 = fib2;
            fib2 = fib;
            fib = fib1 + fib2;
        }
    }
}
