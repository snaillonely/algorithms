package com.luosk.leetcode;

public class Q029_DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        return divide_01(dividend, divisor);
    }

    // Time limit exceeded
    private int divide_01(int dividend, int divisor) {
        int sign = (dividend > 0 && divisor > 0 || dividend < 0 && divisor < 0) ? 1 : -1;
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);

        if (ldividend < ldivisor || ldividend == 0) {
            return 0;
        }

        long result = 0;
        while (ldividend >= ldivisor) {
            result++;
            ldividend -= ldivisor;
        }

        result *= sign;

        if (result < Integer.MIN_VALUE) {
            result = Integer.MIN_VALUE;
        }

        if (result > Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        }

        return (int) result;
    }

    private int divide_02(int dividend, int divisor) {
        if (dividend == 0) { return 0; }
        if (dividend == Integer.MIN_VALUE && divisor == -1) { return Integer.MAX_VALUE; }

        int result = 0;
        long first = Math.abs((long) dividend), second = Math.abs((long) divisor);
        int sign = (dividend > 0 && divisor > 0 || dividend < 0 && divisor < 0) ? 1 : -1;

        while (first >= second) {
            int shift = 0;
            while (first >= (second << shift)) {
                shift++;
            }
            first -= second << (shift - 1);
            result += 1 << (shift - 1);
        }

        return result * sign;
    }

    private int divide_03(int dividend, int divisor) {
        if (divisor == 0) { return 0; }
        if (dividend == Integer.MIN_VALUE && divisor == -1) { return Integer.MAX_VALUE; }

        long lDividend = Math.abs((long) dividend), lDivisor = Math.abs((long) divisor);
        int sign = (dividend > 0 && divisor > 0 || dividend < 0 && divisor < 0) ? 1 : -1;
        int result = 0;
        while (lDividend >= lDivisor) {
            int shift = 0;
            while (lDividend >= (lDivisor << shift)) {
                shift++;
            }
            lDividend -= lDivisor << (shift - 1);
            result += 1 << (shift - 1);
        }

        return result * sign;
    }

}
