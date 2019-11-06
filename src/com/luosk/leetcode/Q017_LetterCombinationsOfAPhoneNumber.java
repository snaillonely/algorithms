package com.luosk.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q017_LetterCombinationsOfAPhoneNumber {

    private char key[][] = {
            { ' ' },
            { ' ' },
            { 'a', 'b', 'c' },
            { 'd', 'e', 'f' },
            { 'g', 'h', 'i' },
            { 'j', 'k', 'l' },
            { 'm', 'n', 'o' },
            { 'p', 'q', 'r', 's' },
            { 't', 'u', 'v' },
            { 'w', 'x', 'y', 'z' },
    };

    public List<String> letterCombinations(String digits) {
        return letterCombinations_01(digits);
    }

    private List<String> letterCombinations_01(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }

        result.add("");
        for (char c : digits.toCharArray()) {
            List<String> temp = new ArrayList<>();
            for (String str : result) {
                for (int i = 0; i < key[c - '0'].length; i++) {
                    temp.add(str + key[c - '0'][i]);
                }
            }
            result = temp;
        }

        return result;
    }
}
