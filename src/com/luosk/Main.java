package com.luosk;

import com.luosk.leetcode.Q008_StringToInteger;
import com.luosk.leetcode.Q010_RegularExpressionMatching;

public class Main {

    public static void main(String[] args) {
        Q010_RegularExpressionMatching solution = new Q010_RegularExpressionMatching();
        String s = "aaa", p = "ab*ac*a";

        System.out.println(solution.isMatch(s, p));
    }
}
