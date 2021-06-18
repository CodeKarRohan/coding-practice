package com.rnl.prc.ds.book.sll;





import java.util.*;
import java.util.stream.Stream;

public class MinStack {
    int minEle;
    Stack<Integer> s = new Stack<Integer>();
    SortedSet<Integer> ts
            = new TreeSet<Integer>();


    /*returns min element from stack*/
    int getMin1()
    {
        // Your code here

        if(ts.isEmpty()){ System.out.print(-1+" "); return -1;}
        int min = ts.first();
       // System.out.print("MIN "+min+" ");
        System.out.print(min+" ");
        return  min;
    }

    /*returns poped element from stack*/
    int pop1()
    {
        int x =-1;
        try{
            x= s.pop();
            ts.remove(x);
        }catch(Exception e){
            ts.clear();
        }

        //System.out.print("POP "+x+ " ");
        System.out.print(x+ " ");
        return x;
        // Your code here
    }

    /*push element x into the stack*/
    void push1(int x)
    {
        // Your code here
        ts.add(x);
        s.push(x);
    }

    public static void main(String[] args){
        MinStack m = new MinStack();
        /**
        m.getMin();
        m.pop();
        m.push(45);
        m.push(12);
        m.getMin();


        m.pop();
        m.getMin();
        m.pop();
        m.push(6);
        m.push(50);
        m.getMin();
        m.push(6);
        m.getMin();
        m.pop();
        m.push(56);
        m.push(90);
        m.pop();
        m.push(19);
        m.push(83);
        m.getMin();
        m.pop();
        m.getMin();
        m.getMin();
        m.push(75);
        m.pop();
        m.pop();
        m.push(54);
        m.getMin();
        m.push(15);
        m.push(80);
        m.getMin();
        m.push(76);
        m.getMin();


      **/

        m.pop();
        m.getMin();
        m.pop();
        m.push(2);
        m.pop();
        System.out.println();
        System.out.println(m.minStack);

        System.out.println();
        m.push(79);
        m.getMin();


        long[] arr = new long[]{1L,3L,5L,2L,2L};
        int n = arr.length;
        m.equilibriumPoint(arr,n);
    }


    Stack<Integer> minStack = new Stack<Integer>();

    int getMin(){
        if(minStack.isEmpty() || s.isEmpty()) {
            System.out.print(-1+" ");
            minStack.clear();
            return  -1;
        }
        int c = minStack.peek();
        System.out.print(c +" ");
        return c;
    }
    void push(int x)
    {
        // Your code here

        s.push(x);
        addToMinStack(x);

        // add to
    }

    int pop(){
        if(s.isEmpty()) {
            System.out.print(-1+" ");
            minStack.clear();
            return  -1;
        }

        int x = s.pop();
        removeFromMinStack(x);
        System.out.print(x+" ");
        return  x;

    }
    void removeFromMinStack(int x){
        Stack<Integer> temp = new Stack<Integer>();

        while(!minStack.isEmpty()){

            int e = minStack.pop();
           if( x == e){
               break;
           }
           else
           {
               temp.push(e);
           }

        }
        while(!temp.isEmpty()){
            minStack.push(temp.pop());
        }
    }
    void addToMinStack(int x){

        Stack<Integer> temp = new Stack<Integer>();
        if (minStack.isEmpty()){
            minStack.push(x);
            return;
        }

        while(!minStack.isEmpty()){

             int p = minStack.peek();
             if (p < x){
                 temp.push(minStack.pop());
             }else{
               //  minStack.push(x);
                 break;
             }

        }

        minStack.push(x);

        while(!temp.isEmpty()){
            minStack.push(temp.pop());
        }

    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here

       // Collections.sort(arr);

        Arrays.sort(arr);
        ArrayList<Integer> res = new ArrayList<Integer>();

        for (int i =0 ; i<arr.length-1; i++){
            if (arr[i] == arr[i+1]){
               res.add(arr[i]);
            }

        }
        return null;
    }

    int MissingNumber(int array[], int n) {
        // Your Code Here

        int sum = (n*(n+1))/2;
        int s = 0;

       s= Arrays.stream(array).sum();

     return 0;
    }


    public static int equilibriumPoint(long a[], int n) {

        // Your code here

        if (  n== 0){ return -1;}

        if ( n == 1){ return 1;}

        Long sum =0L;
        sum= Arrays.stream(a).sum();

        System.out.println("SUMMIS "+sum);
        Long leftSum =0L;
        Long rightSum =0L;
        //1,3,5,2,2
        // 5
        Long prev =0L;
        for(int i = 0; i < n-1; i++){


            leftSum +=  a[i];

            rightSum = sum - leftSum -a[i+1];
            if (leftSum  == rightSum ){
                System.out.println("EQB "+i);
                return i;
              //  return i;
            }

            System.out.println("LEFT "+leftSum+" righ "+rightSum+" prev "+a[i]);




        }
        System.out.println("NO EQB "+-1);
        return -1;
    }
}
