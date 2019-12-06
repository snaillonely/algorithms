package com.luosk.leetcode;

public class Q231_PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return isPowerOfTwo_01(n);
    }

    private boolean isPowerOfTwo_01(int n) {
        int result = 0;
        while (n > 0) {
            result += (n & 1);
            n >>= 1;
        }
        return result == 1;
    }
}
