package com.rnl.prc.array;

import java.util.HashMap;
import java.util.Map;

public class ReverseArray {

    public static  String ret(String k){
        return "rohan";
    }
    public static void main(String[] args){

        int i = 0;
        i = ++i + i;
        System.out.println("I +S+++S+DDS "  +i);
        Map mp = new HashMap<>();
        mp.put("abc",1);

      //  mp.computeIfAbsent("abc", k->ret(k));



        /**
       // int[] a = new int[] {1,2,3,4,5,6,7,8,9};

        int[] a = new int[] {1,2,3,4};

        int[] b = new int[] {1 ,2 ,3, 4, 5, 6, 7, 8, 9, 10};

      printAllSubArray(b);
       // reverse(a);
       // ArrayCoding.printArray(a);
      //  printSubArray(a,0,0,a.length);
         **/
    }


    public static  void reverse(int[] a){
        if (a.length == 0 || a.length ==1){
            return;
        }


        for (int i =0 ; i <a.length/2; i++){
            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
    }

    public static   void printAllSubArray(int[] a){


        for(int i =0; i < a.length; i++){
            for (int j =i; j <a.length; j++){

                for (int k =i ; k <= j ; k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
        }
    }


    public static  void printSubArray(int[] a, int start, int end , int n){

        if ( end == n){
            return;
        }

        else if ( start > end){
            printSubArray(a, 0, end+1, n);
        }

        else {
            System.out.print("[ ");
            for (int i = start; i <= end; i++) {

                System.out.print(a[i] + " ");
            }
            System.out.println("]");

            printSubArray(a, start + 1, end, n);
        }
        return;

    }
/**
    boolean isBSTUtil(Node root, int min, int max)
    {
        // code here.
        if (root == null) return true;

        if (root.data < min || root.data > max)
            return false;

        return (isBSTUtil(root.left, min, root.data-1) &&
                isBSTUtil(root.right, root.data+1, max));



    }
    **/

static String removeChars(String string1, String string2){

    // code here
String retString ="";
    char[] c1 = string2.toCharArray();

    for(char c: c1){
        retString = string1.replaceAll(""+c,"");
    }

return  retString;
}
}
