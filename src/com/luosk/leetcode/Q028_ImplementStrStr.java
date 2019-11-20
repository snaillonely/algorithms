package com.luosk.leetcode;

public class Q028_ImplementStrStr {
    public int strStr(String haystack, String needle) {
        return strStr_01(haystack, needle);
    }

    private int strStr_01(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }

        // watchout: the condition here is <=
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }

                if (j == needle.length() - 1) {
                    return i;
                }
            }
        }

        return -1;
    }

    // trick
    private int strStr_02(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
