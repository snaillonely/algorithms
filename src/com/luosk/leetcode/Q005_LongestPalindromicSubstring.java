package com.luosk.leetcode;

public class Q005_LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        return longestPalindrome_02(s);
    }

    /*
     * time: O(n^2)
     * space: O(n^2)
     */
    private String longestPalindrome_01(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        String result = "";
        boolean[][] dp = new boolean[s.length()][s.length()];

        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i <= j; i++) {
                dp[i][j] = (s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[i + 1][j - 1]));
                if (dp[i][j] && j - i + 1 > result.length()) {
                    result = s.substring(i, j + 1);
                }
            }
        }

        return result;
    }

    /*
     * time: O(n^2)
     * space: O(n^2)
     * 将原字符串反向，然后求两个字符串的最长公共子串
     */
    private String longestPalindrome_02(String s) {
        StringBuffer sb = new StringBuffer(s);
        String r = sb.reverse().toString();

        return longestSubstring(s, r);
    }

    private String longestSubstring(String s1, String s2) {
        int row = s1.length() + 1, col = s2.length() + 1;
        int dp[][] = new int[row][col];
        String result = "";

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > result.length() && i + j - s1.length() == dp[i][j]) { // ?
                        result = s1.substring(i - dp[i][j], i);
                    }
                }
            }
        }

        return result;
    }

    /*
     * time: O(n^2)
     * space: O(1)
     */
    private String result = "";
    private String longestPalindrome_03(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            helper(s, i, i);
            helper(s, i, i + 1);
        }

        return result;
    }

    private void helper(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if (right - left > result.length()) {
            result = s.substring(left + 1, right);
        }
    }
}
