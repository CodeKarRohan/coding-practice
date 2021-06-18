package com.rnl.prc.array;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class BubbleSort {



    public static void main(String[] args){

        int[] a = {12,22,25,11,64,0};
        bubbleSort(a);
        ArrayCoding.printArray(a);

    }
public static void printSom(int n){

        if (n <= 1 ){
            System.out.print(n+" ");
            return;
        }

        printSom(n-1);
        printSom(n-1);
        System.out.print(n+" ");

}

    public static  int[] bubbleSort(int[] a){
        printSom(5);
        boolean swap = false;



        int[] lis = new int[a.length];
        for (int i =0; i < lis.length ; i++) lis[i] = 1;

        for (int i =1 ; i<a.length;i++){

            for (int j =0 ; j < i ; j++){

                if (a[i] > a[j] && lis[i] < lis[j]+1){
                    lis[i] = lis[j] +1;
                }
            }
        }

        int max = lis[0];
        for(int i =0; i < lis.length; i++){
            if (lis[i] > max){
                max = lis[i];
            }
        }

        System.out.println(max);



      for (int i = 0 ; i < a.length -1; i++) {

          swap = false;
          for (int j = 0; j < a.length - i - 1; j++){

              System.out.println("i : "+i+" j: "+j);

              if (a[j] > a[j+1]){

                  int temp  = a[j] ;
                  a[j] = a[j+1];
                  a[j+1] = temp;
                  swap = true;
              }


          }
          if (!swap) return  a;
      }
        return a;
    }
}
