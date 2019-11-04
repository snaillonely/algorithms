package com.luosk.leetcode;

public class Q007_ReverseInteger {
    public int reverse(int x) {
        long result = 0;

        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            result = 0;
        }

        return (int)result;
    }
}
