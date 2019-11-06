package com.luosk;

import com.luosk.leetcode.Q017_LetterCombinationsOfAPhoneNumber;

public class Main {

    public static void main(String[] args) {
        Q017_LetterCombinationsOfAPhoneNumber solution = new Q017_LetterCombinationsOfAPhoneNumber();
        String digits = "23";

        System.out.println(solution.letterCombinations(digits));
    }
}
