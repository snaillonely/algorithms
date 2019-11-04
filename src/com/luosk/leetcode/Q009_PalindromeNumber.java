package com.luosk.leetcode;

public class Q009_PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x > 0 && x % 10 == 0)) {
            return false;
        }

        int origin = x, reverse = 0;

        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        return origin == reverse;
    }
}
