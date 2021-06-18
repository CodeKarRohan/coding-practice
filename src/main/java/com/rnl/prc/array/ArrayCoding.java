package com.rnl.prc.array;

import java.util.HashSet;
import java.util.Set;

public class ArrayCoding {


    public static void findMissingNumberInArray(int[] a) {

        int sumOf100 = 50*101;
        int sum =0;
        for( int i : a) {

            sum = sum+i;
        }

        System.out.println(sumOf100 - sum);

    }


    public static  void findDuplicateNumerInArray(int[] a)
    {
        Set<Integer> dupSet = new HashSet<Integer>();
        for (int i : a) {
            if (!dupSet.add(i)) {
                System.out.println(i);
            }
        }
    }

    public  static  void findLargetAndSmallest(int [] a){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : a){

            if ( i < min) {
                min =i;
            }
            if ( i > max) {
                max = i;
            }
        }

        System.out.println("MAX : "+ max +"  MIN : "+min);


    }

    public static  int sumOfArray(int[] a){
        int sum =0;
        for (int i : a) sum = sum +i;

        return sum;
    }


    // Method should remove one element , at given index
    public static void removeIndexVal(int[] a, int b){

        for (int i=b; i <a.length-1; i++){

            a[i] = a[i+1];

        }
        a[a.length-1] = 0;

    }

    public  static void printArray(int[] a){
        System.out.print("{");
        for (int i:a){

            System.out.print(i+" , ");
        }
        System.out.println("}");
    }

    public  static  void main(String[] args) {
        int a[] ={10,2,4,3,10,4,5,10};
        printArray(a);
        //findDuplicateNumerInArray(a);
        //findLargetAndSmallest(a);

        removeIndexVal(a, 3);
        printArray(a);

    }
}
