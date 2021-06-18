package com.rnl.prc.array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Verifier;

public class TestCode {

    @Test
    public void testOneMethod(){
        int[] n = new int[21];
        Assert.assertEquals(10946, Fibonacci.fibo(20, n));
        Assert.assertEquals(1, Fibonacci.fibo(0, n));
        Assert.assertEquals(1, Fibonacci.fibo(1, n));

    }

    @Test
    public void testPalindromeCheck(){
        Assert.assertTrue(NumerPalindrome.checkForPalindrome(1001));
        Assert.assertFalse(NumerPalindrome.checkForPalindrome(10012));


    }

}
