package com.luosk.leetcode;

import java.util.Stack;

// todo: review
public class Q032_LongestValidParentheses {
    public int longestValidParentheses(String s) {
        return longestValidParentheses_01(s);
    }

    private int longestValidParentheses_01(String s) {
        if (s == null || s.length() < 2) { return 0; }
        Stack<Integer> stack = new Stack<>();
        int result = 0, start = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (stack.isEmpty()) {
                    start = i;
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        result = Math.max(result, i - start);
                    } else {
                        result = Math.max(result, i - stack.peek());
                    }
                }
            }
        }

        return result;
    }

    private int longestValidParentheses_02(String s) {
        int left = 0, right = 0;
        int[] dp = new int[s.length() + 1];
        dp[0] = 0;

        int max = 0;
        for (int i = 1; i < s.length() + 1; i++) {
            if (s.charAt(i - 1) == '(') {
                left++;
                dp[i] = 0;
            }

            if (s.charAt(i - 1) == ')') {
                right++;
                if (left >= right) {
                    dp[i] = dp[i - 1] + 2 + dp[i - dp[i - 1] - 2];
                } else {
                    left = 0;
                    right = 0;
                    dp[i] = 0;
                }

                max = Math.max(dp[i], max);
            }
        }
        return max;
    }
}
