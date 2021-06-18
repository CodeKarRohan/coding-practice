package com.rnl.prc.string;

// check if any permutaion of given string is palindrome
// if any of the permutaion of given string is palindrome
// Main logic is
// Odd character count max should be one

public class PalindromePermutation {
    // Tact coa
    // taco cat
    // only one character count should be odd

    public static void main(String[] args) {

       String  s1 = "tact coa";
       s1 = "GAGAN GAGAN";
        // String  s1 = "topstops";

        s1 = s1.replaceAll(" ", "");
        int oddCount = checkOddCount(s1);
        System.out.println("Odd count is ; " +oddCount);

        if (oddCount > 1) {
            System.out.println(" NO PLAINDROME PERMUTATION");
        }
        else
        {
            System.out.println("  PLAINDROME PERMUTATION");
        }

    }

    public static int checkOddCount(String s) {

        s = s.toLowerCase();

        int[] bitset = new int[128];
        int oddCount = 0;

        for (char c : s.toCharArray()) {

            bitset[c-'a']++;

            if (bitset[c-'a'] %2 != 0) {
                oddCount ++;
            }
            else
            {
                oddCount --;
            }
        }

          return oddCount;
    }




}
