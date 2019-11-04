package com.luosk.leetcode;

public class Q008_StringToInteger {
    public int myAtoi(String str) {
        long temp = 0;
        int result = 0, sign = 1, index = 0;

        while (index < str.length() && (str.charAt(index) == ' ' || str.charAt(index) == '\t')) {
            index++;
        }

        if (index < str.length() && (str.charAt(index) == '-' || str.charAt(index) == '+')) {
            sign = (str.charAt(index++) == '-' ? -1 : 1);
        }

        while (index < str.length() && str.charAt(index) >= '0' && str.charAt(index) <= '9') {
            temp = temp * 10 + (str.charAt(index++) - '0');

            if (temp * sign <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            if (temp > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }

        result = (int)temp * sign;

        return result;
    }
}
