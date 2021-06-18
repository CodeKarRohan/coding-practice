package com.rnl.prc.array;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class TU_array {

    @Test
    public void testMinInArray(){

        int[] a = new int []{1,2,10,12};
        Assert.assertEquals(25, ArrayCoding.sumOfArray(a));
    }

    @Test
    public void testSumPair(){
        int[] a = {1,4,2,5,6,6};

        int sum = 7;

        List<pairs> pa = PairEqualSum.findPairBruteForce(a, sum);

        Assert.assertEquals(3, pa.size());

        pa = PairEqualSum.findPairBruteForce(a, 18);
        Assert.assertEquals(0, pa.size());
    }


    @Test
    public  void testSelectionSort(){
        int a[] = {64 ,25,  12,  22 , 11};

        int b[] = SelectionSort.sort(a);

        Assert.assertArrayEquals(new int [] {11,12,22,25,64}, b);


    }
    @Test
    public void testBubbleSort() {
        int[] a = {12,22,25,11,64,0};

        Assert.assertArrayEquals(new int[] {0,11,12,22,25,64}, BubbleSort.bubbleSort(a));
    }
}
