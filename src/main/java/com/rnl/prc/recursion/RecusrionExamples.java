package com.rnl.prc.recursion;

public class RecusrionExamples {

public  static void main(String[] args){
    /**
    int[] mem = new int[6];
    System.out.println("Mutipeication :"+mult(5, mem));
    int[] mem1 = new int[61];
    System.out.println("Fibonnaci : "+fib(60,mem1));

**/
    int[] sorted = new int[]{10,12,14,18,20,23,26,32};
    int found = binSerach(sorted, 0, sorted.length, 18);

    System.out.println("FOUND "+found);
}


public static void doSomething(String s){

}

public static  int binSerach(int[] a, int l, int r, int elm){

    System.out.println(" l "+l+" r "+r);



    if ( l > r || l == a.length){
        return -1;
    }

    int mid = (l+r)/2;
    if (a[mid] == elm){
        return 1;
    }
    else if (elm > a[mid]){

        l = mid+1;
        return binSerach(a, l, r, elm);

    }
    else
    {
        r = mid-1;
        return binSerach(a, l, r, elm);
    }



}


  public static int fib(int n, int[] mem){


    if (n == 0){
        mem[0] = 1;
        return 1;
    }

    else if (n == 1){
        mem[1] =1 ;
        return 1;
    }
    else
    {

        if (mem[n] != 0)
        {
            return mem[n];
        }
        else
        {
            mem[n] = fib(n-1, mem) + fib(n-2, mem);
            return mem[n];
        }

    }

  }
// mem not needed
    public static int mult(int n, int[] mem){

        if ( n == 0 ){
            mem[0] = 1;
            return 1;
        }
        else if ( n == 1){
            mem[1] =1;
            return 1;
        }
        else
        {
            if (mem[n] != 0){
                return mem[n];
            }
            else
            {
                mem[n] = n * mult(n-1, mem);
                return mem[n];
            }

        }

    }
}
