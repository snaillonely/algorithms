package com.luosk.leetcode;

public class Q557_ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        return reverseWords_01(s);
    }

    private String reverseWords_01(String s) {
        char[] chars = s.toCharArray();
        for (int left = 0, right = 0; right < chars.length && left < chars.length; ++right) {
            if (right == chars.length - 1 || chars[right + 1] == ' ') {
                reverseWord(chars, left, right);
                left = right + 2;
            }
        }

        return new String(chars);
    }

    private void reverseWord(char[] chars, int start, int end) {
        while (start < end) {
            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;

            ++start;
            --end;
        }
    }
}
