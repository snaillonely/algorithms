package com.luosk.leetcode;

import java.util.ArrayList;
import java.util.List;

// todo: review
public class Q022_GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        return generateParenthesis_01(n);
    }

    private List<String> result = new ArrayList<>();
    private List<String> generateParenthesis_01(int n) {
        helper("", n, n);
        return result;
    }

    private void helper(String str, int left, int right) {
        if (right == 0 && left == 0) {
            result.add(str);
            return;
        }

        if (left > 0) {
            helper(str + "(", left - 1, right);
        }

        if (left < right) {
            helper(str + ")", left, right - 1);
        }
    }
}
