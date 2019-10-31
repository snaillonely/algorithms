package com.luosk;

import com.luosk.leetcode.Q001_TwoSum;
import com.luosk.leetcode.Q005_LongestPalindromicSubstring;

public class Main {

    public static void main(String[] args) {
        String s = "cbbd";

        Q005_LongestPalindromicSubstring solution = new Q005_LongestPalindromicSubstring();
        System.out.println(solution.longestPalindrome(s));
    }
}
