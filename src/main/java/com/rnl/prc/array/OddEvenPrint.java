package com.rnl.prc.array;

import java.util.*;

public class OddEvenPrint {

    static int MAX = 10;
    static int num = 1;

    public  void printEvenNum(){
        synchronized (this){
            while(num <= MAX){

                while(num %2 != 0){
                    try{
                        wait();
                    } catch(InterruptedException e){
                        System.out.println("Thread wait interupt exception");
                    }

                }
                System.out.println("even thread "+num);
                num++;
                notifyAll();
            }
        }

    }

    public   void printOddNum(){

        synchronized (this){
            while(num<= MAX){

                while(num %2 == 0){
                    try{
                        wait();
                    } catch(InterruptedException e){
                        System.out.println("Thread wait interupt exception");
                    }

                }
                System.out.println("odd thread : "+num);
                num++;
                notifyAll();
            }
        }

    }

    public  static  void main(String[] args){

      OddEvenPrint ovn = new OddEvenPrint();
    //  new Thread(()->ovn.printEvenNum()).start();
     // new Thread(()->ovn.printOddNum()).start();
        ovn.printAllSubString("abcd");

    }



    public int[] twoSum(int[] nums, int target) {

        HashSet<Integer> n = new HashSet<>();
        return null;

    }


    class NumFreq implements  Comparable{
        int num;
        int freq;

        public NumFreq(int num, int freq){
            this.num = num;
            this.freq = freq;
        }

        @Override
        public int compareTo(Object o) {
            NumFreq q = (NumFreq) o;

            return this.freq - q.freq;

        }

        @Override
        public String toString() {
            return "NumFreq{" +
                    "num=" + num +
                    ", freq=" + freq +
                    '}';
        }
    }

    public int[] topKFrequent(int[] nums, int k) {


        int[] res = new int[k];

        HashMap<Integer, Integer> freq = new  HashMap<Integer, Integer>();


          for (int i : nums){
              freq.put(i, freq.getOrDefault(i,0)+1);
          }

          List<NumFreq> f = new ArrayList<>();
          for (int key1 : freq.keySet()){

              f.add (new NumFreq(key1, freq.get(key1)));

          }

      //  Comparator<NumFreq> cCmp = (a,b)-> {return  a.freq-b.freq;};

           Collections.sort(f);
          Collections.sort(f, Comparator.comparingInt(a -> a.freq));



          System.out.println(f);
          k--;
          while(k >=0){
              res[k] = f.get(k).num;
          }

          return res;
    }

    public int findKthLargest(int[] nums, int k) {

           Arrays.sort(nums);

           return nums[nums.length-k-1];
    }

    public int findPeakElement(int[] a) {

        int prev = a[0];

        for (int i =0; i < a.length-1; i++){

            if (a[i] > prev && a[i] > a[i+i]){
                return i;
            }
            prev = a[i];
        }

         return 1;
    }



    public  void printAllSubString(String s){

        for (int i =0; i <s.length(); i++){
            for (int j =i+1; j <=s.length(); j++){
                System.out.println(i+" "+j+" "+s.substring(i,j));
            }
        }
    }
}
