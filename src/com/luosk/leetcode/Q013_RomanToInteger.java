package com.luosk.leetcode;

public class Q013_RomanToInteger {
    private int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0, index = 0; i < symbols.length; i++) {
            while (s.startsWith(symbols[i], index)) {
                result += values[i];
                index += symbols[i].length();
            }
        }

        return result;
    }
}
