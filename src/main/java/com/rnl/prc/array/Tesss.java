package com.rnl.prc.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Tesss {
public static  void main(String[] args){
    int[] a = new int[] {10,2,24,25,23,100,1,10,200};
    findKthLargest(a, 3);
}
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for(int i =0; i < k ; i++){
            que.add(nums[i]);
        }
/*
        while(!que.isEmpty()){
            System.out.println(que.poll());
        }
        */
        for (int i =k; i < nums.length; i++){


            if (nums[i] < que.peek()){
                continue;
            }
            else
            {
                que.poll();
                que.add(nums[i]);
            }
        }

        while(!que.isEmpty()){
            System.out.println(que.poll());
        }

        return -1;
    }
    //robbery problem
    public int rob(int[] nums) {
        int cur=nums[0],prev=nums[0],prev2=0;
        for(int i=1;i<nums.length;i++){
            cur=Math.max(prev2+nums[i],prev);
            prev2=prev;
            prev=cur;
        }
        return cur;
    }
    public String largestNumber(int[] nums) {

        String[] strAr = new String[nums.length];

        for (int i =0; i <nums.length; i++){
            strAr[i] = ""+nums[i];
        }

        Comparator<String> s = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a+b;
                String order2 = b+a;

                return order2.compareTo(order1);
            }
        };
        Arrays.sort(strAr, s);

return "";
    }
}
